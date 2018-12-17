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

allprojects {
    repositories {
        google()
        jcenter()
        mavenCentral()
        maven { url = uri("http://repository.jetbrains.com/utils") }
        maven { url = uri("https://dl.bintray.com/archinamon/maven") }
    }
}