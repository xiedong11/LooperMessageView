package com.zhuandian.loopermessageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

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
        messageView.setOnItemClickListener(new LooperMessageView.OnItemClickListener() {
            @Override
            public void onClick(String message) {
                Toast.makeText(MainActivity.this, "正要跳转到  " + message, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private List<MessageEntity> generateTips() {
        List<MessageEntity> tips = new ArrayList<>();
        tips.add(new MessageEntity(R.drawable.ic_friends, "有小伙伴艾特你了"));
        tips.add(new MessageEntity(R.drawable.ic_friend_b, "社区里有人给你发私信了"));
        return tips;
    }
}
