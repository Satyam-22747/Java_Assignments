class swapwithouttemp
{
    public static void main(String args[])
{
    int a=12, b=23;
    System.out.println("Value of a before swap="+a);
    System.out.println("Value of b before swap="+b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("Value of a after swap="+a);
    System.out.println("Value of b after swap="+b);
    
}
}

