/**
 * Created by Panxy on 2019/8/5
 */
public class Test {

    private int VARIABLE = 3;

    public static void main(String[] args) {
        int c  = add(1,2);
        int a  = 0;
        if(c == 3){
            a = 5;
        }
    }

    private static int add(int a, int b) {
        return a + b;
    }
}
