package com.lyf.test;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.lyf.test.component.DaggerMainActivityComponent;
import com.lyf.test.module.MainActivityModule;
import com.lyf.test.view.EditTextWithDelete;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainView{

    @BindView(R.id.edt_login_account)
    EditTextWithDelete mEdtLoginAccount;
    @BindView(R.id.edt_login_password)
    EditTextWithDelete mEdtLoginPassword;
    @BindView(R.id.btn_login_login)
    Button mBtnLoginLogin;
    private String mAccount;
    private String mPassWord;
    private ProgressDialog mDialog;
    @Inject MainPresenter mMainPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initInject();
        ButterKnife.bind(this);
        init();
    }
//注入依赖
    private void initInject() {
        DaggerMainActivityComponent.builder()
                .mainActivityModule(new MainActivityModule(this))
                .build().inject(this);
    }

    private void init() {
        //登录按钮点击事件
        mBtnLoginLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMainPresenter.login(mAccount,mPassWord);
            }
        });
        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                judgeEditLength();
                mAccount = mEdtLoginAccount.getText().toString();
                mPassWord = mEdtLoginPassword.getText().toString();
                checkLogin(mAccount, mPassWord);
            }
        };
        mEdtLoginPassword.addTextChangedListener(textWatcher);
        mEdtLoginAccount.addTextChangedListener(textWatcher);
    }
    //判断密码在6位以上时，设置按钮为可用
    private void checkLogin(String account, String passWord) {
        if(TextUtils.isEmpty(account)||TextUtils.isEmpty(passWord)){
            return;
        }else if(passWord.length() >= 6){
            mBtnLoginLogin.setEnabled(true);

        }else {
            mBtnLoginLogin.setEnabled(false);
        }

    }
//使密码不超过20个字符
    private void judgeEditLength() {
        Editable editable = mEdtLoginPassword.getText();
        int length =editable.length();
        if(length > 20){
            int endIndex = Selection.getSelectionEnd(editable);
            String str = editable.toString();
            String newStr = str.substring(0 , 20);
            mEdtLoginPassword.setText(newStr);
            editable=mEdtLoginPassword.getText();
            int newLength = editable.length();
            if( endIndex > newLength){
                endIndex =newLength;
            }
            Selection.setSelection(editable,endIndex);
        }
    }

    @Override
    public void showProgress() {
        mDialog = ProgressDialog.show(this, "正在登录", "请稍候。。。");
    }

    @Override
    public void hintProgress() {
        if(mDialog!=null){
            mDialog.dismiss();
        }
    }

    @Override
    public void showMsg(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
}
