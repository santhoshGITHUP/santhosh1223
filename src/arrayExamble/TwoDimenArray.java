package arrayExamble;

public class TwoDimenArray {
	public static void main(String[] args) {
//int ar[] [] =new int[2][2];
//ar[0][0]=10;
//ar[0][1]=20;
//ar[1][0]=30;
//ar[1][1]=40;
//System.out.println("======Using for loop=====");
// for(int i=0;i<ar.length;i++) {
//	 for(int j=0;j<ar.length;j++) {
//		 System.out.println(ar[i][j]);
//	 }
//	 System.out.println("====Using for Each=======");
//	 for(int [] b:ar) {
//		 for(int c:b) {
//			 System.out.println(c);
//		 }
//	 }
// }
		
		String name[][]= {{"santhosh","kumar"},{"mano","bala"}};
		for(int i=0;i<name.length;i++) {
			for(int j=0;j<name.length;j++) {
				System.out.print(name[i][j]+"");
			}
		System.out.println();
		}

}
}