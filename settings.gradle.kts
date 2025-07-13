pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
    plugins {
        id("com.android.application") version "8.4.0"
        id("org.jetbrains.kotlin.jvm") version "2.0.0" // or your current Kotlin version
        id("org.jetbrains.kotlin.plugin.compose") version "2.0.0" // ✅ Add this!
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "coin flip widget"
include(":app")
