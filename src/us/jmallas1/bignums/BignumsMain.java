package us.jmallas1.bignums;

public class BignumsMain
{
    public static void main(String[] args)
    {
        Double wiscResidents = 5726398d;
        Double caliResidents = 38041430d;
        Double texResidents = 26059203d;

        // System.out.println(wiscResidents + " " + caliResidents + " " + texResidents);

        // Everyone in wisconsin sends a letter to everyone in California
        Double lettersFromWisconsin = wiscResidents*caliResidents;
        Double copiesForCalifornians = lettersFromWisconsin*texResidents;
        Double txCopyCost = copiesForCalifornians*3.23d;

        System.out.printf("Letters from wisconsin to California: %.0f\n", lettersFromWisconsin);
        System.out.printf("Copes of those letters for each Texan: %.0f\n", copiesForCalifornians);
        System.out.printf("Total cost of this nonsense: $%.2f\n\n\n", txCopyCost);

        System.out.println("It would seem that everything really is bigger in Texas...");
    }
}
