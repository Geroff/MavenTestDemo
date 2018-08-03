package com.example.maventest;

import android.util.Log;

public class LogUtil {
    private static final String TAG = "LogUtil";

    public static void debug(String message) {
        Log.d(TAG, message);
    }
}
