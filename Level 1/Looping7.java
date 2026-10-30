// Print the sum of all even numbers upto n

public class Looping7 {
    public static void main(String[] args) {
        int n = 100;
        int sum =0;

        for(int i = 0;i<=n;i++){
            if(i % 2 == 0){
                sum += i;

            }
        }
        System.out.println(sum);
    }
}
