import java.util.Arrays;

public class arraylist {
	public static void main(String[] args) {
//		int[][] a=new int[5][5];//有两个一维数组，每个数组的长度是5
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
//		System.out.println("找出来最大的是："+max);
//		System.out.println("其坐标是["+target_i+"]["+target_j+"]");
	
		//数组复制
//		int a[]=new int[] {18,66,89,22,3,89,33};
//		int[] b=Arrays.copyOfRange(a, 0, 3);
//		for(int i=0;i<b.length;i++) {
//			System.out.print(b[i]+" ");
//		}

		//转化为字符串
//		int a[]=new int[] {18,88,90,78,99,11,34};
//		String content=Arrays.toString(a);
//		System.out.println(content);
	
		//排序
//		int a[]=new int[] {18,88,90,78,99,11,34};
//		System.out.println("排序之前：");
//		System.out.println(Arrays.toString(a));
//		Arrays.sort(a);
//		System.out.println("排序之后：");
//		System.out.println(Arrays.toString(a));
	
		//搜索
//		int a[]=new int[] {18,88,90,78,99,11,34};
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
//		System.out.println("数字90出现的位置"+Arrays.binarySearch(a, 90));
	
		//判断是否相同
//		int a[]=new int[] {18,33,23,78,9,99};
//		int b[]=new int[] {18,33,23,78,9,99};
//		System.out.println(Arrays.equals(a,b));
		
		//填充
//		int a[]=new int[10];
//		Arrays.fill(a, 5);
//		System.out.println(Arrays.toString(a));
		
		
		
//	练习二维数组排序
//		首先定义一个5X8的二维数组，然后使用随机数填充满。
//		借助Arrays的方法对二维数组进行排序。
	  int a[][]=new int[5][8];
	  for(int i=0;i<a.length;i++) {
		 for(int j=0;j<a[i].length;j++) {
			 a[i][j]=(int)(Math.random()*100);
		 }
	  }
		System.out.println("打印二维数组");
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
