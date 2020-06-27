package my.namecard;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import my.namecard.WebView_news.WebView;
import my.namecard.WebView_news.Webview_asia;
import my.namecard.WebView_news.Webview_chosun;
import my.namecard.WebView_news.Webview_daily;
import my.namecard.WebView_news.Webview_daum;
import my.namecard.WebView_news.Webview_dju;
import my.namecard.WebView_news.Webview_djupotal;
import my.namecard.WebView_news.Webview_donga;
import my.namecard.WebView_news.Webview_gukmin;
import my.namecard.WebView_news.Webview_gyocharo;
import my.namecard.WebView_news.Webview_joongang;
import my.namecard.WebView_news.Webview_kyounghyang;
import my.namecard.WebView_news.Webview_mise;
import my.namecard.WebView_news.Webview_nate;
import my.namecard.WebView_news.Webview_naverweather;
import my.namecard.WebView_news.Webview_nocut;
import my.namecard.WebView_news.Webview_segye;
import my.namecard.WebView_news.Webview_sportsseoul;
import my.namecard.WebView_news.Webview_sportstoday;

public class CustomListviewActivity extends FragmentActivity {

    ListView list;
    String[] titles = {
            "네이버 뉴스",
            "다음 뉴스",
            "중앙 일보",
            "조선 일보",
            "네이트 뉴스",
            "데일리 경제",
            "국민 일보",
            "경향 신문",
            "동아 일보",
            "세계 일보",
            "스포츠 투데이",
            "아시아 경제",
            "노컷 뉴스",
            "스포츠 서울",
            "교차로",
            "네이버 날씨",
            "미세먼지 정보",
            "대전대학교",
            "대전대학교 포털시스템"
    } ;

    Integer[] images = {
            R.drawable.news1,
            R.drawable.news2,
            R.drawable.news3,
            R.drawable.news4,
            R.drawable.news5,
            R.drawable.news6,
            R.drawable.news7,
            R.drawable.news8,
            R.drawable.dongaicon,
            R.drawable.seagyeicon,
            R.drawable.sportsicon,
            R.drawable.asiacion,
            R.drawable.nocuticon,
            R.drawable.sportsseoulicon,
            R.drawable.gyocharo,
            R.drawable.weather,
            R.drawable.misae,
            R.drawable.daejeonhome,
            R.drawable.portal
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(android.R.style.Theme_Material_Light_DarkActionBar);
        setTitle("인터넷 뉴스");
        ActionBar actionBar = getActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#2196F3")));
        setContentView(R.layout.activity_custom_listview);


        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(Color.parseColor("#03A9F4"));
        }



        list=(ListView)findViewById(R.id.list);

        // list와 어댑터를 연결
        CustomList adapter = new CustomList(this);

        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch (position)
                {
                    case 0 :
                        Intent intent0 = new Intent(CustomListviewActivity.this, WebView.class);
                        startActivity(intent0);
                        break;
                    case 1:
                        Intent intent1 = new Intent(CustomListviewActivity.this, Webview_daum.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(CustomListviewActivity.this, Webview_joongang.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(CustomListviewActivity.this, Webview_chosun.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(CustomListviewActivity.this, Webview_nate.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(CustomListviewActivity.this, Webview_daily.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(CustomListviewActivity.this, Webview_gukmin.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(CustomListviewActivity.this, Webview_kyounghyang.class);
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(CustomListviewActivity.this, Webview_donga.class);
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(CustomListviewActivity.this, Webview_segye.class);
                        startActivity(intent9);
                        break;
                    case 10:
                        Intent intent10 = new Intent(CustomListviewActivity.this, Webview_sportstoday.class);
                        startActivity(intent10);
                        break;
                    case 11:
                        Intent intent11 = new Intent(CustomListviewActivity.this, Webview_asia.class);
                        startActivity(intent11);
                        break;
                    case 12:
                        Intent intent12 = new Intent(CustomListviewActivity.this, Webview_nocut.class);
                        startActivity(intent12);
                        break;
                    case 13:
                        Intent intent13 = new Intent(CustomListviewActivity.this, Webview_sportsseoul.class);
                        startActivity(intent13);
                        break;
                    case 14:
                        Intent intent14 = new Intent(CustomListviewActivity.this, Webview_gyocharo.class);
                        startActivity(intent14);
                        break;
                    case 15:
                        Intent intent15 = new Intent(CustomListviewActivity.this, Webview_naverweather.class);
                        startActivity(intent15);
                        break;
                    case 16:
                        Intent intent16 = new Intent(CustomListviewActivity.this, Webview_mise.class);
                        startActivity(intent16);
                        break;
                    case 17:
                        Intent intent17 = new Intent(CustomListviewActivity.this, Webview_dju.class);
                        startActivity(intent17);
                        break;
                    case 18:
                        Intent intent18 = new Intent(CustomListviewActivity.this, Webview_djupotal.class);
                        startActivity(intent18);
                        break;
                }
            }
        });


    }
    // 클래스를 내부 클래스로 작성
    public class CustomList extends ArrayAdapter<String> {
        private final Activity context;
        public CustomList(Activity context ) {
            super(context, R.layout.listitem, titles); // 부모 생성자 호출(this, 표준 레이아웃 style, 배열명) = 값 3개, listitem은 xml파일임.
            this.context = context;
        }
        @Override
        public View getView(int position, View view, ViewGroup parent) { // View가 하나의 큰 뷰
            LayoutInflater inflater = context.getLayoutInflater(); // Inflater
            View rowView= inflater.inflate(R.layout.listitem, null, true);
            ImageView imageView = (ImageView) rowView.findViewById(R.id.image);
            TextView title = (TextView) rowView.findViewById(R.id.title);


            title.setText(titles[position]);
            imageView.setImageResource(images[position]);

            return rowView;
        }
    }


    // 메뉴팽창
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);
        return true;
    }

    // 메뉴 아이템 선택 이벤트 처리
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.m_home:
                Intent intent01 = new Intent(CustomListviewActivity.this, MainActivity.class);
                startActivity(intent01);
                finish();
                return true;
            case R.id.m_bookmark:
                Intent intent02 = new Intent(CustomListviewActivity.this, Bookmark.class);
                startActivity(intent02);
                finish();
                return true;
            //case R.id.m_internet:
            // Intent intent03 = new Intent(CustomListviewActivity.this,CustomListviewActivity.class);
            //startActivity(intent03);
            // finish();
            // return true;
            case R.id.m_cable:
                Intent intent04 = new Intent(CustomListviewActivity.this, CustomListviewActivity2.class);
                startActivity(intent04);
                finish();
                return true;
            case R.id.m_info:
                Intent intent05 = new Intent(CustomListviewActivity.this, informationActivity.class);
                startActivity(intent05);
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


}