// Print the table of a given number (n x 1 to n x 10)

public class Looping5 {
    public static void main(String[] args) {
        int num = 3;
        int multipler = 11;
        for(int i =1;i<multipler;i++){
            System.out.printf("%d X %d = %d",num,i,i*num);
            System.out.println();
        }
    }
}
