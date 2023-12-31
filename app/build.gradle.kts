@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.com.android.application)
    alias(libs.plugins.org.jetbrains.kotlin.android)
    alias(libs.plugins.hilt.android.plugin)
    kotlin("kapt")
}

android {
    namespace = "com.example.cctaskofyahoofinance"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.cctaskofyahoofinance"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {

        debug {
            buildConfigField("String", "API_URL", "\"https://yh-finance.p.rapidapi.com/\"")
            buildConfigField(
                "String",
                "API_KEY",
                "\"27b202476fmshea6fc4eb5c1d74dp1ab788jsn8f388994ff4f\""
            )
            buildConfigField("String", "API_HOST", "\"yh-finance.p.rapidapi.com\"")
            // buildConfigField("String", "API_KEY", gradleLocalProperties(rootDir).getProperty("API_KEY"))
        }
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            buildConfigField("String", "API_URL", "\"https://yh-finance.p.rapidapi.com/\"")
            buildConfigField(
                "String",
                "API_KEY",
                "\"27b202476fmshea6fc4eb5c1d74dp1ab788jsn8f388994ff4f\""
            )
            buildConfigField("String", "API_HOST", "\"yh-finance.p.rapidapi.com\"")
            // buildConfigField("String", "API_KEY", gradleLocalProperties(rootDir).getProperty("API_KEY"))
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
        buildConfig = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    viewBinding.enable = true
}

dependencies {

    implementation(libs.core.ktx)
    implementation(libs.lifecycle.runtime.ktx)
    implementation(libs.activity.compose)
    implementation(platform(libs.compose.bom))
    implementation(libs.ui)
    implementation(libs.ui.graphics)
    implementation(libs.ui.tooling.preview)
    implementation(libs.material3)
    implementation(libs.retrofit)
    implementation(libs.gson.converter)
    implementation(libs.coroutines.android)
    implementation(libs.coroutines.core)
    implementation(libs.hilt.android)
    implementation(libs.hilt.navigation.compose)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)
    kapt(libs.hilt.android.compiler)
    implementation(libs.okhttp3.logging.interceptor)
    implementation(platform(libs.okhttp.bom))
    implementation(libs.javapoet)
    implementation(libs.coil.compose)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(platform(libs.compose.bom))
    androidTestImplementation(libs.ui.test.junit4)
    debugImplementation(libs.ui.tooling)
    debugImplementation(libs.ui.test.manifest)
}
