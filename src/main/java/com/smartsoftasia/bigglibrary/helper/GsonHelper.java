package com.smartsoftasia.bigglibrary.helper;

import com.google.gson.Gson;
import com.smartsoftasia.bigglibrary.utils.ParameterizedList;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by gregoire barret on 5/12/15.
 * For Perfumist project.
 */
public class GsonHelper {
    public static final String TAG = "GsonHelper";
    public static <T> List<T> FromJsonArray(JSONArray jsonArray, Class<T> klass) {
        Gson gson = new Gson();
        return gson.fromJson(jsonArray.toString(), new ParameterizedList<T>(klass));

    }

    public static <T> T FromJsonObject(JSONObject jsonObject, Class<T> type){
        Gson gson = new Gson();
        return gson.fromJson(jsonObject.toString(), type);
    }
    public static <T> String ToJsonObject(T object){
        Gson gson = new Gson();
        return gson.toJson(object);
    }
}
