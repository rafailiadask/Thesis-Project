plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.productspurchaseapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.productspurchaseapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    buildFeatures {
        viewBinding = true
    }
    lintOptions {
        check("Deprecation")
    }
}



    dependencies {

        implementation("com.github.rey5137:material:1.3.1")
        implementation("com.google.android.material:material:1.11.0")
        implementation("androidx.constraintlayout:constraintlayout:2.1.4")

        implementation("androidx.appcompat:appcompat:1.7.0-alpha03")
        implementation("androidx.recyclerview:recyclerview:1.4.0-alpha01")
        implementation("androidx.cardview:cardview:1.0.0")
        implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.1")
        implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")
        implementation("androidx.navigation:navigation-fragment:2.6.0")
        implementation("androidx.navigation:navigation-ui:2.6.0")
        implementation("de.hdodenhof:circleimageview:3.1.0")
        implementation("com.google.firebase:firebase-inappmessaging:20.4.2")
        implementation("com.github.mhiew:android-pdf-viewer:3.2.0-beta.1")
        testImplementation("junit:junit:4.13.2")
        androidTestImplementation("androidx.test.ext:junit:1.1.5")
        androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
        implementation(platform("com.google.firebase:firebase-bom:32.7.2"))
        implementation("com.google.firebase:firebase-database:20.0.3")
        implementation("com.firebaseui:firebase-ui-database:7.2.0")
        implementation("com.squareup.picasso:picasso:2.71828")
        implementation("com.google.firebase:firebase-analytics")



    }
