# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.

# Keep native methods
-keepclasseswithmembernames class * {
    native <methods>;
}

# Keep custom views
-keep public class * extends android.view.View {
    public <init>(android.content.Context);
    public <init>(android.content.Context, android.util.AttributeSet);
    public <init>(android.content.Context, android.util.AttributeSet, int);
}

# Retrofit
-keepattributes Signature
-keepattributes Exceptions
-keep class retrofit2.** { *; }

# Gson
-keep class com.google.gson.** { *; }
-keepattributes Signature
-keepattributes *Annotation*

# OkHttp
-dontwarn okhttp3.**
-keep class okhttp3.** { *; }

# RxJava
-dontwarn io.reactivex.**
-keep class io.reactivex.** { *; }

# Glide
-keep public class * implements com.bumptech.glide.module.GlideModule
-keep class * extends com.bumptech.glide.module.AppGlideModule {
 <init>(...);
}
-keep public enum com.bumptech.glide.load.ImageHeaderParser$** {
  **[] $VALUES;
  public *;
}

# EventBus
-keepattributes *Annotation*
-keepclassmembers class * {
    @org.greenrobot.eventbus.Subscribe <methods>;
}
-keep enum org.greenrobot.eventbus.ThreadMode { *; }

# Keep model classes
-keep class com.**.bean.** { *; }
-keep class com.**.model.** { *; }
-keep class com.**.entity.** { *; }
