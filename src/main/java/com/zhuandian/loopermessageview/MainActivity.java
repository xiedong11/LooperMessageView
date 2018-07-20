package com.zhuandian.loopermessageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private LooperMessageView messageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        messageView = (LooperMessageView) findViewById(R.id.lmv_news);
        messageView.setTipList(generateTips());
    }

    private List<String> generateTips() {
        List<String> tips = new ArrayList<>();
        tips.add("自定义view实现上下轮播的view");
        tips.add("仿京东、支付宝消息轮播效果");

        return tips;
    }
}
