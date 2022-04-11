import java.util.*;
class Employee
{
int record_id;
String name;
String phonenumber;
String destiganation;
String department;
void data(int c,String n,String p,String d,String dep)
{
record_id=c;
name=n;
phonenumber=p;
destiganation=d;
department=dep;
}
void display()
{
System.out.println(record_id+"\t\t"+name+"\t\t"+phonenumber+"\t\t"+destiganation+"\t\t"+department);
}
public static void main(String[] args)
{
Employee obj1=new Employee();
Employee obj2=new Employee();
Employee obj3=new Employee();

obj1.data(100,"manu","9656543285","tvpm","mca");
obj2.data(101,"vinu","9567290530","tvm","mba");

System.out.println("Employee information:\n record id\t name\tphone_number\tdestiganation\tdepartment");
obj1.display();
obj2.display();
}
}