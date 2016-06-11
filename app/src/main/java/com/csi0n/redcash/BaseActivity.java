package com.csi0n.redcash;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.csi0n.redcash.utils.AppManager;

/**
 * Created by csi0n on 2015/11/30 0030.
 */
public class BaseActivity extends FragmentActivity implements I_Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppManager.getAppManager().addActivity(this);
        setRootView();
        BeforeInitWidget();
        initWidget();
        AfterInitWidget();
    }

    @Override
    public void setRootView() {

    }

    @Override
    public void BeforeInitWidget() {

    }

    @Override
    public void initWidget() {

    }

    @Override
    public void AfterInitWidget() {

    }
}
