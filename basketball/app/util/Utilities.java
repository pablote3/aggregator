package util;

import java.math.BigDecimal;
import java.util.ArrayList;


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
    
    public static ArrayList<String> teamList() {
    	ArrayList<String> list = new ArrayList<String>();
    	list.add("LAC");
    	list.add("HOU");
    	list.add("MIN");
    	list.add("POR");
    	list.add("OKC");
    	list.add("SA");
    	list.add("PHO");
    	list.add("DAL");
    	list.add("DEN");
    	list.add("GS");
    	list.add("LAL");
    	list.add("MIA");
    	list.add("TOR");
    	list.add("DET");
    	list.add("ATL");
    	list.add("WAS");
    	list.add("SAC");
    	list.add("NO");
    	list.add("PHI");
    	list.add("NY");
    	list.add("BKN");
    	list.add("CLE");
    	list.add("CHA");
    	list.add("IND");
    	list.add("ORL");    	
    	list.add("BOS");
    	list.add("MEM");
    	list.add("MIL");
    	list.add("UTA");
    	list.add("CHI");
    	return list;
    }
}
