package com.codboxer.finallayouttest.service;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class MyApplication extends Application {
    public static final String CHANEL_ID = "chanel_service";

    @Override
    public void onCreate() {
        super.onCreate();

        // Initialize chanel id
        createChanelNotification();
    }

    private void createChanelNotification() {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(CHANEL_ID, "Chanel Service",
                                                                  NotificationManager.IMPORTANCE_DEFAULT);

            NotificationManager manager = getSystemService(NotificationManager.class);
            if(manager != null) {
                manager.createNotificationChannel(channel);
            }
        }
    }
}
