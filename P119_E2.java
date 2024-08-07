import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Please enter the grade: ");
        int result = myscanner.nextInt();

        if (result >= 0 && result <= 100) {
            switch (result / 60) {
                case 1:
                    System.out.println("Good");
                    break;

                case 0:
                    System.out.println("Not good");
                    break;
            }
        }
        else {
            System.out.println("Error");
        }





    }

    }
