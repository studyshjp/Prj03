package r01;

import java.time.LocalDateTime;

public class IfTest1 {

	public static void main(String[] args) {
		// 아침 : 9~11시
		// 점심 : 11~15시
		// 저녁 : 17시~20시
		
		// class
		
		LocalDateTime 	now = LocalDateTime.now();
		System.out.println(now);
		System.out.println(now.getHour());
		
		int 	hour = now.getHour(); //12;
		String  name = "";
		
		if( 9 <= hour && hour <= 11	) {
		 name = "아침식사시간";
		} else {
			if(	11 < hour && hour <= 15 ) {
				name = "점심식사시간"; 
			}
		 else {
			if( 17 <= hour && hour <= 20 ) {
				 name = "저녁식사시간";	
		} 	
		
			
		}
		
		
		
		System.out.println(name);
		
		int 	year = now.getYear();
		int 	month = now.getMonthValue();
		int 	day = now.getDayOfMonth();
		
		int		val		= now.getDayOfWeek().getValue();
		String 	wkday = "수";
		
		System.out.println(now.getMonth());
		System.out.println(now.getMonthValue());
		
		System.out.println( "년도:" + year + "요일");
		System.out.println( "월:" + month + "월");
		System.out.println( "일:" + day + "일");
		System.out.println( "요일:" + val + "요일");
		System.out.println( "요일:" + wkday + "요일");
	}
		}

}