class Sample
{
  void  test()
  {
     System.out.println("no parameters");
  }
  void test(int a)
  {
     System.out.println("a:"+a);
  }
  void test(int a,int b)
  {
     System.out.println("a & b:"+a+"  "+b);
  }
  void test(double a)
  {
     System.out.println("double a: "+a);
  }
}
class TestExample
{
 public static void main(String args[])
 {
    Sample s=new Sample();
    s.test();
    s.test(2);
    s.test(10,20);
    s.test(12.3);
 }
}

