
package autot;

public class AutoOhjelma  {

    public static void main(String[] args) {
        Auto tesla = new Auto("Tesla");
        Auto bmw = new Auto("BMW");

      tesla.aja(100);
      bmw.aja(98);
      tesla.aja(23);

      System.out.println(tesla);
      System.out.println(bmw);

    }
}