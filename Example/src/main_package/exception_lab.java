package main_package;
import java.util.Stack;

public class exception_lab {
    public static void main( String args[] ) {
        try {
            Stack a = new Stack() ;
            a.pop() ;
        } catch( StackOverflowError e ) {
            System.out.println( "Stack Over Error." ) ;
        } catch( ArithmeticException e ) {
            System.out.println( "Math Error." ) ;
        } catch( ArrayIndexOutOfBoundsException e ) {
            System.out.println( "Array Index Error." ) ;
        } catch( Exception e ) {
            System.out.println( "Mix Error." ) ;
        }//end try catch
    }//end method
}//end class
