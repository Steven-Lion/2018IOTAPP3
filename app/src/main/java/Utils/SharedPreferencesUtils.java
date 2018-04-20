package Utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by IOT-STU on 2018-04-20.
 */

public class SharedPreferencesUtils {
    private static final String IS_SIMULATION = "isSimulation";//是否模拟
    private static final String TOKEN = "Token";//用户标识token
    private static final String IP = "Ip";
    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";
    private static final String PROJECTID= "projectId";
    private static final String ISSAVEMSG = "isSaveMsg";//是否保存登录信息;

    private static final String USER = "user";//用户目录
    private static final String BEDROOM = "bedroom";//卧室标识
    private static final String BEDROOM_STATUS = "user";//卧室状态
    private static final String STUDY = "study";// 书房标识
    private static final String LIVINROOM = "user";//客厅标识



    private SharedPreferences.Editor editor;
    private SharedPreferences sp;
    private static SharedPreferencesUtils instanst;

    public SharedPreferencesUtils(Context context,String file){
        //实例化shareprefence
        sp = context.getSharedPreferences(file,Context.MODE_PRIVATE);
        //获得Editor对象
        editor = sp.edit();
    }
    public synchronized static SharedPreferencesUtils getInstanst(Context context){
        if (instanst == null) {
             instanst = new SharedPreferencesUtils(context,USER);//初始化
        }
        return instanst;
    }
    public void addKey(String key,String Value){
       //保存一个String
        editor.putString(key,Value);
        //提交数据
        editor.commit();
    }
  /*
  * 根据key获取value
  * */
    public String getKey(String key){
        return sp.getString(key,"");
    }
    //清除数据
    public void clear(){
        editor.clear();
        editor.commit();
    }
    //获取是否模拟
    public boolean  getIsSimulation(){
        return sp.getBoolean(IS_SIMULATION,false);
    }
    //设置模拟值
    public  void setIsSimulation(boolean simulation){
        editor.putBoolean(IS_SIMULATION,simulation);
        editor.commit();
    }
    //设置服务器ip
    public void setIp(String ip){
       editor.putString(IP,ip);
       editor.commit();
    }
    //获取ip
    public String getIp() { return sp.getString(IP,""); }
   //获取用户唯一标识 Token
    public void setToken(String token){
        editor.putString(TOKEN,token) ;
        editor.commit();
    }
    //项目标识
    public String getProjectID(){
       return sp.getString(PROJECTID,"") ;
    }
    //set项目标识
    public void setProjectid(String id){
        editor.putString(PROJECTID,id);
        editor.commit();
    }
    //用户名
    public




}
