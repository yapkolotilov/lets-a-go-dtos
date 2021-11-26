import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.0"
    id("maven-publish")
}

val groupName = "me.yapko"
val artifactName = "lets_a_go_dtos"
val versionName = "1.1"

group = groupName
version = versionName

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.swagger", "swagger-annotations", "1.6.3")
    implementation("com.fasterxml.jackson.core", "jackson-annotations", "2.2.1")
    implementation("javax.validation", "validation-api", "2.0.1.Final")
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/yapkolotilov/lets-a-go-dtos")
            credentials {
                username = System.getenv("GITHUB_USERNAME").orEmpty()
                password = System.getenv("GITHUB_PASSWORD").orEmpty()
            }
        }
    }
    publications {
        create<MavenPublication>("maven") {
            groupId = groupName
            artifactId = artifactName
            version = versionName

            from(components["java"])
        }
    }
}