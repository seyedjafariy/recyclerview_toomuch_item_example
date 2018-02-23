package com.worldsnas.recyclerview_test;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Seyed on 2/23/2018.
 */

public interface Api {

    @GET("/mshow")
    Call<List<BaseResponse>> getChars();
}
