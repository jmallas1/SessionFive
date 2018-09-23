package org.jrm.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Helper class that can ask a question and return a string result of the give answer from stdin
 * @author Jared Mallas
 * @version 1.0
 */
public class Asker
{
    private static BufferedReader br;

    /**
     * Method to send a passed in string to stdout and return stdin
     * @param question String of what you want to "ask"
     * @return String of answer given to stdin
     */
    public static String ask(String question)
    {
        String rString = new String();
        br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(question);
        try {
            rString = br.readLine();
        } catch (IOException e) {
            System.out.println("Exception thrown in Asker.ask");
            System.out.println(e.getMessage());
        }

        return rString;
    }
}
