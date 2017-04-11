package com.lyf.test.module;

import com.lyf.test.MainPresenter;
import com.lyf.test.MainView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/4/11 0011.
 */
@Module
public class MainActivityModule {
    private MainView mMainView;
    public MainActivityModule(MainView mainView){
        mMainView = mainView;
    }
    @Provides
    MainPresenter provideMainPresenter(){
        return new MainPresenter(mMainView);
    }


}
