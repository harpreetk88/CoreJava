import java.io.*;
public class SerializeDemo 
{
 public static void main(String [] args) throws Exception
 {
   Employee e = new Employee();
   e.name = "sai";
   e.address = "ameerpet";
   FileOutputStream f = new FileOutputStream("xyz.ser");
   ObjectOutputStream o = new ObjectOutputStream(f);
   o.writeObject(e);
   o.close();
   f.close();
  }
}
