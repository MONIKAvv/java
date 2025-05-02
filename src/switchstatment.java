import java.util.Scanner;

public class switchstatment {
    public static void main(String [] args){
//        switch statement
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find the days");
        int day = sc.nextInt();
        switch (day){
            case 1: {
                System.out.println("Its monday today!");
                break;
            }
            case 2 , 9 , 10:
                System.out.println("Its tuesday ");
                break;
            case 3:
                System.out.println("Its wednesday ");
                break;
            case 4:
                System.out.println("Its Thrusday ");
                break;
            case 5:
                System.out.println("Its friday ");
                break;
            case 6:
                System.out.println("Its saturday ");
                break;
            case 0:
                System.out.println("Its Sunday ");
                break;
            default:
                System.out.println("Please Enter the valid number!");
        }



    }
}

//we can also use nested switch statment
