// count how many numbers between 1 - 500 are divisible by 7 but not by 5

public class LLCquestion2 {
    public static void main(String[] args) {
        int n = 500;
        int count = 0;


        for (int i = 1; i <= n; i++) {
            if (i % 7 == 0) {
                if (i % 5 != 0) {
                    count++;

                }
            }
        }
        System.out.println(count);
    }
}
