import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("idea")
    kotlin("jvm") version "1.3.60"
}

version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    testImplementation("org.spekframework.spek2:spek-dsl-jvm:2.0.8")
    testRuntimeOnly("org.spekframework.spek2:spek-runner-junit5:2.0.8")
    testRuntimeOnly("org.jetbrains.kotlin:kotlin-reflect:1.3.60")
    testImplementation("org.junit.jupiter:junit-jupiter:5.5.2")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.withType<Test> {
    useJUnitPlatform {
        includeEngines("spek2")
    }
}