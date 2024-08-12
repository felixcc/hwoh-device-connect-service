plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("maven-publish")
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("release") {
                from(components["release"])

                groupId = "com.hwoh.connect"
                artifactId = "device-service"
                version = "1.0.0"

                pom {
                    name.set("hwoh-device-connect-service")
                    description.set("A description of the library.")
                    url.set("https://github.com/felixcc/hwoh-device-connect-service.git")

                    licenses {
                        license {
                            name.set("The Apache License, Version 2.0")
                            url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
                        }
                    }
                    developers {
                        developer {
                            id.set("felixcc")
                            name.set("felixchen")
                            email.set("lovejiuwei@gmail.com")
                        }
                    }
                    scm {
                        connection.set("scm:git:git://github.com/felixcc/hwoh-device-connect-service.git")
                        developerConnection.set("scm:git:ssh://github.com/felixcc/hwoh-device-connect-service.git")
                        url.set("https://github.com/felixcc/hwoh-device-connect-service.git")
                    }
                }
            }
        }

        repositories {
            maven {
                name = "GitHubPackages"
                url = uri("https://github.com/felixcc/hwoh-device-connect-service.git")
                credentials {
                    username =
                        project.findProperty("gpr.user") as String? ?: System.getenv("USERNAME")
                    password = project.findProperty("gpr.key") as String? ?: System.getenv("TOKEN")
                }
            }
        }
    }
}

android {
    namespace = "com.hwoh.device.connect"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

}