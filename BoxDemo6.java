class Box2 { 
double width; 
double height; 
double depth; 
Box2() { 
System.out.println("Constructing Box"); 
width = 10; 
height = 10; 
depth = 10; 
 } 
double volume() { 
return width * height * depth;
}
} 
class BoxDemo6 { 
public static void main(String args[]) { 
Box2 a = new Box2(); 
double vol = a.volume(); 
System.out.println("Volume is " + vol); 
}
} 














