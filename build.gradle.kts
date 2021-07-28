buildscript {
    repositories {
        mavenCentral()
    }

    val kotlinVersion:String by project

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    }
}

group = "org.example"
version = "1.0"