# SharedPreferencesManger
## How to use
- 1. init SharedPreferencesManger
```
public class MyApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		SharedPreferencesDao.initSharePrefenceDao(getApplicationContext());  //init SharedPreferencesManger
	}
```
- 2. how to save data  
saveData(String key, Object value) 

- 3. how to get data  
<T> T getData(String key, Object defValue, Class&lt;T> clazz); 
