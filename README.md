# SharedPreferencesManger
## Before use it
- 1. init SharedPreferencesManger
```
 public class MyApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		SharedPreferencesDao.initSharePrefenceDao(getApplicationContext());  //init SharedPreferencesManger
	}
}
```  

- 2. how to save data
saveData(String key, Object value) 

- 3. how to get data
<T> T getData(String key, Object defValue, Class&lt;T> clazz);  

## Demo set and get data  
```
   String jsonStr="1234567890-==-098765431";
   SharedPreferencesDao.getInstance().saveData("jsonStr",jsonStr);

    SharedPreferencesDao.getInstance().saveData("test1",1111);
    int test1=SharedPreferencesDao.getInstance().getData("test1",-1,Integer.class); //not good enough
    int testTemp=SharedPreferencesDao.getInstance().getData("testTemp",250,Integer.class);  //have nokey testtemp
```

## Advice?

Please contact me at anylife.zlb@gmail.com
