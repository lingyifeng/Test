package com.lyf.test;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

import com.lyf.test.bean.LoginReponse;
import com.lyf.test.bean.LoginRequest;
import com.lyf.test.net.NetClient;
import com.lyf.test.util.RegexUtil;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Administrator on 2017/4/11 0011.
 */

public class MainPresenter {
    private MainView mMainView;

    public MainPresenter(MainView mainView) {
        mMainView = mainView;
    }

    private static final String PUSH_RE_GID = "120c83f7601763ca587";
    private static final String DESC = "{\"client\":\"android\"}";
    public String getDesc() {
        String str = "";
        JSONObject mJSONObject = new JSONObject();
        try {
            mJSONObject.put("client", "android");
            str = mJSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return str;
    }

    public void login(String account, String password) {
        mMainView.showProgress();
        HashMap<String, String> map = new HashMap<>();
        map.put("account",account);
        map.put("password",password);
        map.put("pushregid",PUSH_RE_GID);
        map.put("desc",getDesc());
        NetClient.getNetClient().getLoginApi().login(map).enqueue(new Callback<LoginReponse>() {
            @Override
            public void onResponse(Call<LoginReponse> call, Response<LoginReponse> response) {
                mMainView.showMsg(response.body().getMsg());
                mMainView.hintProgress();
            }

            @Override
            public void onFailure(Call<LoginReponse> call, Throwable t) {
                mMainView.showMsg(t.getLocalizedMessage());
                mMainView.hintProgress();
            }
        });
    }

}
