// 프로젝트 레벨 build.gradle.kts (플러그인 설정)
plugins {
    id("com.android.application") version "8.7.3" apply false
    id("org.jetbrains.kotlin.android") version "1.9.24" apply false
}

buildscript {
    dependencies {
        classpath("com.android.tools.build:gradle:8.7.3")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.24")
    }
}

/*allprojects {
    repositories {
        mavenCentral()
        maven { url = uri("https://maven.pkg.github.com/naver/") }  // Naver SDK를 위한 Maven repository 추가
    }
}

