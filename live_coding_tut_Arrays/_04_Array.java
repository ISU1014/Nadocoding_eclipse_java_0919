package live_coding_tut_Arrays;

public class _04_Array {

	public static void main(String[] args) {
		
		
//		//배열__반복문
//		 String[] members = { "최진혁", "최유빈", "한이람" };
//	      	for (int i = 0; i < members.length; i++) { //초기화,반복조건,반복실행
//	            String member = members[i];
//	            System.out.println(member + "이 상담을 받았습니다");
//	        }
		
		
        String[] members = { "최진혁", "최유빈", "한이람" };
        for (String e : members) {
            System.out.println(e + "이 상담을 받았습니다");
        }
	}

}
