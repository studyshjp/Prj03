package r04;

public class FuncTest01 {

	//global scope
	
	static  int 	num;
	static  String  name;
	static boolean 	man;
	static	String	gender;
	static	int 	kor;
	static	int 	eng;
	static	int 	mat;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		input();
		process();
		output();
		
		
		
		
	}

	private static void process() {
		// TODO Auto-generated method stub
		if(man) 	// man == true
			gender = "남자";
		else
			gender = "여자";

		String gender = "여자";
		System.out.println(gender);
		
	}

	private static void input() {
		// TODO Auto-generated method stub
		
		num		= 1;
		name 	= "ㅇㅇㅇ";
		man 	= false;
	}

	private static void output() {
		// TODO Auto-generated method stub
		
		System.out.println(num);
		System.out.println(name);
		System.out.println(gender);
		
		System.out.printf("", num, name, kor, eng, mat);
		
	}

}
