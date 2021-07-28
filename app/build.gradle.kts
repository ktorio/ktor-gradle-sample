import org.jetbrains.kotlin.gradle.tasks.KotlinCompile as KotlinCompile

val ktorVersion:String by project
val jvmTargetVersion:String by project

plugins {
    id("org.jetbrains.kotlin.jvm")
    id("application")
}

group = "org.example"
version = "1.0"


application{
    @Suppress("DEPRECATION")
    mainClassName = "com.example.ApplicationKt"
}

repositories {
    mavenCentral()
}

dependencies {

    // KTOR
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("io.ktor:ktor-server-core:$ktorVersion")
    implementation("io.ktor:ktor-server-netty:$ktorVersion")


    // LOGGING
    implementation("ch.qos.logback:logback-classic:1.2.3")


    // KTOR TEST
    testImplementation("io.ktor:ktor-server-tests:$ktorVersion")


    testImplementation(kotlin("test"))

}


tasks.withType(KotlinCompile::class.java)
    .all {
        kotlinOptions {
            jvmTarget = jvmTargetVersion
        }
    }