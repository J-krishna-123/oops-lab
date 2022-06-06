
import java.util.*;
class AreaShape
{
void CalculateAreaShape(float x)
{
System.out.println("Area of the squre:"+x*x+"sq units");
}
void CalculateAreaShape(float x,float y)
{
System.out.println("Area of the rectangle:"+x*y+"sq units");
}
void CalculateAreaShape(double r)
{
double area=3.14*r*r;
System.out.println("Area of the circle:"+area+"sq units");
}
public static void main(String args[])
{
float s;
float l,b;
double r;
AreaShape obj=new AreaShape();
Scanner sc=new Scanner(System.in);
System.out.println("Enter sides of the squre");
s=sc.nextFloat();
System.out.println("Enterlength and breadth of the rectangle");
l=sc.nextFloat();
b=sc.nextFloat();
System.out.println("Enter radious of the circle");
r=sc.nextDouble();
obj.CalculateAreaShape(s);
obj.CalculateAreaShape(l,b);
obj.CalculateAreaShape(r);
}
}