import io.spring.gradle.dependencymanagement.dsl.DependencyManagementExtension

val mockitoAgent = configurations.create("mockitoAgent")

plugins {
    `java-library`
    alias(libs.plugins.springBootPlugin) apply false
    alias(libs.plugins.openapiGradlePlugin)
    `maven-publish`
    alias(libs.plugins.gradleReleaePlugin)
}
apply(plugin = "io.spring.dependency-management")
group = "com.fantasy.football"

the<DependencyManagementExtension>().apply {
    imports {
        mavenBom(org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES)
    }
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
    withJavadocJar()
    withSourcesJar()
}

tasks.test {
    useJUnitPlatform()
    jvmArgs("-javaagent:${mockitoAgent.asPath}")
}

repositories {
    google()
    mavenLocal()
    mavenCentral()
    maven {
        name = "github-packages"
        url = uri("https://maven.pkg.github.com/RohanAditeya/fantasy-football-model")
        credentials {
            username = providers.gradleProperty("artifactory.user").get()
            password = providers.gradleProperty("artifactory.password").get()
        }
    }
}

dependencies {
    api("org.springframework.data:spring-data-r2dbc")
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("org.springframework.boot:spring-boot-autoconfigure-processor")
    api(libs.swaggerParser)
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly("io.r2dbc:r2dbc-h2")
    testImplementation("io.projectreactor:reactor-test")
    mockitoAgent("org.mockito:mockito-core") { isTransitive = false }
}

openApiGenerate {
    generatorName.set("spring")
    outputDir.set(projectDir.path)
    inputSpec.set("${projectDir.path}/src/main/resources/openapi/openapi.yaml")
    packageName.set("com.fantasy.football")
    apiPackage.set("com.fantasy.football.reactive.controller")
    modelPackage.set("com.fantasy.football.dto")
    typeMappings.set(
        mutableMapOf(
            "leagueTeam" to "LeagueTeam",
            "playerBasicInformation" to "PlayerBasicInformation",
            "problemDetail" to "ProblemDetail",
            "playerFantasyStatistics" to "PlayerFantasyStatistics",
            "playerGameStatistics" to "PlayerGameStatistics",
            "playerMiscellaneousInformation" to "PlayerMiscellaneousInformation",
            "playerGameWeekStatistics" to "PlayerGameWeekStatistics",
            "playerGameWeekBreakup" to "PlayerGameWeekBreakup"
        )
    )
    importMappings.set(
        mutableMapOf(
            "LeagueTeam" to "com.fantasy.football.model.LeagueTeam",
            "PlayerBasicInformation" to "com.fantasy.football.model.PlayerBasicInformation",
            "ProblemDetail" to "org.springframework.http.ProblemDetail",
            "PlayerFantasyStatistics" to "com.fantasy.football.model.PlayerFantasyStatistics",
            "PlayerGameStatistics" to "com.fantasy.football.model.PlayerGameStatistics",
            "PlayerMiscellaneousInformation" to "com.fantasy.football.model.PlayerMiscellaneousInformation",
            "PlayerGameWeekStatistics" to "com.fantasy.football.model.PlayerGameWeekStatistics",
            "PlayerGameWeekBreakup" to "com.fantasy.football.model.PlayerGameWeekBreakup"
        )
    )
    configOptions.set(
        mutableMapOf(
            "openApiNullable" to "false",
            "useSpringBoot3" to "true",
            "interfaceOnly" to "true",
            "requestMappingMode" to "api_interface",
            "useJakartaEe" to "true",
            "skipDefaultInterface" to "true",
            "documentationProvider" to "springdoc",
            "reactive" to "true",
            "useBeanValidation" to "true"
        )
    )
    apiFilesConstrainedTo.set(mutableListOf(""))
    modelFilesConstrainedTo.set(mutableListOf(""))
}

tasks.compileJava {
    dependsOn(tasks.openApiGenerate)
    options.compilerArgs.addLast("-parameters") // Added for fixing test cases execution look at problem here https://stackoverflow.com/questions/77427865/missing-parameter-name-in-mongodb-repository-causing-mappingexception
}

tasks.processResources {
    dependsOn(tasks.openApiGenerate)
}

tasks.getByName("sourcesJar") {
    dependsOn(tasks.openApiGenerate)
}

tasks.processTestResources {
    dependsOn(tasks.openApiGenerate)
}

tasks.beforeReleaseBuild {
    dependsOn(tasks.publish)
}

publishing {
    publications {
        create<MavenPublication>("maven-publish") {
            from(components["java"])
        }
    }

    repositories {
        maven {
            name = "github-packages"
            url = uri("https://maven.pkg.github.com/RohanAditeya/fantasy-football-model")
            credentials {
                username = providers.gradleProperty("artifactory.user").get()
                password = providers.gradleProperty("artifactory.password").get()
            }
        }
    }
}