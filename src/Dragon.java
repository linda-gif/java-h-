//����ʽ����ģʽ
public class Dragon {
	
	//��һ����̬���ԣ���������ΪDragon,������
private static Dragon instance=new Dragon();
	//����ʽ����ģʽ
//	private static Dragon instance=null;
	
  //���췽�����˽�е�
	private Dragon()
	{
		
	}
	//�෽��
	public static Dragon getInstance()
	{
		return instance;
	}
	//����ʽ�෽��
//	public static Dragon getInstance() {
//	if(null==instance) 
//		instance=new Dragon();
//	return instance;
//	
//	}	

}
