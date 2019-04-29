import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите дату");

        String d = scan.nextLine();
        String m = scan.nextLine();
        String y = scan.nextLine();

        int day = Integer.parseInt(d);
        int month = Integer.parseInt(m);
        int year = Integer.parseInt(y);

        boolean dayTrue = day > 0 && day < 31;
        boolean monthTrue = month > 0 && month < 12;
        boolean yearTrue = year > 0;

        if (!dayTrue || !monthTrue || !yearTrue) {

            System.out.println("Дата введена неверно");
        } else {
            day += 1;

            if (day == 31) {
                month += 1;
                day = 1;
            }

            if (month == 12) {
                year++;
            }

            System.out.println(day + "." + month + "." + year);


        }
    }
}