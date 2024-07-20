import java.util.Scanner;

public class DemoSwitchSession2 {
    public static void main(String[] args) {
        //finding whether the given month is
        // having 31 or 30 0r 29/28 days
        System.out.println("Select the month from the given list");
        System.out.println("1 --> January");
        System.out.println("2 --> February");
        System.out.println("3 --> March");
        System.out.println("4 --> April");
        System.out.println("5 --> May");
        System.out.println("6 --> June");
        System.out.println("7 --> July");
        System.out.println("8 --> August");
        System.out.println("9 --> September");
        System.out.println("10 --> October");
        System.out.println("11 --> November");
        System.out.println("12 --> December");

        java.util.Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("28 or 29 days, based on leap year");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;

            default:
                System.out.println("Invalid option");

        }
    }
}
