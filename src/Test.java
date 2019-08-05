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
        } else if(c == 2){
            a = 3;
        }else{
            a = 4;
        }
    }

    private static int add(int a, int b) {
        return a + b;
    }
}
