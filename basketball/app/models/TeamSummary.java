package models;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
	private Integer teamSumOpptWins;
	private Integer teamSumOpptGamesPlayed;
	private Integer teamMaxOpptOpptWins;
	private Integer teamMaxOpptOpptGamesPlayed;
	
	private TeamAbbr opptAbbr;
	private Integer opptGamesPlayed;
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
	private Integer opptSumOpptWins;
	private Integer opptSumOpptGamesPlayed;
	private Integer opptMaxOpptOpptWins;
	private Integer opptMaxOpptOpptGamesPlayed;

	// Basic Stats
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
	public Integer getTeamSumWins() { return opptSumOpptWins; }
	public Integer getTeamSumGamesPlayed() { return opptSumOpptGamesPlayed; }
	public Integer getTeamSumOpptWins() { return teamSumOpptWins; }
	public Integer getTeamSumOpptGamesPlayed() { return teamSumOpptGamesPlayed; }
	public Integer getTeamMaxOpptOpptWins() { return teamMaxOpptOpptWins; }
	public Integer getTeamMaxOpptOpptGamesPlayed() { return teamMaxOpptOpptGamesPlayed; }
	public Integer getTeamSumPointsQ1() { return teamSumPointsQ1; }
	public Integer getTeamSumPointsQ2() { return teamSumPointsQ2; }
	public Integer getTeamSumPointsQ3() { return teamSumPointsQ3; }
	public Integer getTeamSumPointsQ4() { return teamSumPointsQ4; }
	public TeamAbbr getOpptAbbr() { return opptAbbr; }
	public Integer getOpptGamesPlayed() { return opptGamesPlayed; }
	
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
	public Integer getOpptSumWins() { return teamSumOpptWins; }
	public Integer getOpptSumGamesPlayed() { return teamSumOpptGamesPlayed; }
	public Integer getOpptSumOpptWins() { return opptSumOpptWins; }
	public Integer getOpptSumOpptGamesPlayed() { return opptSumOpptGamesPlayed; }
	public Integer getOpptMaxOpptOpptWins() { return opptMaxOpptOpptWins; }
	public Integer getOpptMaxOpptOpptGamesPlayed() { return opptMaxOpptOpptGamesPlayed; }
	
	public BigDecimal getTeamAvgPoints(int scale) { return Utilities.getAverage(teamSumPoints, teamGamesPlayed, scale); }
	public BigDecimal getTeamAvgAssists(int scale) { return Utilities.getAverage(teamSumAssists, teamGamesPlayed, scale); }
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

	public BigDecimal getOpptAvgPoints(int scale) { return Utilities.getAverage(opptSumPoints, teamGamesPlayed, scale); }	
	public BigDecimal getOpptAvgAssists(int scale) { return Utilities.getAverage(opptSumAssists, teamGamesPlayed, scale); }
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

	// Advanced Stats Offense
	public BigDecimal getTeamOpptPointDiff(int scale) {
		return Utilities.getPercentDifference(getTeamAvgPoints(2), getOpptAvgPoints(2), scale);
	}
	
	public BigDecimal getTeamOpptFieldGoalPctDiff(int scale) {
		return Utilities.getPercentDifference(getTeamAvgFieldGoalPct(), getOpptAvgFieldGoalPct(), scale);
	}
	
	public BigDecimal getTeamOpptThreePointPctDiff(int scale) {
		return Utilities.getPercentDifference(getTeamAvgThreePointPct(), getOpptAvgThreePointPct(), scale);
	}
	
	public BigDecimal getTeamAvgThreePointRate() {
		return getTeamAvgThreePointAttempts().divide(getTeamAvgFieldGoalAttempts(), 3, RoundingMode.HALF_UP);
	}
	
	public BigDecimal getOpptAvgThreePointRate() {
		return getOpptAvgThreePointAttempts().divide(getOpptAvgFieldGoalAttempts(), 3, RoundingMode.HALF_UP);
	}
	
	public BigDecimal getTeamOpptThreePointRateDiff(int scale) {
		return Utilities.getPercentDifference(getTeamAvgThreePointRate(), getOpptAvgThreePointRate(), scale);
	}
	
	public BigDecimal getTeamOpptFreeThrowPctDiff(int scale) {
		return Utilities.getPercentDifference(getTeamAvgFreeThrowPct(), getOpptAvgFreeThrowPct(), scale);
	}
	
	public BigDecimal getTeamAvgFreeThrowRate() {
		return getTeamAvgFreeThrowAttempts().divide(getTeamAvgFieldGoalAttempts(), 3, RoundingMode.HALF_UP);
	}
	
	public BigDecimal getOpptAvgFreeThrowRate() {
		return getOpptAvgFreeThrowAttempts().divide(getOpptAvgFieldGoalAttempts(), 3, RoundingMode.HALF_UP);
	}
	
	public BigDecimal getTeamOpptFreeThrowRateDiff(int scale) {
		return Utilities.getPercentDifference(getTeamAvgFreeThrowRate(), getOpptAvgFreeThrowRate(), scale);
	}
	
	public BigDecimal getTeamPlayPercent() {
		BigDecimal bd =  new BigDecimal(getTeamSumFieldGoalAttempts())
			.subtract(new BigDecimal(getTeamSumReboundsOffense()))
			.add(new BigDecimal(getTeamSumTurnovers()));
		return new BigDecimal(getTeamSumFieldGoalMade()).divide(bd, 3, RoundingMode.HALF_UP);
	}
	
	public BigDecimal getOpptPlayPercent() {
		BigDecimal bd =  new BigDecimal(getOpptSumFieldGoalAttempts())
			.subtract(new BigDecimal(getOpptSumReboundsOffense()))
			.add(new BigDecimal(getOpptSumTurnovers()));
		return new BigDecimal(getOpptSumFieldGoalMade()).divide(bd, 3, RoundingMode.HALF_UP);
	}
	
	public BigDecimal getTeamOpptPlayPercentDiff(int scale) {
		return Utilities.getPercentDifference(getTeamPlayPercent(), getOpptPlayPercent(), scale);
	}
	
	public BigDecimal getTeamEffectiveFieldGoalPercentage() {
		BigDecimal bd =  new BigDecimal(getTeamSumFieldGoalMade())
			.add(new BigDecimal(getTeamSumThreePointMade() * 0.5));
		return bd
			.divide(new BigDecimal(getTeamSumFieldGoalAttempts()), 3, RoundingMode.HALF_UP);
	}
	
	public BigDecimal getOpptEffectiveFieldGoalPercentage() {
		BigDecimal bd =  new BigDecimal(getOpptSumFieldGoalMade())
			.add(new BigDecimal(getOpptSumThreePointMade() * 0.5));
		return bd
			.divide(new BigDecimal(getOpptSumFieldGoalAttempts()), 3, RoundingMode.HALF_UP);
	}
	
	public BigDecimal getTeamOpptEffectiveFieldGoalPercentageDiff(int scale) {
		return Utilities.getPercentDifference(getTeamEffectiveFieldGoalPercentage(), getOpptEffectiveFieldGoalPercentage(), scale);
	}

	public BigDecimal getTeamTrueShootingPercentage() {
		BigDecimal bd =  new BigDecimal(getTeamSumFieldGoalAttempts())
			.add(new BigDecimal(getTeamSumFreeThrowAttempts() * 0.44))
			.multiply(new BigDecimal(2));
		return new BigDecimal(getTeamSumPoints())
			.divide(bd, 3, RoundingMode.HALF_UP);
	}
	
	public BigDecimal getOpptTrueShootingPercentage() {
		BigDecimal bd =  new BigDecimal(getOpptSumFieldGoalAttempts())
			.add(new BigDecimal(getOpptSumFreeThrowAttempts() * 0.44))
			.multiply(new BigDecimal(2));
		return new BigDecimal(getOpptSumPoints())
			.divide(bd, 3, RoundingMode.HALF_UP);
	}
	
	public BigDecimal getTeamOpptTrueShootingPercentageDiff(int scale) {
		return Utilities.getPercentDifference(getTeamTrueShootingPercentage(), getOpptTrueShootingPercentage(), scale);
	}
	
	public BigDecimal getTeamPointsPerShot() {
		BigDecimal bd =  new BigDecimal(getTeamSumFieldGoalAttempts())
			.add(new BigDecimal(getTeamSumThreePointAttempts()))
			.add(new BigDecimal(getTeamSumFreeThrowAttempts()));
		return bd.divide(new BigDecimal(getTeamSumPoints()), 3, RoundingMode.HALF_UP);
	}
	
	public BigDecimal getOpptPointsPerShot() {
		BigDecimal bd =  new BigDecimal(getOpptSumFieldGoalAttempts())
			.add(new BigDecimal(getOpptSumThreePointAttempts()))
			.add(new BigDecimal(getOpptSumFreeThrowAttempts()));
		return bd.divide(new BigDecimal(getOpptSumPoints()), 3, RoundingMode.HALF_UP);
	}
	
	public BigDecimal getTeamOpptPointsPerShotDiff(int scale) {
		return Utilities.getPercentDifference(getTeamPointsPerShot(), getOpptPointsPerShot(), scale);
	}
	
	public BigDecimal getTeamOpptAssistDiff(int scale) {
		return Utilities.getPercentDifference(getTeamAvgAssists(2), getOpptAvgAssists(2), scale);
	}
	
	public BigDecimal getTeamAssistPercentage() {
		return new BigDecimal(getTeamSumAssists())
			.divide(new BigDecimal(getTeamSumFieldGoalMade()), 4, RoundingMode.HALF_UP)
			.multiply(new BigDecimal(100))
			.setScale(2);
	}
	
	public BigDecimal getOpptAssistPercentage() {
		return new BigDecimal(getOpptSumAssists())
			.divide(new BigDecimal(getOpptSumFieldGoalMade()), 4, RoundingMode.HALF_UP)
			.multiply(new BigDecimal(100))
			.setScale(2);
	}

	public BigDecimal getTeamOpptAssistPercentageDiff(int scale) {
		return Utilities.getPercentDifference(getTeamAssistPercentage(), getOpptAssistPercentage(), scale);
	}
	
	public BigDecimal getTeamAssistRate() {
		BigDecimal bd =  (new BigDecimal(getTeamSumFreeThrowAttempts())
			.multiply(new BigDecimal(0.44)))
			.add(new BigDecimal(getTeamSumFieldGoalAttempts()))
			.add(new BigDecimal(getTeamSumTurnovers()))
			.add(new BigDecimal(getTeamSumAssists()));
		return new BigDecimal(getTeamSumAssists())
			.divide(bd, 4, RoundingMode.HALF_UP)
			.multiply(new BigDecimal(100))
			.setScale(2);
	}
	
	public BigDecimal getOpptAssistRate() {
		BigDecimal bd =  (new BigDecimal(getOpptSumFreeThrowAttempts())
			.multiply(new BigDecimal(0.44)))
			.add(new BigDecimal(getOpptSumFieldGoalAttempts()))
			.add(new BigDecimal(getOpptSumTurnovers()))
			.add(new BigDecimal(getOpptSumAssists()));
		return new BigDecimal(getOpptSumAssists())
			.divide(bd, 4, RoundingMode.HALF_UP)
			.multiply(new BigDecimal(100))
			.setScale(2);
	}
	
	public BigDecimal getTeamOpptAssistRateDiff(int scale) {
		return Utilities.getPercentDifference(getTeamAssistRate(), getOpptAssistRate(), scale);
	}
	
	public BigDecimal getTeamAssistToTurnoverRatio() {
		return new BigDecimal(getTeamSumAssists())
			.divide(new BigDecimal(getTeamSumTurnovers()), 2, RoundingMode.HALF_UP);
	}
	
	public BigDecimal getOpptAssistToTurnoverRatio() {
		return new BigDecimal(getOpptSumAssists())
			.divide(new BigDecimal(getOpptSumTurnovers()), 2, RoundingMode.HALF_UP);
	}
	
	public BigDecimal getTeamOpptAssistToTurnoverRatioDiff(int scale) {
		return Utilities.getPercentDifference(getTeamAssistToTurnoverRatio(), getOpptAssistToTurnoverRatio(), scale);
	}
	
	// Advanced Stats Defense
	public BigDecimal getTeamOffensiveReboundPercentage() {
		BigDecimal bd =  new BigDecimal(getTeamSumReboundsOffense())
			.add(new BigDecimal(getOpptSumReboundsDefense()));
		return new BigDecimal(getTeamSumReboundsOffense())
			.divide(bd, 4, RoundingMode.HALF_UP)
			.multiply(new BigDecimal(100))
			.setScale(2);
	}
	
	public BigDecimal getOpptOffensiveReboundPercentage() {
		BigDecimal bd =  new BigDecimal(getOpptSumReboundsOffense())
			.add(new BigDecimal(getTeamSumReboundsDefense()));
		return new BigDecimal(getOpptSumReboundsOffense())
			.divide(bd, 4, RoundingMode.HALF_UP)
			.multiply(new BigDecimal(100))
			.setScale(2);
	}
	
	public BigDecimal getTeamOpptOffensiveReboundPercentageDiff(int scale) {
		return Utilities.getPercentDifference(getTeamOffensiveReboundPercentage(), getOpptOffensiveReboundPercentage(), scale);
	}
	
	public BigDecimal getTeamDefensiveReboundPercentage() {
		BigDecimal bd =  new BigDecimal(getTeamSumReboundsDefense())
			.add(new BigDecimal(getOpptSumReboundsOffense()));
		return new BigDecimal(getTeamSumReboundsDefense())
			.divide(bd, 4, RoundingMode.HALF_UP)
			.multiply(new BigDecimal(100))
			.setScale(2);
	}
	
	public BigDecimal getOpptDefensiveReboundPercentage() {
		BigDecimal bd =  new BigDecimal(getOpptSumReboundsDefense())
			.add(new BigDecimal(getTeamSumReboundsOffense()));
		return new BigDecimal(getOpptSumReboundsDefense())
			.divide(bd, 4, RoundingMode.HALF_UP)
			.multiply(new BigDecimal(100))
			.setScale(2);
	}
	
	public BigDecimal getTeamOpptDefensiveReboundPercentageDiff(int scale) {
		return Utilities.getPercentDifference(getTeamDefensiveReboundPercentage(), getOpptDefensiveReboundPercentage(), scale);
	}
	
	public BigDecimal getTeamTotalReboundPercentage() {
		BigDecimal bd =  new BigDecimal(getTeamSumReboundsTotal())
			.add(new BigDecimal(getOpptSumReboundsTotal()));
		return new BigDecimal(getTeamSumReboundsTotal())
			.divide(bd, 4, RoundingMode.HALF_UP)
			.multiply(new BigDecimal(100))
			.setScale(2);
	}
	
	public BigDecimal getOpptTotalReboundPercentage() {
		BigDecimal bd =  new BigDecimal(getOpptSumReboundsTotal())
			.add(new BigDecimal(getTeamSumReboundsTotal()));
		return new BigDecimal(getOpptSumReboundsTotal())
			.divide(bd, 4, RoundingMode.HALF_UP)
			.multiply(new BigDecimal(100))
			.setScale(2);
	}
	
	public BigDecimal getTeamOpptTotalReboundPercentageDiff(int scale) {
		return Utilities.getPercentDifference(getTeamTotalReboundPercentage(), getOpptTotalReboundPercentage(), scale);
	}
	
	public BigDecimal getTeamStealPercentage() {
		return getTeamAvgSteals()
			.divide(getTeamOpptPossessions(), 4, RoundingMode.HALF_UP)
			.multiply(new BigDecimal(100))
			.setScale(2);
	}
	
	public BigDecimal getOpptStealPercentage() {
		return getOpptAvgSteals()
			.divide(getTeamOpptPossessions(), 4, RoundingMode.HALF_UP)
			.multiply(new BigDecimal(100))
			.setScale(2);
	}
	
	public BigDecimal getTeamOpptStealPercentageDiff(int scale) {
		return Utilities.getPercentDifference(getTeamStealPercentage(), getOpptStealPercentage(), scale);
	}
	
	public BigDecimal getTeamStealToTurnoverRatio() {
		return getTeamAvgSteals()
			.divide(getTeamAvgTurnovers(), 4, RoundingMode.HALF_UP)
			.multiply(new BigDecimal(100))
			.setScale(2);
	}
	
	public BigDecimal getOpptStealToTurnoverRatio() {
		return getOpptAvgSteals()
			.divide(getOpptAvgTurnovers(), 4, RoundingMode.HALF_UP)
			.multiply(new BigDecimal(100))
			.setScale(2);
	}
	
	public BigDecimal getTeamOpptStealToTurnoverRatioDiff(int scale) {
		return Utilities.getPercentDifference(getTeamStealToTurnoverRatio(), getOpptStealToTurnoverRatio(), scale);
	}
	
	public BigDecimal getTeamTurnoverPercentage() {
		BigDecimal bd =  new BigDecimal(getTeamSumFieldGoalAttempts())
			.add(new BigDecimal(getTeamSumFreeThrowAttempts() * 0.44))
			.add(new BigDecimal(getTeamSumTurnovers()));
		return new BigDecimal(getTeamSumTurnovers())
			.divide(bd, 4, RoundingMode.HALF_UP)
			.multiply(new BigDecimal(100))
			.setScale(2);
	}
	
	public BigDecimal getOpptTurnoverPercentage() {
		BigDecimal bd =  new BigDecimal(getOpptSumFieldGoalAttempts())
			.add(new BigDecimal(getOpptSumFreeThrowAttempts() * 0.44))
			.add(new BigDecimal(getOpptSumTurnovers()));
		return new BigDecimal(getOpptSumTurnovers())
			.divide(bd, 4, RoundingMode.HALF_UP)
			.multiply(new BigDecimal(100))
			.setScale(2);
	}
	
	public BigDecimal getTeamOpptTurnoverPercentageDiff(int scale) {
		return Utilities.getPercentDifference(getTeamTurnoverPercentage(), getOpptTurnoverPercentage(), scale);
	}
	
	public BigDecimal getTeamBlockPercentage() {
		return getTeamAvgBlocks()
			.divide(getTeamOpptPossessions(), 4, RoundingMode.HALF_UP)
			.multiply(new BigDecimal(100))
			.setScale(2);
	}
	
	public BigDecimal getOpptBlockPercentage() {
		return getOpptAvgBlocks()
			.divide(getTeamOpptPossessions(), 4, RoundingMode.HALF_UP)
			.multiply(new BigDecimal(100))
			.setScale(2);
	}
	
	public BigDecimal getTeamOpptBlockPercentageDiff(int scale) {
		return Utilities.getPercentDifference(getTeamBlockPercentage(), getOpptBlockPercentage(), scale);
	}

	
	public BigDecimal getTeamBlockRate() {
		BigDecimal bd =  new BigDecimal(getOpptSumFieldGoalAttempts())
			.subtract(new BigDecimal(getOpptSumThreePointAttempts()));
		return new BigDecimal(getTeamSumBlocks())
			.divide(bd, 4, RoundingMode.HALF_UP)
			.multiply(new BigDecimal(100))
			.setScale(2);
	}
	
	public BigDecimal getOpptBlockRate() {
		BigDecimal bd =  new BigDecimal(getTeamSumFieldGoalAttempts())
			.subtract(new BigDecimal(getTeamSumThreePointAttempts()));
		return new BigDecimal(getOpptSumBlocks())
			.divide(bd, 4, RoundingMode.HALF_UP)
			.multiply(new BigDecimal(100))
			.setScale(2);
	}
	
	public BigDecimal getTeamOpptBlockRateDiff(int scale) {
		return Utilities.getPercentDifference(getTeamBlockRate(), getOpptBlockRate(), scale);
	}
	
	// Advanced Stats Efficiency
	public BigDecimal getTeamOffensiveRating(int scale) {
		return getTeamAvgPoints(2)
			.divide(getTeamOpptPossessions(), 4, RoundingMode.HALF_UP)
			.multiply(new BigDecimal(100))
			.setScale(scale, RoundingMode.HALF_UP);
	}
	
	public BigDecimal getOpptOffensiveRating(int scale) {
		return getOpptAvgPoints(2)
			.divide(getTeamOpptPossessions(), 4, RoundingMode.HALF_UP)
			.multiply(new BigDecimal(100))
			.setScale(scale, RoundingMode.HALF_UP);
	}
	
	public BigDecimal getTeamOpptOffensiveRatingDiff(int scale) {
		return Utilities.getPercentDifference(getTeamOffensiveRating(scale), getOpptOffensiveRating(scale), scale);
	}
	
	public BigDecimal getTeamDefensiveRating(int scale) {
		return getOpptAvgPoints(2)
			.divide(getTeamOpptPossessions(), 4, RoundingMode.HALF_UP)
			.multiply(new BigDecimal(100))
			.setScale(scale, RoundingMode.HALF_UP);
	}
	
	public BigDecimal getOpptDefensiveRating(int scale) {
		return getTeamAvgPoints(2)
			.divide(getTeamOpptPossessions(), 4, RoundingMode.HALF_UP)
			.multiply(new BigDecimal(100))
			.setScale(scale, RoundingMode.HALF_UP);
	}
	
	public BigDecimal getTeamOpptDefensiveRatingDiff(int scale) {
		return Utilities.getPercentDifference(getTeamDefensiveRating(scale), getOpptDefensiveRating(scale), scale);
	}
	
	public BigDecimal getTeamOffensiveDefensiveRatingDiff(int scale) {
		return Utilities.getPercentDifference(getTeamOffensiveRating(2), getTeamDefensiveRating(2), scale);
	}
	
	public BigDecimal getTeamEfficiencyDifferential(int scale) {
		return getTeamOffensiveRating(2)
			.subtract(getTeamDefensiveRating(2))
			.setScale(scale, RoundingMode.HALF_UP);
	}
	
	public BigDecimal getTeamFloorImpactCounter(int scale) {
		BigDecimal bd =  new BigDecimal(getTeamSumPoints())
			.add(new BigDecimal(getTeamSumReboundsOffense()))
			.add(new BigDecimal(getTeamSumReboundsOffense() * 0.75))
			.add(new BigDecimal(getTeamSumAssists()))
			.add(new BigDecimal(getTeamSumSteals()))
			.subtract(new BigDecimal(getTeamSumFieldGoalAttempts() * 0.75))
			.subtract(new BigDecimal(getTeamSumFreeThrowAttempts() * 0.375))
			.subtract(new BigDecimal(getTeamSumTurnovers()))
			.subtract(new BigDecimal(getTeamSumPersonalFouls() * 0.5));
		return bd.divide(new BigDecimal(getTeamGamesPlayed()), scale, RoundingMode.HALF_UP);
	}
	
	public BigDecimal getOpptFloorImpactCounter(int scale) {
		BigDecimal bd =  new BigDecimal(getOpptSumPoints())
			.add(new BigDecimal(getOpptSumReboundsOffense()))
			.add(new BigDecimal(getOpptSumReboundsOffense() * 0.75))
			.add(new BigDecimal(getOpptSumAssists()))
			.add(new BigDecimal(getOpptSumSteals()))
			.subtract(new BigDecimal(getOpptSumFieldGoalAttempts() * 0.75))
			.subtract(new BigDecimal(getOpptSumFreeThrowAttempts() * 0.375))
			.subtract(new BigDecimal(getOpptSumTurnovers()))
			.subtract(new BigDecimal(getOpptSumPersonalFouls() * 0.5));
		return bd.divide(new BigDecimal(getOpptGamesPlayed()), scale, RoundingMode.HALF_UP);
	}
	
	public BigDecimal getTeamOpptFloorImpactCounterDiff(int scale) {
		return Utilities.getPercentDifference(getTeamFloorImpactCounter(scale), getOpptFloorImpactCounter(scale), scale);
	}
	
	public BigDecimal getTeamPythagoreanWinningPercentage13_91(int scale) {
		Double teamPoints = java.lang.Math.pow(new Double(getTeamAvgPoints(2).doubleValue()), new Double(13.91));
		Double opptPoints = java.lang.Math.pow(new Double(getOpptAvgPoints(2).doubleValue()), new Double(13.91));
		return new BigDecimal(teamPoints)
			.divide(new BigDecimal(teamPoints + opptPoints), 4, RoundingMode.HALF_UP)
			.setScale(scale, RoundingMode.HALF_UP);
	}
	
	public BigDecimal getTeamPythagoreanWins13_91(int scale) {
		return getTeamPythagoreanWinningPercentage13_91(2)
			.multiply(new BigDecimal(getTeamGamesPlayed()))
			.setScale(scale, RoundingMode.HALF_UP);
	}
	
	public BigDecimal getTeamPythagoreanLosses13_91(int scale) {
		return new BigDecimal(getTeamGamesPlayed())
			.subtract(getTeamPythagoreanWins13_91(2))
			.setScale(scale, RoundingMode.HALF_UP);
	}
	
	public BigDecimal getTeamPythagoreanWinningPercentage16_5(int scale) {
		Double teamPoints = java.lang.Math.pow(new Double(getTeamSumPoints()), new Double(16.5));
		Double opptPoints = java.lang.Math.pow(new Double(getOpptSumPoints()), new Double(16.5));
		return new BigDecimal(teamPoints)
			.divide(new BigDecimal(teamPoints + opptPoints), 4, RoundingMode.HALF_UP)
			.setScale(scale, RoundingMode.HALF_UP);
	}
	
	public BigDecimal getTeamPythagoreanWins16_5(int scale) {
		return getTeamPythagoreanWinningPercentage16_5(2)
			.multiply(new BigDecimal(getTeamGamesPlayed()))
			.setScale(scale, RoundingMode.HALF_UP);
	}
	
	public BigDecimal getTeamPythagoreanLosses16_5(int scale) {
		return new BigDecimal(getTeamGamesPlayed())
			.subtract(getTeamPythagoreanWins16_5(2))
			.setScale(scale, RoundingMode.HALF_UP);
	}
	
	public BigDecimal getTeamMarginOfVictory(int scale) {
		return getTeamAvgPoints(3)
			.subtract(getOpptAvgPoints(3))
			.setScale(scale, RoundingMode.HALF_UP);
	}
	
	public BigDecimal getTeamStrengthOfSchedule(int scale) {
		BigDecimal opptOpptWinPercent = new BigDecimal(getOpptSumOpptWins())
			.divide(new BigDecimal(getOpptSumOpptGamesPlayed()), 4, RoundingMode.HALF_UP)
			.multiply(new BigDecimal(2));
		BigDecimal opptOpptOpptWinPercent = new BigDecimal(getOpptMaxOpptOpptWins())
			.divide(new BigDecimal(getOpptMaxOpptOpptGamesPlayed()), 4, RoundingMode.HALF_UP);
		return opptOpptWinPercent
			.add(opptOpptOpptWinPercent)
			.divide(new BigDecimal(3), 4, RoundingMode.HALF_UP)
			.setScale(scale, RoundingMode.HALF_UP);
	}
	
	public BigDecimal getOpptStrengthOfSchedule(int scale) {
		BigDecimal teamOpptWinPercent = new BigDecimal(getTeamSumOpptWins())
			.divide(new BigDecimal(getTeamSumOpptGamesPlayed()), 4, RoundingMode.HALF_UP)
			.multiply(new BigDecimal(2));
		BigDecimal teamOpptOpptWinPercent = new BigDecimal(getTeamMaxOpptOpptWins())
			.divide(new BigDecimal(getTeamMaxOpptOpptGamesPlayed()), 4, RoundingMode.HALF_UP);
		return teamOpptWinPercent
			.add(teamOpptOpptWinPercent)
			.divide(new BigDecimal(3), 4, RoundingMode.HALF_UP)
			.setScale(scale, RoundingMode.HALF_UP);
	}
	
	public BigDecimal getTeamOpptStrengthOfScheduleDiff(int scale) {
		return Utilities.getPercentDifference(getTeamStrengthOfSchedule(scale), getOpptStrengthOfSchedule(scale), scale);
	}
	
	public BigDecimal getTeamRelativePercentageIndex(int scale) {
		BigDecimal teamWinPercent = new BigDecimal(getTeamSumWins())
			.divide(new BigDecimal(getTeamSumGamesPlayed()), 4, RoundingMode.HALF_UP)
			.multiply(new BigDecimal(.25));
		BigDecimal opptWinPercent = new BigDecimal(getOpptSumOpptWins())
			.divide(new BigDecimal(getOpptSumOpptGamesPlayed()), 4, RoundingMode.HALF_UP)
			.multiply(new BigDecimal(.5));
		BigDecimal opptOpptWinPercent = new BigDecimal(getOpptMaxOpptOpptWins())
			.divide(new BigDecimal(getOpptMaxOpptOpptGamesPlayed()), 4, RoundingMode.HALF_UP)
			.multiply(new BigDecimal(.25));
		return teamWinPercent
			.add(opptWinPercent)
			.add(opptOpptWinPercent)
			.divide(new BigDecimal(3), 4, RoundingMode.HALF_UP)
			.setScale(scale, RoundingMode.HALF_UP);
	}
	
	public BigDecimal getOpptRelativePercentageIndex(int scale) {
		BigDecimal teamWinPercent = new BigDecimal(getOpptSumWins())
			.divide(new BigDecimal(getOpptSumGamesPlayed()), 4, RoundingMode.HALF_UP)
			.multiply(new BigDecimal(.25));
		BigDecimal opptWinPercent = new BigDecimal(getTeamSumWins())
			.divide(new BigDecimal(getTeamSumGamesPlayed()), 4, RoundingMode.HALF_UP)
			.multiply(new BigDecimal(.5));
		BigDecimal opptOpptWinPercent = new BigDecimal(getTeamMaxOpptOpptWins())
			.divide(new BigDecimal(getTeamMaxOpptOpptGamesPlayed()), 4, RoundingMode.HALF_UP)
			.multiply(new BigDecimal(.25));
		return teamWinPercent
			.add(opptWinPercent)
			.add(opptOpptWinPercent)
			.divide(new BigDecimal(3), 4, RoundingMode.HALF_UP)
			.setScale(scale, RoundingMode.HALF_UP);
	}
	
	public BigDecimal getTeamOpptRelativePercentageIndexDiff(int scale) {
		return Utilities.getPercentDifference(getTeamRelativePercentageIndex(scale), getOpptRelativePercentageIndex(scale), scale);
	}
	
	// Pace
//	public BigDecimal getTeamPace() {
//		return getTeamPossessions()
//				.divide(new BigDecimal(teamMinutes * 240), 2, RoundingMode.HALF_UP);
//	}
	
	public BigDecimal getTeamOpptPossessions() {
		BigDecimal teamPossessions = new BigDecimal(teamSumFieldGoalAttempts)
			.subtract(Utilities.getAverage(teamSumReboundsOffense, teamSumReboundsOffense + opptSumReboundsDefense, 4)
			.multiply(new BigDecimal((teamSumFieldGoalAttempts - teamSumFieldGoalMade) * 1.07)))
			.add(new BigDecimal(teamSumTurnovers))
			.add(new BigDecimal(teamSumFreeThrowAttempts * (0.4)))
			.divide(new BigDecimal(teamGamesPlayed), 2, RoundingMode.HALF_UP);

		BigDecimal opptPossessions = new BigDecimal(opptSumFieldGoalAttempts)
			.subtract(Utilities.getAverage(opptSumReboundsOffense, opptSumReboundsOffense + teamSumReboundsDefense, 4)
			.multiply(new BigDecimal((opptSumFieldGoalAttempts - opptSumFieldGoalMade) * 1.07)))
			.add(new BigDecimal(opptSumTurnovers))
			.add(new BigDecimal(opptSumFreeThrowAttempts * (0.4)))
			.divide(new BigDecimal(teamGamesPlayed), 2, RoundingMode.HALF_UP);

		return teamPossessions.add(opptPossessions).divide(new BigDecimal(2)).setScale(2, RoundingMode.HALF_UP);
	}
	
	public String toStringHeader_Basic() {
		return "Team  GP    FGM    FGA    FG%    3PM    3PA    3P%     FTM    FTA    FT%     TOV    PF    OREB   DREB    REB    AST   STL   BLK    PTS";
	}
	
	public String toStringFooter_Basic() {
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
	
	public String toString_TeamTotals_Basic() {
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
	
	public String toString_OpptTotals_Basic() {
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
	
	public String toString_TeamAverages_Basic() {
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
			.append("  " +	this.getTeamAvgAssists(2))
			.append("  " +	this.getTeamAvgSteals())
			.append("  " +	this.getTeamAvgBlocks())
			.append("  " +	Utilities.padLeft(this.getTeamAvgPoints(2).toPlainString(), 6))
			.toString();
	}
	
	public String toString_OpptAverages_Basic() {
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
			.append("  " +	this.getOpptAvgAssists(2))
			.append("  " +	this.getOpptAvgSteals())
			.append("  " +	this.getOpptAvgBlocks())
			.append("  " +	Utilities.padLeft(this.getOpptAvgPoints(2).toPlainString(), 6))
			.toString();
	}
	
	public String toStringHeader_Advanced_Offense1() {
		return new StringBuffer()
			.append("     |                                                                             Shooting Ratios                                                                           |" + "\r")
			.append("     |        PTS         |        FG%         |        3P%         |        3PR         |        FT%         |        FTR         |       Play%        |        TS%         |" + "\r")
			.append("Team | Own    Opp     Δ%  | Own    Opp     Δ%  | Own    Opp     Δ%  | Own    Opp     Δ%  | Own    Opp     Δ%  | Own    Opp     Δ%  | Own    Opp     Δ%  | Own    Opp     Δ%  |")
			.toString();
	}
	
	public String toString_Advanced_Offense1() {
		return new StringBuffer()
			.append(this.getTeamAbbr() != null ? Utilities.padRight(this.teamAbbr.toString(), 4): Utilities.padRight("", 4))
			.append(" " + Utilities.padLeft(getTeamAvgPoints(1).toPlainString(), 6))
			.append(" " + Utilities.padLeft(getOpptAvgPoints(1).toPlainString(), 6))
			.append(" " + Utilities.padLeft(getTeamOpptPointDiff(2).toPlainString(), 6))			
			.append(" " + Utilities.padLeft(getTeamAvgFieldGoalPct().toPlainString(), 6))
			.append(" " + Utilities.padLeft(getOpptAvgFieldGoalPct().toPlainString(), 6))
			.append(" " + Utilities.padLeft(getTeamOpptFieldGoalPctDiff(2).toPlainString(), 6))
			.append(" " + Utilities.padLeft(getTeamAvgThreePointPct().toPlainString(), 6))
			.append(" " + Utilities.padLeft(getOpptAvgThreePointPct().toPlainString(), 6))
			.append(" " + Utilities.padLeft(getTeamOpptThreePointPctDiff(2).toPlainString(), 6))
			.append(" " + Utilities.padLeft(getTeamAvgThreePointRate().toPlainString(), 6))
			.append(" " + Utilities.padLeft(getOpptAvgThreePointRate().toPlainString(), 6))
			.append(" " + Utilities.padLeft(getTeamOpptThreePointRateDiff(2).toPlainString(), 6))
			.append(" " + Utilities.padLeft(getTeamAvgFreeThrowPct().toPlainString(), 6))
			.append(" " + Utilities.padLeft(getOpptAvgFreeThrowPct().toPlainString(), 6))
			.append(" " + Utilities.padLeft(getTeamOpptFreeThrowPctDiff(2).toPlainString(), 6))
			.append(" " + Utilities.padLeft(getTeamAvgFreeThrowRate().toPlainString(), 6))
			.append(" " + Utilities.padLeft(getOpptAvgFreeThrowRate().toPlainString(), 6))
			.append(" " + Utilities.padLeft(getTeamOpptFreeThrowRateDiff(2).toPlainString(), 6))
			.append(" " + Utilities.padLeft(getTeamPlayPercent().toString(), 6))
			.append(" " + Utilities.padLeft(getOpptPlayPercent().toString(), 6))
			.append(" " + Utilities.padLeft(getTeamOpptPlayPercentDiff(2).toString(), 6))
			.append(" " + Utilities.padLeft(getTeamTrueShootingPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(getOpptTrueShootingPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(getTeamOpptTrueShootingPercentageDiff(2).toString(), 6))
			.toString();
	}
	
	public String toStringFooter_Advanced_Offense1() {
		return new StringBuffer()
			.append("\r" + "Stats Legend")
			.append("\r  " + Utilities.padRight("PTS: Average Points Per Game", 40) + "Σ(PTS) / GP")
			.append("\r  " + Utilities.padRight("FG%: Field Goal Percentage", 40) + "FGM / FGA")
			.append("\r  " + Utilities.padRight("3P%: Three Point Percentage", 40) + "3PM / 3PA")
			.append("\r  " + Utilities.padRight("3PR: Three Point Rate", 40) + "3PA / FGA")
			.append("\r  " + Utilities.padRight("FT%: Free Throw Percentage", 40) + "FTM / FTA")
			.append("\r  " + Utilities.padRight("FTR: Free Throw Rate", 40) + "FTA / FGA")
			.append("\r  " + Utilities.padRight("Play%: Play Percentage", 40) + "FGM / (FGA - OREB + TO)")
			.append("\r  " + Utilities.padRight("TS%: True Shooting Percentage", 40) + "PTS / (2 * (FGA + FTA * 0.44))")
			.toString();
	}
	
	public String toStringHeader_Advanced_Offense2() {
		return new StringBuffer()
			.append("     |             Shooting Ratios             |                                  Passing Ratios                                   |" + "\r")
			.append("     |        eFG%        |        PPS         |        AST         |        AST%        |         AR         |       AST/TO       |" + "\r")
			.append("Team |  Own    Opp    Δ%  | Own    Opp     Δ%  | Own    Opp     Δ%  | Own    Opp     Δ%  | Own    Opp     Δ%  | Own    Opp     Δ%  |")
			.toString();
	}
	
	public String toString_Advanced_Offense2() {
		return new StringBuffer()
			.append(this.getTeamAbbr() != null ? Utilities.padRight(this.teamAbbr.toString(), 4): Utilities.padRight("", 4))
			.append(" " + Utilities.padLeft(getTeamEffectiveFieldGoalPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(getOpptEffectiveFieldGoalPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(getTeamOpptEffectiveFieldGoalPercentageDiff(2).toString(), 6))
			.append(" " + Utilities.padLeft(getTeamPointsPerShot().toString(), 6))
			.append(" " + Utilities.padLeft(getOpptPointsPerShot().toString(), 6))
			.append(" " + Utilities.padLeft(getTeamOpptPointsPerShotDiff(2).toString(), 6))
			.append(" " + Utilities.padLeft(getTeamAvgAssists(1).toPlainString(), 6))
			.append(" " + Utilities.padLeft(getOpptAvgAssists(1).toPlainString(), 6))
			.append(" " + Utilities.padLeft(getTeamOpptAssistDiff(2).toPlainString(), 6))	
			.append(" " + Utilities.padLeft(getTeamAssistPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(getOpptAssistPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(getTeamOpptAssistPercentageDiff(2).toString(), 6))
			.append(" " + Utilities.padLeft(getTeamAssistRate().toString(), 6))
			.append(" " + Utilities.padLeft(getOpptAssistRate().toString(), 6))
			.append(" " + Utilities.padLeft(getTeamOpptAssistRateDiff(2).toString(), 6))			
			.append(" " + Utilities.padLeft(getTeamAssistToTurnoverRatio().toString(), 6))
			.append(" " + Utilities.padLeft(getOpptAssistToTurnoverRatio().toString(), 6))
			.append(" " + Utilities.padLeft(getTeamOpptAssistToTurnoverRatioDiff(2).toString(), 6))
			.toString();
	}
	
	public String toStringFooter_Advanced_Offense2() {
		return new StringBuffer()
			.append("\r" + "Stats Legend")
			.append("\r  " + Utilities.padRight("eFG%: Effective Field Goal Percentage", 40) + "FGM + (0.5 * 3PM) / FGA")
			.append("\r  " + Utilities.padRight("PPS: Points Per Shot", 40) + "PTS / (FGA + 3PA + FTA)")
			.append("\r  " + Utilities.padRight("AST: Average Assists Per Game", 40) + "Σ(AST) / GP")
			.append("\r  " + Utilities.padRight("AST%: Assisted Field Goal Percentage", 40) + "AST / FGM")
			.append("\r  " + Utilities.padRight("AR: Assist Rate", 40) + "(AST * 100) / (FGA + (FTA * 0.44) + AST + TO)")
			.append("\r  " + Utilities.padRight("AST/TO: Assists to Turnover Ratio", 40) + "AST / TO")
			.toString();
	}
	
	public String toStringHeader_Advanced_Defense() {
		return new StringBuffer()
			.append("     |                       Rebound Ratios                         |                         Steal Ratios                         |               Block Ratios              |" + "\r")
			.append("     |       OREB%       |       DREB%         |       TREB%        |        STL%        |       STL/TO       |         TO%        |        BLK%        |        BLKR        |" + "\r")
			.append("Team | Own    Opp     Δ% |  Own    Opp     Δ%  | Own    Opp     Δ%  | Own    Opp     Δ%  | Own    Opp     Δ%  | Own    Opp     Δ%  | Own    Opp     Δ%  |  Own    Opp     Δ% |")
			.toString();
	}
	
	public String toString_Advanced_Defense() {
		return new StringBuffer()
			.append(this.getTeamAbbr() != null ? Utilities.padRight(this.teamAbbr.toString(), 4): Utilities.padRight("", 4))
			.append(" " + Utilities.padLeft(getTeamOffensiveReboundPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(getOpptOffensiveReboundPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(getTeamOpptOffensiveReboundPercentageDiff(2).toPlainString(), 6))
			.append(" " + Utilities.padLeft(getTeamDefensiveReboundPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(getOpptDefensiveReboundPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(getTeamOpptDefensiveReboundPercentageDiff(2).toPlainString(), 6))
			.append(" " + Utilities.padLeft(getTeamTotalReboundPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(getOpptTotalReboundPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(getTeamOpptTotalReboundPercentageDiff(2).toPlainString(), 6))
			.append(" " + Utilities.padLeft(getTeamStealPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(getOpptStealPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(getTeamOpptStealPercentageDiff(2).toPlainString(), 6))
			.append(" " + Utilities.padLeft(getTeamStealToTurnoverRatio().toString(), 6))
			.append(" " + Utilities.padLeft(getOpptStealToTurnoverRatio().toString(), 6))
			.append(" " + Utilities.padLeft(getTeamOpptStealToTurnoverRatioDiff(2).toPlainString(), 6))			
			.append(" " + Utilities.padLeft(getTeamTurnoverPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(getOpptTurnoverPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(getTeamOpptTurnoverPercentageDiff(2).toPlainString(), 6))			
			.append(" " + Utilities.padLeft(getTeamBlockPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(getOpptBlockPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(getTeamOpptBlockPercentageDiff(2).toPlainString(), 6))			
			.append(" " + Utilities.padLeft(getTeamBlockRate().toString(), 6))
			.append(" " + Utilities.padLeft(getOpptBlockRate().toString(), 6))
			.append(" " + Utilities.padLeft(getTeamOpptBlockRateDiff(2).toPlainString(), 6))				
			.toString();
	}
	
	public String toStringFooter_Advanced_Defense() {
		return new StringBuffer()
			.append("\r  " + Utilities.padRight("OREB%: Offensive Rebound Percentage", 40) + "OREB * 100 / (OREB + DDREB)")
			.append("\r  " + Utilities.padRight("DREB%: Defensive Rebound Percentage", 40) + "DREB * 100 / (DREB + DOREB)")
			.append("\r  " + Utilities.padRight("TREB%: Total Rebound Percentage", 40) + "TREB * 100 / (TREB + DTREB)")
			.append("\r  " + Utilities.padRight("STL%: Steal Percentage", 40) + "STL * 100 / Poss")
			.append("\r  " + Utilities.padRight("STL/TO: Steal To Turnover Ratio", 40) + "STL * 100 / TO")			
			.append("\r  " + Utilities.padRight("TO%: Turnover Percentage", 40) + "TO * 100 / (FGA + 0.44 * FTA + TO)")
			.append("\r  " + Utilities.padRight("BLK%: Block Percentage", 40) + "BLK * 100 / Poss")
			.append("\r  " + Utilities.padRight("BLKR: Block Rate", 40) + "BLK * 100 / FGA - 3PA")
			.toString();
	}
	
	public String toStringHeader_Advanced_Efficiency() {
		return new StringBuffer()
			.append("     |                               Efficiency Ratio                               |                    Winning%                   |               Strength of Schedule             |" + "\r")
			.append("     |        ORtg        |        DRtg        |       |       |        FIC         |       Pyth 13.91      |       Pyth 16.5       |      |        SOS         |        RPI         |" + "\r")
			.append("Team | Own    Opp     Δ%  | Own    Opp     Δ%  | eDiff | Poss  | Own    Opp     Δ%  | Pyth%   WPyth   LPyth | Pyth%   WPyth   LPyth | MOV  | Own    Oppt    Δ%  | Own    Oppt    Δ%  |")
			.toString();
	}
	
	public String toString_Advanced_Efficiency() {
		return new StringBuffer()
			.append(this.getTeamAbbr() != null ? Utilities.padRight(this.teamAbbr.toString(), 4): Utilities.padRight("", 4))
			.append(" " + Utilities.padLeft(getTeamOffensiveRating(1).toString(), 6))
			.append(" " + Utilities.padLeft(getOpptOffensiveRating(1).toString(), 6))
			.append(" " + Utilities.padLeft(getTeamOpptOffensiveRatingDiff(2).toPlainString(), 6))
			.append(" " + Utilities.padLeft(getTeamDefensiveRating(1).toString(), 6))
			.append(" " + Utilities.padLeft(getOpptDefensiveRating(1).toString(), 6))
			.append(" " + Utilities.padLeft(getTeamOpptDefensiveRatingDiff(2).toString(), 6))
			.append("  " + Utilities.padLeft(getTeamEfficiencyDifferential(2).toString(), 6))
			.append("  " + Utilities.padLeft(getTeamOpptPossessions().toString(), 6))
			.append(" " + Utilities.padLeft(getTeamFloorImpactCounter(2).toString(), 6))
			.append(" " + Utilities.padLeft(getOpptFloorImpactCounter(2).toString(), 6))
			.append(" " + Utilities.padLeft(getTeamOpptFloorImpactCounterDiff(2).toString(), 6))
			.append("  " + Utilities.padLeft(getTeamPythagoreanWinningPercentage13_91(3).toString(), 6))
			.append(" " + Utilities.padLeft(getTeamPythagoreanWins13_91(2).toString(), 7))
			.append(" " + Utilities.padLeft(getTeamPythagoreanLosses13_91(2).toString(), 7))
			.append(" " + Utilities.padLeft(getTeamPythagoreanWinningPercentage16_5(3).toString(), 7))
			.append(" " + Utilities.padLeft(getTeamPythagoreanWins16_5(2).toString(), 7))
			.append(" " + Utilities.padLeft(getTeamPythagoreanLosses16_5(2).toString(), 7))
			.append(" " + Utilities.padLeft(getTeamMarginOfVictory(2).toString(), 6))
			.append(" " + Utilities.padLeft(getTeamStrengthOfSchedule(3).toString(), 6))
			.append(" " + Utilities.padLeft(getOpptStrengthOfSchedule(3).toString(), 6))
			.append(" " + Utilities.padLeft(getTeamOpptStrengthOfScheduleDiff(2).toString(), 6))
			.append(" " + Utilities.padLeft(getTeamRelativePercentageIndex(3).toString(), 6))
			.append(" " + Utilities.padLeft(getOpptRelativePercentageIndex(3).toString(), 6))
			.append(" " + Utilities.padLeft(getTeamOpptRelativePercentageIndexDiff(2).toString(), 6))
			.toString();
	}
	
	public String toStringFooter_Advanced_Efficiency() {
		return new StringBuffer()
			.append("\r  " + Utilities.padRight("ORtg: Offensive Rating", 40) + "Team PTS / Poss")
			.append("\r  " + Utilities.padRight("DRtg: Defensive Rating", 40) + "Oppt PTS / Poss")
			.append("\r  " + Utilities.padRight("eDiff: Efficiency Differential", 40) + "ORtg - DRtg")
			.append("\r  " + Utilities.padRight("FIC: Floor Impact Counter", 40) + "(PTS + ORB + 0.75 DRB + AST + STL - 0.75 FGA - 0.375 FTA - TO - 0.5 PF) / GP")
			.append("\r  " + Utilities.padRight("Pyth% 13.91: Pythagorean Winning% 13.91", 40) + "Team PTS^13.91 / (Team PTS^13.91 + Oppt PTS^13.91)")
			.append("\r  " + Utilities.padRight("Pyth% 16.5: Pythagorean Winning% 16.5", 40) + "Team PTS^16.5 / (Team PTS^16.5 + Oppt PTS^16.5)")
			.append("\r  " + Utilities.padRight("WPyth: Pythagorean Wins", 40) + "Pyth% * 82")
			.append("\r  " + Utilities.padRight("LPyth: Pythagorean Losses", 40) + "82 - WPyth")
			.append("\r  " + Utilities.padRight("Poss: Estimated Possessions", 40) + "FGA – (OREB / OREB + DDREB) * (FGA – FGM) * 1.07 + TOV + (0.4 * FTA)")
			.append("\r  " + Utilities.padRight("MOV: Margin of Victory", 40) + "Team PTS - Oppt PTS")
			.append("\r  " + Utilities.padRight("SOS: Strength of Schedule", 40) + "(2 * Oppt Win% + Oppt Oppt Win%) / 3")
			.append("\r  " + Utilities.padRight("RPI: Relative Percentage Index", 40) + "0.25 * Team Win% + 0.5 * Oppt Win% + 0.25 * Oppt Oppt Win%")
			.toString();
	}
	
	public String toStringHeader_Advanced_StrengthOfSchedule() {
		return new StringBuffer()
			.append("     |               Strength of Schedule             |" + "\r")
			.append("     |      |        SOS         |        RPI         |" + "\r")
			.append("Team | MOV  | Own    Oppt    Δ%  | Own    Oppt    Δ%  |")
			.toString();
	}
	
	public String toString_Advanced_StrengthOfSchedule() {
		return new StringBuffer()
			.append(this.getTeamAbbr() != null ? Utilities.padRight(this.teamAbbr.toString(), 4): Utilities.padRight("", 4))
			.append(" " + Utilities.padLeft(getTeamMarginOfVictory(2).toString(), 7))
			.append(" " + Utilities.padLeft(getTeamStrengthOfSchedule(2).toString(), 7))
			.append(" " + Utilities.padLeft(getOpptStrengthOfSchedule(2).toString(), 7))
			.toString();
	}
	
	public String toStringFooter_Advanced_StrengthOfSchedule() {
		return new StringBuffer()
			.append("\r  " + Utilities.padRight("MOV: Margin of Victory", 40) + "Team PTS - Oppt PTS")
			.append("\r  " + Utilities.padRight("SOS: Strength of Schedule", 40) + "(2 * Oppt Win% + Oppt Oppt Win%) / 3")
			.append("\r  " + Utilities.padRight("RPI: Relative Percentage Index", 40) + "0.25 * Team Win% + 0.5 * Oppt Win% + 0.25 * Oppt Oppt Win%")
			.toString();
	}
}