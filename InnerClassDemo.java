class Outer 
{ 
 int x = 100; 
 void test() 
 { 
   Inner i = new Inner(); 
   i.display(); 
 } 
 class Inner 
 { 
  void display() 
  { 
    System.out.println(x);
  }
 }
}

class InnerClassDemo 
{ 
 public static void main(String args[]) 
 { 
	Outer o = new Outer(); 
    o.test(); 
 } 
} 
