package com.londonappbrewery.bitcointicker;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

public class BitcoinData {
    private String bitPrice;

    public static BitcoinData fromJson(JSONObject  jsonObject){
        try{
            BitcoinData bitObj = new BitcoinData();

            bitObj.bitPrice = jsonObject.getString("ask");
            return bitObj;

        }catch(JSONException e){
            Log.d("Bitcoin", "Caught Exception"+e);
            return null;
        }
    }

    public String getBitPrice() {
        return bitPrice;
    }
}


