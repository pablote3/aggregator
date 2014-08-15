package models;

import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.running;



//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.List;
//import java.util.Locale;



import org.junit.Test;

import util.Enumerations.ProcessingType;
import util.Enumerations.SeasonType;
import util.Enumerations.TeamAbbr;

//import com.avaje.ebean.Ebean;
//import com.avaje.ebean.Query;
//import com.avaje.ebean.RawSql;
//import com.avaje.ebean.RawSqlBuilder;

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
        	  assertThat(teamSummary.getTeamSumPointsQ1()).isEqualTo((short)2071);
        	  assertThat(teamSummary.getTeamSumPointsQ2()).isEqualTo((short)2017);
        	  assertThat(teamSummary.getTeamSumPointsQ3()).isEqualTo((short)2069);
        	  assertThat(teamSummary.getTeamSumPointsQ4()).isEqualTo((short)2008);
          }
        });
    }
}
