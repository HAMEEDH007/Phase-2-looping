// Find the numbers between 1 - 100 whose digits add up to a multiple of 3

public class LLCquestion4 {
    public static void main(String[] args) {
        int n = 100;
         
         for(int i = 1;i <= n;i++){
            if((i /10+ i % 10)%3 == 0){
                System.out.println(i);
            }
         }
    }
}
