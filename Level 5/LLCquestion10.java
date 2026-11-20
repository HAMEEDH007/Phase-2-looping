// Take 5 numbers as input if the user enters 0, Skip it using continue.At the end,print the sum of all non-zero numbers entered

import java.util.Scanner;

public class LLCquestion10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        for(int i = 1;i<=5;i++){
            System.out.print("Enter number : ");
            int number  = sc.nextInt();
            if(number==0)continue;
            sum += number;
        }
        System.out.println(sum);

        sc.close();
    }
}
