import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.20"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("io.qameta.allure:allure-junit-platform:2.17.3")
}

tasks.test {
    useJUnitPlatform()
    systemProperty("allure.results.directory","build/allure-results")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}