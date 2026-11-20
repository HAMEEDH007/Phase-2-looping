// Find the smallest and largest digit in a given number

public class LLCquestion5 {
    public static void main(String[] args) {
        int number = 324;
        int largest = Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        while(number > 0){
            int lastdigit = number % 10;

            if(lastdigit > largest){
                largest = lastdigit;

            }
            if(lastdigit < smallest){
                smallest = lastdigit;
            }
            number /= 10;
        }
        System.out.println(largest);
        System.out.println(smallest);

    }
}
