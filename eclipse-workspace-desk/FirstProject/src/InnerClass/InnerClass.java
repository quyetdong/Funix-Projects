package InnerClass;

public class InnerClass {
	public class Inner2 {
		void Display2() {
			System.out.println("This is Inner class 2");
		}
	}
	
	public static void main(String[] args) {
		InnerClass inner = new InnerClass();
		Inner2 inner2 = inner.new Inner2();
		inner2.Display2();
		
		class Inner1 {
			public void Method1() {
				System.out.println("Inner Class 1");
			}
		}
		
		new Inner1().Method1();
	}
}
