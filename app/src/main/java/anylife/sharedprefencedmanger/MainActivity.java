package anylife.sharedprefencedmanger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		SharedPreferencesDao.getInstance().saveDate("test1",1111);
		int test1=SharedPreferencesDao.getInstance().getDate("test1",-1,Integer.class);             //会不会太繁琐了？
		int testTemp=SharedPreferencesDao.getInstance().getDate("testTemp",250,Integer.class);      //没有保存testTemp

		SharedPreferencesDao.getInstance().saveDate("test2","helloworld");
		String test2=SharedPreferencesDao.getInstance().getDate("Test2",0,String.class);

	}
}
