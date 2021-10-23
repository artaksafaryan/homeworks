import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        switch (name){
            case "1":
                System.out.println("Monday");
                break;
            case "2":
                System.out.println("Tuesday");
                break;
            case "3":
                System.out.println("Wednesday");
                break;
            case "4":
                System.out.println("Thursday");
                break;
            case "5":
                System.out.println("Friday");
                break;
            case "6":
                System.out.println("Saturday");
                break;
            case "7":
                System.out.println("Saturday");
                break;


            default:
                System.out.println("does not exist4");
        }

    }
}
