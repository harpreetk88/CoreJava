class ThrowsDemo { 
void throwOne() throws Exception { 
	System.out.println("Inside throwOne."); 
throw new Exception("demo");
}
public static void main(String args[]) { 
	try { 
		ThrowsDemo t=new ThrowsDemo();
		t.throwOne(); 
} catch (Exception e) { 
	System.out.println("Caught " + e); 
} 
}
}

