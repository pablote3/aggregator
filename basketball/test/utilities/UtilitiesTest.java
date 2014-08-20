package utilities;

import static org.fest.assertions.Assertions.assertThat;

import java.math.BigDecimal;

import org.junit.Test;

import util.Utilities;

public class UtilitiesTest {	
    @Test
    public void isValidNumber() {
    	assertThat(Utilities.isValidNumber("10")).isTrue();
    	assertThat(Utilities.isValidNumber("ten")).isFalse();
    }
    
    @Test
    public void padString() {
   		assertThat(Utilities.padRight("Jump", 10)).isEqualTo("Jump      ");
    }
    
    @Test
    public void padBigDecimal() {
    	BigDecimal bd = new BigDecimal(25.00).setScale(2, BigDecimal.ROUND_HALF_UP);
   		assertThat(Utilities.padLeft(bd.toPlainString(), 10)).isEqualTo("     25.00");
    }
}
