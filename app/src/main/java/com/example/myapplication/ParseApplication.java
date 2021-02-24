package com.example.myapplication;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();


        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        // set applicationId, and server server based on the values in the Heroku settings.
        // clientKey is not needed unless explicitly configured
        // any network interceptors must be added with the Configuration Builder given this syntax
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("RW3Sm3kiOpWXxXE5SL9xwYAHZ5WvInbMFwK9mSJ5")
                .clientKey("GrE9b0yL15RlweVDzKXMOpmSRJJbUisFWcmKqI3S")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
