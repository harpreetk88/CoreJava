class FinallyDemo {
 void procC() {
try {
System.out.println("inside procC"); }
finally {
System.out.println("procC's finally");
}
}

public static void main(String args[]) {
	FinallyDemo a=new FinallyDemo();
	a.procC();
}
}
