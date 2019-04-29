import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int a =scan.nextInt();
        System.out.println("Факториал числа"+" "+a+" равен "+factorial(a));             }

    private static int factorial(int a) {
        int temp = 1;
        for (int i = 1; i <= a;i++ ){
            temp *= i;
        }
        return temp;
    }
}




