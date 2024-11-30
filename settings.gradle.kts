rootProject.name = "fantasy-football-model"

pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "com.framework.another.boot")
                useModule("${requested.id.id}:another-boot-gradle-plugin:${requested.version}")
        }
    }
}