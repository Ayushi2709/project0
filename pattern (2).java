/*
print pattern
1 *
1 2 * *
1 2 3 * * *
1 2 3 4 * * * *
1 2 3 4 5 * * * * * 
*/
import java.util.Scanner;
class pattern{
public static void main(String args[])
{
System.out.print(" Enter no of rows =");
Scanner s=new Scanner(System.in);
int x=s.nextInt();
for(int i=1;i<=x;i++)
{
for(int j=1;j<=i*2;j++)
{
if(j<=i)
System.out.print(j+" ");
else
	System.out.print("*"+" ");
}
System.out.print("\n");
}
}
}