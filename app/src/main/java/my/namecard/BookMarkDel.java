package my.namecard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class BookMarkDel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent	=	getIntent();
        String	name = intent.getStringExtra("name");
        DBManager	dbManager	=	new	DBManager(this);
        boolean	result	=	dbManager.deleteData(name);

        if(result){
            Intent	intent1	=	new	Intent(BookMarkDel.this,Bookmark.class);
            startActivity(intent1);
            finish();
            Toast.makeText(getApplicationContext(),"즐겨찾기 목록이 비었습니다",	Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(),"삭제에 실패했습니다",	Toast.LENGTH_LONG).show();
        }
    }
}
