package com.lyf.test.net;

import com.lyf.test.bean.LoginReponse;
import com.lyf.test.bean.LoginRequest;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

/**
 * Created by Administrator on 2017/4/11 0011.
 */

public interface LoginApi {
    @POST("/iext/expt/mobile/account/login.do?")
    Call<LoginReponse> login(@QueryMap Map<String,String> params);
}
