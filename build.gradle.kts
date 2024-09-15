plugins {
    alias(libs.plugins.kotlin)
}

group = "ski.chrzanow.olxsniper"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(21)
}

dependencies {
    implementation(libs.coroutines)
    testImplementation(libs.junit)
}

tasks.test {
    useJUnitPlatform()
}
