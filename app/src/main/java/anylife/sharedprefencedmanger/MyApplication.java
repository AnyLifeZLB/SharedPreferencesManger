
package anylife.sharedprefencedmanger;

import android.app.Application;

/**
 * 可以在这里多增加一级别的缓存，memo cache --> SP
 *
 */
public class MyApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();

		SharedPreferencesDao.initSharePrefenceDao(getApplicationContext());  //init sharedprefenced manger
	}

}
