package my.namecard;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClickstar(View imageView){
        Intent intent = new Intent(MainActivity.this,Bookmark.class);
        startActivity(intent);
    }
    public void onClicknews(View imageView2){
        Intent intent = new Intent(MainActivity.this,CustomListviewActivity.class);
        startActivity(intent);
    }
    public void onClickbroadcast(View imageView3){
        Intent intent = new Intent(MainActivity.this,CustomListviewActivity2.class);
        startActivity(intent);
    }
    public void onClickinfo(View imageView4){
        Intent intent = new Intent(MainActivity.this,informationActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Newsto")
                .setMessage("뉴스토를 종료 하시겠습니까?")
                .setPositiveButton("예", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ActivityCompat.finishAffinity(MainActivity.this);
                    }

                })
                .setNegativeButton("아니오", null)
                .show();
    }
}

