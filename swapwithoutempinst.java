class swapwithoutempinst
{
    int a=15, b=30, temp;
    public static void main(String args[])
{
    swapwithoutempinst sw=new swapwithoutempinst();
    System.out.println("Value of a before swap="+sw.a);
    System.out.println("Value of b before swap="+sw.b);
    sw.a=sw.a+sw.b;
    sw.b=sw.a-sw.b;
    sw.a=sw.a-sw.b;
    

    System.out.println("Value of a after swap="+sw.a);
    System.out.println("Value of b after swap="+sw.b);
    
}
}

