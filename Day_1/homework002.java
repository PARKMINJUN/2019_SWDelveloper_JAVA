public class homework002 {
	public static void main( String[] args ){	
	double i = 1000000;
		i = i*(1+(0.066*100));
	System.out.println( i ); 
	}
}

/*
public class Solution2 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      double money = 0;
      for (int i = 1; i <= 100; i++) {// 백년동안
         money +=1000000;
         money = money + interestCalc(money, 6.6);
      }
      System.out.println(money);
   }

   public static double interestCalc(double money, double interest) {
      return money * (interest / 100);
   }

}
*/