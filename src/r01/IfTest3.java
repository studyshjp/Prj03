package r01;

import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;


public class IfTest3 {

	public static void main(String[] args) {
		
		
		// java.time.LocalDateTime	now = java.time.LocalDateTime.now();
		LocalDateTime now = LocalDateTime.now();
		
		int 	daywk = now.getDayOfWeek().getValue(); // 1(월)~7(일)
		String	wkday = "월화수목금토일"; 			// "월화수목금토일";
		
		if( daywk == 1 ) 			wkday = "월"; 
		else { if ( daywk == 2 )	wkday = "월화수목금토일";
		else { if ( daywk == 3 )	wkday = "월화수목금토일";
		

		if( daywk == 1 )  		
			{wkday = "월"; 
		}	else { if ( daywk == 2 )  {wkday = "월화수목금토일";
		}	else { if ( daywk == 3 )  {wkday = "월화수목금토일";
		}	else { if ( daywk == 3 )  {wkday = "월화수목금토일";
		}	else { if ( daywk == 3 )  {wkday = "월화수목금토일";
		}	else { if ( daywk == 3 )  {wkday = "월화수목금토일";
		}	else { if ( daywk == 3 )  {wkday = "월화수목금토일";
		}
		}
		}
	
		
		System.out.println("한자로" + wkday + "요일");
		
		
		// -----------------------------
		String wkday2 = "월화수목금토일";
		switch ( daywk ) {
		case 1: wkday2 = "월" ; break;
		case 2: wkday2 = "화" ; break;
		case 3: wkday2 = "수" ; break;
		case 4: wkday2 = "목" ; break;
		case 5: wkday2 = "금" ; break;
		case 6: wkday2 = "토" ; break;
		case 7: wkday2 = "일" ; break;
		}
		
		System.out.println("한자로" + wkday + "요일");
		
		}
		
		
		// TODO Auto-generated method stub
		
		// 요일 객체 가져오기 ( DayOfWeek )
		java.time.DayOfWeek dayOfWeek = now.getDayOfWeek();
		
		// 1. 한글 요일 출력 ( 예 : 월요일, 화요일 )
		String koreanDay = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.KOREAN);
		System.out.println("한글 요일 전체:" + koreanDay); // 출력 : 수요일
		
		// 2. 배열을 활용
		//						0	1	2
		String [] dayStr = { "월", "화", "수"};
		System.out.println( dayStr [daywk - 1 ] + "요일"); 
		
		

		}
		}
		}
		
		
		
	