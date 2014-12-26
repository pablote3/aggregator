package models;

import util.Utilities;

public class TeamBoxScoreHelper {

	public static String toStringHeader_Basic() {
		return "Team  GP    FGM    FGA    FG%    3PM    3PA    3P%     FTM    FTA    FT%     TOV    PF    OREB   DREB    REB    AST   STL   BLK    PTS";
	}
	
	public static String toStringFooter_Basic() {
		return new StringBuffer()
			.append("\r" + "Stats Legend")
			.append("\r  " + Utilities.padRight("GP: Games Played", 45) + "TOV: Turnovers")
			.append("\r  " + Utilities.padRight("FGM: Field Goals Made", 45) + "PF: Personal Fouls")
			.append("\r  " + Utilities.padRight("FGA: Field Goals Attempts", 45) + "OREB: Offensive Rebounds")
			.append("\r  " + Utilities.padRight("FG%: Field Goal Percentage", 45) + "DREB: Defensive Rebounds")
			.append("\r  " + Utilities.padRight("3PM: Three-Point Field Goals Made", 45) + "REB: Total Rebounds")
			.append("\r  " + Utilities.padRight("3PA: Three-Point Field Goals Attempts", 45) + "AST: Assists")
			.append("\r  " + Utilities.padRight("3P%: Three-Point Field Goal Percentage", 45) + "STL: Steals")
			.append("\r  " + Utilities.padRight("FTM: Free Throws Made", 45) + "BLK: Blocks")
			.append("\r  " + Utilities.padRight("FTM: Free Throws Attempts", 45) + "PTS: Points")
			.append("\r  " + "FTM: Free Throw Percentage")
			.toString();
	}
	
	public static String toString_TeamTotals_Basic(TeamSummary teamSummary) {
		return new StringBuffer()
			.append(teamSummary.getTeamAbbr() != null ? Utilities.padRight(teamSummary.getTeamAbbr().toString(), 4): Utilities.padRight("", 2))
			.append("  " + teamSummary.getTeamGamesPlayed())
			.append("  " + Utilities.padLeft(teamSummary.getTeamSumFieldGoalMade().toString(), 5))
			.append(" " + Utilities.padLeft(teamSummary.getTeamSumFieldGoalAttempts().toString(), 6))
			.append("   " + teamSummary.getTeamAvgFieldGoalPct())
			.append(" " + Utilities.padLeft(teamSummary.getTeamSumThreePointMade().toString(), 5))
			.append("  " + Utilities.padLeft(teamSummary.getTeamSumThreePointAttempts().toString(), 5))
			.append("   " + teamSummary.getTeamAvgThreePointPct())
			.append("  " + Utilities.padLeft(teamSummary.getTeamSumFreeThrowMade().toString(), 5))
			.append("  " + Utilities.padLeft(teamSummary.getTeamSumFreeThrowAttempts().toString(), 5))
			.append("   " + teamSummary.getTeamAvgFreeThrowPct())
			.append("  " + Utilities.padLeft(teamSummary.getTeamSumTurnovers().toString(), 5))
			.append("  " + Utilities.padLeft(teamSummary.getTeamSumPersonalFouls().toString(), 5))
			.append("  " + Utilities.padLeft(teamSummary.getTeamSumReboundsOffense().toString(), 5))
			.append("  " + Utilities.padLeft(teamSummary.getTeamSumReboundsDefense().toString(), 5))
			.append(" " + Utilities.padLeft(teamSummary.getTeamSumReboundsTotal().toString(), 6))
			.append("  " + Utilities.padLeft(teamSummary.getTeamSumAssists().toString(), 5))
			.append(" " + Utilities.padLeft(teamSummary.getTeamSumSteals().toString(), 5))
			.append(" " + Utilities.padLeft(teamSummary.getTeamSumBlocks().toString(), 5))
			.append(" " + Utilities.padLeft(teamSummary.getTeamSumPoints().toString(), 6))
			.toString();
	}
	
	public static String toString_OpptTotals_Basic(TeamSummary teamSummary) {
		return new StringBuffer()
			.append(teamSummary.getTeamAbbr() != null ? Utilities.padRight(teamSummary.getTeamAbbr().toString(), 4): Utilities.padRight("", 2))
			.append("  " + teamSummary.getTeamGamesPlayed())
			.append("  " + Utilities.padLeft(teamSummary.getOpptSumFieldGoalMade().toString(), 5))
			.append(" " + Utilities.padLeft(teamSummary.getOpptSumFieldGoalAttempts().toString(), 6))
			.append("   " + teamSummary.getOpptAvgFieldGoalPct())
			.append(" " + Utilities.padLeft(teamSummary.getOpptSumThreePointMade().toString(), 5))
			.append("  " + Utilities.padLeft(teamSummary.getOpptSumThreePointAttempts().toString(), 5))
			.append("   " + teamSummary.getOpptAvgThreePointPct())
			.append("  " + Utilities.padLeft(teamSummary.getOpptSumFreeThrowMade().toString(), 5))
			.append("  " + Utilities.padLeft(teamSummary.getOpptSumFreeThrowAttempts().toString(), 5))
			.append("   " + teamSummary.getOpptAvgFreeThrowPct())
			.append("  " + Utilities.padLeft(teamSummary.getOpptSumTurnovers().toString(), 5))
			.append("  " + Utilities.padLeft(teamSummary.getOpptSumPersonalFouls().toString(), 5))
			.append("  " + Utilities.padLeft(teamSummary.getOpptSumReboundsOffense().toString(), 5))
			.append("  " + Utilities.padLeft(teamSummary.getOpptSumReboundsDefense().toString(), 5))
			.append(" " + Utilities.padLeft(teamSummary.getOpptSumReboundsTotal().toString(), 6))
			.append("  " + Utilities.padLeft(teamSummary.getOpptSumAssists().toString(), 5))
			.append(" " + Utilities.padLeft(teamSummary.getOpptSumSteals().toString(), 5))
			.append(" " + Utilities.padLeft(teamSummary.getOpptSumBlocks().toString(), 5))
			.append(" " + Utilities.padLeft(teamSummary.getOpptSumPoints().toString(), 6))
			.toString();
	}
	
	public static String toString_TeamAverages_Basic(TeamSummary teamSummary) {
		return new StringBuffer()
			.append(teamSummary.getTeamAbbr() != null ? Utilities.padRight(teamSummary.getTeamAbbr().toString(), 4): Utilities.padRight("", 2))
			.append("  " +	teamSummary.getTeamGamesPlayed())
			.append("  " +	teamSummary.getTeamAvgFieldGoalMade())
			.append("  " +	teamSummary.getTeamAvgFieldGoalAttempts())
			.append("   " +	teamSummary.getTeamAvgFieldGoalPct())
			.append("  " +	teamSummary.getTeamAvgThreePointMade())
			.append("  " +	teamSummary.getTeamAvgThreePointAttempts())
			.append("   " +	teamSummary.getTeamAvgThreePointPct())
			.append("  " +	teamSummary.getTeamAvgFreeThrowMade())
			.append("  " +	teamSummary.getTeamAvgFreeThrowAttempts())
			.append("   " +	teamSummary.getTeamAvgFreeThrowPct())
			.append("  " +	teamSummary.getTeamAvgTurnovers())
			.append("  " +	teamSummary.getTeamAvgPersonalFouls())			
			.append("  " +	Utilities.padLeft(teamSummary.getTeamAvgReboundsOffense().toPlainString(), 5))
			.append("  " +	teamSummary.getTeamAvgReboundsDefense())
			.append("  " +	teamSummary.getTeamAvgReboundsTotal())			
			.append("  " +	teamSummary.getTeamAvgAssists(2))
			.append("  " +	teamSummary.getTeamAvgSteals())
			.append("  " +	teamSummary.getTeamAvgBlocks())
			.append("  " +	Utilities.padLeft(teamSummary.getTeamAvgPoints(2).toPlainString(), 6))
			.toString();
	}
	
	public static String toString_OpptAverages_Basic(TeamSummary teamSummary) {
		return new StringBuffer()
			.append(teamSummary.getTeamAbbr() != null ? Utilities.padRight(teamSummary.getTeamAbbr().toString(), 4): Utilities.padRight("", 2))
			.append("  " +	teamSummary.getTeamGamesPlayed())
			.append("  " +	teamSummary.getOpptAvgFieldGoalMade())
			.append("  " +	teamSummary.getOpptAvgFieldGoalAttempts())
			.append("   " +	teamSummary.getOpptAvgFieldGoalPct())
			.append("  " +	teamSummary.getOpptAvgThreePointMade())
			.append("  " +	teamSummary.getOpptAvgThreePointAttempts())
			.append("   " +	teamSummary.getOpptAvgThreePointPct())
			.append("  " +	teamSummary.getOpptAvgFreeThrowMade())
			.append("  " +	teamSummary.getOpptAvgFreeThrowAttempts())
			.append("   " +	teamSummary.getOpptAvgFreeThrowPct())
			.append("  " +	teamSummary.getOpptAvgTurnovers())
			.append("  " +	teamSummary.getOpptAvgPersonalFouls())			
			.append("  " +	Utilities.padLeft(teamSummary.getOpptAvgReboundsOffense().toPlainString(), 5))
			.append("  " +	teamSummary.getOpptAvgReboundsDefense())
			.append("  " +	teamSummary.getOpptAvgReboundsTotal())			
			.append("  " +	teamSummary.getOpptAvgAssists(2))
			.append("  " +	teamSummary.getOpptAvgSteals())
			.append("  " +	teamSummary.getOpptAvgBlocks())
			.append("  " +	Utilities.padLeft(teamSummary.getOpptAvgPoints(2).toPlainString(), 6))
			.toString();
	}
	
	public static String toString_Team_Advanced(TeamSummary teamSummary) {
		return new StringBuffer()
			.append(teamSummary.getTeamAbbr() != null ? Utilities.padRight(teamSummary.getTeamAbbr().toString(), 4): Utilities.padRight("", 2))
			.append("  " +	teamSummary.getTeamTrueShootingPercentage())
			.append("  " +	teamSummary.getTeamEffectiveFieldGoalPercentage())
			.append("  " +	teamSummary.getTeamOffensiveReboundPercentage())
			.append("   " +	teamSummary.getTeamDefensiveReboundPercentage())
			.append("  " +	teamSummary.getTeamTotalReboundPercentage())
			.append("  " +	teamSummary.getTeamAssistPercentage())
			.append("   " +	teamSummary.getTeamTurnoverPercentage())
			.append("  " +	teamSummary.getTeamStealPercentage())
			.append("  " +	teamSummary.getTeamBlockPercentage())
			.append("   " +	teamSummary.getTeamPointsPerShot())
			.append("  " +	teamSummary.getTeamFloorImpactCounter(2))
			.append("  " +	teamSummary.getTeamOffensiveRating(2))			
			.append("  " +	teamSummary.getTeamDefensiveRating(2))
			.append("  " +	teamSummary.getTeamEfficiencyDifferential(2))			
			.append("  " +	teamSummary.getTeamOpptPossessions())
			.append("  " +	teamSummary.getTeamOpptPace())
			.toString();
	}
	
	public static String toStringHeader_Advanced_Offense1() {
		return new StringBuffer()
			.append("     |                                                                             Shooting Ratios                                                                           |" + "\r")
			.append("     |        PTS         |        FG%         |        3P%         |        3PR         |        FT%         |        FTR         |       Play%        |        TS%         |" + "\r")
			.append("Team | Own    Opp     Δ%  | Own    Opp     Δ%  | Own    Opp     Δ%  | Own    Opp     Δ%  | Own    Opp     Δ%  | Own    Opp     Δ%  | Own    Opp     Δ%  | Own    Opp     Δ%  |")
			.toString();
	}
	
	public static String toString_Advanced_Offense1(TeamSummary teamSummary) {
		return new StringBuffer()
			.append(teamSummary.getTeamAbbr() != null ? Utilities.padRight(teamSummary.getTeamAbbr().toString(), 4): Utilities.padRight("", 4))
			.append(" " + Utilities.padLeft(teamSummary.getTeamAvgPoints(1).toPlainString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getOpptAvgPoints(1).toPlainString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamOpptPointDiff(2).toPlainString(), 6))			
			.append(" " + Utilities.padLeft(teamSummary.getTeamAvgFieldGoalPct().toPlainString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getOpptAvgFieldGoalPct().toPlainString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamOpptFieldGoalPctDiff(2).toPlainString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamAvgThreePointPct().toPlainString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getOpptAvgThreePointPct().toPlainString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamOpptThreePointPctDiff(2).toPlainString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamAvgThreePointRate().toPlainString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getOpptAvgThreePointRate().toPlainString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamOpptThreePointRateDiff(2).toPlainString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamAvgFreeThrowPct().toPlainString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getOpptAvgFreeThrowPct().toPlainString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamOpptFreeThrowPctDiff(2).toPlainString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamAvgFreeThrowRate().toPlainString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getOpptAvgFreeThrowRate().toPlainString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamOpptFreeThrowRateDiff(2).toPlainString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamPlayPercent().toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getOpptPlayPercent().toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamOpptPlayPercentDiff(2).toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamTrueShootingPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getOpptTrueShootingPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamOpptTrueShootingPercentageDiff(2).toString(), 6))
			.toString();
	}
	
	public static String toStringFooter_Advanced_Offense1() {
		return new StringBuffer()
			.append("\r" + "Stats Legend")
			.append("\r  " + Utilities.padRight("PTS: Average Points Per Game", 40) + "Σ(PTS) / GP")
			.append("\r  " + Utilities.padRight("FG%: Field Goal Percentage", 40) + "FGM / FGA")
			.append("\r  " + Utilities.padRight("3P%: Three Point Percentage", 40) + "3PM / 3PA")
			.append("\r  " + Utilities.padRight("3PR: Three Point Rate", 40) + "3PA / FGA")
			.append("\r  " + Utilities.padRight("FT%: Free Throw Percentage", 40) + "FTM / FTA")
			.append("\r  " + Utilities.padRight("FTR: Free Throw Rate", 40) + "FTA / FGA")
			.append("\r  " + Utilities.padRight("Play%: Play Percentage", 40) + "FGM / (FGA - OREB + TO)")
			.append("\r  " + Utilities.padRight("TS%: True Shooting Percentage", 40) + "PTS / (2 * (FGA + FTA * 0.44))")
			.toString();
	}
	
	public static String toStringHeader_Advanced_Offense2() {
		return new StringBuffer()
			.append("     |             Shooting Ratios             |                                  Passing Ratios                                   |" + "\r")
			.append("     |        eFG%        |        PPS         |        AST         |        AST%        |         AR         |       AST/TO       |" + "\r")
			.append("Team |  Own    Opp    Δ%  | Own    Opp     Δ%  | Own    Opp     Δ%  | Own    Opp     Δ%  | Own    Opp     Δ%  | Own    Opp     Δ%  |")
			.toString();
	}
	
	public static String toString_Advanced_Offense2(TeamSummary teamSummary) {
		return new StringBuffer()
			.append(teamSummary.getTeamAbbr() != null ? Utilities.padRight(teamSummary.getTeamAbbr().toString(), 4): Utilities.padRight("", 4))
			.append(" " + Utilities.padLeft(teamSummary.getTeamEffectiveFieldGoalPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getOpptEffectiveFieldGoalPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamOpptEffectiveFieldGoalPercentageDiff(2).toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamPointsPerShot().toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getOpptPointsPerShot().toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamOpptPointsPerShotDiff(2).toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamAvgAssists(1).toPlainString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getOpptAvgAssists(1).toPlainString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamOpptAssistDiff(2).toPlainString(), 6))	
			.append(" " + Utilities.padLeft(teamSummary.getTeamAssistPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getOpptAssistPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamOpptAssistPercentageDiff(2).toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamAssistRate().toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getOpptAssistRate().toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamOpptAssistRateDiff(2).toString(), 6))			
			.append(" " + Utilities.padLeft(teamSummary.getTeamAssistToTurnoverRatio().toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getOpptAssistToTurnoverRatio().toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamOpptAssistToTurnoverRatioDiff(2).toString(), 6))
			.toString();
	}
	
	public static String toStringFooter_Advanced_Offense2() {
		return new StringBuffer()
			.append("\r" + "Stats Legend")
			.append("\r  " + Utilities.padRight("eFG%: Effective Field Goal Percentage", 40) + "FGM + (0.5 * 3PM) / FGA")
			.append("\r  " + Utilities.padRight("PPS: Points Per Shot", 40) + "PTS / (FGA + 3PA + FTA)")
			.append("\r  " + Utilities.padRight("AST: Average Assists Per Game", 40) + "Σ(AST) / GP")
			.append("\r  " + Utilities.padRight("AST%: Assisted Field Goal Percentage", 40) + "AST / FGM")
			.append("\r  " + Utilities.padRight("AR: Assist Rate", 40) + "(AST * 100) / (FGA + (FTA * 0.44) + AST + TO)")
			.append("\r  " + Utilities.padRight("AST/TO: Assists to Turnover Ratio", 40) + "AST / TO")
			.toString();
	}
	
	public static String toStringHeader_Advanced_Defense() {
		return new StringBuffer()
			.append("     |                       Rebound Ratios                         |                         Steal Ratios                         |               Block Ratios              |" + "\r")
			.append("     |       OREB%       |       DREB%         |       TREB%        |        STL%        |       STL/TO       |         TO%        |        BLK%        |        BLKR        |" + "\r")
			.append("Team | Own    Opp     Δ% |  Own    Opp     Δ%  | Own    Opp     Δ%  | Own    Opp     Δ%  | Own    Opp     Δ%  | Own    Opp     Δ%  | Own    Opp     Δ%  |  Own    Opp     Δ% |")
			.toString();
	}
	
	public static String toString_Advanced_Defense(TeamSummary teamSummary) {
		return new StringBuffer()
			.append(teamSummary.getTeamAbbr() != null ? Utilities.padRight(teamSummary.getTeamAbbr().toString(), 4): Utilities.padRight("", 4))
			.append(" " + Utilities.padLeft(teamSummary.getTeamOffensiveReboundPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getOpptOffensiveReboundPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamOpptOffensiveReboundPercentageDiff(2).toPlainString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamDefensiveReboundPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getOpptDefensiveReboundPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamOpptDefensiveReboundPercentageDiff(2).toPlainString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamTotalReboundPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getOpptTotalReboundPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamOpptTotalReboundPercentageDiff(2).toPlainString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamStealPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getOpptStealPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamOpptStealPercentageDiff(2).toPlainString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamStealToTurnoverRatio().toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getOpptStealToTurnoverRatio().toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamOpptStealToTurnoverRatioDiff(2).toPlainString(), 6))			
			.append(" " + Utilities.padLeft(teamSummary.getTeamTurnoverPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getOpptTurnoverPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamOpptTurnoverPercentageDiff(2).toPlainString(), 6))			
			.append(" " + Utilities.padLeft(teamSummary.getTeamBlockPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getOpptBlockPercentage().toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamOpptBlockPercentageDiff(2).toPlainString(), 6))			
			.append(" " + Utilities.padLeft(teamSummary.getTeamBlockRate().toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getOpptBlockRate().toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamOpptBlockRateDiff(2).toPlainString(), 6))				
			.toString();
	}
	
	public static String toStringFooter_Advanced_Defense() {
		return new StringBuffer()
			.append("\r  " + Utilities.padRight("OREB%: Offensive Rebound Percentage", 40) + "OREB * 100 / (OREB + DDREB)")
			.append("\r  " + Utilities.padRight("DREB%: Defensive Rebound Percentage", 40) + "DREB * 100 / (DREB + DOREB)")
			.append("\r  " + Utilities.padRight("TREB%: Total Rebound Percentage", 40) + "TREB * 100 / (TREB + DTREB)")
			.append("\r  " + Utilities.padRight("STL%: Steal Percentage", 40) + "STL * 100 / Poss")
			.append("\r  " + Utilities.padRight("STL/TO: Steal To Turnover Ratio", 40) + "STL * 100 / TO")			
			.append("\r  " + Utilities.padRight("TO%: Turnover Percentage", 40) + "TO * 100 / (FGA + 0.44 * FTA + TO)")
			.append("\r  " + Utilities.padRight("BLK%: Block Percentage", 40) + "BLK * 100 / Poss")
			.append("\r  " + Utilities.padRight("BLKR: Block Rate", 40) + "BLK * 100 / FGA - 3PA")
			.toString();
	}
	
	public static String toStringHeader_Advanced_Efficiency() {
		return new StringBuffer()
			.append("     |                               Efficiency Ratio                               |                    Winning%                   |                      Strength of Schedule                       |" + "\r")
			.append("     |        ORtg        |        DRtg        |       |       |        FIC         |       Pyth 13.91      |       Pyth 16.5       |        SOS         |        RPI         |       |       |       |" + "\r")
			.append("Team | Own    Opp     Δ%  | Own    Opp     Δ%  | eDiff | Poss  | Own    Opp     Δ%  | Pyth%   WPyth   LPyth | Pyth%   WPyth   LPyth | Own    Oppt    Δ%  | Own    Oppt    Δ%  |  MOV  |  SRS  |  PW%  |")
			.toString();
	}
	
	public static String toString_Advanced_Efficiency(TeamSummary teamSummary) {
		return new StringBuffer()
			.append(teamSummary.getTeamAbbr() != null ? Utilities.padRight(teamSummary.getTeamAbbr().toString(), 4): Utilities.padRight("", 4))
			.append(" " + Utilities.padLeft(teamSummary.getTeamOffensiveRating(1).toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getOpptOffensiveRating(1).toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamOpptOffensiveRatingDiff(2).toPlainString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamDefensiveRating(1).toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getOpptDefensiveRating(1).toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamOpptDefensiveRatingDiff(2).toString(), 6))
			.append("  " + Utilities.padLeft(teamSummary.getTeamEfficiencyDifferential(2).toString(), 6))
			.append("  " + Utilities.padLeft(teamSummary.getTeamOpptPossessions().toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamFloorImpactCounter(2).toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getOpptFloorImpactCounter(2).toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamOpptFloorImpactCounterDiff(2).toString(), 6))
			.append("  " + Utilities.padLeft(teamSummary.getTeamPythagoreanWinningPercentage13_91(3).toString(), 6))
			.append(" " + Utilities.padLeft(teamSummary.getTeamPythagoreanWins13_91(2).toString(), 7))
			.append(" " + Utilities.padLeft(teamSummary.getTeamPythagoreanLosses13_91(2).toString(), 7))
			.append(" " + Utilities.padLeft(teamSummary.getTeamPythagoreanWinningPercentage16_5(3).toString(), 7))
			.append(" " + Utilities.padLeft(teamSummary.getTeamPythagoreanWins16_5(2).toString(), 7))
			.append(" " + Utilities.padLeft(teamSummary.getTeamPythagoreanLosses16_5(2).toString(), 7))
//			.append(" " + Utilities.padLeft(teamSummary.getTeamStrengthOfSchedule(3).toString(), 6))
//			.append(" " + Utilities.padLeft(teamSummary.getOpptStrengthOfSchedule(3).toString(), 6))
//			.append(" " + Utilities.padLeft(teamSummary.getTeamOpptStrengthOfScheduleDiff(2).toString(), 6))
//			.append(" " + Utilities.padLeft(teamSummary.getTeamRelativePercentageIndex(3).toString(), 6))
//			.append(" " + Utilities.padLeft(teamSummary.getOpptRelativePercentageIndex(3).toString(), 6))
//			.append(" " + Utilities.padLeft(teamSummary.getTeamOpptRelativePercentageIndexDiff(2).toString(), 6))
			.append("  " + Utilities.padLeft(teamSummary.getTeamMarginOfVictory(2).toString(), 6))
//			.append("  " + Utilities.padLeft(teamSummary.getTeamSimpleRatingSystem(2).toString(), 6))
			.append("  " + Utilities.padLeft(teamSummary.getTeamProjectedWinningPercentage(3).toString(), 6))
			.toString();
	}
	
	public static String toStringFooter_Advanced_Efficiency() {
		return new StringBuffer()
			.append("\r  " + Utilities.padRight("ORtg: Offensive Rating", 40) + "Team PTS / Poss")
			.append("\r  " + Utilities.padRight("DRtg: Defensive Rating", 40) + "Oppt PTS / Poss")
			.append("\r  " + Utilities.padRight("eDiff: Efficiency Differential", 40) + "ORtg - DRtg")
			.append("\r  " + Utilities.padRight("FIC: Floor Impact Counter", 40) + "(PTS + ORB + 0.75 DRB + AST + STL - 0.75 FGA - 0.375 FTA - TO - 0.5 PF) / GP")
			.append("\r  " + Utilities.padRight("Pyth% 13.91: Pythagorean Winning% 13.91", 40) + "Team PTS^13.91 / (Team PTS^13.91 + Oppt PTS^13.91)")
			.append("\r  " + Utilities.padRight("Pyth% 16.5: Pythagorean Winning% 16.5", 40) + "Team PTS^16.5 / (Team PTS^16.5 + Oppt PTS^16.5)")
			.append("\r  " + Utilities.padRight("WPyth: Pythagorean Wins", 40) + "Pyth% * 82")
			.append("\r  " + Utilities.padRight("LPyth: Pythagorean Losses", 40) + "82 - WPyth")
			.append("\r  " + Utilities.padRight("Poss: Estimated Possessions", 40) + "FGA – (OREB / OREB + DDREB) * (FGA – FGM) * 1.07 + TOV + (0.4 * FTA)")
			.append("\r  " + Utilities.padRight("SOS: Strength of Schedule", 40) + "(2 * Oppt Win% + Oppt Oppt Win%) / 3")
			.append("\r  " + Utilities.padRight("RPI: Relative Percentage Index", 40) + "0.25 * Team Win% + 0.5 * Oppt Win% + 0.25 * Oppt Oppt Win%")
			.append("\r  " + Utilities.padRight("MOV: Margin of Victory", 40) + "Team PTS - Oppt PTS")
			.append("\r  " + Utilities.padRight("SRS: Simple Rating System", 40) + "MOV - SOS")
			.append("\r  " + Utilities.padRight("PW%: Projected Winning Percentage", 40) + "((MOV * 2.7) + 41) / 82")
			.toString();
	}
}
