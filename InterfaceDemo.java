interface One
{
	void add();
	
}
class First implements One
{
	public void add()
	{
		int a=10;
	    int b=20;
		int c = a+b;
		System.out.println("Result= "+c);
	}
	
}
 class  InterfaceDemo
{
	public static void main(String[] args) 
	{
		First f=new First();
		f.add();
	}
}

