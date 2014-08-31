package models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.avaje.ebean.annotation.Sql;

import play.db.ebean.Model;
import util.Utilities;
import util.Enumerations.TeamAbbr;

@Entity
@Sql
public class TeamSummary extends Model {
	private static final long serialVersionUID = 1L;
	
	@Enumerated(EnumType.STRING)
	private TeamAbbr teamAbbr;	
	private Integer teamGamesPlayed;
	
	private Integer teamSumPoints;
	private Integer teamSumAssists;
	private Integer teamSumTurnovers;
	private Integer teamSumSteals; 
	private Integer teamSumBlocks;
	private Integer teamSumPersonalFouls;
	private Integer teamSumFieldGoalAttempts;
	private Integer teamSumFieldGoalMade;
	private Integer teamSumThreePointAttempts;
	private Integer teamSumThreePointMade;
	private Integer teamSumFreeThrowAttempts;
	private Integer teamSumFreeThrowMade;
	private Integer teamSumReboundsOffense;
	private Integer teamSumReboundsDefense;
	private Integer teamSumPointsQ1;
	private Integer teamSumPointsQ2;
	private Integer teamSumPointsQ3;
	private Integer teamSumPointsQ4;
	
	private Integer opptSumPoints;
	private Integer opptSumAssists;
	private Integer opptSumTurnovers;
	private Integer opptSumSteals;
	private Integer opptSumBlocks;
	private Integer opptSumPersonalFouls;
	private Integer opptSumFieldGoalAttempts;
	private Integer opptSumFieldGoalMade;
	private Integer opptSumThreePointAttempts;
	private Integer opptSumThreePointMade;
	private Integer opptSumFreeThrowAttempts;
	private Integer opptSumFreeThrowMade;
	private Integer opptSumReboundsOffense;
	private Integer opptSumReboundsDefense;
	private Integer opptSumPointsQ1;
	private Integer opptSumPointsQ2;
	private Integer opptSumPointsQ3;
	private Integer opptSumPointsQ4;
	
	public TeamAbbr getTeamAbbr() { return teamAbbr; }
	public Integer getTeamGamesPlayed() { return teamGamesPlayed; }
	
	public Integer getTeamSumPoints() { return teamSumPoints; }
	public Integer getTeamSumAssists() { return teamSumAssists; }
	public Integer getTeamSumTurnovers() { return teamSumTurnovers; }
	public Integer getTeamSumSteals() { return teamSumSteals; }
	public Integer getTeamSumBlocks() { return teamSumBlocks; }
	public Integer getTeamSumPersonalFouls() { return teamSumPersonalFouls; }
	public Integer getTeamSumFieldGoalAttempts() { return teamSumFieldGoalAttempts; }
	public Integer getTeamSumFieldGoalMade() { return teamSumFieldGoalMade; }
	public Integer getTeamSumThreePointAttempts() { return teamSumThreePointAttempts; }
	public Integer getTeamSumThreePointMade() { return teamSumThreePointMade; }
	public Integer getTeamSumFreeThrowAttempts() { return teamSumFreeThrowAttempts; }
	public Integer getTeamSumFreeThrowMade() { return teamSumFreeThrowMade; }
	public Integer getTeamSumReboundsOffense() { return teamSumReboundsOffense; }
	public Integer getTeamSumReboundsDefense() { return teamSumReboundsDefense; }	
	public Integer getTeamSumReboundsTotal() { return (Integer)(teamSumReboundsOffense + teamSumReboundsDefense); }
	public Integer getTeamSumPointsQ1() { return teamSumPointsQ1; }
	public Integer getTeamSumPointsQ2() { return teamSumPointsQ2; }
	public Integer getTeamSumPointsQ3() { return teamSumPointsQ3; }
	public Integer getTeamSumPointsQ4() { return teamSumPointsQ4; }
	
	public Integer getOpptSumPoints() { return opptSumPoints; }
	public Integer getOpptSumAssists() { return opptSumAssists; }
	public Integer getOpptSumTurnovers() { return opptSumTurnovers; }
	public Integer getOpptSumSteals() { return opptSumSteals; }
	public Integer getOpptSumBlocks() { return opptSumBlocks; }
	public Integer getOpptSumPersonalFouls() { return opptSumPersonalFouls; }
	public Integer getOpptSumFieldGoalAttempts() { return opptSumFieldGoalAttempts; }
	public Integer getOpptSumFieldGoalMade() { return opptSumFieldGoalMade; }
	public Integer getOpptSumThreePointAttempts() { return opptSumThreePointAttempts; }
	public Integer getOpptSumThreePointMade() { return opptSumThreePointMade; }
	public Integer getOpptSumFreeThrowAttempts() { return opptSumFreeThrowAttempts; }
	public Integer getOpptSumFreeThrowMade() { return opptSumFreeThrowMade; }
	public Integer getOpptSumReboundsOffense() { return opptSumReboundsOffense; }
	public Integer getOpptSumReboundsDefense() { return opptSumReboundsDefense; }	
	public Integer getOpptSumReboundsTotal() { return (Integer)(opptSumReboundsOffense + opptSumReboundsDefense); }
	public Integer getOpptSumPointsQ1() { return opptSumPointsQ1; }
	public Integer getOpptSumPointsQ2() { return opptSumPointsQ2; }
	public Integer getOpptSumPointsQ3() { return opptSumPointsQ3; }
	public Integer getOpptSumPointsQ4() { return opptSumPointsQ4; }
	
	public Float getTeamAvgPoints() { return (float)teamSumPoints/teamGamesPlayed; }
	public Float getTeamAvgAssists() { return (float)teamSumAssists/teamGamesPlayed; }
	public Float getTeamAvgTurnovers() { return (float)teamSumTurnovers/teamGamesPlayed; }	
	public Float getTeamAvgSteals() { return (float)teamSumSteals/teamGamesPlayed; }	
	public Float getTeamAvgBlocks() { return (float)teamSumBlocks/teamGamesPlayed; }	
	public Float getTeamAvgPersonalFouls() { return (float)teamSumPersonalFouls/teamGamesPlayed; }	
	public Float getTeamAvgFieldGoalAttempts() { return (float)teamSumFieldGoalAttempts/teamGamesPlayed; }	
	public Float getTeamAvgFieldGoalMade() { return (float)teamSumFieldGoalMade/teamGamesPlayed; }	  
	public Float getTeamAvgFieldGoalPct() { return (float)teamSumFieldGoalMade/teamSumFieldGoalAttempts; } 
	public Float getTeamAvgThreePointAttempts() { return (float)teamSumThreePointAttempts/teamGamesPlayed; }
	public Float getTeamAvgThreePointMade() { return (float)teamSumThreePointMade/teamGamesPlayed; }	
	public Float getTeamAvgThreePointPct() { return (float)teamSumThreePointMade/teamSumThreePointAttempts; } 	
	public Float getTeamAvgFreeThrowAttempts() { return (float)teamSumFreeThrowAttempts/teamGamesPlayed; }
	public Float getTeamAvgFreeThrowMade() { return (float)teamSumFreeThrowMade/teamGamesPlayed; }	
	public Float getTeamAvgFreeThrowPct() { return (float)teamSumFreeThrowMade/teamSumFreeThrowAttempts; } 	
	public Float getTeamAvgReboundsOffense() { return (float)teamSumReboundsOffense/teamGamesPlayed; }	
	public Float getTeamAvgReboundsDefense() { return (float)teamSumReboundsDefense/teamGamesPlayed; }
	public Float getTeamAvgReboundsTotal() { return (float)(teamSumReboundsDefense + teamSumReboundsOffense)/teamGamesPlayed; }	
	public Float getTeamAvgPointsQ1() { return (float)teamSumPointsQ1/teamGamesPlayed; }	
	public Float getTeamAvgPointsQ2() { return (float)teamSumPointsQ2/teamGamesPlayed; }	
	public Float getTeamAvgPointsQ3() { return (float)teamSumPointsQ3/teamGamesPlayed; }	
	public Float getTeamAvgPointsQ4() { return (float)teamSumPointsQ4/teamGamesPlayed; }	

	public Float getOpptAvgPoints() { return (float)opptSumPoints/teamGamesPlayed; }	
	public Float getOpptAvgAssists() { return (float)opptSumAssists/teamGamesPlayed; }
	public Float getOpptAvgTurnovers() { return (float)opptSumTurnovers/teamGamesPlayed; }	
	public Float getOpptAvgSteals() { return (float)opptSumSteals/teamGamesPlayed; }	
	public Float getOpptAvgBlocks() { return (float)opptSumBlocks/teamGamesPlayed; }	
	public Float getOpptAvgPersonalFouls() { return (float)opptSumPersonalFouls/teamGamesPlayed; }	
	public Float getOpptAvgFieldGoalAttempts() { return (float)opptSumFieldGoalAttempts/teamGamesPlayed; }	
	public Float getOpptAvgFieldGoalMade() { return (float)opptSumFieldGoalMade/teamGamesPlayed; }
	public Float getOpptAvgFieldGoalPct() { return (float)opptSumFieldGoalMade/opptSumFieldGoalAttempts; } 	
	public Float getOpptAvgThreePointAttempts() { return (float)opptSumThreePointAttempts/teamGamesPlayed; }
	public Float getOpptAvgThreePointMade() { return (float)opptSumThreePointMade/teamGamesPlayed; }
	public Float getOpptAvgThreePointPct() { return (float)opptSumThreePointMade/opptSumThreePointAttempts; } 	
	public Float getOpptAvgFreeThrowAttempts() { return (float)opptSumFreeThrowAttempts/teamGamesPlayed; }
	public Float getOpptAvgFreeThrowMade() { return (float)opptSumFreeThrowMade/teamGamesPlayed; }
	public Float getOpptAvgFreeThrowPct() { return (float)opptSumFreeThrowMade/opptSumFreeThrowAttempts; } 	
	public Float getOpptAvgReboundsOffense() { return (float)opptSumReboundsOffense/teamGamesPlayed; }	
	public Float getOpptAvgReboundsDefense() { return (float)opptSumReboundsDefense/teamGamesPlayed; }
	public Float getOpptAvgReboundsTotal() { return (float)(opptSumReboundsDefense + opptSumReboundsOffense)/teamGamesPlayed; }
	public Float getOpptAvgPointsQ1() { return (float)opptSumPointsQ1/teamGamesPlayed; }	
	public Float getOpptAvgPointsQ2() { return (float)opptSumPointsQ2/teamGamesPlayed; }	
	public Float getOpptAvgPointsQ3() { return (float)opptSumPointsQ3/teamGamesPlayed; }	
	public Float getOpptAvgPointsQ4() { return (float)opptSumPointsQ4/teamGamesPlayed; }
	
	public String toStringHeader() {
		return "Team  GP    FGM    FGA    FG%    3PM    3PA    3P%     FTM    FTA    FT%     TOV    PF    OREB   DREB    REB    AST   STL   BLK    PTS";
	}
	
	public String toStringFooter() {
		return new StringBuffer()
			.append("\r" + "Stats Legend")
			.append("\r  " + Utilities.padRight("GP: Games Played", 45) + "TOV: Turnovers")
			.append("\r  " + Utilities.padRight("FGM: Field Goals Made", 45) + "PF: Personal Fouls")
			.append("\r  " + Utilities.padRight("FGA: Field Goals Attempts", 45) + "OREB: Offensive Rebounds")
			.append("\r  " + Utilities.padRight("FG%: Field Goal Percentage", 45) + "DREB: Defensive Rebounds")
			.append("\r  " + Utilities.padRight("3PM: Three-Point Field Goals Made", 45) + "REB: Total Rebounds")
			.append("\r  " + Utilities.padRight("3PA: Three-Point Field Goals Attempts", 45) + "AST: Assists")
			.append("\r  " + Utilities.padRight("3P%: Three-Point Field Goal Percentage", 45) + "STL: Steals")
			.append("\r  " + Utilities.padRight("FTM: Free Throws Made", 45) + "BLK: Blocks")
			.append("\r  " + Utilities.padRight("FTM: Free Throws Attempts", 45) + "PTS: Points")
			.append("\r  " + "FTM: Free Throw Percentage")
			.toString();
	}
	
	public String toString_TeamTotals() {
		return new StringBuffer()
			.append(this.getTeamAbbr() != null ? Utilities.padRight(this.teamAbbr.toString(), 4): Utilities.padRight("", 2))
			.append("  " + this.teamGamesPlayed)
			.append("  " + Utilities.padLeft(this.getTeamSumFieldGoalMade().toString(), 5))
			.append(" " + Utilities.padLeft(this.getTeamSumFieldGoalAttempts().toString(), 6))
			.append("   " + Utilities.roundtoBigDecimal(this.getTeamAvgFieldGoalPct(), 3))
			.append(" " + Utilities.padLeft(this.getTeamSumThreePointMade().toString(), 5))
			.append("  " + Utilities.padLeft(this.getTeamSumThreePointAttempts().toString(), 5))
			.append("   " + Utilities.roundtoBigDecimal(this.getTeamAvgThreePointPct(),3))
			.append("  " + Utilities.padLeft(this.getTeamSumFreeThrowMade().toString(), 5))
			.append("  " + Utilities.padLeft(this.getTeamSumFreeThrowAttempts().toString(), 5))
			.append("   " + Utilities.roundtoBigDecimal(this.getTeamAvgFreeThrowPct(),3))
			.append("  " + Utilities.padLeft(this.getTeamSumTurnovers().toString(), 5))
			.append("  " + Utilities.padLeft(this.getTeamSumPersonalFouls().toString(), 5))
			.append("  " + Utilities.padLeft(this.getTeamSumReboundsOffense().toString(), 5))
			.append("  " + Utilities.padLeft(this.getTeamSumReboundsDefense().toString(), 5))
			.append(" " + Utilities.padLeft(this.getTeamSumReboundsTotal().toString(), 6))
			.append("  " + Utilities.padLeft(this.getTeamSumAssists().toString(), 5))
			.append(" " + Utilities.padLeft(this.getTeamSumSteals().toString(), 5))
			.append(" " + Utilities.padLeft(this.getTeamSumBlocks().toString(), 5))
			.append(" " + Utilities.padLeft(this.getTeamSumPoints().toString(), 6))
			.toString();
	}
	
	public String toString_OpptTotals() {
		return new StringBuffer()
			.append(this.getTeamAbbr() != null ? Utilities.padRight(this.teamAbbr.toString(), 4): Utilities.padRight("", 2))
			.append("  " + this.teamGamesPlayed)
			.append("  " + Utilities.padLeft(this.getOpptSumFieldGoalMade().toString(), 5))
			.append(" " + Utilities.padLeft(this.getOpptSumFieldGoalAttempts().toString(), 6))
			.append("   " + Utilities.roundtoBigDecimal(this.getOpptAvgFieldGoalPct(), 3))
			.append(" " + Utilities.padLeft(this.getOpptSumThreePointMade().toString(), 5))
			.append("  " + Utilities.padLeft(this.getOpptSumThreePointAttempts().toString(), 5))
			.append("   " + Utilities.roundtoBigDecimal(this.getOpptAvgThreePointPct(),3))
			.append("  " + Utilities.padLeft(this.getOpptSumFreeThrowMade().toString(), 5))
			.append("  " + Utilities.padLeft(this.getOpptSumFreeThrowAttempts().toString(), 5))
			.append("   " + Utilities.roundtoBigDecimal(this.getOpptAvgFreeThrowPct(),3))
			.append("  " + Utilities.padLeft(this.getOpptSumTurnovers().toString(), 5))
			.append("  " + Utilities.padLeft(this.getOpptSumPersonalFouls().toString(), 5))
			.append("  " + Utilities.padLeft(this.getOpptSumReboundsOffense().toString(), 5))
			.append("  " + Utilities.padLeft(this.getOpptSumReboundsDefense().toString(), 5))
			.append(" " + Utilities.padLeft(this.getOpptSumReboundsTotal().toString(), 6))
			.append("  " + Utilities.padLeft(this.getOpptSumAssists().toString(), 5))
			.append(" " + Utilities.padLeft(this.getOpptSumSteals().toString(), 5))
			.append(" " + Utilities.padLeft(this.getOpptSumBlocks().toString(), 5))
			.append(" " + Utilities.padLeft(this.getOpptSumPoints().toString(), 6))
			.toString();
	}
	
	public String toString_TeamAverages() {
		return new StringBuffer()
			.append(this.getTeamAbbr() != null ? Utilities.padRight(this.teamAbbr.toString(), 4): Utilities.padRight("", 2))
			.append("  " + this.teamGamesPlayed)
			.append("  " + Utilities.roundtoBigDecimal(this.getTeamAvgFieldGoalMade(), 2))
			.append("  " + Utilities.roundtoBigDecimal(this.getTeamAvgFieldGoalAttempts(), 2))
			.append("   " + Utilities.roundtoBigDecimal(this.getTeamAvgFieldGoalPct(), 3))
			.append("  " + Utilities.roundtoBigDecimal(this.getTeamAvgThreePointMade(), 2))
			.append("  " + Utilities.roundtoBigDecimal(this.getTeamAvgThreePointAttempts(), 2))
			.append("   " + Utilities.roundtoBigDecimal(this.getTeamAvgThreePointPct(),3))
			.append("  " + Utilities.roundtoBigDecimal(this.getTeamAvgFreeThrowMade(), 2))
			.append("  " + Utilities.roundtoBigDecimal(this.getTeamAvgFreeThrowAttempts(), 2))
			.append("   " + Utilities.roundtoBigDecimal(this.getTeamAvgFreeThrowPct(),3))
			.append("  " + Utilities.roundtoBigDecimal(this.getTeamAvgTurnovers(), 2))
			.append("  " + Utilities.roundtoBigDecimal(this.getTeamAvgPersonalFouls(),2))			
			.append("  " + Utilities.padLeft(Utilities.roundtoBigDecimal(this.getTeamAvgReboundsOffense(),2).toPlainString(), 5))
			.append("  " + Utilities.roundtoBigDecimal(this.getTeamAvgReboundsDefense(),2))
			.append("  " + Utilities.roundtoBigDecimal(this.getTeamAvgReboundsTotal(),2))			
			.append("  " + Utilities.roundtoBigDecimal(this.getTeamAvgAssists(),2))
			.append("  " + Utilities.roundtoBigDecimal(this.getTeamAvgSteals(),2))
			.append("  " + Utilities.roundtoBigDecimal(this.getTeamAvgBlocks(),2))
			.append("  " + Utilities.padLeft(Utilities.roundtoBigDecimal(this.getTeamAvgPoints(),2).toPlainString(), 6))
			.toString();
	}
	
	public String toString_OpptAverages() {
		return new StringBuffer()
			.append(this.getTeamAbbr() != null ? Utilities.padRight(this.teamAbbr.toString(), 4): Utilities.padRight("", 2))
			.append("  " + this.teamGamesPlayed)
			.append("  " + Utilities.roundtoBigDecimal(this.getOpptAvgFieldGoalMade(), 2))
			.append("  " + Utilities.roundtoBigDecimal(this.getOpptAvgFieldGoalAttempts(), 2))
			.append("   " + Utilities.roundtoBigDecimal(this.getOpptAvgFieldGoalPct(), 3))
			.append("  " + Utilities.roundtoBigDecimal(this.getOpptAvgThreePointMade(), 2))
			.append("  " + Utilities.roundtoBigDecimal(this.getOpptAvgThreePointAttempts(), 2))
			.append("   " + Utilities.roundtoBigDecimal(this.getOpptAvgThreePointPct(),3))
			.append("  " + Utilities.roundtoBigDecimal(this.getOpptAvgFreeThrowMade(), 2))
			.append("  " + Utilities.roundtoBigDecimal(this.getOpptAvgFreeThrowAttempts(), 2))
			.append("   " + Utilities.roundtoBigDecimal(this.getOpptAvgFreeThrowPct(),3))
			.append("  " + Utilities.roundtoBigDecimal(this.getOpptAvgTurnovers(), 2))
			.append("  " + Utilities.roundtoBigDecimal(this.getOpptAvgPersonalFouls(),2))			
			.append("  " + Utilities.padLeft(Utilities.roundtoBigDecimal(this.getOpptAvgReboundsOffense(),2).toPlainString(), 5))
			.append("  " + Utilities.roundtoBigDecimal(this.getOpptAvgReboundsDefense(),2))
			.append("  " + Utilities.roundtoBigDecimal(this.getOpptAvgReboundsTotal(),2))			
			.append("  " + Utilities.roundtoBigDecimal(this.getOpptAvgAssists(),2))
			.append("  " + Utilities.roundtoBigDecimal(this.getOpptAvgSteals(),2))
			.append("  " + Utilities.roundtoBigDecimal(this.getOpptAvgBlocks(),2))
			.append("  " + Utilities.padLeft(Utilities.roundtoBigDecimal(this.getOpptAvgPoints(),2).toPlainString(), 6))
			.toString();
	}
}