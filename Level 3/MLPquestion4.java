// find HCF (GCD) of two numbers using loops.

// import java.util.ArrayList;

public class MLPquestion4 {
    public static void main(String[] args) {
        // int a = 24;
        // int b = 36;
        // ArrayList<Integer> factors = new ArrayList<>();
        // ArrayList<Integer> factors1 = new ArrayList<>();
        // ArrayList<Integer> commonFactors = new ArrayList<>();

        // for(int i = 1;i<=a;i++){
        //     if(a % i == 0){
        //         factors.add(i);
        //     }
        // }
        // for(int i =1;i<=b;i++){
        //     if(b % i == 0){
        //         factors1.add(i);
        //     }
        // }
        // for(int i = 0;i<factors.size();i++){
        //     if(factors1.contains(factors.get(i))){
        //         commonFactors.add(factors.get(i));
        //     }
        // }
        // int gcd = commonFactors.get(0);

        // for(int i =0;i<commonFactors.size();i++){
        //     if(commonFactors.get(i)>gcd){
        //         gcd = commonFactors.get(i);
        //     }

        // }
        // System.out.println(gcd);
        //second approach
        
        // Question: Find HCF (GCD) of two numbers using loops.
        int first = 48, second = 18;
        while (second != 0) {
            int remainder = first % second;
            first = second;
            second = remainder;
        }
        System.out.println("GCD = " + Math.abs(first));
    }
}

    