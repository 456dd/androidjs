package com.example.gty.androidjs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private WebView web;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        web = (WebView) findViewById(R.id.web);
        button = (Button) findViewById(R.id.button);
        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl("file:///android_asset/gg.html");
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                web.loadUrl("javascript:do()");

                break;
        }
    }
}
