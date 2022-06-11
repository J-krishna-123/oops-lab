import java.util.*;
import java.io.*;
class Area
{
void FindArea(int a,int b)
{
System.out.println("Area of rectangle with breadth"+a+"and length"+b+"is:"+a*b);
}
void FindArea(int a)
{
System.out.println("Area of circle with radious"+a+"is:"+3.14*a);
}
void FindArea(double a,double b,double c)
{
double temp=(a+b+c);
double s=temp/2;
double triarea = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
System.out.println("Area of triangle with sides"+a+"and"+b+"and"+c+"are:"+triarea);
}
public static void main(String args[])
throws IOException
{
Scanner c=new Scanner(System.in);
Area d=new Area();
System.out.print("\n find area of\n1.rectangle\n2.triangle\n3.circle\n\nselect a choice:");
int choice=c.nextInt();
switch(choice)
{
case 1:
System.out.println("enter the breadth");
int b=c.nextInt();
System.out.println("enter the length");
int l=c.nextInt();
d.FindArea(b,l);
break;
case 2:
System.out.println("enter the length of first side");
double l1=c.nextDouble();
System.out.println("enter the length 0f second side");
double l2=c.nextDouble();
System.out.println("enter the length 0f third side");
double l3=c.nextDouble();
d.FindArea(l1,l2,l3);
break;
case 3:
System.out.println("enter the radious");
int r=c.nextInt();
d.FindArea(r);
break;
default:
System.out.println("invalid choice");
}
}
}



