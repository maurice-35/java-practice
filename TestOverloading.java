class Adder{  
	static int add(int a,int b){return a+b;}  // 2 arguments
	static int add(int a,int b,int c){return a+b+c;}  //3 arguments
	}  
	class TestOverloading1{  
	public static void main(String[] args){  
	System.out.println(Adder.add(23,41));  
	System.out.println(Adder.add(50,100,11));  
	}} 

	class Adder1{  
		static int add(int a, int b){return a+b;}  // 2 arguments of int data type
		static double add(double a, double b){return a+b;}  // 2 arguments of double data type 
		}  
		class TestOverloading2{  
		public static void main(String[] args){  
		System.out.println(Adder.add(11,11));  
		// System.out.println(Adder.add(12.3,12.6));  // Changing the return type of the method is not possible.
		}} 

		class TestOverloading4{  
			public static void main(String[] args){System.out.println("main with String[]");}  
			public static void main(String args){System.out.println("main with String");}  
			public static void main(){System.out.println("main without args");}  
			} 
			
			class Bank{
				public void disp()
				{
					System.out.println("disp() float");
				}
			}
			class SBI extends Bank{
				public void rate()
				{
					System.out.println("8%");
				}
			
				class ICICI extends Bank{
					public void disp()
					{
						System.out.println("7%");
					}
				}
				class AXIS extends Bank{
					public void disp()
					{
						System.out.println("9%");
					}
				}
				public static void main( String args[]) {
					Bank rate = new Bank();
					rate.disp();
					Bank rate2 = new SBI();
					rate2.disp();
					rate.disp();
					Bank rate3 = new ICICI();
					rate3.disp();
					Bank rate4 = new AXIS();
					rate4.disp();
				}
			}
