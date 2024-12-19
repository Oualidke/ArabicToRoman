package exercices.roman;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class ArabicRomanNumeralsTest {
    @Test
    void convertir_1_donne_I() {
        String result = ArabicRomanNumerals.convert(1);
        assertThat(result).isEqualTo("I");
    }
    @Test
    void convertir_2_donne_II() {
        String result = ArabicRomanNumerals.convert(2);
        assertThat(result).isEqualTo("II");
    }
    @Test
    void convertir_3_donne_III() {
        String result = ArabicRomanNumerals.convert(3);
        assertThat(result).isEqualTo("III");
    }

    @Test
    void convertir_4_donne_IV() {
        String result = ArabicRomanNumerals.convert(4);
        assertThat(result).isEqualTo("IV");
    }
    @Test
    void convertir_10_donne_X() {
        String result = ArabicRomanNumerals.convert(10);
        assertThat(result).isEqualTo("X");
    }

    @Test
    void convertir_39_donne_XXXIX() {
        String result = ArabicRomanNumerals.convert(39);
        assertThat(result).isEqualTo("XXXIX");
    }
    @Test
    void convertir_50_donne_L() {
        String result = ArabicRomanNumerals.convert(50);
        assertThat(result).isEqualTo("L");
    }


}
