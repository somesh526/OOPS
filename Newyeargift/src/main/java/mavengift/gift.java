package mavengift;
import java.util.Scanner;

public interface gift {
int weight();
}
class candies implements gift
{
	public int weight(){
		return 0;
	}
}
class sweet extends candies
{
	Scanner sc=new Scanner(System.in);
void m1()
{
System.out.println("Available sweets are Rasmalia and Gulabjamun");
}

int ras()//method to know Rasmalia weight
{
	System.out.println("Enter weight of Rasmalia (kgs):");
	int Rasmalia=sc.nextInt();
    return Rasmalia;

}
int gul()//method th know Gulabjamun weight
{
	System.out.println("Enter weight of Gulabjamun (kgs):");
	int gulab=sc.nextInt();
    return gulab;

}
}

class Dairymilk extends choclate
{
Scanner sc=new Scanner(System.in);
public int weight()
{
int w=sc.nextInt();
return w;
}
}
class Kitkat extends choclate
{
Scanner sc=new Scanner(System.in);
public int weight()
{
int p=sc.nextInt();
return p;
}
}
class Perk extends choclate
{
Scanner sc=new Scanner(System.in);
public int weight()
{
int o=sc.nextInt();
return o;
}
}
class choclate extends candies
{
void m2()
{
System.out.println("Available chocolates are Dairymilk, Munch & Perk:");
}
}
class NewYear1
{
public static void main(String args[])
{
NewYear1 h=new NewYear1();
Scanner sc=new Scanner(System.in);
System.out.println("Enter no. children to gift:");
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
	System.out.println("Children no"+(i+1));
sweet s9=new sweet();
s9.m1();
int t=s9.ras();//object t stores weight of Rasmalia
int t1=s9.gul();//object t1 stores weight of Gulabjamun
int r[]={t,t1};//array r stores t,t1
System.out.println("Total weight of selected sweets");
char l[]={'s','w','e','e','t','s'};
h.caluclate(r,l);//which is used to sort,and caluclate the total weight
choclate s1=new choclate();
s1.m2();
gift s7=new Dairymilk();
gift s4=new Kitkat();
gift s5=new Perk();
System.out.println("Enter no. of dairymilk choclates");
int w1=s7.weight();//weight of dairymilk
System.out.println("Enter no. of Kitkat choclates");
int w2=s4.weight();//weight of kitkat
System.out.println("Enter no. of Perk choclates");
int w3=s5.weight();//weight of perk
int a[]={w1,w2,w3};//array a stores weight of dairymilk,kitkat,perk
System.out.println("Selected total number of Chocaltes");
char y[]={'c','h','o','c','o','l','a','t','e'};
h.caluclate(a,y);//which is used to sort,and caluclate the total weight
}
}
void caluclate(int a[],char l[])
{

int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];	
		}
		System.out.println(sum);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print("sorting of ");
		System.out.println(l);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}

