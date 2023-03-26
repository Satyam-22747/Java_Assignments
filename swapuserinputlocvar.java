import java.util.Scanner;
class swapuserinputlocvar
{
    public static void main(String args[])
    { 
        Scanner sc= new Scanner(System.in);
        int a,b,temp;
        System.out.println("Enter First number:");
        a=sc.nextInt();
        System.out.println("Enter second number:");
        b=sc.nextInt();
        System.out.println("Before Swap: a="+a+" b="+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swap:  a="+a+" b="+b);
        

        
    }
}
