//  Print all odd numbers between 1 and 100
public class Looping3 {
    public static void main(String[] args) {
        int n = 101;
        for(int i = 0;i<n;i++){
            if(i % 2 != 0){
                System.out.print(" " + i);
            }
        }
    }
}
