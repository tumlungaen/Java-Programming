package main_package;
public class dd {
    class mini_thread extends Thread {
        int count = 0 ;
        public void run() { PP( "" + count ) ; }
        private void SetCount( int count ) { this.count = count ; }
    }//end class
    public static void main( String[] args ) {
        dd thread = new dd() ;
        dd.mini_thread t1 = thread.new mini_thread() ;
        t1.SetCount( 1 ) ; t1.start();
        t1.SetCount( 2 ) ; t1.start();
    }//end method
    public static void PP( String Input ) { System.out.print( Input ) ; }
}//end class
