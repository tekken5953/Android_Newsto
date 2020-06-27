package my.namecard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.Toast;

public class WebviewBook extends AppCompatActivity {
    ImageView btn_Back, btn_Go, btn_Refresh, btn_PageUp;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview_book);

        btn_Back = (ImageView)findViewById(R.id.btn_Back);
        btn_Go = (ImageView)findViewById(R.id.btn_Go);
        btn_Refresh = (ImageView)findViewById(R.id.btn_Refresh);
        btn_PageUp = (ImageView)findViewById(R.id.btn_PageUp);

        webView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setAppCacheEnabled(false);
        webSettings.setJavaScriptEnabled(true); // 자바스크립트 허용
        webSettings.setLoadWithOverviewMode(true); // 컨텐츠가 웹뷰보다 클 경우 스크린 크기에 맞게 조정
        webView.setWebViewClient(new WebViewClient()); // 새창 뜨지 않게 하기위해서

        Intent intent = getIntent();
        String result_name = intent.getStringExtra("name");

        if(result_name.equals("네이버뉴스") || result_name.equals("네이버 뉴스") || result_name.equals("네이버") ||result_name.equals("naver")) {
            webView.loadUrl("https://m.news.naver.com/");
        }
        else if(result_name.equals("다음뉴스") || result_name.equals("다음 뉴스") || result_name.equals("다음") ) {
            webView.loadUrl("https://m.media.daum.net/m/media/");
        }
        else if(result_name.equals("중앙일보") || result_name.equals("중앙 일보") || result_name.equals("중앙")) {
            webView.loadUrl("https://mnews.joins.com");
        }
        else if(result_name.equals("조선일보") || result_name.equals("조선 일보") || result_name.equals("조선")) {
            webView.loadUrl("http://m.chosun.com/?utm_medium=unknown&utm_campaign=main&utm_source=");
        }
        else if(result_name.equals("네이트뉴스") || result_name.equals("네이트 뉴스") || result_name.equals("네이트")) {
            webView.loadUrl("https://news.nate.com");
        }
        else if(result_name.equals("데일리경제") || result_name.equals("데일리 경제") || result_name.equals("데일리")) {
            webView.loadUrl("http://www.kdpress.co.kr/");
        }
        else if(result_name.equals("국민일보") || result_name.equals("국민 일보") || result_name.equals("국민")) {
            webView.loadUrl("http://m.kmib.co.kr/");
        }
        else if(result_name.equals("경향신문") || result_name.equals("경향 신문") || result_name.equals("경향")) {
            webView.loadUrl("http://m.khan.co.kr/");
        }
        else if(result_name.equals("동아일보") || result_name.equals("동아 일보") || result_name.equals("동아")) {
            webView.loadUrl("http://m.donga.com/");
        }
        else if(result_name.equals("세계일보") || result_name.equals("세계 일보") || result_name.equals("세계")) {
            webView.loadUrl("http://m.segye.com");
        }
        else if(result_name.equals("스포츠투데이") || result_name.equals("스포츠 투데이")) {
            webView.loadUrl("http://mstoo.asiae.co.kr");
        }
        else if(result_name.equals("아시아경제") || result_name.equals("아시아 경제") || result_name.equals("아시아")) {
            webView.loadUrl("https://cm.asiae.co.kr");
        }
        else if(result_name.equals("노컷뉴스") || result_name.equals("노컷 뉴스") || result_name.equals("노컷")) {
            webView.loadUrl("https://m.nocutnews.co.kr");
        }
        else if(result_name.equals("스포츠서울") || result_name.equals("스포츠 서울")) {
            webView.loadUrl("http://m.sportsseoul.com");
        }
        else if(result_name.equals("교차로") || result_name.equals("교차로 뉴스") || result_name.equals("교차로뉴스")) {
            webView.loadUrl("http://kcrapp.icross.co.kr/local_select.icross?msgdis=y");
        }
        else if(result_name.equals("네이버날씨") || result_name.equals("네이버 날씨") || result_name.equals("날씨")) {
            webView.loadUrl("https://m.weather.naver.com/m/main.nhn");
        }
        else if(result_name.equals("미세먼지정보") || result_name.equals("미세먼지 정보") || result_name.equals("미세먼지")) {
            webView.loadUrl("http://m.airkorea.or.kr/main;jsessionid=69YKilJZEVLfaP9VtVomfVkwfaVtzxSoIr7Xa37JuI46DNdZUFa3b6VKOqeXVMH2.airwas1_servlet_newmobile1");
        }
        else if(result_name.equals("대전대학교") || result_name.equals("대전대") || result_name.equals("대전대 학교")) {
            webView.loadUrl("http://m.dju.ac.kr");
        }
        else if(result_name.equals("대전대학교 포털시스템") || result_name.equals("대전대학교 포털") || result_name.equals("포털") || result_name.equals("포털시스템") || result_name.equals("대전대 포털")) {
            webView.loadUrl("https://portal.dju.ac.kr");
        }
        else if(result_name.equals("KBS") || result_name.equals("KBS뉴스") || result_name.equals("KBS 뉴스") || result_name.equals("kbs") || result_name.equals("kbs뉴스") || result_name.equals("kbs 뉴스")) {
            webView.loadUrl("http://mn.kbs.co.kr/mobile/main.html");
        }
        else if(result_name.equals("SBS") || result_name.equals("SBS뉴스") || result_name.equals("SBS 뉴스") || result_name.equals("sbs") || result_name.equals("sbs뉴스") || result_name.equals("sbs 뉴스")) {
            webView.loadUrl("https://mnews.sbs.co.kr//news/newsMain.do");
        }
        else if(result_name.equals("MBC") || result_name.equals("MBC뉴스") || result_name.equals("MBC 뉴스") || result_name.equals("mbc") || result_name.equals("mbc뉴스") || result_name.equals("mbc 뉴스")) {
            webView.loadUrl("http://imnews.imbc.com/index_mobile01.html");
        }
        else if(result_name.equals("JTBC") || result_name.equals("JTBC뉴스") || result_name.equals("JTBC 뉴스") || result_name.equals("jtbc") || result_name.equals("jtbc뉴스") || result_name.equals("jtbc 뉴스")) {
            webView.loadUrl("http://mnews.jtbc.joins.com/");
        }
        else if(result_name.equals("YTN") || result_name.equals("YTN뉴스") || result_name.equals("YTN 뉴스") || result_name.equals("ytn") || result_name.equals("ytn뉴스") || result_name.equals("ytn 뉴스")) {
            webView.loadUrl("https://m.ytn.co.kr/");
        }
        else if(result_name.equals("MBN") || result_name.equals("MBN뉴스") || result_name.equals("MBN 뉴스") || result_name.equals("mbn") || result_name.equals("mbn뉴스") || result_name.equals("mbn 뉴스")) {
            webView.loadUrl("http://m.mbn.co.kr/");
        }
        else if(result_name.equals("TV조선") || result_name.equals("TV 조선") || result_name.equals("tv조선") || result_name.equals("tv 조선")) {
            webView.loadUrl("http://m.tv.chosun.com/home.cstv");
        }
        else if(result_name.equals("채널A") || result_name.equals("채널 A") || result_name.equals("채널a") || result_name.equals("채널 a")) {
            webView.loadUrl("http://m.ichannela.com/news/main/news_main_mob.do");
        }
        else if(result_name.equals("네이버TV") || result_name.equals("네이버 TV") || result_name.equals("네이버tv") || result_name.equals("네이버 tv")) {
            webView.loadUrl("https://m.tv.naver.com");
        }
        else if(result_name.equals("Google") || result_name.equals("GOOGLE") || result_name.equals("google") || result_name.equals("Google뉴스") || result_name.equals("GOOGLE뉴스")
                || result_name.equals("google뉴스") || result_name.equals("Google 뉴스") || result_name.equals("GOOGLE 뉴스") || result_name.equals("google 뉴스")) {
            webView.loadUrl("https://news.google.com/");
        }
        else if(result_name.equals("한국경제TV") || result_name.equals("한국경제 TV") || result_name.equals("한국경제tv") || result_name.equals("한국경제 tv")) {
            webView.loadUrl("http://m.wowtv.co.kr/");
        }
        else if(result_name.equals("Youtube") || result_name.equals("YouTube") || result_name.equals("youtube") || result_name.equals("유튜브")) {
            webView.loadUrl("https://youtube.com/");
        }
        else if(result_name.equals("NBC") || result_name.equals("nbc") || result_name.equals("엔비씨")) {
            webView.loadUrl("https://www.nbc.com/");
        }
        else if(result_name.equals("CNN") || result_name.equals("cnn") || result_name.equals("씨엔엔")) {
            webView.loadUrl("https://edition.cnn.com/");
        }
        else if(result_name.equals("BBC") || result_name.equals("bbc") || result_name.equals("비비씨")) {
            webView.loadUrl("https://www.bbc.com/");
        }
        else {
            Toast.makeText(getApplicationContext(),"정확한 이름을 입력하세요.",Toast.LENGTH_SHORT).show();
        }

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
