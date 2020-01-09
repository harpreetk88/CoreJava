import java.io.*;
public class DeserializeDemo
{
 public static void main(String [] args) throws Exception
 {
    FileInputStream f =new FileInputStream("xyz.ser");
    ObjectInputStream o = new ObjectInputStream(f);
    Employee e = (Employee) o.readObject();
    o.close();
    f.close();
    System.out.println("Name: " + e.name);
    System.out.println("Address: " + e.address);
  }
}