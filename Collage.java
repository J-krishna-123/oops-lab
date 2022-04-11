import java.util.*;
class Collage
{
String name;
class Staff
{
int staff_id;
String department;
Staff(int id,String mca)
{
staff_id=id;
department=mca;
}
void display()
{
System.out.println("\n college info");
System.out.println("staff_id="+staff_id);
System.out.println("department="+department+"\n");
}
}
static class student
{
String sname;
String dept;
student(String na,String department)
{
sname=na;
dept=department;
}
void display()
{
System.out.println("\n STUDENT info");
System.out.println("name="+sname);
System.out.println("department="+dept+"\n");
}
}
public static void main(String[] args)
{
Collage.student obj1=new Collage.student("krishna","mca");
Collage obj2=new Collage();
Collage.Staff obj3=obj2.new Staff(101,"mca");
obj1.display();
obj3.display();
}
}