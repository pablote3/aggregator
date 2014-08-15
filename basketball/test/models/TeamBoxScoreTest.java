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
    public void aggregateTeamPointsSeason() {
        running(fakeApplication(), new Runnable() {
          public void run() {
        	  TeamSummary teamSummary = TeamBoxScore.aggregateTeamPointsSeason("2012-10-31", "SAC", ProcessingType.online);
        	  assertThat(teamSummary.getTeamAbbr()).isEqualTo(TeamAbbr.SAC);
        	  assertThat(teamSummary.getTeamGamesPlayed()).isEqualTo((short)82);
          }
        });
    }
}
