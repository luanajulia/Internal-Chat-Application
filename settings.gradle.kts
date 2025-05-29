pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        gradlePluginPortal()
        mavenCentral()
        maven { setUrl("https://jitpack.io") }
        maven { url = uri("https://dl.bintray.com/lisawray/maven") }

    }
}



dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven { setUrl("https://jitpack.io") }
        maven { url = uri("https://dl.bintray.com/lisawray/maven") }

    }
}

rootProject.name = "ChatJavaFirefox"
include(":app")
 