package com.worldsnas.recyclerview_test;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Seyed on 2/23/2018.
 */

public class BaseResponse {

    @SerializedName("action")
    public List<Item> action;
}
