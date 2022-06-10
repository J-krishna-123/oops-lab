import java.util.*;
public class User
{
public static void main(String args[])
{
String username,password;
Scanner sc=new Scanner(System.in);
System.out.println("enter the user name:");
username=sc.nextLine();
System.out.println("enter the password:");
password=sc.nextLine();
try
{
if(username.equals("admin")&&password.equals("hello123"))
{
System.out.println("Authentication is sucessful");
}
else
{
System.out.println("Authentication is fail");
}
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}