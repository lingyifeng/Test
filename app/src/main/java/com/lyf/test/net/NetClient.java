package com.lyf.test.net;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static android.R.string.ok;

/**
 * Created by Administrator on 2017/4/11 0011.
 */

public class NetClient {
    private static NetClient mNetClient = null;
    private static final String BASE_URL="http://mobile.dev.idaqi.com";
    private final Retrofit mRetrofit;
    private LoginApi mLoginApi;

    private NetClient() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build();
        mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }

    public static NetClient getNetClient() {
        if (mNetClient == null) {
            synchronized (NetClient.class) {
                if (mNetClient == null) {
                    mNetClient = new NetClient();
                }
            }
        }
        return mNetClient;
    }

    public LoginApi getLoginApi(){
        if( mLoginApi==null){
            mLoginApi = mRetrofit.create(LoginApi.class);
        }
        return mLoginApi;
    }
}
