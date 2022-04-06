import java.util.*;
class area
{
double area;
area(double r)
{
area=(22*r*r)/7;
}
}
class Areaofcircle
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the radius of the circle");
double radious=s.nextDouble();
area a=new area(radious);
System.out.println("area of the circle is:"+a.area);
}
}