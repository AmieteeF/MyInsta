package com.example.myinsta.ui.login;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("JyfMXS69ZZ930MvVqYOyXExhjRaASI9HkbFCEOfe")
                .clientKey("sGmF4ZG3KC094ipaGE720AxUmPcZ0lsxJKhCxQde")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
