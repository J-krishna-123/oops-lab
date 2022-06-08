import java.util.*;
class MultiLevel
{
public static void main(String args[])
{
int n,i;
Scanner sc2=new Scanner(System.in);
System.out.println("enter number of employee");
n=sc2.nextInt();
Teacher t[]=new Teacher[n];
for(i=0;i<n;i++)
{
t[i]=new Teacher();
}
System.out.println("................");
System.out.println("................");
System.out.println("the details are...");
for(i=0;i<n;i++)
{
t[i].display();
}
}
}
class Employee
{
int empid;
String name;
double salary;
String address;
Employee()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the employee id");
empid=sc.nextInt();
System.out.println("enter the employee name");
name=sc.next();
System.out.println("enter the employee salary");
salary=sc.nextDouble();
System.out.println("enter the employee address");
address=sc.next();
}
}
class Teacher extends Employee
{
String department;
String subject;
Teacher()
{
Scanner sc1=new Scanner(System.in);
System.out.println("enter the department");
department=sc1.next();
System.out.println("enter the subject");
subject=sc1.next();
}
void display()
{
System.out.println(".................................");
System.out.println("id:"+empid);
System.out.println("name:"+name);
System.out.println("salary:"+salary);
System.out.println("address:"+address);
System.out.println("department:"+department);
System.out.println("subject:"+subject);
System.out.println(".................................");
}
}



















