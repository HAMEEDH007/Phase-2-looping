// Print the sum of all odd digits and even digits separately in a number.

public class LLCquestion9 {
    public static void main(String[] args) {
        int number = 3425;
            int oddsum = 0;
            int evensum = 0;
        while (number>0) {
            int lastdigit = number % 10;

            if(lastdigit % 2 == 0){
                evensum += lastdigit;
            }
            if(lastdigit % 2 == 1){
                oddsum += lastdigit;
            }
            number /= 10;
        }
        System.out.println(oddsum);
        System.out.println(evensum);
        
    }
}
