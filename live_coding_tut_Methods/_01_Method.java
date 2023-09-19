package live_coding_tut_Methods;

public class _01_Method {

	public static void numbering() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }	//정의
 
    public static void main(String[] args) {
        numbering(); //호출
        numbering();
        numbering();
        numbering(); //재활용
    }


}
