package beans;

public class Test {
	private String name;
	private int age;
	private String email;

//-------Using Parameterized Constructor----------------------------
	public Test(String name ,int age,String email ) {
		
		this.name = name;
		this.age = age;
		this.email =  email;
		System.out.println("Object Created for Test Class ");		
		
	}
//-------Using Setter method-------------
//	public void setName(String name) {
//		this.name = name;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
	
	public void printWord() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("email: "+email);		
	}

}
