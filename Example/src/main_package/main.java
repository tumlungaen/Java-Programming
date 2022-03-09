package main_package;

public class main {

	// public class InnerClass {
	// 	public InnerClass() {
	// 		System.out.println( "" ) ;
	// 		System.out.println( "This is 'InnerClass' Constractor." ) ;
	// 	}//end method
	// }//end class

	interface InnerInterface {
		//public InnerInterface() ; //Interface cannot have constractor method.
		public void TestMethod() ;
	}//end class

	public class InnerClass implements InnerInterface {
		public InnerClass() {
			System.out.println( "" ) ;
			System.out.println( "This is 'InnerClass' Constractor." ) ;
		}//end method

		public void TestMethod() {
			System.out.println( "This is TestMethod." ) ;
		}//end method
	}//end class

	public static void main( String args[] ) {
		main a = new main() ;
		main.InnerClass b = a.new InnerClass() ;
		b.TestMethod() ;
		//sub_test a = new sub_test() ;
	}//end function
}//end class

