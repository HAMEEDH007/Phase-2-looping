// Print all numbers whose sum of digits is even (1 -100)

public class LLCquestion1 {

    public static void main(String[] args) {
         int n = 100;
         int copy = n;
         for(int i = 1;i <= n;i++){
            if((i /10+ i % 10)%2 == 0){
                System.out.println(i);
            }
         }
    }
}