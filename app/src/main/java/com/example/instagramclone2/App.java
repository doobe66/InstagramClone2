package com.example.instagramclone2;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("PA7VhWyZmRpAKRsSHHciYAfewUe0mkgaHvj4ZSLe")
                // if defined
                .clientKey("zuVQn2LWQsCFLhviX4jQwlGKlJWIBq2uyxGF1d2R")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}
