package r04;

import java.time.LocalDate;
import java.util.Scanner;

public class FuncTest02 {
		
		// 입력
	
		static	String		name;
		static	String		phone;
		static	boolean		man;		// 성별 (남:1 여:2)
		static	int			bYear;		// 태어난 연도
		
		
		//출력
		static	String		Name;		// 남/여
		static	int			age;		// 나이
		static	String		gender;
	
	

		// TODO Auto-generated method stub
	public static void main(String[] args) {
		
		
		
		
		input();
		process();
		output();
		
		
		
	}

	private static void input() {
		// 키보드 준비
		Scanner		in	=	new Scanner(System.in);
		
		System.out.println("이름:");
		name 			= 	in.nextLine(); 		// 엔터 문자열 입력
		System.out.println("전화:");
		phone			=	in.nextLine();		
		System.out.println("성별(1:남 2:여):");
		String man		= 	in.nextLine();
		System.out.println("태어난 연도:");
		bYear			=	in.nextInt();
				
	}

	private static void process() {
		// 중요: 문자열비교는 == 로 하지 않는다
		// man.equals("1") == true - 글자가 같은지 비교
		// man.compareTo("1") > 0 - 글자의 순서 비교
		
		if( man.equals("1") ) 		// == true 생략 가능 man.equals("1")
		gender 	= "남";
		else
		gender 	= "여";
		
		
		//----------------------
		// 올해연도 tYear
		LocalDate	now		= 	LocalDate.now();
		int			tYear 	= 	now.getYear();
		// 올해연도 - 태어난 연도
		age 				=	tYear - bYear; 
				
		age					=	calcAge(bYear);
		
	}
	
	
	
		//

	
	private static int calcAge(int bYear2) {
		// TODO Auto-generated method stub
		
		// 올해연도 tYear
		LocalDate	now		= 	LocalDate.now();
		int			tYear 	= 	now.getYear();
		// 올해연도 - 태어난 연도
		int			 result	=	tYear - bYear; 

		
		
		return result;
	}

	
	
	private static void output() {
		// TODO Auto-generated method stub
		
		
		System.out.println("이름	 전화	 성별	 태어난연도");
		System.out.printf("%s	  %s		%s 		%d",
						name,	 phone,		gender,	 bYear
				);
						
		
	
		
	}

}
