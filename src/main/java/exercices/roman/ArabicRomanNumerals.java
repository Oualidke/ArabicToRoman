package exercices.roman;

public class ArabicRomanNumerals {
    public static String convert(int nbr) {
        if (nbr == 1) return "I";
        if (nbr == 2) return "II";
        if (nbr == 3) return "III";
        return "";
    }
}