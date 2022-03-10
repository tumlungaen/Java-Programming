package main_package;

public class exception_lab {
    public static void main( String args[] ) {
        try {
            int a = 10 / 0 ;
        } catch( Error e ) {
            System.out.println( "Error." ) ;
        } catch( Exception e ) {
            System.out.println( "Exception." ) ;
        }//end try catch
    }//end method
}//end class
