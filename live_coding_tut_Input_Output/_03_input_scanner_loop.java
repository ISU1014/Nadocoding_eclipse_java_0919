package live_coding_tut_Input_Output;

import java.util.Scanner;

public class _03_input_scanner_loop {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            System.out.println(sc.nextInt()*1000); 
        }
        sc.close();
    }

}
