package anylife.sharedprefencedmanger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import anylife.sharedprefencedmanger.multiProcess.ServiceInOtherProcess;

public class MainActivity extends AppCompatActivity {

	String jsonStr="{\n" +
			"    \"type\": \"news\",\n" +
			"    \"text\": \"Apple will publish a new Macbook& MacBook pro at 27/10/2016,if you like it ,buy it!\"\n" +
			"}";

	int test =7;

	private TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		SharedPreferencesDao.getInstance().saveData("jsonStr",jsonStr);
		SharedPreferencesDao.getInstance().getData("jsonStr","",String.class);

		SharedPreferencesDao.getInstance().saveData("test1",1111);
		int test1=SharedPreferencesDao.getInstance().getData("test1",-1,Integer.class);         //not good enough
		int testTemp=SharedPreferencesDao.getInstance().getData("testTemp",250,Integer.class);  //have nokey testtemp


		//Test Multi Process
		ServiceInOtherProcess.startActionBaz(this,"dddd","dddd");
		textView=(TextView) findViewById(R.id.testBtn);
		textView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				test++;
				SharedPreferencesDao.getInstance().saveData("TestMultiProcess",test);
				Log.e("MuitiProcess","Main Proces:     "+SharedPreferencesDao.getInstance().getData("TestMultiProcess",-1,Integer.class));
			}
		});
	}
}
