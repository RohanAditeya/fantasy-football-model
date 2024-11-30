plugins {
    `java-library`
    alias(libs.plugins.anotherBootPlugin)
    alias(libs.plugins.openapiGradlePlugin)
    `maven-publish`
    alias(libs.plugins.gradleReleaePlugin)
}

group = "com.fantasy.football"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
    withJavadocJar()
    withSourcesJar()
}

repositories {
    google()
    mavenLocal()
    mavenCentral()
    maven {
        name = "github-packages"
        url = uri("https://maven.pkg.github.com/RohanAditeya/fantasy-football-model")
        credentials {
            username = project.findProperty("artifactory.user") as String? ?: "user"
            password = project.findProperty("artifactory.password") as String? ?: "password"
        }
    }
}

dependencies {
    api("org.springframework.data:spring-data-r2dbc")
    implementation("com.framework.another.boot:another-boot-starter-webflux")
    implementation("org.springframework.boot:spring-boot-autoconfigure-processor")
    implementation(libs.swaggerParser)
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("io.r2dbc:r2dbc-h2")
    testImplementation("io.projectreactor:reactor-test")
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
    supportingFilesConstrainedTo.set(listOf())
}

tasks.compileJava {
    dependsOn(tasks.openApiGenerate)
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
                username = project.findProperty("artifactory.user") as String? ?: "user"
                password = project.findProperty("artifactory.password") as String? ?: "password"
            }
        }
    }
}

release {
    git {
        requireBranch.set("")
    }
}