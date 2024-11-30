rootProject.name = "fantasy-football-model"

pluginManagement {

    repositories {
        maven {
            url = uri("https://maven.pkg.github.com/RohanAditeya/another-framework")
            credentials {
                username = providers.gradleProperty("artifactory.user") as String? ?: "user"
                password = providers.gradleProperty("artifactory.password") as String? ?: "password"
            }
        }
    }

    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "com.framework.another.boot")
                useModule("${requested.id.id}:another-boot-gradle-plugin:${requested.version}")
        }
    }
}