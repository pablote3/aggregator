package models;

import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.running;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import util.Enumerations.ProcessingType;
import util.Enumerations.SeasonType;
import util.Enumerations.TeamAbbr;
import util.Utilities;

public class TeamBoxScoreTest {

    @Test
    public void findTeamBoxScoresDate() {
        running(fakeApplication(), new Runnable() {
          public void run() {
        	  List<TeamBoxScore> games = TeamBoxScore.findByDate("2012-10-31", ProcessingType.online);        
              assertThat(games.size()).isEqualTo(9);
          }
        });
    }
    
    @Test
    public void findTeamBoxScoresDateSizeOnline_Season() {
        running(fakeApplication(), new Runnable() {
          public void run() {
        	  List<TeamBoxScore> teamBoxScores = TeamBoxScore.findByDateSize("2012-10-30", "0", ProcessingType.online);
              assertThat(teamBoxScores.size()).isEqualTo(1229);
          }
        });
    }
    
    @Test
    public void findTeamBoxScoresDateSizeOnline_Week() {
        running(fakeApplication(), new Runnable() {
          public void run() {
        	  List<TeamBoxScore> teamBoxScores = TeamBoxScore.findByDateSize("2012-10-30", "48", ProcessingType.online);
              assertThat(teamBoxScores.size()).isEqualTo(48);
          }
        });
    }
    
    @Test
    public void findTeamBoxScoresDateTeamSizeOnline_Season() {
        running(fakeApplication(), new Runnable() {
          public void run() {
        	  List<TeamBoxScore> teamBoxScores = TeamBoxScore.findByDateTeamSize("2012-10-30", "WAS", "0", ProcessingType.online);
              assertThat(teamBoxScores.size()).isEqualTo(82);
          }
        });
    }
    
    @Test
    public void findTeamBoxScoresDateTeamSizeOnline_Week() {
        running(fakeApplication(), new Runnable() {
          public void run() {
        	  List<TeamBoxScore> teamBoxScores = TeamBoxScore.findByDateTeamSize("2012-10-30", "WAS", "2", ProcessingType.online);
              assertThat(teamBoxScores.size()).isEqualTo(2);
          }
        });
    }
    
    @Test
    public void findTeamBoxScoreDateTeam() {
        running(fakeApplication(), new Runnable() {
          public void run() {
        	  TeamBoxScore teamBoxScore = TeamBoxScore.findByDateTeam("2012-10-31", "SAC", ProcessingType.online);
        	  assertThat(teamBoxScore.getSeasonType()).isEqualTo(SeasonType.regular);
       		  assertThat(teamBoxScore.getOpptPoints()).isEqualTo((short)87);
          }
        });
    }
    
    @Test
    public void sumTeamBoxScoreSeason() {
        running(fakeApplication(), new Runnable() {
          public void run() {
        	  TeamSummary teamSummary = TeamBoxScore.sumTeamBoxScoreFromDateMaxDate("2013-10-29", "SAC", ProcessingType.online);
        	  
        	  assertThat(teamSummary.getGamesPlayed()).isEqualTo((short)82);
        	  assertThat(teamSummary.getSumPossessions().setScale(2, RoundingMode.HALF_UP)).isEqualTo(Utilities.roundToBigDecimal((float)7796.56, 2));
        	  assertThat(teamSummary.getAvgPace(2)).isEqualTo(Utilities.roundToBigDecimal((float)94.37, 2));
        	  
        	  assertThat(teamSummary.getTeamAbbr()).isEqualTo(TeamAbbr.SAC);
        	  assertThat(teamSummary.getTeamSumPoints()).isEqualTo((short)8241);
        	  assertThat(teamSummary.getTeamSumAssists()).isEqualTo((short)1547);
        	  assertThat(teamSummary.getTeamSumTurnovers()).isEqualTo((short)1249);
        	  assertThat(teamSummary.getTeamSumSteals()).isEqualTo((short)587);
        	  assertThat(teamSummary.getTeamSumBlocks()).isEqualTo((short)318);
        	  assertThat(teamSummary.getTeamSumPersonalFouls()).isEqualTo((short)1849);
        	  assertThat(teamSummary.getTeamSumFieldGoalAttempts()).isEqualTo((short)6766);
        	  assertThat(teamSummary.getTeamSumFieldGoalMade()).isEqualTo((short)3026);
        	  assertThat(teamSummary.getTeamSumThreePointAttempts()).isEqualTo((short)1475);
        	  assertThat(teamSummary.getTeamSumThreePointMade()).isEqualTo((short)491);
        	  assertThat(teamSummary.getTeamSumFreeThrowAttempts()).isEqualTo((short)2237);
        	  assertThat(teamSummary.getTeamSumFreeThrowMade()).isEqualTo((short)1698);
        	  assertThat(teamSummary.getTeamSumReboundsOffense()).isEqualTo((short)990);
        	  assertThat(teamSummary.getTeamSumReboundsDefense()).isEqualTo((short)2656);
        	  assertThat(teamSummary.getTeamSumReboundsTotal()).isEqualTo((short)3646);
        	  assertThat(teamSummary.getTeamSumPointsQ1()).isEqualTo((short)2071);
        	  assertThat(teamSummary.getTeamSumPointsQ2()).isEqualTo((short)2017);
        	  assertThat(teamSummary.getTeamSumPointsQ3()).isEqualTo((short)2069);
        	  assertThat(teamSummary.getTeamSumPointsQ4()).isEqualTo((short)2008);
        	  
        	  assertThat(teamSummary.getOpptSumPoints()).isEqualTo((short)8479);
        	  assertThat(teamSummary.getOpptSumAssists()).isEqualTo((short)1927);
        	  assertThat(teamSummary.getOpptSumTurnovers()).isEqualTo((short)1116);
        	  assertThat(teamSummary.getOpptSumSteals()).isEqualTo((short)637);
        	  assertThat(teamSummary.getOpptSumBlocks()).isEqualTo((short)459);
        	  assertThat(teamSummary.getOpptSumPersonalFouls()).isEqualTo((short)1897);
        	  assertThat(teamSummary.getOpptSumFieldGoalAttempts()).isEqualTo((short)6734);
        	  assertThat(teamSummary.getOpptSumFieldGoalMade()).isEqualTo((short)3103);
        	  assertThat(teamSummary.getOpptSumThreePointAttempts()).isEqualTo((short)1833);
        	  assertThat(teamSummary.getOpptSumThreePointMade()).isEqualTo((short)696);
        	  assertThat(teamSummary.getOpptSumFreeThrowAttempts()).isEqualTo((short)2139);
        	  assertThat(teamSummary.getOpptSumFreeThrowMade()).isEqualTo((short)1577);
        	  assertThat(teamSummary.getOpptSumReboundsOffense()).isEqualTo((short)813);
        	  assertThat(teamSummary.getOpptSumReboundsDefense()).isEqualTo((short)2568);
        	  assertThat(teamSummary.getOpptSumReboundsTotal()).isEqualTo((short)3381);
        	  assertThat(teamSummary.getOpptSumPointsQ1()).isEqualTo((short)2147);
        	  assertThat(teamSummary.getOpptSumPointsQ2()).isEqualTo((short)2173);
        	  assertThat(teamSummary.getOpptSumPointsQ3()).isEqualTo((short)2006);
        	  assertThat(teamSummary.getOpptSumPointsQ4()).isEqualTo((short)2092);
          }
        });
    }
    
    @Test
    public void sumLeagueTeamBoxScoreSeason() {
        running(fakeApplication(), new Runnable() {
          public void run() {
        	  TeamSummary leagueSummary = TeamBoxScore.sumLeagueBoxScoreFromDateMaxDate("2013-10-29", ProcessingType.online);
        	  assertThat(leagueSummary.getGamesPlayed()).isEqualTo((int)2460);
        	  assertThat(leagueSummary.getTeamSumPoints()).isEqualTo((int)248482);
        	  assertThat(leagueSummary.getTeamSumAssists()).isEqualTo((int)54131);
        	  assertThat(leagueSummary.getTeamSumTurnovers()).isEqualTo((int)36040);
        	  assertThat(leagueSummary.getTeamSumSteals()).isEqualTo((int)18895);
        	  assertThat(leagueSummary.getTeamSumBlocks()).isEqualTo((int)11594);
        	  assertThat(leagueSummary.getTeamSumPersonalFouls()).isEqualTo((int)50923);
        	  assertThat(leagueSummary.getTeamSumFieldGoalAttempts()).isEqualTo((int)204172);
        	  assertThat(leagueSummary.getTeamSumFieldGoalMade()).isEqualTo((int)92779);
        	  assertThat(leagueSummary.getTeamSumThreePointAttempts()).isEqualTo((int)52974);
        	  assertThat(leagueSummary.getTeamSumThreePointMade()).isEqualTo((int)19054);
        	  assertThat(leagueSummary.getTeamSumFreeThrowAttempts()).isEqualTo((int)58029);
        	  assertThat(leagueSummary.getTeamSumFreeThrowMade()).isEqualTo((int)43870);
        	  assertThat(leagueSummary.getTeamSumReboundsOffense()).isEqualTo((int)26846);
        	  assertThat(leagueSummary.getTeamSumReboundsDefense()).isEqualTo((int)78315);
        	  assertThat(leagueSummary.getTeamSumReboundsTotal()).isEqualTo((int)105161);
        	  assertThat(leagueSummary.getTeamSumPointsQ1()).isEqualTo((int)62333);
        	  assertThat(leagueSummary.getTeamSumPointsQ2()).isEqualTo((int)62014);
        	  assertThat(leagueSummary.getTeamSumPointsQ3()).isEqualTo((int)61179);
        	  assertThat(leagueSummary.getTeamSumPointsQ4()).isEqualTo((int)60946);
        	  
        	  assertThat(leagueSummary.getOpptSumPoints()).isEqualTo((int)248482);
        	  assertThat(leagueSummary.getOpptSumAssists()).isEqualTo((int)54131);
        	  assertThat(leagueSummary.getOpptSumTurnovers()).isEqualTo((int)36040);
        	  assertThat(leagueSummary.getOpptSumSteals()).isEqualTo((int)18895);
        	  assertThat(leagueSummary.getOpptSumBlocks()).isEqualTo((int)11594);
        	  assertThat(leagueSummary.getOpptSumPersonalFouls()).isEqualTo((int)50923);
        	  assertThat(leagueSummary.getOpptSumFieldGoalAttempts()).isEqualTo((int)204172);
        	  assertThat(leagueSummary.getOpptSumFieldGoalMade()).isEqualTo((int)92779);
        	  assertThat(leagueSummary.getOpptSumThreePointAttempts()).isEqualTo((int)52974);
        	  assertThat(leagueSummary.getOpptSumThreePointMade()).isEqualTo((int)19054);
        	  assertThat(leagueSummary.getOpptSumFreeThrowAttempts()).isEqualTo((int)58029);
        	  assertThat(leagueSummary.getOpptSumFreeThrowMade()).isEqualTo((int)43870);
        	  assertThat(leagueSummary.getOpptSumReboundsOffense()).isEqualTo((int)26846);
        	  assertThat(leagueSummary.getOpptSumReboundsDefense()).isEqualTo((int)78315);
        	  assertThat(leagueSummary.getOpptSumReboundsTotal()).isEqualTo((int)105161);
        	  assertThat(leagueSummary.getOpptSumPointsQ1()).isEqualTo((int)62333);
        	  assertThat(leagueSummary.getOpptSumPointsQ2()).isEqualTo((int)62014);
        	  assertThat(leagueSummary.getOpptSumPointsQ3()).isEqualTo((int)61179);
        	  assertThat(leagueSummary.getOpptSumPointsQ4()).isEqualTo((int)60946);
          }
        });
    }
    
    @Test
    public void avgTeamBoxScoreSeason() {
        running(fakeApplication(), new Runnable() {
          public void run() {
        	  TeamSummary teamSummary = TeamBoxScore.sumTeamBoxScoreFromDateMaxDate("2013-10-29", "SAC", ProcessingType.online);
        	  assertThat(teamSummary.getGamesPlayed()).isEqualTo((short)82);
        	  assertThat(teamSummary.getTeamAbbr()).isEqualTo(TeamAbbr.SAC);
        	  assertThat(new BigDecimal(0)).isEqualTo(new BigDecimal(0));
        	  
        	  assertThat(new BigDecimal(teamSummary.getTeamAvgPoints(2).toString())).isEqualTo(Utilities.roundToBigDecimal((float)100.5, 2));
        	  assertThat(teamSummary.getTeamAvgAssists(2)).isEqualTo(Utilities.roundToBigDecimal((float)18.87, 2));
        	  assertThat(teamSummary.getTeamAvgTurnovers()).isEqualTo(Utilities.roundToBigDecimal((float)15.23, 2));
        	  assertThat(teamSummary.getTeamAvgSteals()).isEqualTo(Utilities.roundToBigDecimal((float)7.16, 2));
        	  assertThat(teamSummary.getTeamAvgBlocks()).isEqualTo(Utilities.roundToBigDecimal((float)3.88, 2));
        	  assertThat(teamSummary.getTeamAvgPersonalFouls()).isEqualTo(Utilities.roundToBigDecimal((float)22.55, 2));       	  
        	  assertThat(teamSummary.getTeamAvgFieldGoalAttempts()).isEqualTo(Utilities.roundToBigDecimal((float)82.51, 2));       	         	  
        	  assertThat(teamSummary.getTeamAvgFieldGoalMade()).isEqualTo(Utilities.roundToBigDecimal((float)36.90, 2));
        	  assertThat(teamSummary.getTeamAvgFieldGoalPct()).isEqualTo(Utilities.roundToBigDecimal((float)0.447, 3));
        	  assertThat(teamSummary.getTeamAvgThreePointAttempts()).isEqualTo(Utilities.roundToBigDecimal((float)17.99, 2));
        	  assertThat(teamSummary.getTeamAvgThreePointMade()).isEqualTo(Utilities.roundToBigDecimal((float)5.99, 2));
        	  assertThat(teamSummary.getTeamAvgThreePointPct()).isEqualTo(Utilities.roundToBigDecimal((float)0.333, 3));
        	  assertThat(teamSummary.getTeamAvgFreeThrowAttempts()).isEqualTo(Utilities.roundToBigDecimal((float)27.28, 2));
        	  assertThat(teamSummary.getTeamAvgFreeThrowMade()).isEqualTo(Utilities.roundToBigDecimal((float)20.71, 2));
        	  assertThat(teamSummary.getTeamAvgFreeThrowPct()).isEqualTo(Utilities.roundToBigDecimal((float)0.759, 3));
        	  assertThat(teamSummary.getTeamAvgReboundsOffense()).isEqualTo(Utilities.roundToBigDecimal((float)12.07, 2));
        	  assertThat(teamSummary.getTeamAvgReboundsDefense()).isEqualTo(Utilities.roundToBigDecimal((float)32.39, 2));
        	  assertThat(teamSummary.getTeamAvgReboundsTotal()).isEqualTo(Utilities.roundToBigDecimal((float)44.46, 2));
        	  assertThat(teamSummary.getTeamAvgPointsQ1()).isEqualTo(Utilities.roundToBigDecimal((float)25.26, 2));
        	  assertThat(teamSummary.getTeamAvgPointsQ2()).isEqualTo(Utilities.roundToBigDecimal((float)24.60, 2));
        	  assertThat(teamSummary.getTeamAvgPointsQ3()).isEqualTo(Utilities.roundToBigDecimal((float)25.23, 2));
        	  assertThat(teamSummary.getTeamAvgPointsQ4()).isEqualTo(Utilities.roundToBigDecimal((float)24.49, 2)); 
        	  
        	  assertThat(teamSummary.getOpptAvgPoints(2)).isEqualTo(Utilities.roundToBigDecimal((float)103.40, 2));
        	  assertThat(teamSummary.getOpptAvgAssists(2)).isEqualTo(Utilities.roundToBigDecimal((float)23.50, 2));
        	  assertThat(teamSummary.getOpptAvgTurnovers()).isEqualTo(Utilities.roundToBigDecimal((float)13.61, 2));
        	  assertThat(teamSummary.getOpptAvgSteals()).isEqualTo(Utilities.roundToBigDecimal((float)7.77, 2));
        	  assertThat(teamSummary.getOpptAvgBlocks()).isEqualTo(Utilities.roundToBigDecimal((float)5.60, 2));
        	  assertThat(teamSummary.getOpptAvgPersonalFouls()).isEqualTo(Utilities.roundToBigDecimal((float)23.13, 2));
        	  assertThat(teamSummary.getOpptAvgFieldGoalAttempts()).isEqualTo(Utilities.roundToBigDecimal((float)82.12, 2));
        	  assertThat(teamSummary.getOpptAvgFieldGoalMade()).isEqualTo(Utilities.roundToBigDecimal((float)37.84, 2));
        	  assertThat(teamSummary.getOpptAvgFieldGoalPct()).isEqualTo(Utilities.roundToBigDecimal((float)0.461, 3));
        	  assertThat(teamSummary.getOpptAvgThreePointAttempts()).isEqualTo(Utilities.roundToBigDecimal((float)22.35, 2));
        	  assertThat(teamSummary.getOpptAvgThreePointMade()).isEqualTo(Utilities.roundToBigDecimal((float)8.49, 2));
        	  assertThat(teamSummary.getOpptAvgThreePointPct()).isEqualTo(Utilities.roundToBigDecimal((float)0.380, 3));
        	  assertThat(teamSummary.getOpptAvgFreeThrowAttempts()).isEqualTo(Utilities.roundToBigDecimal((float)26.09, 2));
        	  assertThat(teamSummary.getOpptAvgFreeThrowMade()).isEqualTo(Utilities.roundToBigDecimal((float)19.23, 2));
        	  assertThat(teamSummary.getOpptAvgFreeThrowPct()).isEqualTo(Utilities.roundToBigDecimal((float)0.737, 3));
        	  assertThat(teamSummary.getOpptAvgReboundsOffense()).isEqualTo(Utilities.roundToBigDecimal((float)9.91, 2));
        	  assertThat(teamSummary.getOpptAvgReboundsDefense()).isEqualTo(Utilities.roundToBigDecimal((float)31.32, 2));
        	  assertThat(teamSummary.getOpptAvgReboundsTotal()).isEqualTo(Utilities.roundToBigDecimal((float)41.23, 2));
        	  assertThat(teamSummary.getOpptAvgPointsQ1()).isEqualTo(Utilities.roundToBigDecimal((float)26.18, 2));
        	  assertThat(teamSummary.getOpptAvgPointsQ2()).isEqualTo(Utilities.roundToBigDecimal((float)26.50, 2));
        	  assertThat(teamSummary.getOpptAvgPointsQ3()).isEqualTo(Utilities.roundToBigDecimal((float)24.46, 2));
        	  assertThat(teamSummary.getOpptAvgPointsQ4()).isEqualTo(Utilities.roundToBigDecimal((float)25.51, 2));
          }
        });
    }
    
    @Test
    public void avgLeagueBoxScoreSeason() {
        running(fakeApplication(), new Runnable() {
          public void run() {
        	  TeamSummary leagueSummary = TeamBoxScore.sumLeagueBoxScoreFromDateMaxDate("2013-10-29", ProcessingType.online);
        	  assertThat(leagueSummary.getGamesPlayed()).isEqualTo((short)2460);
        	  assertThat(leagueSummary.getTeamAvgPoints(2)).isEqualTo(Utilities.roundToBigDecimal((float)101.01, 2));
        	  assertThat(leagueSummary.getTeamAvgAssists(2)).isEqualTo(Utilities.roundToBigDecimal((float)22.00, 2));
        	  assertThat(leagueSummary.getTeamAvgTurnovers()).isEqualTo(Utilities.roundToBigDecimal((float)14.65, 2));
        	  assertThat(leagueSummary.getTeamAvgSteals()).isEqualTo(Utilities.roundToBigDecimal((float)7.68, 2));
        	  assertThat(leagueSummary.getTeamAvgBlocks()).isEqualTo(Utilities.roundToBigDecimal((float)4.71, 2));
        	  assertThat(leagueSummary.getTeamAvgPersonalFouls()).isEqualTo(Utilities.roundToBigDecimal((float)20.70, 2));       	  
        	  assertThat(leagueSummary.getTeamAvgFieldGoalAttempts()).isEqualTo(Utilities.roundToBigDecimal((float)83.00, 2));       	         	  
        	  assertThat(leagueSummary.getTeamAvgFieldGoalMade()).isEqualTo(Utilities.roundToBigDecimal((float)37.72, 2));
        	  assertThat(leagueSummary.getTeamAvgFieldGoalPct()).isEqualTo(Utilities.roundToBigDecimal((float)0.454, 3));
        	  assertThat(leagueSummary.getTeamAvgThreePointAttempts()).isEqualTo(Utilities.roundToBigDecimal((float)21.53, 2));
        	  assertThat(leagueSummary.getTeamAvgThreePointMade()).isEqualTo(Utilities.roundToBigDecimal((float)7.75, 2));
        	  assertThat(leagueSummary.getTeamAvgThreePointPct()).isEqualTo(Utilities.roundToBigDecimal((float)0.360, 3));
        	  assertThat(leagueSummary.getTeamAvgFreeThrowAttempts()).isEqualTo(Utilities.roundToBigDecimal((float)23.59, 2));
        	  assertThat(leagueSummary.getTeamAvgFreeThrowMade()).isEqualTo(Utilities.roundToBigDecimal((float)17.83, 2));
        	  assertThat(leagueSummary.getTeamAvgFreeThrowPct()).isEqualTo(Utilities.roundToBigDecimal((float)0.756, 3));
        	  assertThat(leagueSummary.getTeamAvgReboundsOffense()).isEqualTo(Utilities.roundToBigDecimal((float)10.91, 2));
        	  assertThat(leagueSummary.getTeamAvgReboundsDefense()).isEqualTo(Utilities.roundToBigDecimal((float)31.84, 2));
        	  assertThat(leagueSummary.getTeamAvgReboundsTotal()).isEqualTo(Utilities.roundToBigDecimal((float)42.75, 2));
        	  assertThat(leagueSummary.getTeamAvgPointsQ1()).isEqualTo(Utilities.roundToBigDecimal((float)25.34, 2));
        	  assertThat(leagueSummary.getTeamAvgPointsQ2()).isEqualTo(Utilities.roundToBigDecimal((float)25.21, 2));
        	  assertThat(leagueSummary.getTeamAvgPointsQ3()).isEqualTo(Utilities.roundToBigDecimal((float)24.87, 2));
        	  assertThat(leagueSummary.getTeamAvgPointsQ4()).isEqualTo(Utilities.roundToBigDecimal((float)24.77, 2)); 
        	  
        	  assertThat(leagueSummary.getOpptAvgPoints(2)).isEqualTo(Utilities.roundToBigDecimal((float)101.01, 2));
        	  assertThat(leagueSummary.getOpptAvgAssists(2)).isEqualTo(Utilities.roundToBigDecimal((float)22.00, 2));
        	  assertThat(leagueSummary.getOpptAvgTurnovers()).isEqualTo(Utilities.roundToBigDecimal((float)14.65, 2));
        	  assertThat(leagueSummary.getOpptAvgSteals()).isEqualTo(Utilities.roundToBigDecimal((float)7.68, 2));
        	  assertThat(leagueSummary.getOpptAvgBlocks()).isEqualTo(Utilities.roundToBigDecimal((float)4.71, 2));
        	  assertThat(leagueSummary.getOpptAvgPersonalFouls()).isEqualTo(Utilities.roundToBigDecimal((float)20.70, 2));
        	  assertThat(leagueSummary.getOpptAvgFieldGoalAttempts()).isEqualTo(Utilities.roundToBigDecimal((float)83.00, 2));
        	  assertThat(leagueSummary.getOpptAvgFieldGoalMade()).isEqualTo(Utilities.roundToBigDecimal((float)37.72, 2));
        	  assertThat(leagueSummary.getOpptAvgFieldGoalPct()).isEqualTo(Utilities.roundToBigDecimal((float)0.454, 3));
        	  assertThat(leagueSummary.getOpptAvgThreePointAttempts()).isEqualTo(Utilities.roundToBigDecimal((float)21.53, 2));
        	  assertThat(leagueSummary.getOpptAvgThreePointMade()).isEqualTo(Utilities.roundToBigDecimal((float)7.75, 2));
        	  assertThat(leagueSummary.getOpptAvgThreePointPct()).isEqualTo(Utilities.roundToBigDecimal((float)0.360, 3));
        	  assertThat(leagueSummary.getOpptAvgFreeThrowAttempts()).isEqualTo(Utilities.roundToBigDecimal((float)23.59, 2));
        	  assertThat(leagueSummary.getOpptAvgFreeThrowMade()).isEqualTo(Utilities.roundToBigDecimal((float)17.83, 2));
        	  assertThat(leagueSummary.getOpptAvgFreeThrowPct()).isEqualTo(Utilities.roundToBigDecimal((float)0.756, 3));
        	  assertThat(leagueSummary.getOpptAvgReboundsOffense()).isEqualTo(Utilities.roundToBigDecimal((float)10.91, 2));
        	  assertThat(leagueSummary.getOpptAvgReboundsDefense()).isEqualTo(Utilities.roundToBigDecimal((float)31.84, 2));
        	  assertThat(leagueSummary.getOpptAvgReboundsTotal()).isEqualTo(Utilities.roundToBigDecimal((float)42.75, 2));
        	  assertThat(leagueSummary.getOpptAvgPointsQ1()).isEqualTo(Utilities.roundToBigDecimal((float)25.34, 2));
        	  assertThat(leagueSummary.getOpptAvgPointsQ2()).isEqualTo(Utilities.roundToBigDecimal((float)25.21, 2));
        	  assertThat(leagueSummary.getOpptAvgPointsQ3()).isEqualTo(Utilities.roundToBigDecimal((float)24.87, 2));
        	  assertThat(leagueSummary.getOpptAvgPointsQ4()).isEqualTo(Utilities.roundToBigDecimal((float)24.77, 2));
          }
        });
    }
    
    @Ignore
    @Test
    public void boxScoresBasicTeam() {
        running(fakeApplication(), new Runnable() {
          public void run() {
        	  ArrayList<String> teams = Utilities.teamList();
        	  TeamSummary leagueSummary = TeamBoxScore.sumLeagueBoxScoreFromDateMaxDate("2013-10-29", ProcessingType.online);
        	  TeamSummary teamSummary = null;
        	  
        	  for (int i = 0; i < teams.size(); i++) {
        		  teamSummary = TeamBoxScore.sumTeamBoxScoreFromDateMaxDate("2013-10-29", teams.get(i), ProcessingType.online);
        		  if (i == 0) {
        			  System.out.println("\r" + Utilities.padLeft("Basic Statistics - Team: 2013-2014 Season", 85));
        			  System.out.println("\r" + "Team Totals");
        			  System.out.println(ReportHelper.toStringHeader_Basic());
        		  }
            	  System.out.println(ReportHelper.toString_TeamTotals_Basic(teamSummary));
        	  }        	  
        	  System.out.println(ReportHelper.toString_TeamTotals_Basic(leagueSummary));
        	  
        	  for (int i = 0; i < teams.size(); i++) {
        		  teamSummary = TeamBoxScore.sumTeamBoxScoreFromDateMaxDate("2013-10-29", teams.get(i), ProcessingType.online);
        		  if (i == 0) {
        			  System.out.println("\r" + "Team Averages");
        			  System.out.println(ReportHelper.toStringHeader_Basic());
        		  }
            	  System.out.println(ReportHelper.toString_TeamAverages_Basic(teamSummary));
        	  }
        	  System.out.println(ReportHelper.toString_TeamAverages_Basic(leagueSummary));
        	  
        	  System.out.println(ReportHelper.toStringFooter_Basic());
          }
        });
    }
    
//    @Ignore
    @Test
    public void boxScoresBasicTeam_PaceAdjusted() {
        running(fakeApplication(), new Runnable() {
          public void run() {
        	  ArrayList<String> teams = Utilities.teamList();
        	  TeamSummary leagueSummary = TeamBoxScore.sumLeagueBoxScoreFromDateMaxDate("2013-10-29", ProcessingType.online);
        	  TeamSummary teamSummary = null;
        	  
        	  for (int i = 0; i < teams.size(); i++) {
        		  teamSummary = TeamBoxScore.sumTeamBoxScoreFromDateMaxDate("2013-10-29", teams.get(i), ProcessingType.online);
        		  if (i == 0) {
        			  System.out.println("\r" + Utilities.padLeft("Basic Statistics - Team: 2013-2014 Season", 85));
        			  System.out.println("\r" + "Team Totals");
        			  System.out.println(ReportHelper.toStringHeader_Basic());
        		  }
            	  System.out.println(ReportHelper.toString_TeamTotals_Basic_PaceAdjusted(teamSummary));
        	  }        	  
        	  System.out.println(ReportHelper.toString_TeamTotals_Basic_PaceAdjusted(leagueSummary));
        	  
        	  for (int i = 0; i < teams.size(); i++) {
        		  teamSummary = TeamBoxScore.sumTeamBoxScoreFromDateMaxDate("2013-10-29", teams.get(i), ProcessingType.online);
        		  if (i == 0) {
        			  System.out.println("\r" + "Team Averages - Pace Adjusted");
        			  System.out.println(ReportHelper.toStringHeader_Basic());
        		  }
            	  System.out.println(ReportHelper.toString_TeamAverages_Basic(teamSummary));
        	  }
        	  System.out.println(ReportHelper.toString_TeamAverages_Basic(leagueSummary));
        	  
        	  System.out.println(ReportHelper.toStringFooter_Basic());
          }
        });
    }
    
    @Ignore
    @Test
    public void boxScoresBasicOppt() {
        running(fakeApplication(), new Runnable() {
          public void run() {
        	  ArrayList<String> teams = Utilities.teamList();
        	  TeamSummary leagueSummary = TeamBoxScore.sumLeagueBoxScoreFromDateMaxDate("2013-10-29", ProcessingType.online);
        	  TeamSummary teamSummary = null;
        	  
        	  for (int i = 0; i < teams.size(); i++) {
        		  teamSummary = TeamBoxScore.sumTeamBoxScoreFromDateMaxDate("2013-10-29", teams.get(i), ProcessingType.online);
        		  if (i == 0) {
        			  System.out.println("\r" + Utilities.padLeft("Basic Statistics - Oppt: 2013-2014 Season", 85));
        			  System.out.println("\r" + "Oppt Totals");
        			  System.out.println(ReportHelper.toStringHeader_Basic());
        		  }
            	  System.out.println(ReportHelper.toString_OpptTotals_Basic(teamSummary));
        	  }
        	  System.out.println(ReportHelper.toString_OpptTotals_Basic(leagueSummary));
        	  
        	  for (int i = 0; i < teams.size(); i++) {
        		  teamSummary = TeamBoxScore.sumTeamBoxScoreFromDateMaxDate("2013-10-29", teams.get(i), ProcessingType.online);
        		  if (i == 0) {
        			  System.out.println("\r" + "Oppt Averages");
        			  System.out.println(ReportHelper.toStringHeader_Basic());
        		  }
            	  System.out.println(ReportHelper.toString_OpptAverages_Basic(teamSummary));
        	  } 
        	  System.out.println(ReportHelper.toString_OpptAverages_Basic(leagueSummary));
        	  
        	  System.out.println(ReportHelper.toStringFooter_Basic());
          }
        });
    }
    
    @Ignore
    @Test
    public void boxScoresAdvanced() {
        running(fakeApplication(), new Runnable() {
          public void run() {
        	  ArrayList<String> teams = Utilities.teamList();
        	  TeamSummary leagueSummary = TeamBoxScore.sumLeagueBoxScoreFromDateMaxDate("2013-10-29", ProcessingType.online);
        	  TeamSummary teamSummary = null;
        	  
        	  for (int i = 0; i < teams.size(); i++) {
        		  teamSummary = TeamBoxScore.sumTeamBoxScoreFromDateMaxDate("2013-10-29", teams.get(i), ProcessingType.online);
        		  if (i == 0) {
        			  System.out.println("\r" + Utilities.padLeft("Advanced Statistics - Team: 2013-2014 Season", 80));
        			  System.out.println("\r" + "Team Totals");
        			  System.out.println(ReportHelper.toStringHeader_Advanced());
        		  }
            	  System.out.println(ReportHelper.toString_Team_Advanced(teamSummary));
        	  }
        	  System.out.println(ReportHelper.toString_Team_Advanced(leagueSummary));
        	  
        	  System.out.println(ReportHelper.toStringFooter_Advanced());
          }
        });
    }
    
    @Ignore
    @Test
    public void boxScoresAdvancedOffense1() {
        running(fakeApplication(), new Runnable() {
          public void run() {
        	  ArrayList<String> teams = Utilities.teamList();
        	  TeamSummary leagueSummary = TeamBoxScore.sumLeagueBoxScoreFromDateMaxDate("2013-10-29", ProcessingType.online);
        	  TeamSummary teamSummary = null;
        	  
        	  for (int i = 0; i < teams.size(); i++) {
        		  teamSummary = TeamBoxScore.sumTeamBoxScoreFromDateMaxDate("2013-10-29", teams.get(i), ProcessingType.online);
        		  if (i == 0) {
        			  System.out.println(Utilities.padLeft("Advanced Statistics: 2013-2014 Season", 109));
        			  System.out.println(Utilities.padLeft("Offensive Stats 1", 99) + "\n");
        			  System.out.println(ReportHelper.toStringHeader_Advanced_Offense1());
        		  }
            	  System.out.println(ReportHelper.toString_Advanced_Offense1(teamSummary));
        	  }        	  
        	  System.out.println(ReportHelper.toString_Advanced_Offense1(leagueSummary));
        	  
        	  System.out.println(ReportHelper.toStringFooter_Advanced_Offense1());
          }
        });
    }
    
  @Ignore
  @Test
  public void boxScoresAdvancedOffense2() {
      running(fakeApplication(), new Runnable() {
        public void run() {
      	  ArrayList<String> teams = Utilities.teamList();
      	  TeamSummary leagueSummary = TeamBoxScore.sumLeagueBoxScoreFromDateMaxDate("2013-10-29", ProcessingType.online);
      	  TeamSummary teamSummary = null;
      	  
      	  for (int i = 0; i < teams.size(); i++) {
      		  teamSummary = TeamBoxScore.sumTeamBoxScoreFromDateMaxDate("2013-10-29", teams.get(i), ProcessingType.online);
      		  if (i == 0) {
      			  System.out.println(Utilities.padLeft("Advanced Statistics: 2013-2014 Season", 109));
      			  System.out.println(Utilities.padLeft("Offensive Stats 2", 99) + "\n");
      			  System.out.println(ReportHelper.toStringHeader_Advanced_Offense2());
      		  }
          	  System.out.println(ReportHelper.toString_Advanced_Offense2(teamSummary));
      	  }        	  
      	  System.out.println(ReportHelper.toString_Advanced_Offense2(leagueSummary));
      	  
      	  System.out.println(ReportHelper.toStringFooter_Advanced_Offense2());
        }
      });
  }
  
  @Ignore
  @Test
  public void boxScoresAdvancedDefense() {
      running(fakeApplication(), new Runnable() {
        public void run() {
      	  ArrayList<String> teams = Utilities.teamList();
      	  TeamSummary leagueSummary = TeamBoxScore.sumLeagueBoxScoreFromDateMaxDate("2013-10-29", ProcessingType.online);
      	  TeamSummary teamSummary = null;
      	  
      	  for (int i = 0; i < teams.size(); i++) {
      		  teamSummary = TeamBoxScore.sumTeamBoxScoreFromDateMaxDate("2013-10-29", teams.get(i), ProcessingType.online);
      		  if (i == 0) {
      			  System.out.println(Utilities.padLeft("Advanced Statistics: 2013-2014 Season", 109));
      			  System.out.println(Utilities.padLeft("Defensive Stats", 99) + "\n");
      			  System.out.println(ReportHelper.toStringHeader_Advanced_Defense());
      		  }
          	  System.out.println(ReportHelper.toString_Advanced_Defense(teamSummary));
      	  }        	  
      	  System.out.println(ReportHelper.toString_Advanced_Defense(leagueSummary));
      	  
      	  System.out.println(ReportHelper.toStringFooter_Advanced_Defense());
        }
      });
  }
  
  @Ignore
  @Test
  public void boxScoresAdvancedEfficiency() {
      running(fakeApplication(), new Runnable() {
        public void run() {
      	  ArrayList<String> teams = Utilities.teamList();
      	  TeamSummary leagueSummary = TeamBoxScore.sumLeagueBoxScoreFromDateMaxDate("2013-10-29", ProcessingType.online);
      	  TeamSummary teamSummary = null;
      	  
      	  for (int i = 0; i < teams.size(); i++) {
      		  teamSummary = TeamBoxScore.sumTeamBoxScoreFromDateMaxDate("2013-10-29", teams.get(i), ProcessingType.online);
      		  if (i == 0) {
      			  System.out.println(Utilities.padLeft("Advanced Statistics: 2013-2014 Season", 109));
      			  System.out.println(Utilities.padLeft("Efficiency Stats", 99) + "\n");
      			  System.out.println(ReportHelper.toStringHeader_Advanced_Efficiency());
      		  }
          	  System.out.println(ReportHelper.toString_Advanced_Efficiency(teamSummary));
      	  }        	  
      	  System.out.println(ReportHelper.toString_Advanced_Efficiency(leagueSummary));
      	  
      	  System.out.println(ReportHelper.toStringFooter_Advanced_Efficiency());
        }
      });
  }
}
