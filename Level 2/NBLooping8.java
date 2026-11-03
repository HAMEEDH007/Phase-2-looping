public class NBLooping8 {
    public static void main(String[] args) {
        int n = 14;
        int count = 0;
        for (int i = 2; i <= 100; i++) {
            if (n % i == 0) {
                count++;

            }
        }
        if (count == 2) {
            System.out.println("Is a Prime number");
        } else {
            System.out.println("Is not a Prime number");
        }
    }
}
