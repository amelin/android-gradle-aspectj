buildscript {
    repositories {
        google()
        jcenter()
        mavenCentral()
    }

    val kotlinVersion: String by extra
    dependencies {
        classpath(kotlin("gradle-plugin", kotlinVersion))
    }
}

plugins {
    `java-gradle-plugin`
}

allprojects {
    repositories {
        google()
        jcenter()
        mavenCentral()
        maven { url = uri("http://repository.jetbrains.com/utils") }
        maven { url = uri("https://dl.bintray.com/archinamon/maven") }
    }
}

val androidGradleVersion: String by extra

dependencies {
    compile("com.android.tools.build:gradle:$androidGradleVersion")
}
