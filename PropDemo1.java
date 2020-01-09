import java.util.*; 
class PropDemo1 { 
public static void main(String args[]) { 
	Properties p = new Properties(); 
String str; 
p.put("Illinois  ", "Springfield"); 
p.put("Missouri  ", "Jefferson City"); 
p.put("Washington", "Olympia"); 
Set s = p.keySet(); 
Iterator itr = s.iterator(); 
while(itr.hasNext()) { 
str = (String) itr.next(); 
System.out.println(str + " : " + p.getProperty(str)); 
} 
} 
} 

