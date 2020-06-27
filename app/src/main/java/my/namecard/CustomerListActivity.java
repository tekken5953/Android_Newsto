package my.namecard;

import android.app.ActionBar;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.hardware.camera2.params.BlackLevelPattern;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CustomerListActivity extends FragmentActivity {

    DBManager dbManager;
    Button btn_backadd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(android.R.style.Theme_Material_Light_DarkActionBar);
        setTitle("즐겨찾기");
        ActionBar actionBar = getActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#2196F3")));
        setContentView(R.layout.activity_customer_list);

        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(Color.parseColor("#03A9F4"));
        }

        dbManager = new DBManager(this);
        btn_backadd = (Button)findViewById(R.id.btn_backadd);


        // mainlayout 초기화

        final LinearLayout mainlayout = (LinearLayout) findViewById(R.id.mainlayout);

        ////////////////////////////////////
        Cursor cursor = dbManager.selectAll();
        ////////////////////////////////////

        final Intent it = getIntent();
        final String str_name = it.getStringExtra("it_name");

        boolean result = dbManager.insertData(str_name);



        if (result) {
        } else {
        }


        String name = "";
        while (cursor.moveToNext()) {

            name = cursor.getString(cursor.getColumnIndex("name"));

            LinearLayout layout = new LinearLayout(this);
            // 방향성 설정할 때 호출
            layout.setOrientation(LinearLayout.VERTICAL);

            final TextView textView1 = new TextView(this);
            final ImageView imageView1 = new ImageView(this);

            textView1.setTextSize(20);
            textView1.setText(name);
            textView1.setPadding(25, 7, 0, 7);
            textView1.setTextColor(Color.BLACK);

            imageView1.setImageDrawable(getResources().getDrawable(R.drawable.line_gray));

            /////////////////////////////////////////////////////
            textView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), WebviewBook.class);
                    intent.putExtra("name", textView1.getText().toString());
                    startActivity(intent);
                    finish();
                }
            });
            /////////////////////////////////////////////////////


            layout.addView(textView1);
            layout.addView(imageView1);

            mainlayout.addView(layout);

        }


    final Button delete = (Button) findViewById(R.id.btn_delete);

        delete.setTag(mainlayout);

        delete.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        Intent intent1 = new Intent(CustomerListActivity.this, BookMarkDel.class);
        intent1.putExtra("name", delete.getTag().toString());
        startActivity(intent1);
        finish();
    }
    });


        btn_backadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(CustomerListActivity.this,Bookmark.class);
                startActivity(intent2);
                finish();
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
                Intent intent01 = new Intent(CustomerListActivity.this, MainActivity.class);
                startActivity(intent01);
                finish();
                return true;
            case R.id.m_bookmark:
                Intent intent02 = new Intent(CustomerListActivity.this, Bookmark.class);
                startActivity(intent02);
                finish();
                return true;
            case R.id.m_internet:
                 Intent intent03 = new Intent(CustomerListActivity.this,CustomListviewActivity.class);
                 startActivity(intent03);
                 finish();
                 return true;
            case R.id.m_cable:
                Intent intent04 = new Intent(CustomerListActivity.this, CustomListviewActivity2.class);
                startActivity(intent04);
                finish();
                return true;
            case R.id.m_info:
                Intent intent05 = new Intent(CustomerListActivity.this, informationActivity.class);
                startActivity(intent05);
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
