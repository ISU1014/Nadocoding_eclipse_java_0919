package live_coding_tutorials_Arithmetic;

public class Arithmetic_02 {

	public static void main(String[] args) {
	        // 이항 연산자
			//문자 연산
			String firstString = "This is";
	        String secondString = " a concatenated string.";
	        String thirdString = firstString + secondString;
	        System.out.println(thirdString);
	        
	        //연산자 형변환
	        int a = 10;
	        int b = 3;
	          
	        float c = 10.0F;
	        float d = 3.0F;
	          
	        System.out.println(a/b);
	        System.out.println(c/d);
	        System.out.println(a/d); // 10.0 / 3.0 자동형변환
	        
	        //단항 연산자
	        int i = 3;
	        i++;
	        System.out.println(i); // 4 출력
	        ++i;
	        System.out.println(i); // 5 출력
	        System.out.println(++i); // 6 출력
	        System.out.println(i++); // 6 출력
	        System.out.println(i); // 7 출력
	        
	        //우선순위
	        int aa = 4-3*6; // <---

	}

}
