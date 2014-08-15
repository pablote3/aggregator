package models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.avaje.ebean.annotation.Sql;

import play.db.ebean.Model;
import util.Enumerations.TeamAbbr;

@Entity
@Sql
public class TeamSummary extends Model {
	private static final long serialVersionUID = 1L;
	
	@Enumerated(EnumType.STRING)
	private TeamAbbr teamAbbr;
	public TeamAbbr getTeamAbbr() {
		return teamAbbr;
	}
	public void setTeamAbbr(TeamAbbr teamAbbr) {
		this.teamAbbr = teamAbbr;
	}
	
	private Short teamGamesPlayed;
	public Short getTeamGamesPlayed() {
		return teamGamesPlayed;
	}
	public void setGamesPlayed(Short teamGamesPlayed) {
		this.teamGamesPlayed = teamGamesPlayed;
	}

	private Short teamSumPoints;
	public Short getTeamSumPoints() {
		return teamSumPoints;
	}
	public void setTeamSumPoints(Short teamSumPoints) {
		this.teamSumPoints = teamSumPoints;
	}
	
	private Short teamSumAssists;
	public Short getTeamSumAssists() {
		return teamSumAssists;
	}
	public void setTeamSumAssists(Short teamSumAssists) {
		this.teamSumAssists = teamSumAssists;
	}
	
	private Short teamSumTurnovers;
	public Short getTeamSumTurnovers() {
		return teamSumTurnovers;
	}
	public void setTeamSumTurnovers(Short teamSumTurnovers) {
		this.teamSumTurnovers = teamSumTurnovers;
	}
	
	private Short teamSumSteals;
	public Short getTeamSumSteals() {
		return teamSumSteals;
	}
	public void setTeamSumSteals(Short teamSumSteals) {
		this.teamSumSteals = teamSumSteals;
	}
	
	private Short teamSumBlocks;
	public Short getTeamSumBlocks() {
		return teamSumBlocks;
	}
	public void setTeamSumBlocks(Short teamSumBlocks) {
		this.teamSumBlocks = teamSumBlocks;
	}
	
	private Short teamSumPersonalFouls;
	public Short getTeamSumPersonalFouls() {
		return teamSumPersonalFouls;
	}
	public void setTeamSumPersonalFouls(Short teamSumPersonalFouls) {
		this.teamSumPersonalFouls = teamSumPersonalFouls;
	}
	
	private Short teamSumFieldGoalAttempts;
	public Short getTeamSumFieldGoalAttempts() {
		return teamSumFieldGoalAttempts;
	}
	public void setTeamSumFieldGoalAttempts(Short teamSumFieldGoalAttempts) {
		this.teamSumFieldGoalAttempts = teamSumFieldGoalAttempts;
	}	
	
	private Short teamSumFieldGoalMade;
	public Short getTeamSumFieldGoalMade() {
		return teamSumFieldGoalMade;
	}
	public void setTeamSumFieldGoalMade(Short teamSumFieldGoalMade) {
		this.teamSumFieldGoalMade = teamSumFieldGoalMade;
	}	

	private Short teamSumThreePointAttempts;
	public Short getTeamSumThreePointAttempts() {
		return teamSumThreePointAttempts;
	}
	public void setTeamSumThreePointAttempts(Short teamSumThreePointAttempts) {
		this.teamSumThreePointAttempts = teamSumThreePointAttempts;
	}	

	private Short teamSumThreePointMade;
	public Short getTeamSumThreePointMade() {
		return teamSumThreePointMade;
	}
	public void setTeamSumThreePointMade(Short teamSumThreePointMade) {
		this.teamSumThreePointMade = teamSumThreePointMade;
	}
	
	private Short teamSumFreeThrowAttempts;
	public Short getTeamSumFreeThrowAttempts() {
		return teamSumFreeThrowAttempts;
	}
	public void setTeamSumFreeThrowAttempts(Short teamSumFreeThrowAttempts) {
		this.teamSumFreeThrowAttempts = teamSumFreeThrowAttempts;
	}	

	private Short teamSumFreeThrowMade;
	public Short getTeamSumFreeThrowMade() {
		return teamSumFreeThrowMade;
	}
	public void setTeamSumFreeThrowMade(Short teamSumFreeThrowMade) {
		this.teamSumFreeThrowMade = teamSumFreeThrowMade;
	}	
	
	private Short teamSumReboundsOffense;
	public Short getTeamSumReboundsOffense() {
		return teamSumReboundsOffense;
	}
	public void setTeamSumReboundsOffense(Short teamSumReboundsOffense) {
		this.teamSumReboundsOffense = teamSumReboundsOffense;
	}
	
	private Short teamSumReboundsDefense;
	public Short getTeamSumReboundsDefense() {
		return teamSumReboundsDefense;
	}
	public void setTeamSumReboundsDefense(Short teamSumReboundsDefense) {
		this.teamSumReboundsDefense = teamSumReboundsDefense;
	}
	
	private Short teamSumPointsQ1;
	public Short getTeamSumPointsQ1() {
		return teamSumPointsQ1;
	}
	public void setTeamSumPointsQ1(Short teamSumPointsQ1) {
		this.teamSumPointsQ1 = teamSumPointsQ1;
	}
	
	private Short teamSumPointsQ2;
	public Short getTeamSumPointsQ2() {
		return teamSumPointsQ2;
	}
	public void setTeamSumPointsQ2(Short teamSumPointsQ2) {
		this.teamSumPointsQ2 = teamSumPointsQ2;
	}
	
	private Short teamSumPointsQ3;
	public Short getTeamSumPointsQ3() {
		return teamSumPointsQ3;
	}
	public void setTeamSumPointsQ3(Short teamSumPointsQ3) {
		this.teamSumPointsQ3 = teamSumPointsQ3;
	}
	
	private Short teamSumPointsQ4;
	public Short getTeamSumPointsQ4() {
		return teamSumPointsQ4;
	}
	public void setTeamSumPointsQ4(Short teamSumPointsQ4) {
		this.teamSumPointsQ4 = teamSumPointsQ4;
	}
}