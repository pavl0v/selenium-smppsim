plugins {
    java
}

group = "org.example"
//version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("regexp:regexp:1.3")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Jar>("jar") {
    manifest {
        attributes["Manifest-Version"] = "1.0"
        attributes["Main-Class"] = "com.seleniumsoftware.SMPPSim.SMPPSim"
    }

    from (
        configurations.runtimeClasspath.get().map { zipTree(it) }
    )
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
