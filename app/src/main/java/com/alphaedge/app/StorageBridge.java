package com.alphaedge.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.JavascriptInterface;

public class StorageBridge {
    private final SharedPreferences prefs;

    public StorageBridge(Context context) {
        prefs = context.getSharedPreferences("alphaedge_data", Context.MODE_PRIVATE);
    }

    @JavascriptInterface
    public void save(String key, String value) {
        prefs.edit().putString(key, value).apply();
    }

    @JavascriptInterface
    public String load(String key) {
        return prefs.getString(key, null);
    }

    @JavascriptInterface
    public void remove(String key) {
        prefs.edit().remove(key).apply();
    }

    @JavascriptInterface
    public void clear() {
        prefs.edit().clear().apply();
    }
}
