import java.util.Scanner;

class Main{
    public static void main(String[] args){

        int i = 1;
        int num = 0;
        do {
            if (i % 5 == 0 && i % 3 != 0) {
                num ++;
            }
            i ++;
            
        } while (i <= 200);
        System.out.println(num);


         }

    }
