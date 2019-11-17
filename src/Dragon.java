//饿汉式单例模式
public class Dragon {
	
	//做一个静态属性，属性类型为Dragon,类属性
private static Dragon instance=new Dragon();
	//懒汉式单例模式
//	private static Dragon instance=null;
	
  //构造方法变成私有的
	private Dragon()
	{
		
	}
	//类方法
	public static Dragon getInstance()
	{
		return instance;
	}
	//懒汉式类方法
//	public static Dragon getInstance() {
//	if(null==instance) 
//		instance=new Dragon();
//	return instance;
//	
//	}	

}
