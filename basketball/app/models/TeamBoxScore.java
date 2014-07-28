package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.joda.time.DateTime;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;
import util.DateTimeUtil;
import util.Enumerations.Conference;
import util.Enumerations.Division;
import util.Enumerations.Result;
import util.Enumerations.SeasonType;
import util.Enumerations.TeamAbbr;

@Entity
public class TeamBoxScore extends Model {
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name="table_gen", table="seq_table", pkColumnName="seq_name", valueColumnName="seq_count", pkColumnValue="teamboxscore_seq", initialValue=1)
	@GeneratedValue(strategy=GenerationType.TABLE, generator="table_gen")
	private Long id;
	public Long getId() {
		return id;
	}
	
	@Required
	@Column(name="gameDate", nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private DateTime gameDate;
	public DateTime getGameDate() {
		return gameDate;
	}
	public void setGameDate(DateTime gameDate) {
		this.gameDate = gameDate;
	}
	public String getTimeDisplay() {
		return DateTimeUtil.getDisplayTime(gameDate);
	}
	
	@Required
	@Column(name="OfficialLastName", length=35, nullable=false)
	private String officialLastName;
	public String getOfficialLastName() {
		return officialLastName;
	}
	public void setOfficialLastName(String officialLastName) {
		this.officialLastName = officialLastName;
	}
	
	@Required
	@Column(name="OfficialFirstName", length=35, nullable=false)
	private String officialFirstName;
	public String getOfficialFirstName() {
		return officialFirstName;
	}
	public void setOfficialFirstName(String officialFirstName) {
		this.officialFirstName = officialFirstName;
	}
	
	@Required
	@Enumerated(EnumType.STRING)
	@Column(name="seasonType", length=7, nullable=false)
	private SeasonType seasonType;
	public SeasonType getSeasonType() {
		return seasonType;
	}
	public void setSeasonType(SeasonType seasonType) {
		this.seasonType = seasonType;
	}
	
	@Required
	@Enumerated(EnumType.STRING)
	@Column(name="homeTeamAbbr", length=3, nullable=false)
	private TeamAbbr homeTeamAbbr;
	public TeamAbbr getHomeTeamAbbr() {
		return homeTeamAbbr;
	}
	public void setHomeTeamAbbr(TeamAbbr homeTeamAbbr) {
		this.homeTeamAbbr = homeTeamAbbr;
	}
	
	@Required
	@Enumerated(EnumType.STRING)
	@Column(name="homeConference", length=4, nullable=false)
	private Conference homeConference;
	public Conference getHomeConference() {
		return homeConference;
	}
	public void setHomeConference(Conference homeConference) {
		this.homeConference = homeConference;
	}
	
	@Required
	@Enumerated(EnumType.STRING)
	@Column(name="homeDivision", length=9, nullable=false)
	private Division homeDivision;
	public Division getHomeDivision() {
		return homeDivision;
	}
	public void setHomeDivision(Division homeDivision) {
		this.homeDivision = homeDivision;
	}
	
	@Required
	@Enumerated(EnumType.STRING)
	@Column(name="homeResult", length=4, nullable=false)
	private Result homeResult;
	public Result getHomeResult() {
		return homeResult;
	}
	public void setHomeResult(Result homeResult) {
		this.homeResult = homeResult;
	}
	
	@Column(name="homeTeamName", length=35, nullable=false)
	private String homeTeamName;
	public String getHomeTeamName() {
		return homeTeamName;
	}
	public void setHomeTeamName(String homeTeamName) {
		this.homeTeamName = homeTeamName;
	}

	@Column(name="homePoints", nullable=false)
	private Short homePoints;
	public Short getHomePoints() {
		return homePoints;
	}
	public void setHomePoints(Short homePoints) {
		this.homePoints = homePoints;
	}
	
	@Column(name="homeAssists", nullable=false)
	private Short homeAssists;
	public Short getHomeAssists() {
		return homeAssists;
	}
	public void setHomeAssists(Short homeAssists) {
		this.homeAssists = homeAssists;
	}
	
	@Column(name="homeTurnovers", nullable=false)
	private Short homeTurnovers;
	public Short getHomeTurnovers() {
		return homeTurnovers;
	}
	public void setHomeTurnovers(Short homeTurnovers) {
		this.homeTurnovers = homeTurnovers;
	}
	
	@Column(name="homeSteals", nullable=false)
	private Short homeSteals;
	public Short getHomeSteals() {
		return homeSteals;
	}
	public void setHomeSteals(Short homeSteals) {
		this.homeSteals = homeSteals;
	}
	
	@Column(name="homeBlocks", nullable=false)
	private Short homeBlocks;
	public Short getHomeBlocks() {
		return homeBlocks;
	}
	public void setHomeBlocks(Short homeBlocks) {
		this.homeBlocks = homeBlocks;
	}
	
	@Column(name="homePersonalFouls", nullable=false)
	private Short homePersonalFouls;
	public Short getHomePersonalFouls() {
		return homePersonalFouls;
	}
	public void setHomePersonalFouls(Short homePersonalFouls) {
		this.homePersonalFouls = homePersonalFouls;
	}
	
	@Column(name="homeFieldGoalAttempts", nullable=false)
	private Short homeFieldGoalAttempts;
	public Short getHomeFieldGoalAttempts() {
		return homeFieldGoalAttempts;
	}
	public void setHomeFieldGoalAttempts(Short homeFieldGoalAttempts) {
		this.homeFieldGoalAttempts = homeFieldGoalAttempts;
	}	
	
	@Column(name="homeFieldGoalMade", nullable=false)
	private Short homeFieldGoalMade;
	public Short getHomeFieldGoalMade() {
		return homeFieldGoalMade;
	}
	public void setHomeFieldGoalMade(Short homeFieldGoalMade) {
		this.homeFieldGoalMade = homeFieldGoalMade;
	}	

	@Column(name="homeThreePointAttempts", nullable=false)
	private Short homeThreePointAttempts;
	public Short getHomeThreePointAttempts() {
		return homeThreePointAttempts;
	}
	public void setHomeThreePointAttempts(Short homeThreePointAttempts) {
		this.homeThreePointAttempts = homeThreePointAttempts;
	}	

	@Column(name="homeThreePointMade", nullable=false)
	private Short homeThreePointMade;
	public Short getHomeThreePointMade() {
		return homeThreePointMade;
	}
	public void setHomeThreePointMade(Short homeThreePointMade) {
		this.homeThreePointMade = homeThreePointMade;
	}
	
	@Column(name="homeFreeThrowAttempts", nullable=false)
	private Short homeFreeThrowAttempts;
	public Short getHomeFreeThrowAttempts() {
		return homeFreeThrowAttempts;
	}
	public void setHomeFreeThrowAttempts(Short homeFreeThrowAttempts) {
		this.homeFreeThrowAttempts = homeFreeThrowAttempts;
	}	

	@Column(name="homeFreeThrowMade", nullable=false)
	private Short homeFreeThrowMade;
	public Short getHomeFreeThrowMade() {
		return homeFreeThrowMade;
	}
	public void setHomeFreeThrowMade(Short homeFreeThrowMade) {
		this.homeFreeThrowMade = homeFreeThrowMade;
	}	
	
	@Column(name="homeReboundsOffense", nullable=false)
	private Short homeReboundsOffense;
	public Short getHomeReboundsOffense() {
		return homeReboundsOffense;
	}
	public void setHomeReboundsOffense(Short homeReboundsOffense) {
		this.homeReboundsOffense = homeReboundsOffense;
	}
	
	@Column(name="homeReboundsDefense", nullable=false)
	private Short homeReboundsDefense;
	public Short getHomeReboundsDefense() {
		return homeReboundsDefense;
	}
	public void setHomeReboundsDefense(Short homeReboundsDefense) {
		this.homeReboundsDefense = homeReboundsDefense;
	}
	
	@Column(name="homePointsQ1", nullable=false)
	private Short homePointsQ1;
	public Short getHomePointsQ1() {
		return homePointsQ1;
	}
	public void setHomePointsQ1(Short homePointsQ1) {
		this.homePointsQ1 = homePointsQ1;
	}
	
	@Column(name="homePointsQ2", nullable=false)
	private Short homePointsQ2;
	public Short getHomePointsQ2() {
		return homePointsQ2;
	}
	public void setHomePointsQ2(Short homePointsQ2) {
		this.homePointsQ2 = homePointsQ2;
	}
	
	@Column(name="homePointsQ3", nullable=false)
	private Short homePointsQ3;
	public Short getHomePointsQ3() {
		return homePointsQ3;
	}
	public void setHomePointsQ3(Short homePointsQ3) {
		this.homePointsQ3 = homePointsQ3;
	}
	
	@Column(name="homePointsQ4", nullable=false)
	private Short homePointsQ4;
	public Short getHomePointsQ4() {
		return homePointsQ4;
	}
	public void setHomePointsQ4(Short homePointsQ4) {
		this.homePointsQ4 = homePointsQ4;
	}
	
	@Column(name="homePointsQ5", nullable=false)
	private Short homePointsQ5;
	public Short getHomePointsQ5() {
		return homePointsQ5;
	}
	public void setHomePointsQ5(Short homePointsQ5) {
		this.homePointsQ5 = homePointsQ5;
	}
	
	@Column(name="homePointsQ6", nullable=false)
	private Short homePointsQ6;
	public Short getHomePointsQ6() {
		return homePointsQ6;
	}
	public void setHomePointsQ6(Short homePointsQ6) {
		this.homePointsQ6 = homePointsQ6;
	}
	
	@Column(name="homePointsQ7", nullable=false)
	private Short homePointsQ7;
	public Short getHomePointsQ7() {
		return homePointsQ7;
	}
	public void setHomePointsQ7(Short homePointsQ7) {
		this.homePointsQ7 = homePointsQ7;
	}
	
	@Column(name="homePointsQ8", nullable=false)
	private Short homePointsQ8;
	public Short getHomePointsQ8() {
		return homePointsQ8;
	}
	public void setHomePointsQ8(Short homePointsQ8) {
		this.homePointsQ8 = homePointsQ8;
	}
	
	@Required
	@Enumerated(EnumType.STRING)
	@Column(name="awayTeamAbbr", length=3, nullable=false)
	private TeamAbbr awayTeamAbbr;
	public TeamAbbr getAwayTeamAbbr() {
		return awayTeamAbbr;
	}
	public void setAwayTeamAbbr(TeamAbbr awayTeamAbbr) {
		this.awayTeamAbbr = awayTeamAbbr;
	}
	
	@Required
	@Enumerated(EnumType.STRING)
	@Column(name="awayConference", length=4, nullable=false)
	private Conference awayConference;
	public Conference getAwayConference() {
		return awayConference;
	}
	public void setAwayConference(Conference awayConference) {
		this.awayConference = awayConference;
	}
	
	@Required
	@Enumerated(EnumType.STRING)
	@Column(name="awayDivision", length=9, nullable=false)
	private Division awayDivision;
	public Division getAwayDivision() {
		return awayDivision;
	}
	public void setAwayDivision(Division awayDivision) {
		this.awayDivision = awayDivision;
	}
	
	@Required
	@Enumerated(EnumType.STRING)
	@Column(name="awayResult", length=4, nullable=false)
	private Result awayResult;
	public Result getAwayResult() {
		return awayResult;
	}
	public void setAwayResult(Result awayResult) {
		this.awayResult = awayResult;
	}
	
	@Column(name="awayTeamName", length=35, nullable=false)
	private String awayTeamName;
	public String getAwayTeamName() {
		return awayTeamName;
	}
	public void setAwayTeamName(String awayTeamName) {
		this.awayTeamName = awayTeamName;
	}
	
	@Column(name="awayPoints", nullable=false)
	private Short awayPoints;
	public Short getAwayPoints() {
		return awayPoints;
	}
	public void setAwayPoints(Short awayPoints) {
		this.awayPoints = awayPoints;
	}
	
	@Column(name="awayAssists", nullable=false)
	private Short awayAssists;
	public Short getAwayAssists() {
		return awayAssists;
	}
	public void setAwayAssists(Short awayAssists) {
		this.awayAssists = awayAssists;
	}
	
	@Column(name="awayTurnovers", nullable=false)
	private Short awayTurnovers;
	public Short getAwayTurnovers() {
		return awayTurnovers;
	}
	public void setAwayTurnovers(Short awayTurnovers) {
		this.awayTurnovers = awayTurnovers;
	}
	
	@Column(name="awaySteals", nullable=false)
	private Short awaySteals;
	public Short getAwaySteals() {
		return awaySteals;
	}
	public void setAwaySteals(Short awaySteals) {
		this.awaySteals = awaySteals;
	}
	
	@Column(name="awayBlocks", nullable=false)
	private Short awayBlocks;
	public Short getAwayBlocks() {
		return awayBlocks;
	}
	public void setAwayBlocks(Short awayBlocks) {
		this.awayBlocks = awayBlocks;
	}
	
	@Column(name="awayPersonalFouls", nullable=false)
	private Short awayPersonalFouls;
	public Short getAwayPersonalFouls() {
		return awayPersonalFouls;
	}
	public void setAwayPersonalFouls(Short awayPersonalFouls) {
		this.awayPersonalFouls = awayPersonalFouls;
	}
	
	@Column(name="awayFieldGoalAttempts", nullable=false)
	private Short awayFieldGoalAttempts;
	public Short getAwayFieldGoalAttempts() {
		return awayFieldGoalAttempts;
	}
	public void setAwayFieldGoalAttempts(Short awayFieldGoalAttempts) {
		this.awayFieldGoalAttempts = awayFieldGoalAttempts;
	}	
	
	@Column(name="awayFieldGoalMade", nullable=false)
	private Short awayFieldGoalMade;
	public Short getAwayFieldGoalMade() {
		return awayFieldGoalMade;
	}
	public void setAwayFieldGoalMade(Short awayFieldGoalMade) {
		this.awayFieldGoalMade = awayFieldGoalMade;
	}	

	@Column(name="awayThreePointAttempts", nullable=false)
	private Short awayThreePointAttempts;
	public Short getAwayThreePointAttempts() {
		return awayThreePointAttempts;
	}
	public void setAwayThreePointAttempts(Short awayThreePointAttempts) {
		this.awayThreePointAttempts = awayThreePointAttempts;
	}	

	@Column(name="awayThreePointMade", nullable=false)
	private Short awayThreePointMade;
	public Short getAwayThreePointMade() {
		return awayThreePointMade;
	}
	public void setAwayThreePointMade(Short awayThreePointMade) {
		this.awayThreePointMade = awayThreePointMade;
	}
	
	@Column(name="awayFreeThrowAttempts", nullable=false)
	private Short awayFreeThrowAttempts;
	public Short getAwayFreeThrowAttempts() {
		return awayFreeThrowAttempts;
	}
	public void setAwayFreeThrowAttempts(Short awayFreeThrowAttempts) {
		this.awayFreeThrowAttempts = awayFreeThrowAttempts;
	}	

	@Column(name="awayFreeThrowMade", nullable=false)
	private Short awayFreeThrowMade;
	public Short getAwayFreeThrowMade() {
		return awayFreeThrowMade;
	}
	public void setAwayFreeThrowMade(Short awayFreeThrowMade) {
		this.awayFreeThrowMade = awayFreeThrowMade;
	}	
	
	@Column(name="awayReboundsOffense", nullable=false)
	private Short awayReboundsOffense;
	public Short getAwayReboundsOffense() {
		return awayReboundsOffense;
	}
	public void setAwayReboundsOffense(Short awayReboundsOffense) {
		this.awayReboundsOffense = awayReboundsOffense;
	}
	
	@Column(name="awayReboundsDefense", nullable=false)
	private Short awayReboundsDefense;
	public Short getAwayReboundsDefense() {
		return awayReboundsDefense;
	}
	public void setAwayReboundsDefense(Short awayReboundsDefense) {
		this.awayReboundsDefense = awayReboundsDefense;
	}
	
	@Column(name="awayPointsQ1", nullable=false)
	private Short awayPointsQ1;
	public Short getAwayPointsQ1() {
		return awayPointsQ1;
	}
	public void setAwayPointsQ1(Short awayPointsQ1) {
		this.awayPointsQ1 = awayPointsQ1;
	}
	
	@Column(name="awayPointsQ2", nullable=false)
	private Short awayPointsQ2;
	public Short getAwayPointsQ2() {
		return awayPointsQ2;
	}
	public void setAwayPointsQ2(Short awayPointsQ2) {
		this.awayPointsQ2 = awayPointsQ2;
	}
	
	@Column(name="awayPointsQ3", nullable=false)
	private Short awayPointsQ3;
	public Short getAwayPointsQ3() {
		return awayPointsQ3;
	}
	public void setAwayPointsQ3(Short awayPointsQ3) {
		this.awayPointsQ3 = awayPointsQ3;
	}
	
	@Column(name="awayPointsQ4", nullable=false)
	private Short awayPointsQ4;
	public Short getAwayPointsQ4() {
		return awayPointsQ4;
	}
	public void setAwayPointsQ4(Short awayPointsQ4) {
		this.awayPointsQ4 = awayPointsQ4;
	}
	
	@Column(name="awayPointsQ5", nullable=false)
	private Short awayPointsQ5;
	public Short getAwayPointsQ5() {
		return awayPointsQ5;
	}
	public void setAwayPointsQ5(Short awayPointsQ5) {
		this.awayPointsQ5 = awayPointsQ5;
	}
	
	@Column(name="awayPointsQ6", nullable=false)
	private Short awayPointsQ6;
	public Short getAwayPointsQ6() {
		return awayPointsQ6;
	}
	public void setAwayPointsQ6(Short awayPointsQ6) {
		this.awayPointsQ6 = awayPointsQ6;
	}
	
	@Column(name="awayPointsQ7", nullable=false)
	private Short awayPointsQ7;
	public Short getAwayPointsQ7() {
		return awayPointsQ7;
	}
	public void setAwayPointsQ7(Short awayPointsQ7) {
		this.awayPointsQ7 = awayPointsQ7;
	}
	
	@Column(name="awayPointsQ8", nullable=false)
	private Short awayPointsQ8;
	public Short getAwayPointsQ8() {
		return awayPointsQ8;
	}
	public void setAwayPointsQ8(Short awayPointsQ8) {
		this.awayPointsQ8 = awayPointsQ8;
	}
	
	@Column(name="Official1LastName", length=35, nullable=false)
	private String official1LastName;
	public String getOfficial1LastName() {
		return official1LastName;
	}
	public void setOfficial1LastName(String official1LastName) {
		this.official1LastName = official1LastName;
	}
	
	@Column(name="Official1FirstName", length=35, nullable=false)
	private String official1FirstName;
	public String getOfficial1FirstName() {
		return official1FirstName;
	}
	public void setOfficial1FirstName(String official1FirstName) {
		this.official1FirstName = official1FirstName;
	}
	
	@Column(name="Official2LastName", length=35, nullable=false)
	private String official2LastName;
	public String getOfficial2LastName() {
		return official2LastName;
	}
	public void setOfficial2LastName(String official2LastName) {
		this.official2LastName = official2LastName;
	}
	
	@Column(name="Official2FirstName", length=35, nullable=false)
	private String official2FirstName;
	public String getOfficial2FirstName() {
		return official2FirstName;
	}
	public void setOfficial2FirstName(String official2FirstName) {
		this.official2FirstName = official2FirstName;
	}
	
	@Column(name="Official3LastName", length=35, nullable=false)
	private String official3LastName;
	public String getOfficial3LastName() {
		return official3LastName;
	}
	public void setOfficial3LastName(String official3LastName) {
		this.official3LastName = official3LastName;
	}
	
	@Column(name="Official3FirstName", length=35, nullable=false)
	private String official3FirstName;
	public String getOfficial3FirstName() {
		return official3FirstName;
	}
	public void setOfficial3FirstName(String official3FirstName) {
		this.official3FirstName = official3FirstName;
	}
	
	public String toString() {
		return new StringBuffer()
			.append("  id: " + this.id)
			.append("  homeResult:    " + this.homeResult + "  awayResult:    " + this.awayResult)
			.append("  homePoints:    " + this.homePoints + "  awayPoints:    " + this.awayPoints)
			.append("  homeAssists:   " + this.homeAssists + "  awayAssists:   " + this.awayAssists)
			.append("  homeTurnovers: " + this.homeTurnovers + "  awayTurnovers: " + this.awayTurnovers)
			.append("  homeSteals:    " + this.homeSteals + "  awaySteals:    " + this.awaySteals)
			.append("  homeBlocks:    " + this.homeBlocks + "  awayBlocks:    " + this.awayBlocks)
			.toString();
	}
}