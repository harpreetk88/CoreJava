import java.util.*; 
class HTDemo1 { 
public static void main(String args[]) { 
Hashtable h = new Hashtable(); 
String str; 
h.put("John Doe", new Double(3434.34)); 
h.put("Tom Smith", new Double(123.22)); 
h.put("Jane Baker", new Double(1378.00)); 
System.out.println(h);
Enumeration e = h.keys(); 
while(e.hasMoreElements()) { 
str = (String) e.nextElement(); 
System.out.println(str + ": " + h.get(str)); 
} 
System.out.println(h.get("John Doe"));
} 
} 


