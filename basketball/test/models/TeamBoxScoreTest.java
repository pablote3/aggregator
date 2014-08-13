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
    
//    @Test
//    public void findTeamBoxScoreByDateTeamOnline_Season() {
//        running(fakeApplication(), new Runnable() {
//            public void run() {
//          	  List<TeamBoxScore> teamBoxScores = TeamBoxScore.findByDateTeamSize("2012-10-30", "sacramento-kings", "0", ProcessingType.online);
//          	  assertThat(teamBoxScores.size()).isEqualTo(82);
//            }
//        });
//    }
//    
//    @Test
//    public void findTeamBoxScoresByDateTeamBatch_Season() {
//       	  List<TeamBoxScore> teamBoxScores = TeamBoxScore.findByDateTeamSize("2012-10-30", "sacramento-kings", "0", ProcessingType.batch);
//       	  assertThat(teamBoxScores.size()).isEqualTo(82);
//    }
//
//    @Test
//    public void aggregateScores() {
//        running(fakeApplication(), new Runnable() {
//          public void run() {                      	  
//        	  Date startDate = null;
//        	  Date endDate = null;
//        	  
//        	  try {
//        		  SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
//        		  startDate = simpleDateFormat.parse("2012-10-29");
//        		  endDate = simpleDateFormat.parse("2013-04-18");
//        	  } catch (ParseException e) {
//        		  e.printStackTrace();
//        	  }
//        	  
//        	  String sql 
//        	  		= "select g.id, g.date, g.status " +
//            		  "from game g " +
//            		  "inner join box_score bs1 on bs1.game_id = g.id " +
//            		  "inner join team t1 on t1.id = bs1.team_id " + 
//            		  "inner join box_score bs2 on bs2.game_id = g.id and bs2.id <> bs1.id " +
//            		  "inner join team t2 on t2.id = bs2.team_id ";
//        	  
//        	  RawSql rawSql =
//        			RawSqlBuilder
//        			  .parse(sql)
//        			  .columnMapping("g.id", "id")
//        			  .columnMapping("g.date", "date")
//        			  .columnMapping("g.status", "status")
//        			  .create();
//        	  
//              Query<TeamBoxScore> query = Ebean.find(TeamBoxScore.class);
//              query.setRawSql(rawSql);
//            		  
//              query.where().between("g.date", startDate, endDate);
//              query.where().eq("t1.abbr", "SAC");
//
//              List<TeamBoxScore> teamBoxScores = query.findList();
//              assertThat(teamBoxScores.size() == 82);
//          }
//        });
//    }
}
