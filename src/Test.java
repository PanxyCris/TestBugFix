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

    private void use(){
        this.CONSTANT = 3;
    }

    private static void drop(int a){

    }
}
