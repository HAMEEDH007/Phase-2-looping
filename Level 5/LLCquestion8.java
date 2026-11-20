// Print factorial of each number from 1 to n
public class LLCquestion8 {
    public static void main(String[] args) {
        int n = 10;
        for(int i =1;i<=n;i++){
            int fact =1;
            for(int j = 1;j<=i;j++){
                fact *=j;
                
            }
            System.out.println(fact);
        }
    }
}
