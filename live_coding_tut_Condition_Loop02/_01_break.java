package live_coding_tut_Condition_Loop02;

public class _01_break {

	public static void main(String[] args) {
		 for (int i = 0; i < 10; i++) {
	            if (i == 5) //{} 한줄일 경우 생략 가능.
	                break;
	            System.out.println("Coding Everybody " + i);
	        }
	}

}
