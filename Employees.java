import java.util.*;
class Employees
{
int empid;
String empname;
Employees(int id,String name)
{
empid=id;
empname=name;
}
void display()
{
System.out.println("Employees id"+empid);
System.out.println("Employees name"+empname);
}
public static void main(String[]args)
{
int id1;
String name1;
Employees[]emp=new Employees[5];
Scanner sc=new Scanner(System.in);
for(int i=0;i<2;i++)
{
id1=sc.nextInt();
name1=sc.next();
emp[i]=new Employees(id1,name1);
}
System.out.println("Employees Details /n");
for(int i=0;i<2;i++)
{
emp[i].display();
}
}
}