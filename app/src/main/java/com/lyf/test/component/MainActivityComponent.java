package com.lyf.test.component;

import com.lyf.test.MainActivity;
import com.lyf.test.module.MainActivityModule;

import dagger.Component;

/**
 * Created by Administrator on 2017/4/11 0011.
 */
@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {
    void inject(MainActivity mainActivity);
}
