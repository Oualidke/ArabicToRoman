package exercices.roman;

public class ArabicRomanNumerals {
    private static final int[] VALUES = {50, 40, 10, 9, 5, 4, 1};
    private static final String[] SYMBOLS = {"L", "XL", "X", "IX", "V", "IV", "I"};

    public static String convert(int nbr) {
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < VALUES.length; i++) {
            while (nbr >= VALUES[i]) {
                roman.append(SYMBOLS[i]);
                nbr -= VALUES[i];
            }
        }
        return roman.toString();
    }
}