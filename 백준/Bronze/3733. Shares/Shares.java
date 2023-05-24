import java.util.Scanner;

public class Main {
    static int n, s;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            n = sc.nextInt() + 1;
            s = sc.nextInt();
            System.out.println(s / n);
        }
    }
}