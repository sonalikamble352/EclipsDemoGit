package New;

public class Runner 
{
   public static int sum (final int number1,final int number2)
   {
	   return number1 + number2;
   }
	   public static  void main (String[]args){
		   System.out.println(String.format("sum(%d,%d)=>%d", 5,10,sum(5,10)));
	   }
   }

