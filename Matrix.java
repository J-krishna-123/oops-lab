import java.util.*;
class Matrix
{
 public static void main(String[] args)
{
int m,n,i,j;
Scanner s1=new Scanner(System.in);
System.out.println("enter the number of rows and column");
m=s1.nextInt();
n=s1.nextInt();
int a[][]=new int[m][n];
int b[][]=new int[m][n];
int c[][]=new int[m][n];
System.out.println("enter the elements of first matrix");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=s1.nextInt();
}

}
System.out.println("enter the elements of second matrix");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
b[i][j]=s1.nextInt();
}
}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
c[i][j]=a[i][j]+b[i][j];
}
}
System.out.println("displaying the resultent matrix is");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
   System.out.println(c[i][j]+" ");
}
System.out.println(" ");
}
}
}








   



 


    
