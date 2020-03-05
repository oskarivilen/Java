import java.util.Scanner;

public class MarsinLampotilat {

    public static void main(String[] args) {

        int[] mittaus = new int[10];

        int min = 0;
        int max = 0;

        int index = 0;
        int temp = 0;

        double keski = 0;
        Scanner lukija = new Scanner(System.in);

        while (temp < mittaus.length)

        {
            System.out.print("Syötä mittaus " + Math.addExact(temp, 1) + "/10: ");
            index = lukija.nextInt();
            if (index > -140 && index < 21) {
                mittaus[temp] = index;
                keski += index;

                ++temp;

                if (min > index) {
                    min = index;
                } else if (max < index) {
                    max = index;
                }
            } else {
                System.out.println("Anna lämpötila väliltä -140 - +20!");
            }
        }

        System.out.println("\nMittausten keskiarvo: " + keski / 10);
        System.out.println("Pienin mittaustulos: " + min);
        System.out.println("Suurin mittaustulos: " + max);

    }

}