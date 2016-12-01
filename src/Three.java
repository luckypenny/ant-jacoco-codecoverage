public class Three {
	String message = "foo";
	String message1 = "foo1";
	String message2 = "foo1";
	String message3 = "foo1";
	
	public String foo(){
		return message;
	}

	public void uncoveredMethod(){
		System.out.println(foo());
	}
	
	public String foo1(){
		return message1;
	}
	
	public String foo2(){
		return message2;
	}
	
	public String foo3(){
		return message3;
	}
}
