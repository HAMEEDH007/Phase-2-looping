// Print all numbers from 1 - n whose binary representation has an even number of 1s.
public class LLCquestion6 {
    public static void main(String[] args) {
        int n = 20;
        
        for(int i = 1; i<=n;i++){
            int temp = i;
            int count =0;
            while(temp> 0){
                int rem = temp %2;
                if(rem == 1){
                    count++;

                }
                temp /= 2;
            }
            if(count % 2 ==0){
                System.out.println(i);
            }
        }
    }
}
