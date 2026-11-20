// Print all numbers that are pallindromes between 1 - 500
public class LLCquestion3 {
    public static void main(String[] args) {
        for(int i = 1; i<=500;i++){
            int original = i;
            int temp = i;
            int reverse = 0;

            while(temp >0){
                int digit = temp %10;
                reverse = reverse * 10 +digit;
                temp = temp / 10;
            }
            if(original == reverse){
                System.out.println(original);
            }

        }
    }
}
