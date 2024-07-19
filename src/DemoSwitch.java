import java.util.Scanner;
public class DemoSwitch {
    public static  void main(String[] args){
        // WAP to print nameof the day, when user entered the week day
        System.out.println("Select from the below choices:");

        System.out.println("Press 1 for 1st day of the week");
        System.out.println("Press 2 for 2nd day of the week");
        System.out.println("Press 3 for 3rd day of the week");
        System.out.println("Press 4 for 4th day of the week");
        System.out.println("Press 5 for 5th day of the week");
        System.out.println("Press 6 for 6th day of the week");
        System.out.println("Press 7 for 7th day of the week");
        System.out.println("Press 0 to exit");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                //break;
            case 4:
                System.out.println("Wednesday");
                //break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            case 0:
                System.out.println("Exiting......");
                break;


        }




    }
}
