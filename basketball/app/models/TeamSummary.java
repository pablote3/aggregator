package models;

import java.math.BigDecimal;

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
	
	public BigDecimal getTeamAvgPoints() { return Utilities.getAverage(teamSumPoints, teamGamesPlayed, 2); }
	public BigDecimal getTeamAvgAssists() { return Utilities.getAverage(teamSumAssists, teamGamesPlayed, 2); }
	public BigDecimal getTeamAvgTurnovers() { return Utilities.getAverage(teamSumTurnovers, teamGamesPlayed, 2); }	
	public BigDecimal getTeamAvgSteals() { return Utilities.getAverage(teamSumSteals, teamGamesPlayed, 2); }	
	public BigDecimal getTeamAvgBlocks() { return Utilities.getAverage(teamSumBlocks, teamGamesPlayed, 2); }	
	public BigDecimal getTeamAvgPersonalFouls() { return Utilities.getAverage(teamSumPersonalFouls, teamGamesPlayed, 2); }	
	public BigDecimal getTeamAvgFieldGoalAttempts() { return Utilities.getAverage(teamSumFieldGoalAttempts, teamGamesPlayed, 2); }	
	public BigDecimal getTeamAvgFieldGoalMade() { return Utilities.getAverage(teamSumFieldGoalMade, teamGamesPlayed, 2); }	  
	public BigDecimal getTeamAvgFieldGoalPct() { return Utilities.getAverage(teamSumFieldGoalMade, teamSumFieldGoalAttempts, 3); } 
	public BigDecimal getTeamAvgThreePointAttempts() { return Utilities.getAverage(teamSumThreePointAttempts, teamGamesPlayed, 2); }
	public BigDecimal getTeamAvgThreePointMade() { return Utilities.getAverage(teamSumThreePointMade, teamGamesPlayed, 2); }	
	public BigDecimal getTeamAvgThreePointPct() { return Utilities.getAverage(teamSumThreePointMade, teamSumThreePointAttempts, 3); } 	
	public BigDecimal getTeamAvgFreeThrowAttempts() { return Utilities.getAverage(teamSumFreeThrowAttempts, teamGamesPlayed, 2); }
	public BigDecimal getTeamAvgFreeThrowMade() { return Utilities.getAverage(teamSumFreeThrowMade, teamGamesPlayed, 2); }	
	public BigDecimal getTeamAvgFreeThrowPct() { return Utilities.getAverage(teamSumFreeThrowMade, teamSumFreeThrowAttempts, 3); } 	
	public BigDecimal getTeamAvgReboundsOffense() { return Utilities.getAverage(teamSumReboundsOffense, teamGamesPlayed, 2); }	
	public BigDecimal getTeamAvgReboundsDefense() { return Utilities.getAverage(teamSumReboundsDefense, teamGamesPlayed, 2); }
	public BigDecimal getTeamAvgReboundsTotal() { return Utilities.getAverage((teamSumReboundsDefense + teamSumReboundsOffense), teamGamesPlayed, 2); }	
	public BigDecimal getTeamAvgPointsQ1() { return Utilities.getAverage(teamSumPointsQ1, teamGamesPlayed, 2); }	
	public BigDecimal getTeamAvgPointsQ2() { return Utilities.getAverage(teamSumPointsQ2, teamGamesPlayed, 2); }	
	public BigDecimal getTeamAvgPointsQ3() { return Utilities.getAverage(teamSumPointsQ3, teamGamesPlayed, 2); }	
	public BigDecimal getTeamAvgPointsQ4() { return Utilities.getAverage(teamSumPointsQ4, teamGamesPlayed, 2); }	

	public BigDecimal getOpptAvgPoints() { return Utilities.getAverage(opptSumPoints, teamGamesPlayed, 2); }	
	public BigDecimal getOpptAvgAssists() { return Utilities.getAverage(opptSumAssists, teamGamesPlayed, 2); }
	public BigDecimal getOpptAvgTurnovers() { return Utilities.getAverage(opptSumTurnovers, teamGamesPlayed, 2); }	
	public BigDecimal getOpptAvgSteals() { return Utilities.getAverage(opptSumSteals, teamGamesPlayed, 2); }	
	public BigDecimal getOpptAvgBlocks() { return Utilities.getAverage(opptSumBlocks, teamGamesPlayed, 2); }	
	public BigDecimal getOpptAvgPersonalFouls() { return Utilities.getAverage(opptSumPersonalFouls, teamGamesPlayed, 2); }	
	public BigDecimal getOpptAvgFieldGoalAttempts() { return Utilities.getAverage(opptSumFieldGoalAttempts, teamGamesPlayed, 2); }	
	public BigDecimal getOpptAvgFieldGoalMade() { return Utilities.getAverage(opptSumFieldGoalMade, teamGamesPlayed, 2); }
	public BigDecimal getOpptAvgFieldGoalPct() { return Utilities.getAverage(opptSumFieldGoalMade, opptSumFieldGoalAttempts, 3); } 	
	public BigDecimal getOpptAvgThreePointAttempts() { return Utilities.getAverage(opptSumThreePointAttempts, teamGamesPlayed, 2); }
	public BigDecimal getOpptAvgThreePointMade() { return Utilities.getAverage(opptSumThreePointMade, teamGamesPlayed, 2); }
	public BigDecimal getOpptAvgThreePointPct() { return Utilities.getAverage(opptSumThreePointMade, opptSumThreePointAttempts, 3); } 	
	public BigDecimal getOpptAvgFreeThrowAttempts() { return Utilities.getAverage(opptSumFreeThrowAttempts, teamGamesPlayed, 2); }
	public BigDecimal getOpptAvgFreeThrowMade() { return Utilities.getAverage(opptSumFreeThrowMade, teamGamesPlayed, 2); }
	public BigDecimal getOpptAvgFreeThrowPct() { return Utilities.getAverage(opptSumFreeThrowMade, opptSumFreeThrowAttempts, 3); } 	
	public BigDecimal getOpptAvgReboundsOffense() { return Utilities.getAverage(opptSumReboundsOffense, teamGamesPlayed, 2); }	
	public BigDecimal getOpptAvgReboundsDefense() { return Utilities.getAverage(opptSumReboundsDefense, teamGamesPlayed, 2); }
	public BigDecimal getOpptAvgReboundsTotal() { return Utilities.getAverage((opptSumReboundsDefense + opptSumReboundsOffense), teamGamesPlayed, 2); }
	public BigDecimal getOpptAvgPointsQ1() { return Utilities.getAverage(opptSumPointsQ1, teamGamesPlayed, 2); }	
	public BigDecimal getOpptAvgPointsQ2() { return Utilities.getAverage(opptSumPointsQ2, teamGamesPlayed, 2); }	
	public BigDecimal getOpptAvgPointsQ3() { return Utilities.getAverage(opptSumPointsQ3, teamGamesPlayed, 2); }	
	public BigDecimal getOpptAvgPointsQ4() { return Utilities.getAverage(opptSumPointsQ4, teamGamesPlayed, 2); }
	
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
			.append("   " + this.getTeamAvgFieldGoalPct())
			.append(" " + Utilities.padLeft(this.getTeamSumThreePointMade().toString(), 5))
			.append("  " + Utilities.padLeft(this.getTeamSumThreePointAttempts().toString(), 5))
			.append("   " + this.getTeamAvgThreePointPct())
			.append("  " + Utilities.padLeft(this.getTeamSumFreeThrowMade().toString(), 5))
			.append("  " + Utilities.padLeft(this.getTeamSumFreeThrowAttempts().toString(), 5))
			.append("   " + this.getTeamAvgFreeThrowPct())
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
			.append("   " + this.getOpptAvgFieldGoalPct())
			.append(" " + Utilities.padLeft(this.getOpptSumThreePointMade().toString(), 5))
			.append("  " + Utilities.padLeft(this.getOpptSumThreePointAttempts().toString(), 5))
			.append("   " + this.getOpptAvgThreePointPct())
			.append("  " + Utilities.padLeft(this.getOpptSumFreeThrowMade().toString(), 5))
			.append("  " + Utilities.padLeft(this.getOpptSumFreeThrowAttempts().toString(), 5))
			.append("   " + this.getOpptAvgFreeThrowPct())
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
			.append("  " +	this.teamGamesPlayed)
			.append("  " +	this.getTeamAvgFieldGoalMade())
			.append("  " +	this.getTeamAvgFieldGoalAttempts())
			.append("   " +	this.getTeamAvgFieldGoalPct())
			.append("  " +	this.getTeamAvgThreePointMade())
			.append("  " +	this.getTeamAvgThreePointAttempts())
			.append("   " +	this.getTeamAvgThreePointPct())
			.append("  " +	this.getTeamAvgFreeThrowMade())
			.append("  " +	this.getTeamAvgFreeThrowAttempts())
			.append("   " +	this.getTeamAvgFreeThrowPct())
			.append("  " +	this.getTeamAvgTurnovers())
			.append("  " +	this.getTeamAvgPersonalFouls())			
			.append("  " +	Utilities.padLeft(this.getTeamAvgReboundsOffense().toPlainString(), 5))
			.append("  " +	this.getTeamAvgReboundsDefense())
			.append("  " +	this.getTeamAvgReboundsTotal())			
			.append("  " +	this.getTeamAvgAssists())
			.append("  " +	this.getTeamAvgSteals())
			.append("  " +	this.getTeamAvgBlocks())
			.append("  " +	Utilities.padLeft(this.getTeamAvgPoints().toPlainString(), 6))
			.toString();
	}
	
	public String toString_OpptAverages() {
		return new StringBuffer()
			.append(this.getTeamAbbr() != null ? Utilities.padRight(this.teamAbbr.toString(), 4): Utilities.padRight("", 2))
			.append("  " +	this.teamGamesPlayed)
			.append("  " +	this.getOpptAvgFieldGoalMade())
			.append("  " +	this.getOpptAvgFieldGoalAttempts())
			.append("   " +	this.getOpptAvgFieldGoalPct())
			.append("  " +	this.getOpptAvgThreePointMade())
			.append("  " +	this.getOpptAvgThreePointAttempts())
			.append("   " +	this.getOpptAvgThreePointPct())
			.append("  " +	this.getOpptAvgFreeThrowMade())
			.append("  " +	this.getOpptAvgFreeThrowAttempts())
			.append("   " +	this.getOpptAvgFreeThrowPct())
			.append("  " +	this.getOpptAvgTurnovers())
			.append("  " +	this.getOpptAvgPersonalFouls())			
			.append("  " +	Utilities.padLeft(this.getOpptAvgReboundsOffense().toPlainString(), 5))
			.append("  " +	this.getOpptAvgReboundsDefense())
			.append("  " +	this.getOpptAvgReboundsTotal())			
			.append("  " +	this.getOpptAvgAssists())
			.append("  " +	this.getOpptAvgSteals())
			.append("  " +	this.getOpptAvgBlocks())
			.append("  " +	Utilities.padLeft(this.getOpptAvgPoints().toPlainString(), 6))
			.toString();
	}
}