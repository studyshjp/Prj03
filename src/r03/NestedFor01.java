package r03;

public class NestedFor01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		star1();
		star2();
		star3();
		star4();
		
		
		
		
	}
	
	
	
	
		private static void star4() {
		// TODO Auto-generated method stub
			System.out.println("4.");
			
			for(int i=1;i<=5;i++){
				for(int j=1;j<=5;j++)
			System.out.println("*");
				System.out.println();
			
			}
			
			System.out.println();
			
			
			
			
			
	}




		// star3()
		private static void star3() {
		// TODO Auto-generated method stub
			
			System.out.println("3.");
			for(int i=1;i<=5;i++){
			System.out.println("*");}

			System.out.println();
			
	}






		// star2()
		private static void star2() {
		// TODO Auto-generated method stub
			System.out.println("2.");
			
			for(int i=1;i<=5;i++){
			System.out.println("*****");}
			
			System.out.println();
	}

		// star1()
		private static void star1() {
			
			System.out.println("1.");
			System.out.println("*****");
			System.out.println("*****");
			System.out.println("*****");
			System.out.println("*****");
			System.out.println("*****");
			
		}
		
	
}
