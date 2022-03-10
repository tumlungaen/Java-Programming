package main_package;

public class test_inner_class {
    int a = 10, b = 11, c = 12 ;
    class a { int a = 11, b = 12, c = 13 ; }
    class b { int a =  9, b = 10, c = 11 ; }
    class c { int a = 12, b = 13, c = 14 ; }
    public static void main( String[] args ) {
        test_inner_class a = new test_inner_class() ;
        int ans = a.a ;
        PP( "" + ans ) ;
    }//end method
    public static void PP( String Input ) { System.out.print( Input ) ; }
}//end class
