package models;

import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.running;

import java.math.BigDecimal;
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
        	  assertThat(teamBoxScore.getOfficial1LastName()).isEqualTo("Jones");
          }
        });
    }
    
    @Test
    public void sumTeamBoxScoreSeason() {
        running(fakeApplication(), new Runnable() {
          public void run() {
        	  TeamSummary teamSummary = TeamBoxScore.sumTeamBoxScoreFromDateMaxDate("2013-10-29", "SAC", ProcessingType.online);
        	  assertThat(teamSummary.getTeamAbbr()).isEqualTo(TeamAbbr.SAC);
        	  assertThat(teamSummary.getTeamGamesPlayed()).isEqualTo((short)82);
        	  assertThat(teamSummary.getTeamSumPoints()).isEqualTo((short)8241);
        	  assertThat(teamSummary.getTeamSumAssists()).isEqualTo((short)1547);
        	  assertThat(teamSummary.getTeamSumTurnovers()).isEqualTo((short)1203);
        	  assertThat(teamSummary.getTeamSumSteals()).isEqualTo((short)587);
        	  assertThat(teamSummary.getTeamSumBlocks()).isEqualTo((short)318);
        	  assertThat(teamSummary.getTeamSumPersonalFouls()).isEqualTo((short)1849);
        	  assertThat(teamSummary.getTeamSumFieldGoalAttempts()).isEqualTo((short)6765);
        	  assertThat(teamSummary.getTeamSumFieldGoalMade()).isEqualTo((short)3026);
        	  assertThat(teamSummary.getTeamSumThreePointAttempts()).isEqualTo((short)1475);
        	  assertThat(teamSummary.getTeamSumThreePointMade()).isEqualTo((short)491);
        	  assertThat(teamSummary.getTeamSumFreeThrowAttempts()).isEqualTo((short)2237);
        	  assertThat(teamSummary.getTeamSumFreeThrowMade()).isEqualTo((short)1698);
        	  assertThat(teamSummary.getTeamSumReboundsOffense()).isEqualTo((short)989);
        	  assertThat(teamSummary.getTeamSumReboundsDefense()).isEqualTo((short)2656);
        	  assertThat(teamSummary.getTeamSumReboundsTotal()).isEqualTo((short)3645);
        	  assertThat(teamSummary.getTeamSumPointsQ1()).isEqualTo((short)2071);
        	  assertThat(teamSummary.getTeamSumPointsQ2()).isEqualTo((short)2017);
        	  assertThat(teamSummary.getTeamSumPointsQ3()).isEqualTo((short)2069);
        	  assertThat(teamSummary.getTeamSumPointsQ4()).isEqualTo((short)2008);
        	  assertThat(teamSummary.getTeamPossessions()).isEqualTo(Utilities.roundToBigDecimal((float)94.60, 2));
        	  
        	  assertThat(teamSummary.getOpptSumPoints()).isEqualTo((short)8479);
        	  assertThat(teamSummary.getOpptSumAssists()).isEqualTo((short)1927);
        	  assertThat(teamSummary.getOpptSumTurnovers()).isEqualTo((short)1084);
        	  assertThat(teamSummary.getOpptSumSteals()).isEqualTo((short)637);
        	  assertThat(teamSummary.getOpptSumBlocks()).isEqualTo((short)458);
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
        	  assertThat(leagueSummary.getTeamGamesPlayed()).isEqualTo((int)2456);
        	  assertThat(leagueSummary.getTeamSumPoints()).isEqualTo((int)248084);
        	  assertThat(leagueSummary.getTeamSumAssists()).isEqualTo((int)54054);
        	  assertThat(leagueSummary.getTeamSumTurnovers()).isEqualTo((int)34507);
        	  assertThat(leagueSummary.getTeamSumSteals()).isEqualTo((int)18859);
        	  assertThat(leagueSummary.getTeamSumBlocks()).isEqualTo((int)11572);
        	  assertThat(leagueSummary.getTeamSumPersonalFouls()).isEqualTo((int)50840);
        	  assertThat(leagueSummary.getTeamSumFieldGoalAttempts()).isEqualTo((int)203818);
        	  assertThat(leagueSummary.getTeamSumFieldGoalMade()).isEqualTo((int)92630);
        	  assertThat(leagueSummary.getTeamSumThreePointAttempts()).isEqualTo((int)52894);
        	  assertThat(leagueSummary.getTeamSumThreePointMade()).isEqualTo((int)19030);
        	  assertThat(leagueSummary.getTeamSumFreeThrowAttempts()).isEqualTo((int)57922);
        	  assertThat(leagueSummary.getTeamSumFreeThrowMade()).isEqualTo((int)43794);
        	  assertThat(leagueSummary.getTeamSumReboundsOffense()).isEqualTo((int)26785);
        	  assertThat(leagueSummary.getTeamSumReboundsDefense()).isEqualTo((int)78178);
        	  assertThat(leagueSummary.getTeamSumReboundsTotal()).isEqualTo((int)104963);
        	  assertThat(leagueSummary.getTeamSumPointsQ1()).isEqualTo((int)62225);
        	  assertThat(leagueSummary.getTeamSumPointsQ2()).isEqualTo((int)61924);
        	  assertThat(leagueSummary.getTeamSumPointsQ3()).isEqualTo((int)61070);
        	  assertThat(leagueSummary.getTeamSumPointsQ4()).isEqualTo((int)60855);
        	  
        	  assertThat(leagueSummary.getOpptSumPoints()).isEqualTo((int)248084);
        	  assertThat(leagueSummary.getOpptSumAssists()).isEqualTo((int)54054);
        	  assertThat(leagueSummary.getOpptSumTurnovers()).isEqualTo((int)34507);
        	  assertThat(leagueSummary.getOpptSumSteals()).isEqualTo((int)18859);
        	  assertThat(leagueSummary.getOpptSumBlocks()).isEqualTo((int)11572);
        	  assertThat(leagueSummary.getOpptSumPersonalFouls()).isEqualTo((int)50840);
        	  assertThat(leagueSummary.getOpptSumFieldGoalAttempts()).isEqualTo((int)203818);
        	  assertThat(leagueSummary.getOpptSumFieldGoalMade()).isEqualTo((int)92630);
        	  assertThat(leagueSummary.getOpptSumThreePointAttempts()).isEqualTo((int)52894);
        	  assertThat(leagueSummary.getOpptSumThreePointMade()).isEqualTo((int)19030);
        	  assertThat(leagueSummary.getOpptSumFreeThrowAttempts()).isEqualTo((int)57922);
        	  assertThat(leagueSummary.getOpptSumFreeThrowMade()).isEqualTo((int)43794);
        	  assertThat(leagueSummary.getOpptSumReboundsOffense()).isEqualTo((int)26785);
        	  assertThat(leagueSummary.getOpptSumReboundsDefense()).isEqualTo((int)78178);
        	  assertThat(leagueSummary.getOpptSumReboundsTotal()).isEqualTo((int)104963);
        	  assertThat(leagueSummary.getOpptSumPointsQ1()).isEqualTo((int)62225);
        	  assertThat(leagueSummary.getOpptSumPointsQ2()).isEqualTo((int)61924);
        	  assertThat(leagueSummary.getOpptSumPointsQ3()).isEqualTo((int)61070);
        	  assertThat(leagueSummary.getOpptSumPointsQ4()).isEqualTo((int)60855);
          }
        });
    }
    
    @Test
    public void avgTeamBoxScoreSeason() {
        running(fakeApplication(), new Runnable() {
          public void run() {
        	  TeamSummary teamSummary = TeamBoxScore.sumTeamBoxScoreFromDateMaxDate("2013-10-29", "SAC", ProcessingType.online);
        	  assertThat(teamSummary.getTeamAbbr()).isEqualTo(TeamAbbr.SAC);
        	  assertThat(teamSummary.getTeamGamesPlayed()).isEqualTo((short)82);
        	  assertThat(new BigDecimal(0)).isEqualTo(new BigDecimal(0));
        	  
        	  assertThat(new BigDecimal(teamSummary.getTeamAvgPoints(2).toString())).isEqualTo(Utilities.roundToBigDecimal((float)100.5, 2));
        	  assertThat(teamSummary.getTeamAvgAssists(2)).isEqualTo(Utilities.roundToBigDecimal((float)18.87, 2));
        	  assertThat(teamSummary.getTeamAvgTurnovers()).isEqualTo(Utilities.roundToBigDecimal((float)14.67, 2));
        	  assertThat(teamSummary.getTeamAvgSteals()).isEqualTo(Utilities.roundToBigDecimal((float)7.16, 2));
        	  assertThat(teamSummary.getTeamAvgBlocks()).isEqualTo(Utilities.roundToBigDecimal((float)3.88, 2));
        	  assertThat(teamSummary.getTeamAvgPersonalFouls()).isEqualTo(Utilities.roundToBigDecimal((float)22.55, 2));       	  
        	  assertThat(teamSummary.getTeamAvgFieldGoalAttempts()).isEqualTo(Utilities.roundToBigDecimal((float)82.50, 2));       	         	  
        	  assertThat(teamSummary.getTeamAvgFieldGoalMade()).isEqualTo(Utilities.roundToBigDecimal((float)36.90, 2));
        	  assertThat(teamSummary.getTeamAvgFieldGoalPct()).isEqualTo(Utilities.roundToBigDecimal((float)0.447, 3));
        	  assertThat(teamSummary.getTeamAvgThreePointAttempts()).isEqualTo(Utilities.roundToBigDecimal((float)17.99, 2));
        	  assertThat(teamSummary.getTeamAvgThreePointMade()).isEqualTo(Utilities.roundToBigDecimal((float)5.99, 2));
        	  assertThat(teamSummary.getTeamAvgThreePointPct()).isEqualTo(Utilities.roundToBigDecimal((float)0.333, 3));
        	  assertThat(teamSummary.getTeamAvgFreeThrowAttempts()).isEqualTo(Utilities.roundToBigDecimal((float)27.28, 2));
        	  assertThat(teamSummary.getTeamAvgFreeThrowMade()).isEqualTo(Utilities.roundToBigDecimal((float)20.71, 2));
        	  assertThat(teamSummary.getTeamAvgFreeThrowPct()).isEqualTo(Utilities.roundToBigDecimal((float)0.759, 3));
        	  assertThat(teamSummary.getTeamAvgReboundsOffense()).isEqualTo(Utilities.roundToBigDecimal((float)12.06, 2));
        	  assertThat(teamSummary.getTeamAvgReboundsDefense()).isEqualTo(Utilities.roundToBigDecimal((float)32.39, 2));
        	  assertThat(teamSummary.getTeamAvgReboundsTotal()).isEqualTo(Utilities.roundToBigDecimal((float)44.45, 2));
        	  assertThat(teamSummary.getTeamAvgPointsQ1()).isEqualTo(Utilities.roundToBigDecimal((float)25.26, 2));
        	  assertThat(teamSummary.getTeamAvgPointsQ2()).isEqualTo(Utilities.roundToBigDecimal((float)24.60, 2));
        	  assertThat(teamSummary.getTeamAvgPointsQ3()).isEqualTo(Utilities.roundToBigDecimal((float)25.23, 2));
        	  assertThat(teamSummary.getTeamAvgPointsQ4()).isEqualTo(Utilities.roundToBigDecimal((float)24.49, 2)); 
        	  
        	  assertThat(teamSummary.getOpptAvgPoints(2)).isEqualTo(Utilities.roundToBigDecimal((float)103.40, 2));
        	  assertThat(teamSummary.getOpptAvgAssists(2)).isEqualTo(Utilities.roundToBigDecimal((float)23.50, 2));
        	  assertThat(teamSummary.getOpptAvgTurnovers()).isEqualTo(Utilities.roundToBigDecimal((float)13.22, 2));
        	  assertThat(teamSummary.getOpptAvgSteals()).isEqualTo(Utilities.roundToBigDecimal((float)7.77, 2));
        	  assertThat(teamSummary.getOpptAvgBlocks()).isEqualTo(Utilities.roundToBigDecimal((float)5.59, 2));
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
        	  assertThat(leagueSummary.getTeamGamesPlayed()).isEqualTo((short)2456);
        	  assertThat(leagueSummary.getTeamAvgPoints(2)).isEqualTo(Utilities.roundToBigDecimal((float)101.01, 2));
        	  assertThat(leagueSummary.getTeamAvgAssists(2)).isEqualTo(Utilities.roundToBigDecimal((float)22.01, 2));
        	  assertThat(leagueSummary.getTeamAvgTurnovers()).isEqualTo(Utilities.roundToBigDecimal((float)14.05, 2));
        	  assertThat(leagueSummary.getTeamAvgSteals()).isEqualTo(Utilities.roundToBigDecimal((float)7.68, 2));
        	  assertThat(leagueSummary.getTeamAvgBlocks()).isEqualTo(Utilities.roundToBigDecimal((float)4.71, 2));
        	  assertThat(leagueSummary.getTeamAvgPersonalFouls()).isEqualTo(Utilities.roundToBigDecimal((float)20.70, 2));       	  
        	  assertThat(leagueSummary.getTeamAvgFieldGoalAttempts()).isEqualTo(Utilities.roundToBigDecimal((float)82.99, 2));       	         	  
        	  assertThat(leagueSummary.getTeamAvgFieldGoalMade()).isEqualTo(Utilities.roundToBigDecimal((float)37.72, 2));
        	  assertThat(leagueSummary.getTeamAvgFieldGoalPct()).isEqualTo(Utilities.roundToBigDecimal((float)0.454, 3));
        	  assertThat(leagueSummary.getTeamAvgThreePointAttempts()).isEqualTo(Utilities.roundToBigDecimal((float)21.54, 2));
        	  assertThat(leagueSummary.getTeamAvgThreePointMade()).isEqualTo(Utilities.roundToBigDecimal((float)7.75, 2));
        	  assertThat(leagueSummary.getTeamAvgThreePointPct()).isEqualTo(Utilities.roundToBigDecimal((float)0.360, 3));
        	  assertThat(leagueSummary.getTeamAvgFreeThrowAttempts()).isEqualTo(Utilities.roundToBigDecimal((float)23.58, 2));
        	  assertThat(leagueSummary.getTeamAvgFreeThrowMade()).isEqualTo(Utilities.roundToBigDecimal((float)17.83, 2));
        	  assertThat(leagueSummary.getTeamAvgFreeThrowPct()).isEqualTo(Utilities.roundToBigDecimal((float)0.756, 3));
        	  assertThat(leagueSummary.getTeamAvgReboundsOffense()).isEqualTo(Utilities.roundToBigDecimal((float)10.91, 2));
        	  assertThat(leagueSummary.getTeamAvgReboundsDefense()).isEqualTo(Utilities.roundToBigDecimal((float)31.83, 2));
        	  assertThat(leagueSummary.getTeamAvgReboundsTotal()).isEqualTo(Utilities.roundToBigDecimal((float)42.74, 2));
        	  assertThat(leagueSummary.getTeamAvgPointsQ1()).isEqualTo(Utilities.roundToBigDecimal((float)25.34, 2));
        	  assertThat(leagueSummary.getTeamAvgPointsQ2()).isEqualTo(Utilities.roundToBigDecimal((float)25.21, 2));
        	  assertThat(leagueSummary.getTeamAvgPointsQ3()).isEqualTo(Utilities.roundToBigDecimal((float)24.87, 2));
        	  assertThat(leagueSummary.getTeamAvgPointsQ4()).isEqualTo(Utilities.roundToBigDecimal((float)24.78, 2)); 
        	  
        	  assertThat(leagueSummary.getOpptAvgPoints(2)).isEqualTo(Utilities.roundToBigDecimal((float)101.01, 2));
        	  assertThat(leagueSummary.getOpptAvgAssists(2)).isEqualTo(Utilities.roundToBigDecimal((float)22.01, 2));
        	  assertThat(leagueSummary.getOpptAvgTurnovers()).isEqualTo(Utilities.roundToBigDecimal((float)14.05, 2));
        	  assertThat(leagueSummary.getOpptAvgSteals()).isEqualTo(Utilities.roundToBigDecimal((float)7.68, 2));
        	  assertThat(leagueSummary.getOpptAvgBlocks()).isEqualTo(Utilities.roundToBigDecimal((float)4.71, 2));
        	  assertThat(leagueSummary.getOpptAvgPersonalFouls()).isEqualTo(Utilities.roundToBigDecimal((float)20.70, 2));
        	  assertThat(leagueSummary.getOpptAvgFieldGoalAttempts()).isEqualTo(Utilities.roundToBigDecimal((float)82.99, 2));
        	  assertThat(leagueSummary.getOpptAvgFieldGoalMade()).isEqualTo(Utilities.roundToBigDecimal((float)37.72, 2));
        	  assertThat(leagueSummary.getOpptAvgFieldGoalPct()).isEqualTo(Utilities.roundToBigDecimal((float)0.454, 3));
        	  assertThat(leagueSummary.getOpptAvgThreePointAttempts()).isEqualTo(Utilities.roundToBigDecimal((float)21.54, 2));
        	  assertThat(leagueSummary.getOpptAvgThreePointMade()).isEqualTo(Utilities.roundToBigDecimal((float)7.75, 2));
        	  assertThat(leagueSummary.getOpptAvgThreePointPct()).isEqualTo(Utilities.roundToBigDecimal((float)0.360, 3));
        	  assertThat(leagueSummary.getOpptAvgFreeThrowAttempts()).isEqualTo(Utilities.roundToBigDecimal((float)23.58, 2));
        	  assertThat(leagueSummary.getOpptAvgFreeThrowMade()).isEqualTo(Utilities.roundToBigDecimal((float)17.83, 2));
        	  assertThat(leagueSummary.getOpptAvgFreeThrowPct()).isEqualTo(Utilities.roundToBigDecimal((float)0.756, 3));
        	  assertThat(leagueSummary.getOpptAvgReboundsOffense()).isEqualTo(Utilities.roundToBigDecimal((float)10.91, 2));
        	  assertThat(leagueSummary.getOpptAvgReboundsDefense()).isEqualTo(Utilities.roundToBigDecimal((float)31.83, 2));
        	  assertThat(leagueSummary.getOpptAvgReboundsTotal()).isEqualTo(Utilities.roundToBigDecimal((float)42.74, 2));
        	  assertThat(leagueSummary.getOpptAvgPointsQ1()).isEqualTo(Utilities.roundToBigDecimal((float)25.34, 2));
        	  assertThat(leagueSummary.getOpptAvgPointsQ2()).isEqualTo(Utilities.roundToBigDecimal((float)25.21, 2));
        	  assertThat(leagueSummary.getOpptAvgPointsQ3()).isEqualTo(Utilities.roundToBigDecimal((float)24.87, 2));
        	  assertThat(leagueSummary.getOpptAvgPointsQ4()).isEqualTo(Utilities.roundToBigDecimal((float)24.78, 2));
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
        			  System.out.println("\r" + Utilities.padLeft("Basic Statistics: 2013-2014 Season", 70));
        			  System.out.println("\r" + Utilities.padLeft("Team Totals", 70));
        			  System.out.println(teamSummary.toStringHeader_Basic());
        		  }
            	  System.out.println(teamSummary.toString_TeamTotals_Basic());
        	  }        	  
        	  System.out.println(leagueSummary.toString_TeamTotals_Basic());
        	  
        	  for (int i = 0; i < teams.size(); i++) {
        		  teamSummary = TeamBoxScore.sumTeamBoxScoreFromDateMaxDate("2013-10-29", teams.get(i), ProcessingType.online);
        		  if (i == 0) {
        			  System.out.println("\r" + "Team Averages");
        			  System.out.println(teamSummary.toStringHeader_Basic());
        		  }
            	  System.out.println(teamSummary.toString_TeamAverages_Basic());
        	  }
        	  System.out.println(leagueSummary.toString_TeamAverages_Basic());
        	  
        	  System.out.println(teamSummary.toStringFooter_Basic());
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
        			  System.out.println("\r" + Utilities.padLeft("Basic Statistics: 2013-2014 Season", 70));
        			  System.out.println("\r" + Utilities.padLeft("Team Totals", 70));
        			  System.out.println(teamSummary.toStringHeader_Basic());
        		  }
            	  System.out.println(teamSummary.toString_OpptTotals_Basic());
        	  }
        	  System.out.println(leagueSummary.toString_OpptTotals_Basic());
        	  
        	  for (int i = 0; i < teams.size(); i++) {
        		  teamSummary = TeamBoxScore.sumTeamBoxScoreFromDateMaxDate("2013-10-29", teams.get(i), ProcessingType.online);
        		  if (i == 0) {
        			  System.out.println("\r" + "Oppt Averages");
        			  System.out.println(teamSummary.toStringHeader_Basic());
        		  }
            	  System.out.println(teamSummary.toString_OpptAverages_Basic());
        	  } 
        	  System.out.println(leagueSummary.toString_OpptAverages_Basic());
        	  
        	  System.out.println(teamSummary.toStringFooter_Basic());
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
        			  System.out.println(teamSummary.toStringHeader_Advanced_Offense1());
        		  }
            	  System.out.println(teamSummary.toString_Advanced_Offense1());
        	  }        	  
        	  System.out.println(leagueSummary.toString_Advanced_Offense1());
        	  
        	  System.out.println(teamSummary.toStringFooter_Advanced_Offense1());
          }
        });
    }
    
//  @Ignore
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
      			  System.out.println(teamSummary.toStringHeader_Advanced_Offense2());
      		  }
          	  System.out.println(teamSummary.toString_Advanced_Offense2());
      	  }        	  
      	  System.out.println(leagueSummary.toString_Advanced_Offense2());
      	  
      	  System.out.println(teamSummary.toStringFooter_Advanced_Offense2());
        }
      });
  }
}
