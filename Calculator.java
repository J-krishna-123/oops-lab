import java.util.*;
class Calculator
{
   public static void main(String[]args)
    {
       int a,b,c,ch;
       Scanner s1=new Scanner(System.in);
       System.out.println("enter two numbers");
      a=s1.nextInt();
b=s1.nextInt();
System.out.println("1.addition\n 2.substraction\n3.multiplication\n4.division\n");
ch=s1.nextInt();
switch(ch)
{
case 1:c=a+b;
System.out.println(c);
break;
case 2:c=a-b;
System.out.println(c);
break;
case 3:c=a*b;
System.out.println(c);
break;
case 4:c=a/b;
System.out.println(c);
break;
default:System.out.println("invalid input");
}
}
}
      
      