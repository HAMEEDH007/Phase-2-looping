// Find the sum of digits of a number.
public class NBLooping4 {
    public static void main(String[] args) {
        int number = 123;
        int sum =0;
        while(number>0){
            int lastDigit = number % 10;
            sum = sum + lastDigit;
            number /= 10;
        }
        System.out.println(sum);
    }
}
