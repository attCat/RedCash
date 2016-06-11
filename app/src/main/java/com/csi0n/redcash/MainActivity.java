package com.csi0n.redcash;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by csi0n on 2015/11/30 0030.
 */
public class MainActivity extends BaseActivity {
    private Button btn_open;
private TextView btn_open_url;
    @Override
    public void setRootView() {
        super.setRootView();
        setContentView(R.layout.aty_main);
    }

    @Override
    public void initWidget() {
        super.initWidget();
        btn_open = (Button) findViewById(R.id.btn_open);
        btn_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open();
            }
        });
        btn_open_url=(TextView)findViewById(R.id.btn_open_url);
        btn_open_url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_url();
            }
        });
    }

    private void open() {
        try {
            Intent intent = new Intent(android.provider.Settings.ACTION_ACCESSIBILITY_SETTINGS);
            startActivity(intent);
            Toast.makeText(this, "找到抢红包，然后开启服务即可", Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void open_url() {
        try {
            Uri uri = Uri.parse("http://www.csi0n.com");
            Intent it = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(it);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode){
            case KeyEvent.KEYCODE_BACK:
                Toast.makeText(this, "退出", Toast.LENGTH_LONG).show();
                break;
        }
        return super.onKeyDown(keyCode, event);
    }
}
