//plugins {
//    id("com.android.application")
//    id("org.jetbrains.kotlin.android")
//    kotlin("kapt")
//    id("com.google.dagger.hilt.android")
//}
//
//android {
//    namespace = "com.example.newsinshort"
//    compileSdk = 34
//
//    defaultConfig {
//        applicationId = "com.example.newsinshort"
//        minSdk = 29
//        targetSdk = 34
//        versionCode = 1
//        versionName = "1.0"
//
//        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
//        vectorDrawables {
//            useSupportLibrary = true
//        }
//    }
//
//    buildTypes {
//        release {
//            isMinifyEnabled = false
//            proguardFiles(
//                getDefaultProguardFile("proguard-android-optimize.txt"),
//                "proguard-rules.pro"
//            )
//        }
//    }
//    compileOptions {
//        sourceCompatibility = JavaVersion.VERSION_17
//        targetCompatibility = JavaVersion.VERSION_17
//    }
//    kotlinOptions {
//        jvmTarget = "17"
//    }
//    buildFeatures {
//        compose = true
//    }
//    composeOptions {
//        kotlinCompilerExtensionVersion = "1.5.1"
//    }
//    packaging {
//        resources {
//            excludes += "/META-INF/{AL2.0,LGPL2.1}"
//        }
//    }
//}
//
//dependencies {
//
//    implementation(Dependencies.coreKtx)
//    implementation(Dependencies.lifecycleRuntimeKtx)
//    implementation(Dependencies.activityCompose)
//    implementation(platform(Dependencies.platformComposeBom))
//    implementation(platform(Dependencies.composeUi))
//    implementation(Dependencies.composeUiGraphics)
//    implementation(Dependencies.composeUitoolingPreview)
//    implementation(Dependencies.composeMaterial3)
//    implementation("androidx.compose.ui:ui-tooling-preview-android:1.6.2")
//    testImplementation(Dependencies.junit)
//    androidTestImplementation(Dependencies.androidxTest)
//    androidTestImplementation(Dependencies.espresso)
//    androidTestImplementation(platform(Dependencies.composeBom))
//    androidTestImplementation(Dependencies.uiTest)
//    debugImplementation(Dependencies.uiTooling)
//    debugImplementation(Dependencies.uiTestManifest)
//
//    implementation(project(Modules.utilities))
//
//    implementation(Dependencies.hiltAndroid)
//    kapt(Dependencies.hiltAndroidCompliler)
//    kapt(Dependencies.hiltCompiler)
//
//    implementation(Dependencies.hiltNavigationCompose)
//
//    implementation(Dependencies.retrofit)
//    implementation(Dependencies.okhttp)
//    implementation(Dependencies.convertergson)
//    implementation(Dependencies.moshi)
//    implementation(Dependencies.moshiConverter)
//    implementation(Dependencies.loginInterceptor)
//
//    implementation((Dependencies.coroutinesAndroid))
//    implementation((Dependencies.coroutinesCore))
//
//}
//
//kapt{
//    correctErrorTypes = true
//}

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.example.newsinshort"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.newsinshort"
        minSdk = 31
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(Dependencies.coreKtx)
    implementation(Dependencies.lifecycleruntime)
    implementation(Dependencies.activityCompose)
    implementation(platform(Dependencies.composeBom))
    implementation(Dependencies.composeUi)
    implementation(Dependencies.composeUiUiGraphics)
    implementation(Dependencies.composeUiUiToolingPreview)
    implementation(Dependencies.composeMaterial3)
    testImplementation(Dependencies.junits)
    androidTestImplementation(Dependencies.extJunit)
    androidTestImplementation(Dependencies.espressoCore)
    androidTestImplementation(platform(Dependencies.composeBom))
    androidTestImplementation(Dependencies.composeUITestjunit4)
    debugImplementation(Dependencies.composeUiUiTooling)
    debugImplementation(Dependencies.composeUITestManifest)
//    implementation(Dependencies.hiltAndroid)
//    kapt(Dependencies.hiltCompiler)
//    kapt(Dependencies.hiltAndroidCompiler)

    implementation("com.google.dagger:hilt-android:2.48")
    kapt("com.google.dagger:hilt-android-compiler:2.48")
    implementation("androidx.hilt:hilt-common:1.2.0")
    kapt("androidx.hilt:hilt-compiler:1.2.0")
    implementation("androidx.hilt:hilt-navigation-compose:1.2.0")
    //implementation("androidx.hilt:hilt-work:1.2.0")
    implementation(project(":utilities"))

//    implementation("com.squareup.retrofit2:retrofit:2.9.0")
//    implementation("com.squareup.okhttp3:okhttp:5.0.0-alpha.2")
//    // define a BOM and its version
//    implementation(platform("com.squareup.retrofit:converter-gson:2.9.0"))
//
//    // define any required OkHttp artifacts without version
//    implementation("com.squareup.moshi:moshi-kotlin:1.13.0")
//    implementation("com.squareup.retrofit2:converter-moshi:2.9.0")
//    implementation("com.squareup.okhttp3:logging-interceptor:4.8.1")

    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.okhttp3:okhttp:5.0.0-alpha.2")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.moshi:moshi-kotlin:1.15.0")
    implementation("com.squareup.retrofit2:converter-moshi:2.9.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.12.0")

}
kapt {
    correctErrorTypes = true
}