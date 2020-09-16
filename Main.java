import java.util.Random;

import javax.lang.model.util.ElementScanner6;

class Main {
  public static void main(String[] args) {
    Random r = new Random();
    int randomNum = r.nextInt(50) + 1;
    System.out.println("The Random Number is: " + randomNum);

    if (randomNum > 0)
      for (int count = randomNum; count >= 0; count--) {
        System.out.println(count);
      }
    if (randomNum < 25) {
      System.out.println("Ahoy mateys");
    } else if (randomNum > 25 & randomNum < 42) {
      System.out.println("Cannonball");
    } else {
      System.out.println("Blast Off!");
    }
  }
}