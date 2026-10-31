// Check if a number is a palindrome.
public class NBLooping3 {
    public static void main(String[] args) {
        int n = 1281;
        int copy = n;
        int reverse =0;
        while(n>0){
            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n /=10;
        }
        System.out.println(copy == reverse);
    }
}
