package live_coding_tut_Condition_Loop02;

public class _04_practice {

	public static void main(String[] args) {
		/*for(int i=1; i<30; ++i) {
			for(int j=1; j<i; ++j) {
				System.out.print("*");			
			}
			System.out.println();
			
		}*/
		for (int i = 30; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
			
		}

	}

}
