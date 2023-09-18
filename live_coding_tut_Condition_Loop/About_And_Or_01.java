package live_coding_tut_Condition_Loop;

public class About_And_Or_01 {

	public static void main(String[] args) {
		//비교 -> 불린 -> 조건문 <- 논리연산자
		
		// and
		if (true && true) {
            System.out.println(1);
        }
 
        if (true && false) {
            System.out.println(2);
        }
 
        if (false && true) {
            System.out.println(3);
        }
        	
        if (false && false) {
            System.out.println(4);
        }  
        
        
        // or
        if (true || true) {
            System.out.println(1);
        }
        if (true || false) {
            System.out.println(2);
        }
        if (false || true) {
            System.out.println(3);
        }
        if (false || false) {
            System.out.println(4);
        }
        
        // or and
        String id = args[0];
        String password = args[1];
        if ((id.equals("egoing") || id.equals("k8805") || id.equals("sorialgi"))
                && password.equals("111111")) {
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }
        
        
	}

}
