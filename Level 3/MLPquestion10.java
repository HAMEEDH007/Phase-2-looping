// Print first n terms of  a geometric progression (a,r)
public class MLPquestion10 {
    public static void main(String[] args) {
        int n = 4;
        int a = 2;
        int d = 2;
        for(int i = 1;i<=n;i++){
            System.out.print(" "+a);
            a *= d;
        }
    }
}
