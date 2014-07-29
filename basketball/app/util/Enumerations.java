package util;

import com.avaje.ebean.annotation.EnumValue;

public class Enumerations {
	public enum Status {
        @EnumValue("Scheduled") scheduled,
        @EnumValue("Finished") finished,
        @EnumValue("Completed") completed,
        @EnumValue("Postponed") postponed,
        @EnumValue("Suspended") suspended,
        @EnumValue("Cancelled") cancelled
    }
	
	public enum Location {
        @EnumValue("Home") home,
        @EnumValue("Away") away
    }
	
	public enum SeasonType {
        @EnumValue("Pre") pre,
        @EnumValue("Regular") regular,
        @EnumValue("Post") post
    }
	
	public enum Result {
        @EnumValue("Win") win,
        @EnumValue("Loss") loss
    }
	
	public enum TeamAbbr {
        @EnumValue("BOS") BOS,
        @EnumValue("BKN") BKN,
        @EnumValue("NY") NY,
        @EnumValue("PHI") PHI,  
        @EnumValue("TOR") TOR,
        @EnumValue("CHI") CHI,
        @EnumValue("CLE") CLE,
        @EnumValue("DET") DET,
        @EnumValue("IND") IND,
        @EnumValue("MIL") MIL,
        @EnumValue("ATL") ATL,
        @EnumValue("CHA") CHA,  
        @EnumValue("MIA") MIA,
        @EnumValue("ORL") ORL,
        @EnumValue("WAS") WAS,
        @EnumValue("DAL") DAL,
        @EnumValue("HOU") HOU,
        @EnumValue("MEM") MEM,
        @EnumValue("NO") NO,
        @EnumValue("SA") SA,  
        @EnumValue("DEN") DEN,
        @EnumValue("MIN") MIN,
        @EnumValue("POR") POR,
        @EnumValue("OKC") OKC,
        @EnumValue("UTA") UTA,
        @EnumValue("GS") GS,
        @EnumValue("LAC") LAC,
        @EnumValue("LAL") LAL,  
        @EnumValue("PHO") PHO,
        @EnumValue("SAC") SAC
	}
	
    public enum Conference {
        @EnumValue("East") East,
        @EnumValue("West") West,
    }
    
	public enum Division {
        @EnumValue("Atlantic")  Atlantic,
        @EnumValue("Central")   Central,
        @EnumValue("Southeast") Southeast,
        @EnumValue("Southwest") Southwest,
        @EnumValue("Northwest") Northwest,
        @EnumValue("Pacific")   Pacific,
    }
	
	public enum Position {
        @EnumValue("PG") PG,
        @EnumValue("SG") SG,
        @EnumValue("SF") SF,
        @EnumValue("PF") PF,
        @EnumValue("C") C,
        @EnumValue("G") G,
        @EnumValue("F") F
    }
	
}
