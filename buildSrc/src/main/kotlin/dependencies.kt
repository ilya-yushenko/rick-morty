import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.core() {
    add("implementation", "androidx.core:core-ktx:${versions.core}")
    add("implementation", "androidx.appcompat:appcompat:${versions.appcompat}")
}

fun DependencyHandler.design() {
    add("implementation", "com.google.android.material:material:${versions.material}")
    add("implementation", "androidx.constraintlayout:constraintlayout:${versions.constraint}")
}

fun DependencyHandler.dagger() {
    add("implementation", "com.google.dagger:dagger:${versions.dagger}")
    add("kapt", "com.google.dagger:dagger-compiler:${versions.dagger}")
}

fun DependencyHandler.navigation() {
    add("implementation", "androidx.navigation:navigation-fragment-ktx:${versions.navigation}")
    add("implementation", "androidx.navigation:navigation-ui-ktx:${versions.navigation}")
}

fun DependencyHandler.kotlin() {
    add("implementation", "org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.5.30")
}

fun DependencyHandler.epoxy() {
    add("implementation", "com.airbnb.android:epoxy:${versions.epoxy}")
    add("kapt", "com.airbnb.android:epoxy-processor:${versions.epoxy}")
}

fun DependencyHandler.picasso() {
    add("implementation", "com.squareup.picasso:picasso:${versions.picasso}")
}

fun DependencyHandler.livedata() {
    add("implementation", "androidx.lifecycle:lifecycle-livedata-ktx:${versions.livedata}")
}

fun DependencyHandler.coroutines() {
    add("implementation", "org.jetbrains.kotlinx:kotlinx-coroutines-android:${versions.coroutines}")
}

fun DependencyHandler.retrofit() {
    add("implementation", "com.squareup.retrofit2:retrofit:${versions.retrofit}")
    add("implementation", "com.squareup.retrofit2:converter-gson:${versions.retrofit}")
}

fun DependencyHandler.okhttp() {
    add("implementation", "com.squareup.okhttp3:logging-interceptor:${versions.okhttp}")
    add("implementation", "com.squareup.okhttp3:okhttp:${versions.okhttp}")
}

fun DependencyHandler.fragment() {
    add("implementation", "androidx.fragment:fragment-ktx:${versions.fragment}")
}

fun DependencyHandler.test() {
    add("testImplementation", "junit:junit:${versions.junit}")
    add("androidTestImplementation", "androidx.test.ext:junit:${versions.extJunit}")
    add("androidTestImplementation", "androidx.test.espresso:espresso-core:${versions.espresso}")
}