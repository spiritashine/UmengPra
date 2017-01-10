package com.hujie.umengpra;

import android.os.Bundle;
import android.widget.Toast;

import com.umeng.analytics.MobclickAgent;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        MobclickAgent.UMAnalyticsConfig config=
//                new MobclickAgent.UMAnalyticsConfig
//                        (this,"58747f4c07fe653817000c95","channel");
//        MobclickAgent.startWithConfigure(config);
    }

    long curent=0;
    @Override
    public void onBackPressed() {
        if (System.currentTimeMillis()-curent>2000){
            Toast.makeText(this, "再按一下退出", Toast.LENGTH_LONG).show();
            curent=System.currentTimeMillis();
        }else {
            super.onBackPressed();
            MobclickAgent.onKillProcess(this);
            System.exit(0);
        }
    }
}
