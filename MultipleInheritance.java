import java.util.*;
class MultipleInheritance
{
public static void main(String args[])
{
rectangle r=new rectangle();
circle c=new circle();
int ch=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter 1 for circle 2 for rectangle");
ch=sc.nextInt();
switch(ch)
{
case 1:
c.area();
c.perimeter();
break;
case 2:
r.area();
r.perimeter();
break;
}
}
}
interface areaperi
{
void area();
void perimeter();
}
class rectangle implements areaperi
{
int l=10,b=20;
public void area()
{
System.out.println("area of the rectangle is"+l*b);
}
public void perimeter()
{
System.out.println("perimeter of the rectangle is"+(2*(l+b)));
}
}
class circle implements areaperi
{
int r=10;
public void area()
{
System.out.println("area of the circle is"+3.14*r*r);
}
public void perimeter()
{
System.out.println("perimeter of the circle is"+2*3.14*r);
}
}