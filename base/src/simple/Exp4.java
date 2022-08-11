package simple;

public class Exp4 {
int a=4;
int b=5;
public void add()
{
    System.out.println(a+b);
}
public static void main(String[]args)
{
	int x=4;
	int y=6;
	Exp4 obj=new Exp4();
	obj.add();
	//obj.add(x+y); we need to pass parameters 
	System.out.println(x*y);
}
}
