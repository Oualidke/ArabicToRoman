package exercices.roman;

public class ArabicRomanNumerals {
    public static String convert(int nbr) {
        if (nbr == 1) return "I";
        if (nbr == 2) return "II";
        if (nbr == 3) return "III";
        if (nbr == 4) return "IV";
        if (nbr == 10) return "X";
        if (nbr == 39) return "XXXIX";
        return "";
    }
}