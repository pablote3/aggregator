package util;

import java.math.BigDecimal;


public class Utilities {
	static public boolean isValidNumber(String number)  {
		try {
			if (Integer.parseInt(number) >= 0)
				return true;
			else
				return false;
		} 
		catch (NumberFormatException e) {
			return false;
		}
	}
	
	public static String padRight(String text, int length)  {
		return String.format("%1$-" + length + "s", text);
	}
	
	public static String padLeft(String text, int length) {
	    return String.format("%1$" + length + "s", text);  
	}

	
    public static BigDecimal roundtoBigDecimal(float d, int decimalPlace) {
    	//use to retain number of decimal places with ending zeros
        BigDecimal bd = new BigDecimal(Float.toString(d));
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        return bd;
    }
    
    public static float roundtoFloat(float d, int decimalPlace) {
    	//use to retain number of decimal places with ending zeros
        BigDecimal bd = new BigDecimal(Float.toString(d));
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        return bd.floatValue();
    }
}
