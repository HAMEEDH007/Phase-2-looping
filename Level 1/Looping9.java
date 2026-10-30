
//  Print the product of digits of a given number.
public class Looping9 {
    public static void main(String[] args) {
        int num =23457657;
        int sum =0;
        while(num>0){
            int lastDigit = num % 10;
            num /= 10;
            sum += lastDigit;
        }
        System.out.println(sum);
    }
}
