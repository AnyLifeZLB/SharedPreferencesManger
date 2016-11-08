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

## Demo set and get data  
```
		SharedPreferencesDao.getInstance().saveData("test1",1111);
		int test1=SharedPreferencesDao.getInstance().getData("test1",-1,Integer.class);             //会不会太繁琐了？
		int testTemp=SharedPreferencesDao.getInstance().getData("testTemp",250,Integer.class);      //没有保存testTemp

		SharedPreferencesDao.getInstance().saveData("test2","helloworld");
		String test2=SharedPreferencesDao.getInstance().getData("Test2",0,String.class);  
```

## Advice?

Please contact me at anylife.zlb@gmail.com
