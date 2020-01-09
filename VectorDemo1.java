import java.util.*; 
class VectorDemo1 { 
public static void main(String args[]) { 
Vector v = new Vector(); 
v.addElement(new Integer(1));
v.addElement(new Integer(1));
v.addElement(new Double(6.08)); 
System.out.println(v); 
Enumeration e = v.elements(); 
while(e.hasMoreElements()) 
System.out.println(e.nextElement()); 
} 
} 
 
