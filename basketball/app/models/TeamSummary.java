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

//	private Short teamPoints;
//	public Short getTeamPoints() {
//		return teamPoints;
//	}
//	public void setTeamPoints(Short teamPoints) {
//		this.teamPoints = teamPoints;
//	}
//	
//	private Short teamAssists;
//	public Short getTeamAssists() {
//		return teamAssists;
//	}
//	public void setTeamAssists(Short teamAssists) {
//		this.teamAssists = teamAssists;
//	}
//	
//	private Short teamTurnovers;
//	public Short getTeamTurnovers() {
//		return teamTurnovers;
//	}
//	public void setTeamTurnovers(Short teamTurnovers) {
//		this.teamTurnovers = teamTurnovers;
//	}
//	
//	private Short teamSteals;
//	public Short getTeamSteals() {
//		return teamSteals;
//	}
//	public void setTeamSteals(Short teamSteals) {
//		this.teamSteals = teamSteals;
//	}
//	
//	private Short teamBlocks;
//	public Short getTeamBlocks() {
//		return teamBlocks;
//	}
//	public void setTeamBlocks(Short teamBlocks) {
//		this.teamBlocks = teamBlocks;
//	}
//	
//	private Short teamPersonalFouls;
//	public Short getTeamPersonalFouls() {
//		return teamPersonalFouls;
//	}
//	public void setTeamPersonalFouls(Short teamPersonalFouls) {
//		this.teamPersonalFouls = teamPersonalFouls;
//	}
//	
//	private Short teamFieldGoalAttempts;
//	public Short getTeamFieldGoalAttempts() {
//		return teamFieldGoalAttempts;
//	}
//	public void setTeamFieldGoalAttempts(Short teamFieldGoalAttempts) {
//		this.teamFieldGoalAttempts = teamFieldGoalAttempts;
//	}	
//	
//	private Short teamFieldGoalMade;
//	public Short getTeamFieldGoalMade() {
//		return teamFieldGoalMade;
//	}
//	public void setTeamFieldGoalMade(Short teamFieldGoalMade) {
//		this.teamFieldGoalMade = teamFieldGoalMade;
//	}	
//
//	private Short teamThreePointAttempts;
//	public Short getTeamThreePointAttempts() {
//		return teamThreePointAttempts;
//	}
//	public void setTeamThreePointAttempts(Short teamThreePointAttempts) {
//		this.teamThreePointAttempts = teamThreePointAttempts;
//	}	
//
//	private Short teamThreePointMade;
//	public Short getTeamThreePointMade() {
//		return teamThreePointMade;
//	}
//	public void setTeamThreePointMade(Short teamThreePointMade) {
//		this.teamThreePointMade = teamThreePointMade;
//	}
//	
//	private Short teamFreeThrowAttempts;
//	public Short getTeamFreeThrowAttempts() {
//		return teamFreeThrowAttempts;
//	}
//	public void setTeamFreeThrowAttempts(Short teamFreeThrowAttempts) {
//		this.teamFreeThrowAttempts = teamFreeThrowAttempts;
//	}	
//
//	private Short teamFreeThrowMade;
//	public Short getTeamFreeThrowMade() {
//		return teamFreeThrowMade;
//	}
//	public void setTeamFreeThrowMade(Short teamFreeThrowMade) {
//		this.teamFreeThrowMade = teamFreeThrowMade;
//	}	
//	
//	private Short teamReboundsOffense;
//	public Short getTeamReboundsOffense() {
//		return teamReboundsOffense;
//	}
//	public void setTeamReboundsOffense(Short teamReboundsOffense) {
//		this.teamReboundsOffense = teamReboundsOffense;
//	}
//	
//	private Short teamReboundsDefense;
//	public Short getTeamReboundsDefense() {
//		return teamReboundsDefense;
//	}
//	public void setTeamReboundsDefense(Short teamReboundsDefense) {
//		this.teamReboundsDefense = teamReboundsDefense;
//	}
}