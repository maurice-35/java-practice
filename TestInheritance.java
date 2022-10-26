class Family {
	void rent() {System.out.println("renting...");}
	}
	class Father extends Family{  // Hierarchical Inheritance
	void work() {System.out.println("working...");}
	}
	class Mother extends Father{  //Hierarchical Inheritance
	void cook() {System.out.println("cooking...");}
	}
	class TestInheritance2{
	public static void main(String args[]) {
	Mother m=new Mother();
	m.cook();
	m.work();
	m.rent();
	}
	}
	


