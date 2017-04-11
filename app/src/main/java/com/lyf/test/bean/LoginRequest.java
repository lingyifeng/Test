package com.lyf.test.bean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/4/11 0011.
 */

public class LoginRequest {
    @SerializedName("account")
    private String account;
    @SerializedName("password")
    private String password;
    @SerializedName("pushregid")
    private String pushregid;
    @SerializedName("desc")
    private String desc;

    public LoginRequest(String account, String password, String pushregid , String desc) {
        this.account = account;
        this.password = password;
        this.pushregid = pushregid;
        this.desc = desc;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPushregid() {
        return pushregid;
    }

    public void setPushregid(String pushregid) {
        this.pushregid = pushregid;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
