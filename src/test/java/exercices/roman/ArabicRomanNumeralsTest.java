package exercices.roman;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class ArabicRomanNumeralsTest {

    @Test
    void convertir_1_donne_I() {
        String result = ArabicRomanNumerals.convert(1);
        assertThat(result).isEqualTo("I");
    }
}