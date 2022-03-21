import java.util.*;
class ArrayTwoD
{
public static void main(String[] args)
{
int a[][]=new int[5][5];
Scanner s1=new Scanner(System.in);
System.out.println("enter the element");
for(int i=0;i<5;i++)
{
for(int j=0;j<5;j++)
{
     a[i][j]=s1.nextInt();
}
}
System.out.println("Display");
for(int i=0;i<5;i++)
{
for(int j=0;j<5;j++)
{
  System.out.println(a[i][j]);  
  System.out.println(" ");

}
}
}
}

