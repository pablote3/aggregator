package util;

import java.math.BigDecimal;
import java.math.RoundingMode;
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

	
    public static BigDecimal roundToBigDecimal(float d, int scale) {
        BigDecimal bd = new BigDecimal(Float.toString(d));
        bd = bd.setScale(scale, BigDecimal.ROUND_HALF_UP);
        return bd;
    }
    
    public static BigDecimal getAverage(int int1, int int2, int scale) {
    	return roundToBigDecimal(((float)int1/int2), scale);
    }
    
    public static BigDecimal getPercentDifference(BigDecimal arg1, BigDecimal arg2, int scale) {
    	BigDecimal bdAdd = arg1.add(arg2).divide(new BigDecimal(2), scale + 2, RoundingMode.HALF_UP);
    	if (bdAdd.compareTo(BigDecimal.ZERO) == 0) {
    		return BigDecimal.ZERO;
    	}
    	else {
    		BigDecimal bdSubtract = arg1.subtract(arg2);
    		return bdSubtract.divide(bdAdd, scale + 2, RoundingMode.HALF_UP).multiply(new BigDecimal(100)).setScale(scale);
    	}
    }
    
    public static BigDecimal getPossessionAdjustedStat(Integer stat, BigDecimal poss, int scale) {
    	return new BigDecimal(stat)
    		.divide(poss, 4, RoundingMode.HALF_UP)
    		.multiply(new BigDecimal(100))
    		.setScale(scale, RoundingMode.HALF_UP);
    }

    public static BigDecimal getPer48MinuteStat(Integer stat, Integer gamesPlayed, Integer minutes, int scale) {
    	return new BigDecimal(stat)
    		.multiply(new BigDecimal(48 * 5))
    		.multiply(new BigDecimal(gamesPlayed))
    		.divide(new BigDecimal(minutes), scale, RoundingMode.HALF_UP);
    }

    public static BigDecimal getPaceAdjustedStat(Integer stat, BigDecimal pace, int scale) {
    	return new BigDecimal(stat)
    		.divide(pace, 4, RoundingMode.HALF_UP)
    		.multiply(new BigDecimal(100))
    		.setScale(scale, RoundingMode.HALF_UP);
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
