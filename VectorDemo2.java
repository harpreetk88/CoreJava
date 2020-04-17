import java.util.*; 
import java.io.*;
class VectorDemo2 { 
public static void main(String args[]) { 
	Vector v = new Vector(Arrays.asList(1, 2,"sri"));
System.out.println("Initial size: " + v.size()); 
System.out.println("Initial capacity: " + 
	v.capacity()); 
Enumeration vEnum = v.elements(); 
System.out.println("\nElements in vector:"); 
while(vEnum.hasMoreElements()) 
System.out.print(vEnum.nextElement() + " "); 
System.out.println(); 
} 
} 
 
