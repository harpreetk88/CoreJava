import java.util.*;
class HashMapExample1 { 
public static void main(String args[]) { 
HashMap hm = new HashMap(); 
hm.put("John Doe", new Double(3434.34)); 
hm.put("Tom Smith", new Double(123.22)); 
hm.put("Jane Baker", new Double(1378.00)); 
System.out.println(hm);
Set s = hm.entrySet(); 
Iterator i = s.iterator(); 
while(i.hasNext()) { 
System.out.println(i.next()); 
} 
System.out.println(hm.get("John Doe"));
} 
}