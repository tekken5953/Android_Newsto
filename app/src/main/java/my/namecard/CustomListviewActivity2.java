package my.namecard;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
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

import my.namecard.WebView_BroadCast.WebView0;
import my.namecard.WebView_BroadCast.WebView1;
import my.namecard.WebView_BroadCast.WebView10;
import my.namecard.WebView_BroadCast.WebView11;
import my.namecard.WebView_BroadCast.WebView12;
import my.namecard.WebView_BroadCast.WebView13;
import my.namecard.WebView_BroadCast.WebView14;
import my.namecard.WebView_BroadCast.WebView2;
import my.namecard.WebView_BroadCast.WebView3;
import my.namecard.WebView_BroadCast.WebView4;
import my.namecard.WebView_BroadCast.WebView5;
import my.namecard.WebView_BroadCast.WebView6;
import my.namecard.WebView_BroadCast.WebView7;
import my.namecard.WebView_BroadCast.WebView8;
import my.namecard.WebView_BroadCast.WebView9;

public class CustomListviewActivity2 extends FragmentActivity {

    ListView list;
    String[] titles2 = {
            "KBS 뉴스",
            "SBS 뉴스",
            "MBC 뉴스",
            "JTBC 뉴스",
            "YTN 뉴스",
            "MBN 뉴스",
            "TV조선",
            "채널A",
            "네이버TV",
            "구글 뉴스",
            "한국경제TV",
            "YouTube",
            "NBC",
            "CNN",
            "BBC"
    } ;
    Integer[] images2 = {
            R.drawable.cable1,
            R.drawable.cable2,
            R.drawable.cable3,
            R.drawable.cable4,
            R.drawable.cable5,
            R.drawable.cable6,
            R.drawable.cable7,
            R.drawable.cable8,
            R.drawable.navericon,
            R.drawable.google,
            R.drawable.hangukicon,
            R.drawable.youtube,
            R.drawable.nbc,
            R.drawable.cnn,
            R.drawable.bbc
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(android.R.style.Theme_Material_Light_DarkActionBar);
        setTitle("방송 뉴스");
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
                        Intent intent0 = new Intent(CustomListviewActivity2.this, WebView0.class);
                        startActivity(intent0);
                        break;
                    case 1:
                        Intent intent1 = new Intent(CustomListviewActivity2.this, WebView1.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(CustomListviewActivity2.this, WebView2.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(CustomListviewActivity2.this, WebView3.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(CustomListviewActivity2.this, WebView4.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(CustomListviewActivity2.this, WebView5.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(CustomListviewActivity2.this, WebView6.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(CustomListviewActivity2.this, WebView7.class);
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(CustomListviewActivity2.this, WebView8.class);
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(CustomListviewActivity2.this, WebView9.class);
                        startActivity(intent9);
                        break;
                    case 10:
                        Intent intent10 = new Intent(CustomListviewActivity2.this, WebView10.class);
                        startActivity(intent10);
                        break;
                    case 11:
                        Intent intent11 = new Intent(CustomListviewActivity2.this, WebView11.class);
                        startActivity(intent11);
                        break;
                    case 12:
                        Intent intent12 = new Intent(CustomListviewActivity2.this, WebView12.class);
                        startActivity(intent12);
                        break;
                    case 13:
                        Intent intent13 = new Intent(CustomListviewActivity2.this, WebView13.class);
                        startActivity(intent13);
                        break;
                    case 14:
                        Intent intent14 = new Intent(CustomListviewActivity2.this, WebView14.class);
                        startActivity(intent14);
                        break;

                }
            }
        });
    }
    // 클래스를 내부 클래스로 작성
    public class CustomList extends ArrayAdapter<String> {
        private final Activity context;
        public CustomList(Activity context ) {
            super(context, R.layout.listitem2, titles2); // 부모 생성자 호출(this, 표준 레이아웃 style, 배열명) = 값 3개, listitem은 xml파일임.
            this.context = context;
        }
        @Override
        public View getView(int position, View view, ViewGroup parent) { // View가 하나의 큰 뷰
            LayoutInflater inflater = context.getLayoutInflater(); // Inflater
            View rowView= inflater.inflate(R.layout.listitem2, null, true);
            ImageView imageView = (ImageView) rowView.findViewById(R.id.image2);
            TextView title = (TextView) rowView.findViewById(R.id.title2);


            title.setText(titles2[position]);
            imageView.setImageResource(images2[position]);

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
                Intent intent01 = new Intent(CustomListviewActivity2.this,MainActivity.class);
                startActivity(intent01);
                finish();
                return true;
            case R.id.m_bookmark:
                Intent intent02 = new Intent(CustomListviewActivity2.this,Bookmark.class);
                startActivity(intent02);
                finish();
                return true;
            case R.id.m_internet:
                Intent intent03 = new Intent(CustomListviewActivity2.this,CustomListviewActivity.class);
                startActivity(intent03);
                finish();
                return true;
            //case R.id.m_cable:
                //Intent intent04 = new Intent(CustomListviewActivity2.this,CustomListviewActivity2.class);
                //startActivity(intent04);
                //return true;
            case R.id.m_info:
                Intent intent05 = new Intent(CustomListviewActivity2.this,informationActivity.class);
                startActivity(intent05);
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}