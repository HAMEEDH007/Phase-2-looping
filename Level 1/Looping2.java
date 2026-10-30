// Print all even numbers between 1 and 100

public class Looping2 {
    public static void main(String[] args) {
        int n = 101;
        for(int i =1;i<n;i++){
            if(i % 2 == 0){
                System.out.print(" " + i);
            }
        }
    }
}
