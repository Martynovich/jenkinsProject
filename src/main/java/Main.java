/**
 * Created by Igor on 05.05.2017.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Jenkins!");
        int a = 2;
        int b = 2;
        System.out.println(a + "+" + b + "=" + new Calculator().sum(a,b));
    }
}
