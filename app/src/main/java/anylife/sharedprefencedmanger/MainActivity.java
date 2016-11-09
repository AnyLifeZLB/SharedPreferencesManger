package anylife.sharedprefencedmanger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		String jsonStr="{\n" +
				"    \"type\": \"news\",\n" +
				"    \"text\": \"Apple will publish a new Macbook& MacBook pro at 27/10/2016,if you like it ,buy it!\"\n" +
				"}";
		SharedPreferencesDao.getInstance().saveData("jsonStr",jsonStr);
		SharedPreferencesDao.getInstance().getData("jsonStr","",String.class);
		

		SharedPreferencesDao.getInstance().saveData("test1",1111);
		int test1=SharedPreferencesDao.getInstance().getData("test1",-1,Integer.class); //not good enough
		int testTemp=SharedPreferencesDao.getInstance().getData("testTemp",250,Integer.class);  //have nokey testtemp

	}
}
