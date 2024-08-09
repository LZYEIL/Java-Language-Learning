import java.util.Scanner;

class Main{
    public static void main(String[] args){
        int num = 0;
        int sum = 0;

        for (int i = 0; i < 100; i++) {
            if (i % 9 == 0) {
                System.out.println(i);
                num = num + 1;
                sum = sum + i;
            }
        }
        System.out.println("Sum is" + sum);
        System.out.println("Number is" + num);


    }

    }
