package models;

import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.running;

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
        	  assertThat(leagueSummary.getSumGamesPlayed()).isEqualTo((int)2456);
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
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getTeamAvgPoints(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)100.5, 2));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getTeamAvgAssists(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)18.87, 2));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getTeamAvgTurnovers(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)14.67, 2));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getTeamAvgSteals(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)7.16, 2));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getTeamAvgBlocks(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)3.88, 2));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getTeamAvgPersonalFouls(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)22.55, 2));       	  
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getTeamAvgFieldGoalAttempts(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)82.50, 2));       	         	  
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getTeamAvgFieldGoalMade(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)36.90, 2));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getTeamAvgFieldGoalPct(), 3)).isEqualTo(Utilities.roundtoBigDecimal((float)0.447, 3));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getTeamAvgThreePointAttempts(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)17.99, 2));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getTeamAvgThreePointMade(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)5.99, 2));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getTeamAvgThreePointPct(), 3)).isEqualTo(Utilities.roundtoBigDecimal((float)0.333, 3));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getTeamAvgFreeThrowAttempts(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)27.28, 2));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getTeamAvgFreeThrowMade(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)20.71, 2));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getTeamAvgFreeThrowPct(), 3)).isEqualTo(Utilities.roundtoBigDecimal((float)0.759, 3));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getTeamAvgReboundsOffense(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)12.06, 2));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getTeamAvgReboundsDefense(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)32.39, 2));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getTeamAvgReboundsTotal(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)44.45, 2));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getTeamAvgPointsQ1(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)25.26, 2));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getTeamAvgPointsQ2(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)24.60, 2));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getTeamAvgPointsQ3(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)25.23, 2));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getTeamAvgPointsQ4(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)24.49, 2)); 
        	  
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getOpptAvgPoints(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)103.40, 2));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getOpptAvgAssists(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)23.50, 2));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getOpptAvgTurnovers(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)13.22, 2));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getOpptAvgSteals(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)7.77, 2));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getOpptAvgBlocks(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)5.59, 2));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getOpptAvgPersonalFouls(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)23.13, 2));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getOpptAvgFieldGoalAttempts(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)82.12, 2));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getOpptAvgFieldGoalMade(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)37.84, 2));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getOpptAvgFieldGoalPct(), 3)).isEqualTo(Utilities.roundtoBigDecimal((float)0.461, 3));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getOpptAvgThreePointAttempts(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)22.35, 2));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getOpptAvgThreePointMade(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)8.49, 2));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getOpptAvgThreePointPct(), 3)).isEqualTo(Utilities.roundtoBigDecimal((float)0.380, 3));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getOpptAvgFreeThrowAttempts(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)26.09, 2));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getOpptAvgFreeThrowMade(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)19.23, 2));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getOpptAvgFreeThrowPct(), 3)).isEqualTo(Utilities.roundtoBigDecimal((float)0.737, 3));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getOpptAvgReboundsOffense(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)9.91, 2));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getOpptAvgReboundsDefense(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)31.32, 2));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getOpptAvgReboundsTotal(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)41.23, 2));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getOpptAvgPointsQ1(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)26.18, 2));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getOpptAvgPointsQ2(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)26.50, 2));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getOpptAvgPointsQ3(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)24.46, 2));
        	  assertThat(Utilities.roundtoBigDecimal(teamSummary.getOpptAvgPointsQ4(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)25.51, 2));
          }
        });
    }
    
    @Test
    public void avgLeagueBoxScoreSeason() {
        running(fakeApplication(), new Runnable() {
          public void run() {
        	  TeamSummary leagueSummary = TeamBoxScore.sumLeagueBoxScoreFromDateMaxDate("2013-10-29", ProcessingType.online);
        	  assertThat(leagueSummary.getTeamGamesPlayed()).isEqualTo((short)2456);
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getTeamAvgPoints(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)101.01, 2));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getTeamAvgAssists(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)22.01, 2));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getTeamAvgTurnovers(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)14.05, 2));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getTeamAvgSteals(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)7.68, 2));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getTeamAvgBlocks(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)4.71, 2));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getTeamAvgPersonalFouls(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)20.70, 2));       	  
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getTeamAvgFieldGoalAttempts(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)82.99, 2));       	         	  
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getTeamAvgFieldGoalMade(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)37.72, 2));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getTeamAvgFieldGoalPct(), 3)).isEqualTo(Utilities.roundtoBigDecimal((float)0.454, 3));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getTeamAvgThreePointAttempts(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)21.54, 2));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getTeamAvgThreePointMade(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)7.75, 2));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getTeamAvgThreePointPct(), 3)).isEqualTo(Utilities.roundtoBigDecimal((float)0.360, 3));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getTeamAvgFreeThrowAttempts(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)23.58, 2));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getTeamAvgFreeThrowMade(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)17.83, 2));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getTeamAvgFreeThrowPct(), 3)).isEqualTo(Utilities.roundtoBigDecimal((float)0.756, 3));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getTeamAvgReboundsOffense(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)10.91, 2));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getTeamAvgReboundsDefense(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)31.83, 2));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getTeamAvgReboundsTotal(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)42.74, 2));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getTeamAvgPointsQ1(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)25.34, 2));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getTeamAvgPointsQ2(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)25.21, 2));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getTeamAvgPointsQ3(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)24.87, 2));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getTeamAvgPointsQ4(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)24.78, 2)); 
        	  
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getOpptAvgPoints(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)101.01, 2));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getOpptAvgAssists(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)22.01, 2));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getOpptAvgTurnovers(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)14.05, 2));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getOpptAvgSteals(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)7.68, 2));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getOpptAvgBlocks(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)4.71, 2));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getOpptAvgPersonalFouls(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)20.70, 2));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getOpptAvgFieldGoalAttempts(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)82.99, 2));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getOpptAvgFieldGoalMade(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)37.72, 2));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getOpptAvgFieldGoalPct(), 3)).isEqualTo(Utilities.roundtoBigDecimal((float)0.454, 3));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getOpptAvgThreePointAttempts(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)21.54, 2));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getOpptAvgThreePointMade(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)7.75, 2));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getOpptAvgThreePointPct(), 3)).isEqualTo(Utilities.roundtoBigDecimal((float)0.360, 3));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getOpptAvgFreeThrowAttempts(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)23.58, 2));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getOpptAvgFreeThrowMade(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)17.83, 2));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getOpptAvgFreeThrowPct(), 3)).isEqualTo(Utilities.roundtoBigDecimal((float)0.756, 3));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getOpptAvgReboundsOffense(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)10.91, 2));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getOpptAvgReboundsDefense(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)31.83, 2));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getOpptAvgReboundsTotal(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)42.74, 2));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getOpptAvgPointsQ1(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)25.34, 2));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getOpptAvgPointsQ2(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)25.21, 2));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getOpptAvgPointsQ3(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)24.87, 2));
        	  assertThat(Utilities.roundtoBigDecimal(leagueSummary.getOpptAvgPointsQ4(), 2)).isEqualTo(Utilities.roundtoBigDecimal((float)24.78, 2));
          }
        });
    }
    
    @Ignore
    @Test
    public void reportTeamBoxScores() {
        running(fakeApplication(), new Runnable() {
          public void run() {
        	  ArrayList<String> teams = Utilities.teamList();
        	  TeamSummary leagueSummary = TeamBoxScore.sumLeagueBoxScoreFromDateMaxDate("2013-10-29", ProcessingType.online);
        	  TeamSummary teamSummary = null;
        	  
        	  for (int i = 0; i < teams.size(); i++) {
        		  teamSummary = TeamBoxScore.sumTeamBoxScoreFromDateMaxDate("2013-10-29", teams.get(i), ProcessingType.online);
        		  if (i == 0) {
        			  System.out.println("\r" + Utilities.padLeft("Basic Statistics", 70));
        			  System.out.println("\r" + "2013-2014 Team Totals");
        			  System.out.println(teamSummary.toStringHeader());
        		  }
            	  System.out.println(teamSummary.toString_TeamTotals());
        	  }        	  
        	  System.out.println(leagueSummary.toString_TeamTotals());
        	  
        	  for (int i = 0; i < teams.size(); i++) {
        		  teamSummary = TeamBoxScore.sumTeamBoxScoreFromDateMaxDate("2013-10-29", teams.get(i), ProcessingType.online);
        		  if (i == 0) {
        			  System.out.println("\r" + "2013-2014 Team Averages");
        			  System.out.println(teamSummary.toStringHeader());
        		  }
            	  System.out.println(teamSummary.toString_TeamAverages());
        	  }
        	  System.out.println(leagueSummary.toString_TeamAverages());
        	  
        	  System.out.println(teamSummary.toStringFooter());
          }
        });
    }
    
    @Ignore
    @Test
    public void reportOpptBoxScores() {
        running(fakeApplication(), new Runnable() {
          public void run() {
        	  ArrayList<String> teams = Utilities.teamList();
        	  TeamSummary leagueSummary = TeamBoxScore.sumLeagueBoxScoreFromDateMaxDate("2013-10-29", ProcessingType.online);
        	  TeamSummary teamSummary = null;
        	  
        	  for (int i = 0; i < teams.size(); i++) {
        		  teamSummary = TeamBoxScore.sumTeamBoxScoreFromDateMaxDate("2013-10-29", teams.get(i), ProcessingType.online);
        		  if (i == 0) {
        			  System.out.println("\r" + Utilities.padLeft("Basic Statistics", 70));
        			  System.out.println("2013-2014 Oppt Totals");
        			  System.out.println(teamSummary.toStringHeader());
        		  }
            	  System.out.println(teamSummary.toString_OpptTotals());
        	  }
        	  System.out.println(leagueSummary.toString_OpptTotals());
        	  
        	  for (int i = 0; i < teams.size(); i++) {
        		  teamSummary = TeamBoxScore.sumTeamBoxScoreFromDateMaxDate("2013-10-29", teams.get(i), ProcessingType.online);
        		  if (i == 0) {
        			  System.out.println("\r" + "2013-2014 Oppt Averages");
        			  System.out.println(teamSummary.toStringHeader());
        		  }
            	  System.out.println(teamSummary.toString_OpptAverages());
        	  } 
        	  System.out.println(leagueSummary.toString_OpptAverages());
        	  
        	  System.out.println(teamSummary.toStringFooter());
          }
        });
    }
}
