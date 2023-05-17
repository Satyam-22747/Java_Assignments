import java.util.Scanner;
class calculate
{
    int a,b,c,d;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the first operand:");
        a=sc.nextInt();
        System.out.println("Enter second operand:");
        b=sc.nextInt();
        System.out.println("Enter the choice for operator to perform operation:\n");
        System.out.println("1:Add+ || 2:Subtract- || 3:Multiply*\n4:Divide/ || 5:Modulus% || 6:Increment(++)");
        System.out.println("7:Decrement(--) || 8:Comparison(<,>,==) || 9:Assignment operator(=)");
        System.out.println("10:Logical AND(&&)\n11:Ternary opertor\n12:Bitwise operator");
        System.out.println("13:Shift Operators");
        c=sc.nextInt();
    }
    void calc()
    {
        switch(c)
        {
            case 1:
            {
                System.out.println("Addition:"+(a+b));
                break;
            }
            case 2:
            {
                System.out.println("Subtraction:"+(a-b));
                break;
            }
            case 3:
            {
                System.out.println("Multiplication:"+(a*b));
                break;
            }
            case 4:
            {
                System.out.println("Division(quotient):"+(a/b));
                break;
            }
            case 5:
            {
                System.out.println("Division:"+(a/b));
                break;
            }
            case 6:
            {
                System.out.println("Increment: a after increment="+(++a)+" b after increment="+(++b));
                break;
            }
            case 7:
            {
                System.out.println("Decrement: a after decrement="+(--a)+" b after decrement="+(b--));
                break;
            }
            case 8:
            {
                if(a<b)
                System.out.println(a+" is less than "+b);
                else if(a>b)
                System.out.println(a+" is greater than "+b);
                else
                System.out.println(a+" is equal to "+b);
                break;
            }
            case 9:
            {
                System.out.println("Value of first operand before assignment="+a+"\nValue of first operand after assignment="+(a=b));
                break;
            }
            case 10:
            {    
                if(a>0&&b>0)
                System.out.println(a+" and "+b+" both are positive numbers");
                else 
                System.out.println("Both of them are not positive numbers");
                break;
            }
            case 11:
            {
                int r=((a>b)?a:b);
                System.out.println(r+" is greater than other given operand");
                break;
            }
            case 12:
            {
                Scanner ss=new Scanner(System.in);
                System.out.println("Enter your choice: 1-AND(&) 2-OR(|) 3-XOR(^) 4-NOT(~)");
                d=ss.nextInt();
                switch (d)
                {
                    case 1:
                    {
                        System.out.println("AND of "+a+" and "+b+":"+(a&b));
                        break;
                    }
                    case 2:
                    {
                        System.out.println("OR of "+a+" and "+b+":"+(a|b));
                        break;
                    }
                    case 3:
                    {
                        System.out.println("XOR of "+a+" and "+b+":"+(a^b));
                        break;
                    }
                    case 4:
                    {
                        System.out.println("NOT of "+a+" and "+b+":"+(~a)+","+(~b));
                        break;
                    }
                    default:
                    System.out.println("Invalid");
                    break;
                    
                }
                break;
            }
            case 13:
            {
                Scanner ss=new Scanner(System.in);
                System.out.println("Enter your choice: 1-Left shift(<<) 2-Signed Right shift operator(>>)\n3-Unsigned Right shift operator(>>>)");
                d=ss.nextInt();
                switch (d)
                {
                    case 1:
                    {
                        System.out.println("Left shift of "+a+" by "+b+" bits:"+(a<<b));
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Signed Right shift of "+a+" by "+b+" bits:"+(a>>b));
                        break;
                    }
                    case 3:
                    {
                        System.out.println("UnSigned Right shift of "+a+" by "+b+" bits:"+(a>>>b));
                        break;
                    }
                    default:
                   System.out.println("Invalid choice:");
                   break;
                }
                break;
            }

            default:
            System.out.println("Invalid choice:");
            break;
        }
        }
}
class operators
{
    public static void main(String[] args)
{
 calculate ca=new calculate();
 ca.getdata();
 ca.calc();
}
}