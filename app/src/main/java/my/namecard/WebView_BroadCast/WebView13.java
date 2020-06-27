package my.namecard.WebView_BroadCast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import my.namecard.R;

public class WebView13 extends AppCompatActivity {
    android.webkit.WebView webView;
    ImageView btn_Back, btn_Go, btn_Home, btn_Refresh, btn_PageUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        btn_Back = (ImageView)findViewById(R.id.btn_Back);
        btn_Go = (ImageView)findViewById(R.id.btn_Go);
        btn_Home = (ImageView)findViewById(R.id.btn_Home);
        btn_Refresh = (ImageView)findViewById(R.id.btn_Refresh);
        btn_PageUp = (ImageView)findViewById(R.id.btn_PageUp);

        webView = (android.webkit.WebView)findViewById(R.id.webView);

        WebSettings webSettings = webView.getSettings();
        webSettings.setAppCacheEnabled(false);
        webSettings.setJavaScriptEnabled(true); // 자바스크립트 허용
        webSettings.setLoadWithOverviewMode(true); // 컨텐츠가 웹뷰보다 클 경우 스크린 크기에 맞게 조정

        // 브라우저가 새 창에서 열리는 것을 방지
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(android.webkit.WebView view, String url) {
                view.loadUrl(url);
                return false;
            }
        });

        webView.loadUrl("https://edition.cnn.com/");

        // webView 내에서 뒤로가기 키를 클릭했을 시 발생하는 이벤트 처리
        btn_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.goBack();
            }
        });

        // webView 내에서 앞으로가기 키를 클릭했을 시 발생하는 이벤트 처리
        btn_Go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.goForward();
            }
        });

        // webView 내에서 처음으로가기 키를 클릭했을 시 발생하는 이벤트 처리
        btn_Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("https://edition.cnn.com/");
            }
        });

        // webView 내에서 새로고침 키를 클릭했을 시 발생하는 이벤트 처리
        btn_Refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.reload();
            }
        });

        // webView 내에서 위로스크롤 키를 클릭했을 시 발생하는 이벤트 처리
        btn_PageUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.pageUp(true);
            }
        });
    }
}
