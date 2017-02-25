import 	java.lang.*;

class WelcomeMessage 
{
   void printMessage()
   {
      System.out.println("Hello World");
   }

   public static void printStatic()
   {
     System.out.println("Hello world from static member function\n");
   }
}

class Myclass
{
  public static void main(String[] args) 
  {
	WelcomeMessage obj = new WelcomeMessage();
	obj.printMessage();
	WelcomeMessage.printStatic();
  }
}
