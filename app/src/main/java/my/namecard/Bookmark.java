package my.namecard;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Bookmark extends FragmentActivity {
    Button btn_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(android.R.style.Theme_Material_Light_DarkActionBar);
        setTitle("즐겨찾기 추가");
        ActionBar actionBar = getActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#2196F3")));
        setContentView(R.layout.activity_bookmark);


        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(Color.parseColor("#03A9F4"));
        }

        btn_add = (Button) findViewById(R.id.btn_add);



        Button deleteblank = (Button) findViewById(R.id.btn_delete);



        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et_name = (EditText)findViewById(R.id.name);
                String str_name = et_name.getText().toString();

                if(str_name.length() == 0 ){
                    Toast.makeText(getApplicationContext(), "뉴스 이름이 입력되지 않았습니다.", Toast.LENGTH_SHORT).show();
                    et_name.requestFocus();
                }
                else if(str_name.equals("네이버뉴스") || str_name.equals("네이버 뉴스") || str_name.equals("네이버") ||str_name.equals("naver")
                        || str_name.equals("다음뉴스") || str_name.equals("다음 뉴스") || str_name.equals("다음") || str_name.equals("중앙일보")
                        || str_name.equals("중앙 일보") || str_name.equals("중앙") || str_name.equals("조선일보") || str_name.equals("조선 일보")
                        || str_name.equals("조선") || str_name.equals("네이트뉴스") || str_name.equals("네이트 뉴스") || str_name.equals("네이트")
                        || str_name.equals("데일리경제") || str_name.equals("데일리 경제") || str_name.equals("데일리") || str_name.equals("국민일보")
                        || str_name.equals("국민 일보") || str_name.equals("국민") || str_name.equals("경향신문") || str_name.equals("경향 신문")
                        || str_name.equals("경향") || str_name.equals("동아일보") || str_name.equals("동아 일보") || str_name.equals("동아")
                        || str_name.equals("세계일보") || str_name.equals("세계 일보") || str_name.equals("세계") || str_name.equals("스포츠투데이")
                        || str_name.equals("스포츠 투데이") || str_name.equals("아시아경제") || str_name.equals("아시아 경제") || str_name.equals("아시아")
                        || str_name.equals("노컷뉴스") || str_name.equals("노컷 뉴스") || str_name.equals("노컷") || str_name.equals("스포츠서울")
                        || str_name.equals("스포츠 서울") || str_name.equals("교차로") || str_name.equals("교차로 뉴스") || str_name.equals("교차로뉴스")
                        || str_name.equals("네이버날씨") || str_name.equals("네이버 날씨") || str_name.equals("날씨") || str_name.equals("미세먼지정보")
                        || str_name.equals("미세먼지 정보") || str_name.equals("미세먼지") || str_name.equals("대전대학교") || str_name.equals("대전대")
                        || str_name.equals("대전대 학교") || str_name.equals("대전대학교 포털시스템") || str_name.equals("대전대학교 포털")
                        || str_name.equals("포털") || str_name.equals("포털시스템") || str_name.equals("대전대 포털") || str_name.equals("KBS")
                        || str_name.equals("KBS뉴스") || str_name.equals("KBS 뉴스") || str_name.equals("kbs") || str_name.equals("kbs뉴스")
                        || str_name.equals("kbs 뉴스") || str_name.equals("SBS") || str_name.equals("SBS뉴스") || str_name.equals("SBS 뉴스")
                        || str_name.equals("sbs") || str_name.equals("sbs뉴스") || str_name.equals("sbs 뉴스") || str_name.equals("MBC")
                        || str_name.equals("MBC뉴스") || str_name.equals("MBC 뉴스") || str_name.equals("mbc") || str_name.equals("mbc뉴스")
                        || str_name.equals("mbc 뉴스") || str_name.equals("JTBC") || str_name.equals("JTBC뉴스") || str_name.equals("JTBC 뉴스")
                        || str_name.equals("jtbc") || str_name.equals("jtbc뉴스") || str_name.equals("jtbc 뉴스") || str_name.equals("YTN")
                        || str_name.equals("YTN뉴스") || str_name.equals("YTN 뉴스") || str_name.equals("ytn") || str_name.equals("ytn뉴스")
                        || str_name.equals("ytn 뉴스") || str_name.equals("MBN") || str_name.equals("MBN뉴스") || str_name.equals("MBN 뉴스")
                        || str_name.equals("mbn") || str_name.equals("mbn뉴스") || str_name.equals("mbn 뉴스") || str_name.equals("TV조선")
                        || str_name.equals("TV 조선") || str_name.equals("tv조선") || str_name.equals("tv 조선") || str_name.equals("채널A")
                        || str_name.equals("채널 A") || str_name.equals("채널a") || str_name.equals("채널 a") || str_name.equals("네이버TV")
                        || str_name.equals("네이버 TV") || str_name.equals("네이버tv") || str_name.equals("네이버 tv") || str_name.equals("Google")
                        || str_name.equals("GOOGLE") || str_name.equals("google") || str_name.equals("Google뉴스") || str_name.equals("GOOGLE뉴스")
                        || str_name.equals("한국경제TV") || str_name.equals("한국경제 TV") || str_name.equals("한국경제tv") || str_name.equals("한국경제 tv")
                        || str_name.equals("Youtube") || str_name.equals("YouTube") || str_name.equals("youtube") || str_name.equals("유튜브")
                        || str_name.equals("NBC") || str_name.equals("nbc") || str_name.equals("엔비씨") || str_name.equals("CNN") || str_name.equals("cnn")
                        || str_name.equals("씨엔엔") || str_name.equals("BBC") || str_name.equals("bbc") || str_name.equals("비비씨") ){
                    Intent it = new Intent(Bookmark.this, CustomerListActivity.class);
                    it.putExtra("it_name", str_name);
                    startActivity(it);
                    finish();
                }
                else{
                    Toast.makeText(getApplicationContext(), "없는 뉴스입니다.", Toast.LENGTH_SHORT).show();
                    et_name.requestFocus();
                }

            }
        });

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
                Intent intent01 = new Intent(Bookmark.this, MainActivity.class);
                startActivity(intent01);
                finish();
                return true;
            //case R.id.m_bookmark:
              //  Intent intent02 = new Intent(Bookmark.this, Bookmark.class);
              //  startActivity(intent02);
              //  finish();
               // return true;
            case R.id.m_internet:
                 Intent intent03 = new Intent(Bookmark.this,CustomListviewActivity.class);
                 startActivity(intent03);
                 finish();
             return true;
            case R.id.m_cable:
                Intent intent04 = new Intent(Bookmark.this, CustomListviewActivity2.class);
                startActivity(intent04);
                finish();
                return true;
            case R.id.m_info:
                Intent intent05 = new Intent(Bookmark.this, informationActivity.class);
                startActivity(intent05);
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


}