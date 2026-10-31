
// Check a number is a armstrong number
public class NBLooping5 {
    public static void main(String[] args) {
        int number = 0;
        int copy = number;
        int sum =0;
        int count = countDigit.count(number);
        while(copy >0){
            int lastDigit = copy % 10;
            sum = (int)(sum + Math.pow(lastDigit,count));
            copy /= 10;
        }
        System.out.println(sum);
        System.out.println(sum == number);

    }
}
class countDigit{
    public static int count(int n ){
        int count =0;
        while(n >0){
            int lastDigit = n % 10;
            count++;
            n /=10;

        }
        return count;
    }
}