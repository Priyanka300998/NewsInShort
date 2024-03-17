//object Dependencies {
//
//    val coreKtx by lazy{"androidx.core:core-ktx:${Versions.coreKtx}"}
//    val lifecycleRuntimeKtx by lazy{"androidx.lifecycle-runtime-ktx:${Versions.lifecycleRuntimeKtx}"}
//    val activityCompose by lazy{"activity-compose:${Versions.activityCompose}"}
//    //val platformComposeBom by lazy{"androidx.compose:compose-bom:"}
//    val composeUi by lazy{"androidx.compose.ui:ui:"}
//    val composeUiGraphics by lazy{"androidx.compose.ui:ui-graphics:"}
//
//    val composeUitoolingPreview by lazy { "androidx.compose.ui:ui-tooling-preview" }
//
//    val composeMaterial3 by lazy { "androidx.compose.material3:material3" }
//
//    val junit by lazy{"junit:junit:${Versions.junit}"}
//
//    val androidxTest by lazy{"androidx.test.ext:junit:${Versions.androidxTest}"}
//
//    val espresso by lazy{"androidx.test.espresso:espresso-core:${Versions.espresso}"}
//
//    val composeBom by lazy{"androidx.compose:compose-bom:${Versions.composeBom}"}
//    val  composeBom by lazy { "androidx.compose:compose-bom:${Versions.composeBom}" }
//
//    val uiTest by lazy{"androidx.compose.ui:ui-test-junit4"}
//
//    val uiTooling by lazy{"androidx.compose.ui:ui-tooling:"}
//
//    val uiTestManifest by lazy{"androidx.compose.ui:ui-test-manifest"}
//
//
//    val hiltAndroid by lazy{"com.google.dagger:hilt-android:${Versions.hiltAndroid}"}
//    val hiltAndroidCompliler by lazy{"com.google.dagger:hilt-compiler:${Versions.hiltAndroid}"}
//    val hiltCompiler by lazy{"androidx.hilt:hilt-compiler:${Versions.hiltCompiler}"}
//
//    val hiltNavigationCompose by lazy{"androidx.hilt:hilt-navigation-compose:${Versions.hiltNavigationCompose}"}
//
//    val retrofit by lazy{"com.squareup.retrofit2:retrofit:${Versions.retrofit}"}
//    val okhttp by lazy{"com.squareup.okhttp3:okhttp:${Versions.okhttp}"}
//    val convertergson by lazy{"com.squareup.retrofit2:converter-gson:${Versions.convertergson}"}
//    val moshi by lazy{"com.squareup.moshi:moshi-kotlin:${Versions.moshi}"}
//    val moshiConverter by lazy{"com.squareup.retrofit2:converter-moshi:${Versions.moshiConverter}"}
//    val loginInterceptor by lazy{"com.squareup.okhttp3:login-interceptor:${Versions.loginInterceptor}"}
//
//    val coroutinesAndroid by lazy{"org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"}
//    val coroutinesCore by lazy{"org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"}
//
//
//
//
//
//}
//
//object Modules{
//    const val utilities = ":utilities"
//}

object Dependencies {
    val  coreKtx by lazy { "androidx.core:core-ktx:${Versions.coreKtx}" }
    val  lifecycleruntime by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleruntime}" }
    val  activityCompose by lazy { "androidx.activity:activity-compose:${Versions.activityCompose}" }
    val  composeBom by lazy { "androidx.compose:compose-bom:${Versions.composeBom}" }
    val  composeUi by lazy { "androidx.compose.ui:ui" }
    val  composeUiUiGraphics by lazy { "androidx.compose.ui:ui-graphics" }
    val  composeUiUiToolingPreview by lazy { "androidx.compose.ui:ui-tooling-preview" }
    val  composeMaterial3 by lazy { "androidx.compose.material3:material3" }
    val  junits by lazy { "junit:junit:${Versions.junits}" }
    val  extJunit by lazy { "androidx.test.ext:junit:${Versions.extJunit}" }
    val  espressoCore by lazy { "androidx.test.espresso:espresso-core:${Versions.espressoCore}" }
    val  composeUITestjunit4 by lazy { "androidx.compose.ui:ui-test-junit4" }
    val  composeUITestManifest by lazy { "androidx.compose.ui:ui-test-manifest" }
    val  composeUiUiTooling by lazy { "androidx.compose.ui:ui-tooling" }
    val  appcompat by lazy { "androidx.appcompat:appcompat:${Versions.appcompat}" }
    val  material by lazy { "com.google.android.material:material:${Versions.material}" }

    val  hiltAndroid by lazy { "com.google.dagger:hilt-android:${Versions.hilt}" }
    val  hiltAndroidCompiler by lazy { "com.google.dagger:hilt-android-compiler:${Versions.hiltCompiler}" }
    val  hiltCompiler by lazy { "androidx.hilt:hilt-compiler:${Versions.hiltCompiler}" }

}
