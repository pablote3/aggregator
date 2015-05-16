package models;

import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.running;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import util.Enumerations.ProcessingType;
import util.Enumerations.TeamAbbr;
import util.Utilities;

public class StandingTest {

    @Test
    public void findStandingsDate() {
        running(fakeApplication(), new Runnable() {
          public void run() {
        	  List<Standing> standings = Standing.findByDate("2013-12-09", ProcessingType.online);        
              assertThat(standings.size()).isEqualTo(30);
          }
        });
    }
    
    @Test
    public void findStandingsByDateTeam() {
        running(fakeApplication(), new Runnable() {
          public void run() {
        	  Standing standing = Standing.findByDateTeam("2013-12-09", "SAC", ProcessingType.online);
        	  assertThat(standing.getTeamAbbr()).isEqualTo(TeamAbbr.SAC);
        	  assertThat(standing.getAwayLosses()).isEqualTo((short)4);
        	  assertThat(standing.getAwayWins()).isEqualTo((short)2);
        	  assertThat(standing.getConferenceLosses()).isEqualTo((short)11);
        	  assertThat(standing.getConferenceWins()).isEqualTo((short)5);
        	  assertThat(standing.getGamesBack()).isEqualTo((float)10.5);
        	  assertThat(standing.getGamesLost()).isEqualTo((short)13);
        	  assertThat(standing.getGamesWon()).isEqualTo((short)6);
        	  assertThat(standing.getGamesPlayed()).isEqualTo((short)19);
        	  assertThat(standing.getHomeLosses()).isEqualTo((short)9);
        	  assertThat(standing.getHomeWins()).isEqualTo((short)4);
        	  assertThat(standing.getLastFive()).isEqualTo("2-3");
        	  assertThat(standing.getLastTen()).isEqualTo("4-6");
        	  assertThat(standing.getOrdinalRank()).isEqualTo("14th");
        	  assertThat(standing.getPointDifferential()).isEqualTo((short)-40);
        	  assertThat(standing.getPointDifferentialPerGame()).isEqualTo((float)-2.1);
        	  assertThat(standing.getPointsAgainst()).isEqualTo((short)1915);
        	  assertThat(standing.getPointsFor()).isEqualTo((short)1875);
        	  assertThat(standing.getPointsScoredPerGame()).isEqualTo((float)98.7);
        	  assertThat(standing.getRank()).isEqualTo((short)14);
        	  assertThat(standing.getStreak()).isEqualTo("W2");
        	  assertThat(standing.getStreakTotal()).isEqualTo((short)2);
        	  assertThat(standing.getStreakType()).isEqualTo("win");
        	  
        	  assertThat(standing.getOpptWinPercentage()).isEqualTo((float)0.5462);
        	  assertThat(standing.getOpptOpptWinPercentage()).isEqualTo((float)0.522);
        	  assertThat(standing.getMarginOfVictory(2)).isEqualTo(new BigDecimal("-2.10"));
        	  assertThat(standing.getRelativePercentageIndex(3)).isEqualTo(new BigDecimal("0.483"));
        	  assertThat(standing.getSimpleRatingSystem(3)).isEqualTo(new BigDecimal("-2.638"));
        	  assertThat(standing.getStrengthOfSchedule(3)).isEqualTo(new BigDecimal("0.538"));
        	  assertThat(standing.getProjectedWinningPercentage(3)).isEqualTo(new BigDecimal("0.431"));
          }
        });
    }

    @Test
    public void standingsBasic() {
        running(fakeApplication(), new Runnable() {
          public void run() {
        	  ArrayList<String> teams = Utilities.teamList();
        	  Standing standing = null;
        	  for (int i = 0; i < teams.size(); i++) {
        		  standing = Standing.findByDateTeam("2014-04-16", teams.get(i), ProcessingType.online);
        		  if (i == 0) {
        			  System.out.println("\r" + Utilities.padLeft("Standings: 2013-2014 Season", 85));
        			  System.out.println("Standings 2014-04-16");
        			  System.out.println(ReportHelper.toStringHeader_Standings());
        		  }
            	  System.out.println(ReportHelper.toString_Standings(standing));
        	  }
        	  System.out.println(ReportHelper.toStringFooter_Standings());
          }
        });
    }
}
