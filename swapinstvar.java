class swapinstvar
{
    int a=10, b=20, temp;
    public static void main(String args[])
{
    swapinstvar sw=new swapinstvar();
    System.out.println("Value of a before swap="+sw.a);
    System.out.println("Value of b before swap="+sw.b);
    sw.temp=sw.a;
    sw.a=sw.b;
    sw.b=sw.temp;
    System.out.println("Value of a after swap="+sw.a);
    System.out.println("Value of b after swap="+sw.b);
    
}
}

