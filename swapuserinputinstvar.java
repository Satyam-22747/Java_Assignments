import java.util.Scanner;
class swapuserinputinstvar
{
    int a,b,temp;
    public static void main(String args[])
    { 
        Scanner sc= new Scanner(System.in);
        swapuserinputinstvar sw=new swapuserinputinstvar();
        System.out.println("Enter First number:");
        sw.a=sc.nextInt();
        System.out.println("Enter second number:");
        sw.b=sc.nextInt();
        System.out.println("Before Swap: a="+sw.a+" b="+sw.b);
        sw.temp=sw.a;
        sw.a=sw.b;
        sw.b=sw.temp;
        System.out.println("After Swap:  a="+sw.a+" b="+sw.b);
        

        
    }
}
