package live_coding_tut_Input_Output;

import java.util.Scanner;

public class _02_input_scanner {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //while(sc.hasNextInt()) {
        int i = sc.nextInt();
        System.out.println(i*1000); 
       // }
        sc.close();
    }

}
