class MultiCatch { 
public static void main(String args[]) { 
	try { 
int a = 0; 
int b = 42 / a; 
int c[] = { 1 }; 
c[42] = 99; 
} catch(ArithmeticException e) { 
System.out.println(e); 
} catch(ArrayIndexOutOfBoundsException e) { 
System.out.println(e); 
} 
System.out.println("After try/catch blocks.");
}
} 


