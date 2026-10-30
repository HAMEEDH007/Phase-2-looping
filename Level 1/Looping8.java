// Print the sum of all odd numbers up to n
public class Looping8 {
    public static void main(String[] args) {
        int n = 100;
        int sum =0;
        for(int i =1;i<=n;i++){
            if(i % 2 != 0){
                sum += i;
                // System.out.println(sum);
            }
        }
        System.out.println(sum);
    }   
}
