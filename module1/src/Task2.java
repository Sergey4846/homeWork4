import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите длину дома 1");
        int a = scan.nextInt();

        System.out.println("Введите ширину дома 1");
        int b = scan.nextInt();
        System.out.println("Ввeдите длину дома 2");
        int c = scan.nextInt();

        System.out.println("Введите ширину дома 2");
        int d = scan.nextInt();

        System.out.println("Введите длину участка");
        int e = scan.nextInt();

        System.out.println("Введите ширину участка");
        int f = scan.nextInt();

        int s1 = a * b;
        int s2 = c * d;
        int s3 = e * f;
        if ((s1 + s2) <= s3) {
            System.out.println("Дома на участке помещаются");
        } else {
            System.out.println("Дома на участке не помещаются");
        }
    }
}