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
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;

public class informationActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(android.R.style.Theme_Material_Light_DarkActionBar);
        setTitle("정보");
        ActionBar actionBar = getActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#2196F3")));
        setContentView(R.layout.activity_information);

        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(Color.parseColor("#03A9F4"));
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
                Intent intent01 = new Intent(informationActivity.this,MainActivity.class);
                startActivity(intent01);
                finish();
                return true;
            case R.id.m_bookmark:
                Intent intent02 = new Intent(informationActivity.this,Bookmark.class);
                startActivity(intent02);
                finish();
                return true;
            case R.id.m_internet:
                Intent intent03 = new Intent(informationActivity.this,CustomListviewActivity.class);
                startActivity(intent03);
                finish();
                return true;
            case R.id.m_cable:
                Intent intent04 = new Intent(informationActivity.this,CustomListviewActivity2.class);
                startActivity(intent04);
                finish();
                return true;
            //case R.id.m_info:
                //Intent intent05 = new Intent(informationActivity.this,informationActivity.class);
                //startActivity(intent05);
                //return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
