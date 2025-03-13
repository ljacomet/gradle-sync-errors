plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
}

testing {
    suites {
        register<JvmTestSuite>("integrationTest") {
            testType = "integration"
        }
    }
}