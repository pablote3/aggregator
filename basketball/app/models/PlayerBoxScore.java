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
import org.joda.time.LocalDate;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;
import util.DateTimeUtil;
import util.Enumerations.Conference;
import util.Enumerations.Division;
import util.Enumerations.Location;
import util.Enumerations.Position;
import util.Enumerations.Result;
import util.Enumerations.SeasonType;
import util.Enumerations.TeamAbbr;

@Entity
public class PlayerBoxScore extends Model {
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name="table_gen", table="seq_table", pkColumnName="seq_name", valueColumnName="seq_count", pkColumnValue="playerboxscore_seq", initialValue=1)
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
	@Column(name="playerLastName", length=25, nullable=false)
	private String playerLastName;
	public String getPlayerLastName() {
		return playerLastName;
	}
	public void setPlayerLastName(String playerLastName) {
		this.playerLastName = playerLastName;
	}
	
	@Required
	@Column(name="playerFirstName", length=25, nullable=false)
	private String playerFirstName;
	public String getPlayerFirstName() {
		return playerFirstName;
	}
	public void setPlayerFirstName(String playerFirstName) {
		this.playerFirstName = playerFirstName;
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
	@Column(name="playerTeamAbbr", length=3, nullable=false)
	private TeamAbbr playerTeamAbbr;
	public TeamAbbr getPlayerTeamAbbr() {
		return playerTeamAbbr;
	}
	public void setPlayerTeamAbbr(TeamAbbr playerTeamAbbr) {
		this.playerTeamAbbr = playerTeamAbbr;
	}
	
	@Required
	@Enumerated(EnumType.STRING)
	@Column(name="playerConference", length=4, nullable=false)
	private Conference playerConference;
	public Conference getPlayerConference() {
		return playerConference;
	}
	public void setPlayerConference(Conference playerConference) {
		this.playerConference = playerConference;
	}
	
	@Required
	@Enumerated(EnumType.STRING)
	@Column(name="playerDivision", length=9, nullable=false)
	private Division playerDivision;
	public Division getPlayerDivision() {
		return playerDivision;
	}
	public void setPlayerDivision(Division playerDivision) {
		this.playerDivision = playerDivision;
	}
	
	@Required
	@Enumerated(EnumType.STRING)
	@Column(name="playerLocation", length=4, nullable=false)
	private Location playerLocation;
	public Location getPlayerLocation() {
		return playerLocation;
	}
	public void setPlayerLocation(Location playerLocation) {
		this.playerLocation = playerLocation;
	}
	
	@Required
	@Enumerated(EnumType.STRING)
	@Column(name="result", length=4, nullable=false)
	private Result result;
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}
	
	@Required
	@Column(name="fromDate", nullable=false)
	@Temporal(TemporalType.DATE)
	private LocalDate fromDate;
	public LocalDate getFromDate() {
		return fromDate;
	}
	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}
	public String getFromDateDisplay() {
		return DateTimeUtil.getDisplayDateShort(fromDate);
	}
	
	@Required
	@Column(name="toDate", nullable=false)
	@Temporal(TemporalType.DATE)
	private LocalDate toDate;
	public LocalDate getToDate() {
		return toDate;
	}
	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}
	public String getToDateDisplay() {
		return DateTimeUtil.getDisplayDateShort(toDate);
	}
	
	@Required
	@Enumerated(EnumType.STRING)
	@Column(name="position", length=5, nullable=false)
	private Position position;
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	
	@Column(name="height", nullable=true)
	private Short height;
	public Short getHeight() {
		return height;
	}
	public void setHeight(Short height) {
		this.height = height;
	}
	
	@Column(name="weight", nullable=true)
	private Short weight;
	public Short getWeight() {
		return weight;
	}
	public void setWeight(Short weight) {
		this.weight = weight;
	}
	
	@Required
	@Column(name="birthdate", nullable=true)
	@Temporal(TemporalType.DATE)
	private LocalDate birthDate;
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	@Required
	@Column(name="birthplace", length=50, nullable=true)
	private String birthPlace;
	public String getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	
	@Column(name="minutes", nullable=true)
	private Short minutes;
	public Short getMinutes() {
		return minutes;
	}
	public void setMinutes(Short minutes) {
		this.minutes = minutes;
	}
	
	@Column(name="starter", nullable=false)
	private boolean starter;
	public boolean getStarter() {
		return starter;
	}
	public void setStarter(boolean starter) {
		this.starter = starter;
	}

	@Column(name="points", nullable=false)
	private Short points;
	public Short getPoints() {
		return points;
	}
	public void setPoints(Short points) {
		this.points = points;
	}
	
	@Column(name="assists", nullable=false)
	private Short assists;
	public Short getAssists() {
		return assists;
	}
	public void setAssists(Short assists) {
		this.assists = assists;
	}
	
	@Column(name="turnovers", nullable=false)
	private Short turnovers;
	public Short getTurnovers() {
		return turnovers;
	}
	public void setTurnovers(Short turnovers) {
		this.turnovers = turnovers;
	}
	
	@Column(name="steals", nullable=false)
	private Short steals;
	public Short getSteals() {
		return steals;
	}
	public void setSteals(Short steals) {
		this.steals = steals;
	}
	
	@Column(name="blocks", nullable=false)
	private Short blocks;
	public Short getBlocks() {
		return blocks;
	}
	public void setBlocks(Short blocks) {
		this.blocks = blocks;
	}
	
	@Column(name="personalFouls", nullable=false)
	private Short personalFouls;
	public Short getPersonalFouls() {
		return personalFouls;
	}
	public void setPersonalFouls(Short personalFouls) {
		this.personalFouls = personalFouls;
	}
	
	@Column(name="fieldGoalAttempts", nullable=false)
	private Short fieldGoalAttempts;
	public Short getFieldGoalAttempts() {
		return fieldGoalAttempts;
	}
	public void setFieldGoalAttempts(Short fieldGoalAttempts) {
		this.fieldGoalAttempts = fieldGoalAttempts;
	}	
	
	@Column(name="fieldGoalMade", nullable=false)
	private Short fieldGoalMade;
	public Short getFieldGoalMade() {
		return fieldGoalMade;
	}
	public void setFieldGoalMade(Short fieldGoalMade) {
		this.fieldGoalMade = fieldGoalMade;
	}	

	@Column(name="threePointAttempts", nullable=false)
	private Short threePointAttempts;
	public Short getThreePointAttempts() {
		return threePointAttempts;
	}
	public void setThreePointAttempts(Short threePointAttempts) {
		this.threePointAttempts = threePointAttempts;
	}	

	@Column(name="threePointMade", nullable=false)
	private Short threePointMade;
	public Short getThreePointMade() {
		return threePointMade;
	}
	public void setThreePointMade(Short threePointMade) {
		this.threePointMade = threePointMade;
	}
	
	@Column(name="freeThrowAttempts", nullable=false)
	private Short freeThrowAttempts;
	public Short getFreeThrowAttempts() {
		return freeThrowAttempts;
	}
	public void setFreeThrowAttempts(Short freeThrowAttempts) {
		this.freeThrowAttempts = freeThrowAttempts;
	}	

	@Column(name="freeThrowMade", nullable=false)
	private Short freeThrowMade;
	public Short getFreeThrowMade() {
		return freeThrowMade;
	}
	public void setFreeThrowMade(Short freeThrowMade) {
		this.freeThrowMade = freeThrowMade;
	}	
	
	@Column(name="reboundsOffense", nullable=false)
	private Short reboundsOffense;
	public Short getReboundsOffense() {
		return reboundsOffense;
	}
	public void setReboundsOffense(Short reboundsOffense) {
		this.reboundsOffense = reboundsOffense;
	}
	
	@Column(name="reboundsDefense", nullable=false)
	private Short reboundsDefense;
	public Short getReboundsDefense() {
		return reboundsDefense;
	}
	public void setReboundsDefense(Short reboundsDefense) {
		this.reboundsDefense = reboundsDefense;
	}
	
	@Column(name="pointsQ1", nullable=false)
	private Short pointsQ1;
	public Short getPointsQ1() {
		return pointsQ1;
	}
	public void setPointsQ1(Short pointsQ1) {
		this.pointsQ1 = pointsQ1;
	}
	
	@Column(name="pointsQ2", nullable=false)
	private Short pointsQ2;
	public Short getPointsQ2() {
		return pointsQ2;
	}
	public void setPointsQ2(Short pointsQ2) {
		this.pointsQ2 = pointsQ2;
	}
	
	@Column(name="pointsQ3", nullable=false)
	private Short pointsQ3;
	public Short getPointsQ3() {
		return pointsQ3;
	}
	public void setPointsQ3(Short pointsQ3) {
		this.pointsQ3 = pointsQ3;
	}
	
	@Column(name="pointsQ4", nullable=false)
	private Short pointsQ4;
	public Short getPointsQ4() {
		return pointsQ4;
	}
	public void setPointsQ4(Short pointsQ4) {
		this.pointsQ4 = pointsQ4;
	}
	
	@Column(name="pointsQ5", nullable=false)
	private Short pointsQ5;
	public Short getPointsQ5() {
		return pointsQ5;
	}
	public void setPointsQ5(Short pointsQ5) {
		this.pointsQ5 = pointsQ5;
	}
	
	@Column(name="pointsQ6", nullable=false)
	private Short pointsQ6;
	public Short getPointsQ6() {
		return pointsQ6;
	}
	public void setPointsQ6(Short pointsQ6) {
		this.pointsQ6 = pointsQ6;
	}
	
	@Column(name="pointsQ7", nullable=false)
	private Short pointsQ7;
	public Short getPointsQ7() {
		return pointsQ7;
	}
	public void setPointsQ7(Short pointsQ7) {
		this.pointsQ7 = pointsQ7;
	}
	
	@Column(name="pointsQ8", nullable=false)
	private Short pointsQ8;
	public Short getPointsQ8() {
		return pointsQ8;
	}
	public void setPointsQ8(Short pointsQ8) {
		this.pointsQ8 = pointsQ8;
	}
	
	@Enumerated(EnumType.STRING)
	@Column(name="opptTeamAbbr", length=3, nullable=false)
	private TeamAbbr opptTeamAbbr;
	public TeamAbbr getOpptTeamAbbr() {
		return opptTeamAbbr;
	}
	public void setOpptTeamAbbr(TeamAbbr opptTeamAbbr) {
		this.opptTeamAbbr = opptTeamAbbr;
	}
	
	@Enumerated(EnumType.STRING)
	@Column(name="opptConference", length=4, nullable=false)
	private Conference opptConference;
	public Conference getOpptConference() {
		return opptConference;
	}
	public void setOpptConference(Conference opptConference) {
		this.opptConference = opptConference;
	}
	
	@Enumerated(EnumType.STRING)
	@Column(name="opptDivision", length=9, nullable=false)
	private Division opptDivision;
	public Division getOpptDivision() {
		return opptDivision;
	}
	public void setOpptDivision(Division opptDivision) {
		this.opptDivision = opptDivision;
	}

	@Column(name="official1LastName", length=25, nullable=false)
	private String official1LastName;
	public String getOfficial1LastName() {
		return official1LastName;
	}
	public void setOfficial1LastName(String official1LastName) {
		this.official1LastName = official1LastName;
	}
	
	@Column(name="official1FirstName", length=25, nullable=false)
	private String official1FirstName;
	public String getOfficial1FirstName() {
		return official1FirstName;
	}
	public void setOfficial1FirstName(String official1FirstName) {
		this.official1FirstName = official1FirstName;
	}
	
	@Column(name="official2LastName", length=25, nullable=false)
	private String official2LastName;
	public String getOfficial2LastName() {
		return official2LastName;
	}
	public void setOfficial2LastName(String official2LastName) {
		this.official2LastName = official2LastName;
	}
	
	@Column(name="official2FirstName", length=35, nullable=false)
	private String official2FirstName;
	public String getOfficial2FirstName() {
		return official2FirstName;
	}
	public void setOfficial2FirstName(String official2FirstName) {
		this.official2FirstName = official2FirstName;
	}
	
	@Column(name="official3LastName", length=25, nullable=false)
	private String official3LastName;
	public String getOfficial3LastName() {
		return official3LastName;
	}
	public void setOfficial3LastName(String official3LastName) {
		this.official3LastName = official3LastName;
	}
	
	@Column(name="official3FirstName", length=25, nullable=false)
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
			.append("  result:    " + this.result)
			.append("  points:    " + this.points)
			.append("  assists:   " + this.assists)
			.append("  turnovers: " + this.turnovers)
			.append("  steals:    " + this.steals)
			.append("  blocks:    " + this.blocks)
			.toString();
	}
}