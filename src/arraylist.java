import java.util.Arrays;

public class arraylist {
	public static void main(String[] args) {
//		int[][] a=new int[5][5];//������һά���飬ÿ������ĳ�����5
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a[i].length;j++) {
//				a[i][j]=(int)(Math.random()*100);
//			}
//			
//		}
//		for(int[] row:a) {
//			for(int each :row) {
//				System.out.print(each+"\t");
//			}
//			System.out.println();
//		}
//		
//		int max=-1;
//		int target_i=-1;
//		int target_j=-1;
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a[i].length;j++) {
//				if(a[i][j]>max) {
//					max=a[i][j];
//		     		target_i=i;
//					target_j=j;
//					
//				}
//			}
//		}
//		System.out.println("�ҳ��������ǣ�"+max);
//		System.out.println("��������["+target_i+"]["+target_j+"]");
	
		//���鸴��
//		int a[]=new int[] {18,66,89,22,3,89,33};
//		int[] b=Arrays.copyOfRange(a, 0, 3);
//		for(int i=0;i<b.length;i++) {
//			System.out.print(b[i]+" ");
//		}

		//ת��Ϊ�ַ���
//		int a[]=new int[] {18,88,90,78,99,11,34};
//		String content=Arrays.toString(a);
//		System.out.println(content);
	
		//����
//		int a[]=new int[] {18,88,90,78,99,11,34};
//		System.out.println("����֮ǰ��");
//		System.out.println(Arrays.toString(a));
//		Arrays.sort(a);
//		System.out.println("����֮��");
//		System.out.println(Arrays.toString(a));
	
		//����
//		int a[]=new int[] {18,88,90,78,99,11,34};
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
//		System.out.println("����90���ֵ�λ��"+Arrays.binarySearch(a, 90));
	
		//�ж��Ƿ���ͬ
//		int a[]=new int[] {18,33,23,78,9,99};
//		int b[]=new int[] {18,33,23,78,9,99};
//		System.out.println(Arrays.equals(a,b));
		
		//���
//		int a[]=new int[10];
//		Arrays.fill(a, 5);
//		System.out.println(Arrays.toString(a));
		
		
		
//	��ϰ��ά��������
//		���ȶ���һ��5X8�Ķ�ά���飬Ȼ��ʹ��������������
//		����Arrays�ķ����Զ�ά�����������
	  int a[][]=new int[5][8];
	  for(int i=0;i<a.length;i++) {
		 for(int j=0;j<a[i].length;j++) {
			 a[i][j]=(int)(Math.random()*100);
		 }
	  }
		System.out.println("��ӡ��ά����");
		for(int[] m:a) {
			System.out.println(Arrays.toString(m));
		}
		int b[]=new int[40];
		for(int i=0;i<a.length;i++) {
			System.arraycopy(a[i],0,b,i*8,a[i].length);
			
		}
	//	System.out.println(Arrays.toString(b));
		Arrays.sort(b);
	//	System.out.println(Arrays.toString(b));
		System.out.println();
		for(int i=0;i<a.length;i++) {
			System.arraycopy(b,i*8,a[i],0,8);
			
		}
		for(int[] m:a) {
		System.out.println(Arrays.toString(m));
		}
		
	}

}
