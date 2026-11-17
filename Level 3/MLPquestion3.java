// Print all numbers between a and b divisible by 7

public class MLPquestion3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 49;
        while(a < b){
            if(a % 7 ==0){
                System.out.println(a);
            }
            a++;
        }
    }
}
