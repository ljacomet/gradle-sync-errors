plugins {
    `java-library`
    // Test
}

testing {
    suites {
        register<JvmTestSuite>("weirdTest") {
            testType = "weird"
        }
    }
}