package live_coding_tut_Condition_Loop;

public class About_Switch_02 {

	public static void main(String[] args) {
		
//		switch의 조건으로는 제한된 데이터 타입만을 사용할 수 있다. 
//		byte, short, char, int, enum, String, 
//		Character, Byte, Short, Integer
//		
		System.out.println("switch(1)");
        switch(1){
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        }
         
        System.out.println("switch(2)");
        switch(2){
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        }
         
        System.out.println("switch(3)");
        switch(4){
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
            
         default:
        	 System.out.println("defalut");
        }

	}

}
