import java.util.Scanner;
class A {
    public static void main(String[] args) {
        int n,s=0,c,r;
        
        System.out.println("Enter any Number");
        Scanner ref = new Scanner(System.in);
        n =ref.nextInt();
        c=n;
        while(n>0)
        {
            r=n%10;
            s=(s*10)+r;
            n=n/10;
            //System.out.println("Palindrome number");
        }
        if(c==s)
        System.out.println("Palindrome number");
        else
        System.out.println("Not Palindrome number");

        
    }
}
