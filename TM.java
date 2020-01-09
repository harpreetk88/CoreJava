import java.util.*;
class TM { 
public static void main(String args[]) { 
TreeMap h = new TreeMap(); 
h.put("Varun", new Double(3434.34)); 
h.put("David", new Double(123.22)); 
h.put("Ali", new Double(1378.00)); 
Set s = h.entrySet(); 
Iterator i = s.iterator(); 
while(i.hasNext()) { 
System.out.println(i.next()); 
}
} 
} 

