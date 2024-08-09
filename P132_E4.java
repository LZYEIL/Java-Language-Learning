import java.util.Scanner;

class Main{
    public static void main(String[] args){

        Scanner myscanner = new Scanner(System.in);

        boolean ifGive = true;
        do {
            System.out.println("Give the money!");
            String answer = myscanner.next();
            if (answer.equals("yes")) {
                ifGive = false;
            }
            
        } while (ifGive);




         }

    }
