
package anylife.sharedprefencedmanger;

import android.app.Application;

/**
 */
public class MyApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();

		SharedPreferencesDao.initSharePrefenceDao(getApplicationContext());  //初始化sharePrence 环境
	}

}
