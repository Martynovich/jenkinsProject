/**
 * Created by Igor on 05.05.2017.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Jenkins!");
        int a = 3;
        int b = 3;
        System.out.println(a + "+" + b + "=" + new Calculator().sum(a,b));
    }
}
