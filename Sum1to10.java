public class Sum1to10 {
   public static void main(String[] args) {
      int i, num = 10, sum = 0;
         for(i = 1; i <= num; i++) {
	    sum = sum + i;
	 }
      System.out.println("The sum of integers from 1 to 10 is: " + sum + ".");
   }
}
