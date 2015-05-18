package com.smartsoftasia.bigglibrary.helper;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by gregoire barret on 5/11/15.
 * For Perfumist project.
 */
public class SharedPreferenceHelper {
    public static final String TAG = "SharedPreferenceHelper";

    public static SharedPreferences.Editor writeSharedPref(Context context, String sharedPref){
        SharedPreferences settings = context.getSharedPreferences(sharedPref, Context.MODE_PRIVATE);
        return settings.edit();
    }

    public static SharedPreferences readSharedPref(Context context, String sharedPref){
        return context.getSharedPreferences(sharedPref, Context.MODE_PRIVATE);
    }


    public static void writeString(Context context, String sharedPref, String key, String value){
        SharedPreferences.Editor editor = writeSharedPref(context, sharedPref);
        editor.putString(key, value);
        editor.apply();
    }

    public static void writeStrings(Context context, String sharedPref, HashMap<String, String> keyValuePair){
        SharedPreferences.Editor editor = writeSharedPref(context, sharedPref);
        for (Map.Entry<String, String> o : keyValuePair.entrySet()) {
            editor.putString( o.getKey(), o.getValue());
        }
        editor.apply();
    }

    public static String readString(Context context, String sharedPref, String key, String defaultValue){
        SharedPreferences sharedPreferences = readSharedPref(context, sharedPref);
        return sharedPreferences.getString(key, defaultValue);
    }

    public static void writeInt(Context context, String sharedPref, String key, int value){
        SharedPreferences.Editor editor = writeSharedPref(context, sharedPref);
        editor.putInt(key, value);
        editor.apply();
    }

    public static int readInt(Context context, String sharedPref, String key, int defaultValue){
        SharedPreferences sharedPreferences = readSharedPref(context, sharedPref);
        return sharedPreferences.getInt(key, defaultValue);
    }


    public static void writeBoolean(Context context, String sharedPref, String key, boolean value){
        SharedPreferences.Editor editor = writeSharedPref(context, sharedPref);
        editor.putBoolean(key, value);
        editor.apply();
    }

    public static boolean readBoolean(Context context, String sharedPref, String key){
        SharedPreferences sharedPreferences = readSharedPref(context, sharedPref);
        return sharedPreferences.getBoolean(key, false);
    }


    public static void cleanString(Context context, String sharedPref, String key){
        writeString(context,sharedPref,key,null);
    }

}
