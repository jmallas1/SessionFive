package us.jmallas1.enums;

import org.jrm.io.*;

/**
 * Main class demonstrating use of enums
 * @author Jared Mallas
 * @version 1.0
 */
public class EnumsMain
{
    public static void main(String[] args)
    {
        // write your code here.
        String someString = Asker.ask("What is your favorite NFC team?");

        System.out.println(someString);
        String searchString = someString.substring(0, 3);
        searchString = searchString.toLowerCase();

        Teams[] NFCTeams = Teams.values();

        for (Teams aTeam : NFCTeams)
        {
            if(aTeam.getCity().toLowerCase().matches("(.*)" + searchString + "(.*)") ||
            aTeam.getMascot().toLowerCase().matches("(.*)" + searchString + "(.*)"))
            {
                System.out.println("I think you mean ");
                printFullName(aTeam);
            }
        }
    }

    /**
     * Method to grab city and mascot from a Team
     * @param aTeam team you're interested in
     */
    private static void printFullName(Teams aTeam)
    {
        System.out.println(aTeam);
    }
}
