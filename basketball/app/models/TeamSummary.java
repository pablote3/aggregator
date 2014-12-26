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
	
	private TeamAbbr opptTeamAbbr;
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
	public Integer getTeamSumPointsQ1() { return teamSumPointsQ1; }
	public Integer getTeamSumPointsQ2() { return teamSumPointsQ2; }
	public Integer getTeamSumPointsQ3() { return teamSumPointsQ3; }
	public Integer getTeamSumPointsQ4() { return teamSumPointsQ4; }
	public TeamAbbr getOpptTeamAbbr() { return opptTeamAbbr; }
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
	
	public BigDecimal getTeamProjectedWinningPercentage(int scale) {
		return getTeamMarginOfVictory(3)
			.multiply(new BigDecimal(2.7))
			.add(new BigDecimal(41))
			.divide(new BigDecimal(82), 4, RoundingMode.HALF_UP)
			.setScale(scale, RoundingMode.HALF_UP);
	}
	
	public BigDecimal getTeamOpptPace() {
		return getTeamOpptPossessions()
				.divide(new BigDecimal(teamGamesPlayed), 2, RoundingMode.HALF_UP);
	}
	
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
}