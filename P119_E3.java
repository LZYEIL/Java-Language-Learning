import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Please enter the month: ");
        int month = myscanner.nextInt();

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;

            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;

            default:
                System.out.println("Error");
                break;
            }


    }

    }
