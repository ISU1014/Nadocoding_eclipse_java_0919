package live_coding_tut_Condition_Loop;

public class About_Switch_01 {

	public static void main(String[] args) {
		
			System.out.println("switch(1)");
	        switch(1){
	        case 1:
	            System.out.println("one");
	        case 2:
	            System.out.println("two");
	        case 3:
	            System.out.println("three");
	        }
	         
	        System.out.println("switch(2)");
	        switch(2){
	        case 1:
	            System.out.println("one");
	        case 2:
	            System.out.println("two");
	        case 3:
	            System.out.println("three");
	        }
	         
	        System.out.println("switch(3)");
	        switch(3){
	        case 1:
	            System.out.println("one");
	        case 2:
	            System.out.println("two");
	        case 3:
	            System.out.println("three");
	        }
	        
	        //switch 문과 if 문은 대체 가능
	        int val = 1;
	        if(val == 1) {
	        	System.out.println("one");
	        } else if(val == 2) {
	        	System.out.println("two");
	        } else if(val == 3) {
	        	System.out.println("three");
	        }

	}

}
