/**
 * Created by Panxy on 2019/8/5
 */
public class Test {

    private int VARIABLE = 3;

    public static void main(String[] args) {
        drop();
        int c = dec(1, 2);
        int a = 0;
        c = 1;
        a = add(0, add(1, 3));
        int b = a;
        if (c == 3) {
            a = 5;
        } else if (c == 2) {
            a = 3;
        } else {
            a = 4;
        }
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int dec(int a, int b) {
        return a - b;
    }

    private static void use(){

    }

    private static void drop(){

    }
}
