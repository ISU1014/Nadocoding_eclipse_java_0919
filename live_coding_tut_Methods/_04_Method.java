package live_coding_tut_Methods;

public class _04_Method {

    public static void numbering(int init, int limit) {
        int i = init;
        while (i < limit) {
            System.out.println(i);
            i++;
        }
    }
 
    public static void main(String[] args) {
        numbering(0, 5);
    }

}
