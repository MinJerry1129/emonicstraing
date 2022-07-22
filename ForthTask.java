import java.io.IOException;

class TestException {
    public static void main(String[] args) {
   	    try {
   		    testExceptions();
   	    }catch (IOException  e) 
        {
            e.printStackTrace();
        }
    }
  
    public static void testExceptions() throws IOException{
   	    System.out.println("IOException is running");
    }
}

// 2:: Same thread can't start twice.

// -This can work:
// 	th1 = new ThreadClass();
// 	th1.start();
// 	th2 = new ThreadClass();
// 	th2.start();

// -this is not allowed:
// 	thread1 = new ThreadClass();
// 	thread1.start();
// 	thread1.start();