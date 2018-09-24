package us.jmallas1.numwrappers;

import org.jrm.io.Asker;

/**
 * Main class for numwrappers. Demonstrate the ability to determine what *kind* of number
 * was passed at the command line. Full disclosure: Im not proud of this. I think there should
 * be a better way to do this but I'll be dipped if I can think of it.
 * @author Jared Mallas
 * @version 1.0
 */
public class numwrappersMain
{
    public static void main(String[] args)
    {
        String someString = Asker.ask("Please enter a number");

        Object theNumber = null;

        Boolean bDone = false;

        while (!bDone)
        {
            try
            {
                theNumber = Byte.parseByte(someString);
            }
            catch(NumberFormatException nfea)
            {
                // System.out.println("notabyte");

                try
                {
                    theNumber = Integer.parseInt(someString);
                }
                catch(NumberFormatException nfeb)
                {
                    // System.out.println("notaint");
                    try
                    {
                        theNumber = Short.parseShort(someString);
                    }
                    catch (NumberFormatException nfec)
                    {
                        // System.out.println("notashort");
                        try
                        {
                            theNumber = Long.parseLong(someString);
                        }
                        catch(NumberFormatException nfed)
                        {
                            // System.out.println("notalong");
                            try
                            {
                                theNumber = Double.parseDouble(someString);
                            }
                            catch (NumberFormatException nfee)
                            {
                                // System.out.println("notadouble");
                                theNumber = null;
                            }
                        }
                    }
                }
            }
            finally
            {
                try
                {
                    System.out.println("The number " + theNumber + " will fit into a " + theNumber.getClass());
                    bDone = true;
                }
                catch(NullPointerException npe)
                {
                    System.out.println("Doesn't look like you passed in a number at all...");
                    someString = Asker.ask("Please enter a number this time:");
                }

            }
        }
    }
}