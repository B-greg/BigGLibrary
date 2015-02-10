package com.smartsoftasia.bigglibrary.helper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by gregoire barret on 2/10/15.
 * For SmartCommerce project.
 */
public class CollectionHelper {
    public static final String TAG = "CollectionHelper";
    
    public static <T> List<T> toList(Collection<T> collection){
        if (collection instanceof List)
            return (List<T>)collection;
        else
            return new ArrayList<>(collection);
    }
}
