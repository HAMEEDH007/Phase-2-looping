public class NBLooping9 {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;
        int c;
        int sum=0;
        for(int i =0;i<=n;i++){
            System.out.println(a);
            sum += a;

            c = a+b;
            a =b;
            b=c;
        }
        // System.out.println(sum);
    }
}
