/**
 * Created by Panxy on 2019/8/5
 */
public class Test {

    private int VARIABLE = 3;
    private int CONSTANT = 4;

    public static void main(String[] args) {
        drop(2);
        int c = dec(1, 2);
        int a = 0;
        c = 1;
        a = add(0, add(1, 3));
        int b = c;

    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int dec(int a, int b) {
        return a - b;
    }

    private void use(int a){
        this.VARIABLE = 3;
        this.CONSTANT = a;
    }

    private static void drop(int a){

    }
}
