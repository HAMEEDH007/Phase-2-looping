// find LCM of two numbers using loops 
public class MLPquestion5 {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;
        int lcm = Math.max(num1,num2);

        while(true){
            if(lcm % num1 ==0 && lcm %num2 ==0){
                break;
            }
            lcm++;
        }
        System.out.println("LCM = "+ lcm);
    }
}
