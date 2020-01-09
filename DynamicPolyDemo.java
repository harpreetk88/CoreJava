class Test
{
	 void show()
	{
		System.out.println("from superclass");
	}
}
class DynamicPolyDemo extends Test
{
	 void show()
	{
		System.out.println("from subclass");
	}
	public static void main(String args[])
	{
		DynamicPolyDemo dpd=new DynamicPolyDemo();
		dpd.show();
	}
}





