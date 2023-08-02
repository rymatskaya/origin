package lesson5;

import java.util.Random;

public class GenerateFunctions {
    public static String Generate_String_element() {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(7);
        for (int i = 0; i < 7; i++) {
            int index
                    = (int) (AlphaNumericString.length()
                    * Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }
        return sb.toString();
    }

    public static String Generate_Double_element() {
        Random rnd = new Random();
        int lowerBound = 0;
        int upperBound = 1000;
        double dbl =
                ((rnd == null ? new Random() : rnd).nextDouble() //
                        * (upperBound - lowerBound))
                        + lowerBound;
        String Str_Double = String.valueOf(dbl);
        return Str_Double.substring(0, 7);

    }
}
