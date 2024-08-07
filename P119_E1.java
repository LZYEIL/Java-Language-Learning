import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Please enter: ");
        char result = myscanner.next().charAt(0);

        switch(result) {
            case 'a':
                System.out.println("A");
                break;

            case 'b':
                System.out.println("B");
                break;

            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            case 'e':
                System.out.println("E");
                break;
            default:
                System.out.println("other");
                break;
        }



    }

    }
