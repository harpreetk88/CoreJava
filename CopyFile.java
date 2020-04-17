import java.io.*; 
class CopyFile { 
public static void main(String args[]) throws Exception 
{ 
int i; 
FileInputStream fin = new FileInputStream("a.txt"); 
FileOutputStream fout = new FileOutputStream("b.txt"); 
do { 
i = fin.read(); 
if(i != -1) fout.write(i);
} while(i != -1);
fin.close(); 
fout.close(); 
 } 
} 




