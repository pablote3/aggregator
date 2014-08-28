package models;

import javax.persistence.Entity;

import play.db.ebean.Model;
import util.Utilities;

import com.avaje.ebean.annotation.Sql;

@Entity
@Sql
public class LeagueSummary extends Model {
	private static final long serialVersionUID = 1L;
	
	private Integer teamGamesPlayed;
	public Integer getTeamGamesPlayed() {
		return teamGamesPlayed / 30;
	}
	public void setGamesPlayed(Integer teamGamesPlayed) {
		this.teamGamesPlayed = teamGamesPlayed;
	}
	
	public Integer getSumGamesPlayed() {
		return teamGamesPlayed;
	}
	public void setSumGamesPlayed(Integer teamGamesPlayed) {
		this.teamGamesPlayed = teamGamesPlayed;
	}

	private Integer teamSumPoints;
	public Integer getTeamSumPoints() {
		return teamSumPoints;
	}
	public void setTeamSumPoints(Integer teamSumPoints) {
		this.teamSumPoints = teamSumPoints;
	}
	
	private Integer teamSumAssists;
	public Integer getTeamSumAssists() {
		return teamSumAssists;
	}
	public void setTeamSumAssists(Integer teamSumAssists) {
		this.teamSumAssists = teamSumAssists;
	}
	
	private Integer teamSumTurnovers;
	public Integer getTeamSumTurnovers() {
		return teamSumTurnovers;
	}
	public void setTeamSumTurnovers(Integer teamSumTurnovers) {
		this.teamSumTurnovers = teamSumTurnovers;
	}
	
	private Integer teamSumSteals;
	public Integer getTeamSumSteals() {
		return teamSumSteals;
	}
	public void setTeamSumSteals(Integer teamSumSteals) {
		this.teamSumSteals = teamSumSteals;
	}
	
	private Integer teamSumBlocks;
	public Integer getTeamSumBlocks() {
		return teamSumBlocks;
	}
	public void setTeamSumBlocks(Integer teamSumBlocks) {
		this.teamSumBlocks = teamSumBlocks;
	}
	
	private Integer teamSumPersonalFouls;
	public Integer getTeamSumPersonalFouls() {
		return teamSumPersonalFouls;
	}
	public void setTeamSumPersonalFouls(Integer teamSumPersonalFouls) {
		this.teamSumPersonalFouls = teamSumPersonalFouls;
	}
	
	private Integer teamSumFieldGoalAttempts;
	public Integer getTeamSumFieldGoalAttempts() {
		return teamSumFieldGoalAttempts;
	}
	public void setTeamSumFieldGoalAttempts(Integer teamSumFieldGoalAttempts) {
		this.teamSumFieldGoalAttempts = teamSumFieldGoalAttempts;
	}	
	
	private Integer teamSumFieldGoalMade;
	public Integer getTeamSumFieldGoalMade() {
		return teamSumFieldGoalMade;
	}
	public void setTeamSumFieldGoalMade(Integer teamSumFieldGoalMade) {
		this.teamSumFieldGoalMade = teamSumFieldGoalMade;
	}	

	private Integer teamSumThreePointAttempts;
	public Integer getTeamSumThreePointAttempts() {
		return teamSumThreePointAttempts;
	}
	public void setTeamSumThreePointAttempts(Integer teamSumThreePointAttempts) {
		this.teamSumThreePointAttempts = teamSumThreePointAttempts;
	}	

	private Integer teamSumThreePointMade;
	public Integer getTeamSumThreePointMade() {
		return teamSumThreePointMade;
	}
	public void setTeamSumThreePointMade(Integer teamSumThreePointMade) {
		this.teamSumThreePointMade = teamSumThreePointMade;
	}
	
	private Integer teamSumFreeThrowAttempts;
	public Integer getTeamSumFreeThrowAttempts() {
		return teamSumFreeThrowAttempts;
	}
	public void setTeamSumFreeThrowAttempts(Integer teamSumFreeThrowAttempts) {
		this.teamSumFreeThrowAttempts = teamSumFreeThrowAttempts;
	}	

	private Integer teamSumFreeThrowMade;
	public Integer getTeamSumFreeThrowMade() {
		return teamSumFreeThrowMade;
	}
	public void setTeamSumFreeThrowMade(Integer teamSumFreeThrowMade) {
		this.teamSumFreeThrowMade = teamSumFreeThrowMade;
	}	
	
	private Integer teamSumReboundsOffense;
	public Integer getTeamSumReboundsOffense() {
		return teamSumReboundsOffense;
	}
	public void setTeamSumReboundsOffense(Integer teamSumReboundsOffense) {
		this.teamSumReboundsOffense = teamSumReboundsOffense;
	}
	
	private Integer teamSumReboundsDefense;
	public Integer getTeamSumReboundsDefense() {
		return teamSumReboundsDefense;
	}
	public void setTeamSumReboundsDefense(Integer teamSumReboundsDefense) {
		this.teamSumReboundsDefense = teamSumReboundsDefense;
	}
	
	public Integer getTeamSumReboundsTotal() {
		return (Integer)(teamSumReboundsOffense + teamSumReboundsDefense);
	}
	
	private Integer teamSumPointsQ1;
	public Integer getTeamSumPointsQ1() {
		return teamSumPointsQ1;
	}
	public void setTeamSumPointsQ1(Integer teamSumPointsQ1) {
		this.teamSumPointsQ1 = teamSumPointsQ1;
	}
	
	private Integer teamSumPointsQ2;
	public Integer getTeamSumPointsQ2() {
		return teamSumPointsQ2;
	}
	public void setTeamSumPointsQ2(Integer teamSumPointsQ2) {
		this.teamSumPointsQ2 = teamSumPointsQ2;
	}
	
	private Integer teamSumPointsQ3;
	public Integer getTeamSumPointsQ3() {
		return teamSumPointsQ3;
	}
	public void setTeamSumPointsQ3(Integer teamSumPointsQ3) {
		this.teamSumPointsQ3 = teamSumPointsQ3;
	}
	
	private Integer teamSumPointsQ4;
	public Integer getTeamSumPointsQ4() {
		return teamSumPointsQ4;
	}
	public void setTeamSumPointsQ4(Integer teamSumPointsQ4) {
		this.teamSumPointsQ4 = teamSumPointsQ4;
	}
	
	private Integer opptSumPoints;
	public Integer getOpptSumPoints() {
		return opptSumPoints;
	}
	public void setOpptSumPoints(Integer opptSumPoints) {
		this.opptSumPoints = opptSumPoints;
	}
	
	private Integer opptSumAssists;
	public Integer getOpptSumAssists() {
		return opptSumAssists;
	}
	public void setOpptSumAssists(Integer opptSumAssists) {
		this.opptSumAssists = opptSumAssists;
	}
	
	private Integer opptSumTurnovers;
	public Integer getOpptSumTurnovers() {
		return opptSumTurnovers;
	}
	public void setOpptSumTurnovers(Integer opptSumTurnovers) {
		this.opptSumTurnovers = opptSumTurnovers;
	}
	
	private Integer opptSumSteals;
	public Integer getOpptSumSteals() {
		return opptSumSteals;
	}
	public void setOpptSumSteals(Integer opptSumSteals) {
		this.opptSumSteals = opptSumSteals;
	}
	
	private Integer opptSumBlocks;
	public Integer getOpptSumBlocks() {
		return opptSumBlocks;
	}
	public void setOpptSumBlocks(Integer opptSumBlocks) {
		this.opptSumBlocks = opptSumBlocks;
	}
	
	private Integer opptSumPersonalFouls;
	public Integer getOpptSumPersonalFouls() {
		return opptSumPersonalFouls;
	}
	public void setOpptSumPersonalFouls(Integer opptSumPersonalFouls) {
		this.opptSumPersonalFouls = opptSumPersonalFouls;
	}
	
	private Integer opptSumFieldGoalAttempts;
	public Integer getOpptSumFieldGoalAttempts() {
		return opptSumFieldGoalAttempts;
	}
	public void setOpptSumFieldGoalAttempts(Integer opptSumFieldGoalAttempts) {
		this.opptSumFieldGoalAttempts = opptSumFieldGoalAttempts;
	}	
	
	private Integer opptSumFieldGoalMade;
	public Integer getOpptSumFieldGoalMade() {
		return opptSumFieldGoalMade;
	}
	public void setOpptSumFieldGoalMade(Integer opptSumFieldGoalMade) {
		this.opptSumFieldGoalMade = opptSumFieldGoalMade;
	}	

	private Integer opptSumThreePointAttempts;
	public Integer getOpptSumThreePointAttempts() {
		return opptSumThreePointAttempts;
	}
	public void setOpptSumThreePointAttempts(Integer opptSumThreePointAttempts) {
		this.opptSumThreePointAttempts = opptSumThreePointAttempts;
	}	

	private Integer opptSumThreePointMade;
	public Integer getOpptSumThreePointMade() {
		return opptSumThreePointMade;
	}
	public void setOpptSumThreePointMade(Integer opptSumThreePointMade) {
		this.opptSumThreePointMade = opptSumThreePointMade;
	}
	
	private Integer opptSumFreeThrowAttempts;
	public Integer getOpptSumFreeThrowAttempts() {
		return opptSumFreeThrowAttempts;
	}
	public void setOpptSumFreeThrowAttempts(Integer opptSumFreeThrowAttempts) {
		this.opptSumFreeThrowAttempts = opptSumFreeThrowAttempts;
	}	

	private Integer opptSumFreeThrowMade;
	public Integer getOpptSumFreeThrowMade() {
		return opptSumFreeThrowMade;
	}
	public void setOpptSumFreeThrowMade(Integer opptSumFreeThrowMade) {
		this.opptSumFreeThrowMade = opptSumFreeThrowMade;
	}	
	
	private Integer opptSumReboundsOffense;
	public Integer getOpptSumReboundsOffense() {
		return opptSumReboundsOffense;
	}
	public void setOpptSumReboundsOffense(Integer opptSumReboundsOffense) {
		this.opptSumReboundsOffense = opptSumReboundsOffense;
	}
	
	private Integer opptSumReboundsDefense;
	public Integer getOpptSumReboundsDefense() {
		return opptSumReboundsDefense;
	}
	public void setOpptSumReboundsDefense(Integer opptSumReboundsDefense) {
		this.opptSumReboundsDefense = opptSumReboundsDefense;
	}
	
	public Integer getOpptSumReboundsTotal() {
		return (Integer)(opptSumReboundsOffense + opptSumReboundsDefense);
	}
	
	private Integer opptSumPointsQ1;
	public Integer getOpptSumPointsQ1() {
		return opptSumPointsQ1;
	}
	public void setOpptSumPointsQ1(Integer opptSumPointsQ1) {
		this.opptSumPointsQ1 = opptSumPointsQ1;
	}
	
	private Integer opptSumPointsQ2;
	public Integer getOpptSumPointsQ2() {
		return opptSumPointsQ2;
	}
	public void setOpptSumPointsQ2(Integer opptSumPointsQ2) {
		this.opptSumPointsQ2 = opptSumPointsQ2;
	}
	
	private Integer opptSumPointsQ3;
	public Integer getOpptSumPointsQ3() {
		return opptSumPointsQ3;
	}
	public void setOpptSumPointsQ3(Integer opptSumPointsQ3) {
		this.opptSumPointsQ3 = opptSumPointsQ3;
	}
	
	private Integer opptSumPointsQ4;
	public Integer getOpptSumPointsQ4() {
		return opptSumPointsQ4;
	}
	public void setOpptSumPointsQ4(Integer opptSumPointsQ4) {
		this.opptSumPointsQ4 = opptSumPointsQ4;
	}

	public Float getTeamAvgPoints() {
		return (float)teamSumPoints/teamGamesPlayed;
	}
	public Float getTeamAvgAssists() {
		return (float)teamSumAssists/teamGamesPlayed;
	}
	public Float getTeamAvgTurnovers() {
		return (float)teamSumTurnovers/teamGamesPlayed;
	}	
	public Float getTeamAvgSteals() {
		return (float)teamSumSteals/teamGamesPlayed;
	}	
	public Float getTeamAvgBlocks() {
		return (float)teamSumBlocks/teamGamesPlayed;
	}	
	public Float getTeamAvgPersonalFouls() {
		return (float)teamSumPersonalFouls/teamGamesPlayed;
	}
	
	public Float getTeamAvgFieldGoalAttempts() {
		return (float)teamSumFieldGoalAttempts/teamGamesPlayed;
	}	
	public Float getTeamAvgFieldGoalMade() {
		return (float)teamSumFieldGoalMade/teamGamesPlayed;
	}	  
	public Float getTeamAvgFieldGoalPct() {
		return (float)teamSumFieldGoalMade/teamSumFieldGoalAttempts;
	} 

	public Float getTeamAvgThreePointAttempts() {
		return (float)teamSumThreePointAttempts/teamGamesPlayed;
	}
	public Float getTeamAvgThreePointMade() {
		return (float)teamSumThreePointMade/teamGamesPlayed;
	}	
	public Float getTeamAvgThreePointPct() {
		return (float)teamSumThreePointMade/teamSumThreePointAttempts;
	} 
	
	public Float getTeamAvgFreeThrowAttempts() {
		return (float)teamSumFreeThrowAttempts/teamGamesPlayed;
	}
	public Float getTeamAvgFreeThrowMade() {
		return (float)teamSumFreeThrowMade/teamGamesPlayed;
	}	
	public Float getTeamAvgFreeThrowPct() {
		return (float)teamSumFreeThrowMade/teamSumFreeThrowAttempts;
	} 
	
	public Float getTeamAvgReboundsOffense() {
		return (float)teamSumReboundsOffense/teamGamesPlayed;
	}	
	public Float getTeamAvgReboundsDefense() {
		return (float)teamSumReboundsDefense/teamGamesPlayed;
	}
	public Float getTeamAvgReboundsTotal() {
		return (float)(teamSumReboundsDefense + teamSumReboundsOffense)/teamGamesPlayed;
	}
	
	public Float getTeamAvgPointsQ1() {
		return (float)teamSumPointsQ1/teamGamesPlayed;
	}	
	public Float getTeamAvgPointsQ2() {
		return (float)teamSumPointsQ2/teamGamesPlayed;
	}	
	public Float getTeamAvgPointsQ3() {
		return (float)teamSumPointsQ3/teamGamesPlayed;
	}	
	public Float getTeamAvgPointsQ4() {
		return (float)teamSumPointsQ4/teamGamesPlayed;
	}	

	public Float getOpptAvgPoints() {
		return (float)opptSumPoints/teamGamesPlayed;
	}	
	public Float getOpptAvgAssists() {
		return (float)opptSumAssists/teamGamesPlayed;
	}
	public Float getOpptAvgTurnovers() {
		return (float)opptSumTurnovers/teamGamesPlayed;
	}	
	public Float getOpptAvgSteals() {
		return (float)opptSumSteals/teamGamesPlayed;
	}	
	public Float getOpptAvgBlocks() {
		return (float)opptSumBlocks/teamGamesPlayed;
	}	
	public Float getOpptAvgPersonalFouls() {
		return (float)opptSumPersonalFouls/teamGamesPlayed;
	}
	
	public Float getOpptAvgFieldGoalAttempts() {
		return (float)opptSumFieldGoalAttempts/teamGamesPlayed;
	}	
	public Float getOpptAvgFieldGoalMade() {
		return (float)opptSumFieldGoalMade/teamGamesPlayed;
	}
	public Float getOpptAvgFieldGoalPct() {
		return (float)opptSumFieldGoalMade/opptSumFieldGoalAttempts;
	} 
	
	public Float getOpptAvgThreePointAttempts() {
		return (float)opptSumThreePointAttempts/teamGamesPlayed;
	}
	public Float getOpptAvgThreePointMade() {
		return (float)opptSumThreePointMade/teamGamesPlayed;
	}
	public Float getOpptAvgThreePointPct() {
		return (float)opptSumThreePointMade/opptSumThreePointAttempts;
	} 
	
	public Float getOpptAvgFreeThrowAttempts() {
		return (float)opptSumFreeThrowAttempts/teamGamesPlayed;
	}
	public Float getOpptAvgFreeThrowMade() {
		return (float)opptSumFreeThrowMade/teamGamesPlayed;
	}
	public Float getOpptAvgFreeThrowPct() {
		return (float)opptSumFreeThrowMade/opptSumFreeThrowAttempts;
	} 
	
	public Float getOpptAvgReboundsOffense() {
		return (float)opptSumReboundsOffense/teamGamesPlayed;
	}	
	public Float getOpptAvgReboundsDefense() {
		return (float)opptSumReboundsDefense/teamGamesPlayed;
	}
	public Float getOpptAvgReboundsTotal() {
		return (float)(opptSumReboundsDefense + opptSumReboundsOffense)/teamGamesPlayed;
	}

	public Float getOpptAvgPointsQ1() {
		return (float)opptSumPointsQ1/teamGamesPlayed;
	}	
	public Float getOpptAvgPointsQ2() {
		return (float)opptSumPointsQ2/teamGamesPlayed;
	}	
	public Float getOpptAvgPointsQ3() {
		return (float)opptSumPointsQ3/teamGamesPlayed;
	}	
	public Float getOpptAvgPointsQ4() {
		return (float)opptSumPointsQ4/teamGamesPlayed;
	}
	
	public String toStringHeader() {
		return "Team  GP   FGM    FGA    FG%   3PM    3PA    3P%    FTM    FTA   FT%   TOV   PF   OREB   DREB    REB    AST   STL   BLK    PTS";
	}
	
	public String toString_TeamTotals() {
		return new StringBuffer()
			.append(Utilities.padRight("", 4))
			.append("  " + this.teamGamesPlayed)
			.append("  " + Utilities.padLeft(this.getTeamSumFieldGoalMade().toString(), 4))
			.append("   " + Utilities.padLeft(this.getTeamSumFieldGoalAttempts().toString(), 4))
			.append("   " + Utilities.roundtoBigDecimal(this.getTeamAvgFieldGoalPct(), 3))
			.append("  " + this.getTeamSumThreePointMade())
			.append("   " + this.getTeamSumThreePointAttempts())
			.append("   " + Utilities.roundtoBigDecimal(this.getTeamAvgThreePointPct(),3))
			.append("  " + this.getTeamSumFreeThrowMade())
			.append("   " + this.getTeamSumFreeThrowAttempts())
			.append("   " + Utilities.roundtoBigDecimal(this.getTeamAvgFreeThrowPct(),3))
			.append("  " + this.getTeamSumTurnovers())
			.append("   " + this.getTeamSumPersonalFouls())
			.append("  " + Utilities.padLeft(this.getTeamSumReboundsOffense().toString(), 4))
			.append("   " + this.getTeamSumReboundsDefense())
			.append("   " + this.getTeamSumReboundsTotal())
			.append("   " + this.getTeamSumAssists())
			.append("   " + this.getTeamSumSteals())
			.append("   " + this.getTeamSumBlocks())
			.append("   " + this.getTeamSumPoints())
			.toString();
	}
	
	public String toString_OpptTotals() {
		return new StringBuffer()
			.append(Utilities.padRight("", 4))
			.append("  " + this.teamGamesPlayed)
			.append("  " + Utilities.padLeft(this.getOpptSumFieldGoalMade().toString(), 4))
			.append("   " + Utilities.padLeft(this.getOpptSumFieldGoalAttempts().toString(), 4))
			.append("   " + Utilities.roundtoBigDecimal(this.getOpptAvgFieldGoalPct(), 3))
			.append("  " + this.getOpptSumThreePointMade())
			.append("   " + this.getOpptSumThreePointAttempts())
			.append("   " + Utilities.roundtoBigDecimal(this.getOpptAvgThreePointPct(),3))
			.append("  " + this.getOpptSumFreeThrowMade())
			.append("   " + this.getOpptSumFreeThrowAttempts())
			.append("   " + Utilities.roundtoBigDecimal(this.getOpptAvgFreeThrowPct(),3))
			.append("  " + this.getOpptSumTurnovers())
			.append("   " + this.getOpptSumPersonalFouls())
			.append("  " + Utilities.padLeft(this.getOpptSumReboundsOffense().toString(), 4))
			.append("   " + this.getOpptSumReboundsDefense())
			.append("   " + this.getOpptSumReboundsTotal())
			.append("   " + this.getOpptSumAssists())
			.append("   " + this.getOpptSumSteals())
			.append("   " + this.getOpptSumBlocks())
			.append("   " + this.getOpptSumPoints())
			.toString();
	}
	
	public String toString_TeamAverages() {
		return new StringBuffer()
			.append(Utilities.padRight("", 4))
			.append("  " + this.teamGamesPlayed)
			.append("  " + Utilities.roundtoBigDecimal(this.getTeamAvgFieldGoalMade(), 2))
			.append("  " + Utilities.roundtoBigDecimal(this.getTeamAvgFieldGoalAttempts(), 2))
			.append("  " + Utilities.roundtoBigDecimal(this.getTeamAvgFieldGoalPct(), 3))
			.append("  " + Utilities.roundtoBigDecimal(this.getTeamAvgThreePointMade(), 2))
			.append("  " + Utilities.roundtoBigDecimal(this.getTeamAvgThreePointAttempts(), 2))
			.append("  " + Utilities.roundtoBigDecimal(this.getTeamAvgThreePointPct(),3))
			.append("  " + Utilities.roundtoBigDecimal(this.getTeamAvgFreeThrowMade(), 2))
			.append("  " + this.getTeamAvgTurnovers())
			.append("  " + Utilities.roundtoBigDecimal(this.getTeamAvgFreeThrowAttempts(), 2))
			.append("  " + Utilities.roundtoBigDecimal(this.getTeamAvgPersonalFouls(),2))
			.append("  " + Utilities.roundtoBigDecimal(this.getTeamAvgFreeThrowPct(),3))
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
			.append(Utilities.padRight("", 4))
			.append("  " + this.teamGamesPlayed)
			.append("  " + Utilities.roundtoBigDecimal(this.getOpptAvgFieldGoalMade(), 2))
			.append("  " + Utilities.roundtoBigDecimal(this.getOpptAvgFieldGoalAttempts(), 2))
			.append("  " + Utilities.roundtoBigDecimal(this.getOpptAvgFieldGoalPct(), 3))
			.append("  " + Utilities.roundtoBigDecimal(this.getOpptAvgThreePointMade(), 2))
			.append("  " + Utilities.roundtoBigDecimal(this.getOpptAvgThreePointAttempts(), 2))
			.append("  " + Utilities.roundtoBigDecimal(this.getOpptAvgThreePointPct(),3))
			.append("  " + Utilities.roundtoBigDecimal(this.getOpptAvgFreeThrowMade(), 2))
			.append("  " + Utilities.roundtoBigDecimal(this.getOpptAvgFreeThrowAttempts(), 2))
			.append("  " + this.getOpptAvgTurnovers())
			.append("  " + Utilities.roundtoBigDecimal(this.getOpptAvgPersonalFouls(),2))
			.append("  " + Utilities.roundtoBigDecimal(this.getOpptAvgFreeThrowPct(),3))
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