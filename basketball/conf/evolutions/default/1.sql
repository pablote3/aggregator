# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table official_box_score (
  id                        bigint auto_increment not null,
  gameDate                  datetime not null,
  officialLastName          varchar(25) not null,
  officialFirstName         varchar(25) not null,
  seasonType                varchar(7) not null,
  teamAbbr                  varchar(3) not null,
  teamConference            varchar(4) not null,
  teamDivision              varchar(9) not null,
  teamLocation              varchar(4) not null,
  teamResult                varchar(4) not null,
  teamPoints                smallint not null,
  teamAssists               smallint not null,
  teamTurnovers             smallint not null,
  teamSteals                smallint not null,
  teamBlocks                smallint not null,
  teamPersonalFouls         smallint not null,
  teamFieldGoalAttempts     smallint not null,
  teamFieldGoalMade         smallint not null,
  teamThreePointAttempts    smallint not null,
  teamThreePointMade        smallint not null,
  teamFreeThrowAttempts     smallint not null,
  teamFreeThrowMade         smallint not null,
  teamReboundsOffense       smallint not null,
  teamReboundsDefense       smallint not null,
  teamPointsQ1              smallint not null,
  teamPointsQ2              smallint not null,
  teamPointsQ3              smallint not null,
  teamPointsQ4              smallint not null,
  teamPointsQ5              smallint not null,
  teamPointsQ6              smallint not null,
  teamPointsQ7              smallint not null,
  teamPointsQ8              smallint not null,
  opptAbbr                  varchar(3) not null,
  opptConference            varchar(4) not null,
  opptDivision              varchar(9) not null,
  opptLocation              varchar(4) not null,
  opptResult                varchar(4) not null,
  opptPoints                smallint not null,
  opptAssists               smallint not null,
  opptTurnovers             smallint not null,
  opptSteals                smallint not null,
  opptBlocks                smallint not null,
  opptPersonalFouls         smallint not null,
  opptFieldGoalAttempts     smallint not null,
  opptFieldGoalMade         smallint not null,
  opptThreePointAttempts    smallint not null,
  opptThreePointMade        smallint not null,
  opptFreeThrowAttempts     smallint not null,
  opptFreeThrowMade         smallint not null,
  opptReboundsOffense       smallint not null,
  opptReboundsDefense       smallint not null,
  opptPointsQ1              smallint not null,
  opptPointsQ2              smallint not null,
  opptPointsQ3              smallint not null,
  opptPointsQ4              smallint not null,
  opptPointsQ5              smallint not null,
  opptPointsQ6              smallint not null,
  opptPointsQ7              smallint not null,
  opptPointsQ8              smallint not null,
  constraint ck_official_box_score_seasonType check (seasonType in ('Post','Regular','Pre')),
  constraint ck_official_box_score_teamAbbr check (teamAbbr in ('MIA','NY','DAL','OKC','HOU','DEN','NO','DET','ORL','MIL','CHI','MIN','UTA','LAC','CHA','SAC','IND','BKN','CLE','ATL','WAS','BOS','MEM','POR','GS','LAL','PHO','TOR','PHI','SA')),
  constraint ck_official_box_score_teamConference check (teamConference in ('West','East')),
  constraint ck_official_box_score_teamDivision check (teamDivision in ('Central','Atlantic','Northwest','Pacific','Southeast','Southwest')),
  constraint ck_official_box_score_teamLocation check (teamLocation in ('Away','Home')),
  constraint ck_official_box_score_teamResult check (teamResult in ('Loss','Win')),
  constraint ck_official_box_score_opptAbbr check (opptAbbr in ('MIA','NY','DAL','OKC','HOU','DEN','NO','DET','ORL','MIL','CHI','MIN','UTA','LAC','CHA','SAC','IND','BKN','CLE','ATL','WAS','BOS','MEM','POR','GS','LAL','PHO','TOR','PHI','SA')),
  constraint ck_official_box_score_opptConference check (opptConference in ('West','East')),
  constraint ck_official_box_score_opptDivision check (opptDivision in ('Central','Atlantic','Northwest','Pacific','Southeast','Southwest')),
  constraint ck_official_box_score_opptLocation check (opptLocation in ('Away','Home')),
  constraint ck_official_box_score_opptResult check (opptResult in ('Loss','Win')),
  constraint pk_official_box_score primary key (id))
;

create table player_box_score (
  id                        bigint auto_increment not null,
  gameDate                  datetime not null,
  playerLastName            varchar(25) not null,
  playerFirstName           varchar(25) not null,
  seasonType                varchar(7) not null,
  playerTeamAbbr            varchar(3) not null,
  playerConference          varchar(4) not null,
  playerDivision            varchar(9) not null,
  playerLocation            varchar(4) not null,
  result                    varchar(4) not null,
  fromDate                  date not null,
  toDate                    date not null,
  position                  varchar(5) not null,
  height                    smallint,
  weight                    smallint,
  birthdate                 date,
  birthplace                varchar(50),
  minutes                   smallint,
  starter                   tinyint(1) default 0 not null,
  points                    smallint not null,
  assists                   smallint not null,
  turnovers                 smallint not null,
  steals                    smallint not null,
  blocks                    smallint not null,
  personalFouls             smallint not null,
  fieldGoalAttempts         smallint not null,
  fieldGoalMade             smallint not null,
  threePointAttempts        smallint not null,
  threePointMade            smallint not null,
  freeThrowAttempts         smallint not null,
  freeThrowMade             smallint not null,
  reboundsOffense           smallint not null,
  reboundsDefense           smallint not null,
  pointsQ1                  smallint not null,
  pointsQ2                  smallint not null,
  pointsQ3                  smallint not null,
  pointsQ4                  smallint not null,
  pointsQ5                  smallint not null,
  pointsQ6                  smallint not null,
  pointsQ7                  smallint not null,
  pointsQ8                  smallint not null,
  opptTeamAbbr              varchar(3) not null,
  opptConference            varchar(4) not null,
  opptDivision              varchar(9) not null,
  official1LastName         varchar(25) not null,
  official1FirstName        varchar(25) not null,
  official2LastName         varchar(25) not null,
  official2FirstName        varchar(35) not null,
  official3LastName         varchar(25) not null,
  official3FirstName        varchar(25) not null,
  constraint ck_player_box_score_seasonType check (seasonType in ('Post','Regular','Pre')),
  constraint ck_player_box_score_playerTeamAbbr check (playerTeamAbbr in ('MIA','NY','DAL','OKC','HOU','DEN','NO','DET','ORL','MIL','CHI','MIN','UTA','LAC','CHA','SAC','IND','BKN','CLE','ATL','WAS','BOS','MEM','POR','GS','LAL','PHO','TOR','PHI','SA')),
  constraint ck_player_box_score_playerConference check (playerConference in ('West','East')),
  constraint ck_player_box_score_playerDivision check (playerDivision in ('Central','Atlantic','Northwest','Pacific','Southeast','Southwest')),
  constraint ck_player_box_score_playerLocation check (playerLocation in ('Away','Home')),
  constraint ck_player_box_score_result check (result in ('Loss','Win')),
  constraint ck_player_box_score_position check (position in ('F','SF','G','SG','C','PF','PG')),
  constraint ck_player_box_score_opptTeamAbbr check (opptTeamAbbr in ('MIA','NY','DAL','OKC','HOU','DEN','NO','DET','ORL','MIL','CHI','MIN','UTA','LAC','CHA','SAC','IND','BKN','CLE','ATL','WAS','BOS','MEM','POR','GS','LAL','PHO','TOR','PHI','SA')),
  constraint ck_player_box_score_opptConference check (opptConference in ('West','East')),
  constraint ck_player_box_score_opptDivision check (opptDivision in ('Central','Atlantic','Northwest','Pacific','Southeast','Southwest')),
  constraint pk_player_box_score primary key (id))
;

create table team_box_score (
  id                        bigint auto_increment not null,
  gameDate                  datetime not null,
  seasonType                varchar(7) not null,
  teamAbbr                  varchar(3) not null,
  teamConference            varchar(4) not null,
  teamDivision              varchar(9) not null,
  teamLocation              varchar(4) not null,
  teamResult                varchar(4) not null,
  teamPoints                smallint not null,
  teamAssists               smallint not null,
  teamTurnovers             smallint not null,
  teamSteals                smallint not null,
  teamBlocks                smallint not null,
  teamPersonalFouls         smallint not null,
  teamFieldGoalAttempts     smallint not null,
  teamFieldGoalMade         smallint not null,
  teamThreePointAttempts    smallint not null,
  teamThreePointMade        smallint not null,
  teamFreeThrowAttempts     smallint not null,
  teamFreeThrowMade         smallint not null,
  teamReboundsOffense       smallint not null,
  teamReboundsDefense       smallint not null,
  teamPointsQ1              smallint not null,
  teamPointsQ2              smallint not null,
  teamPointsQ3              smallint not null,
  teamPointsQ4              smallint not null,
  teamPointsQ5              smallint not null,
  teamPointsQ6              smallint not null,
  teamPointsQ7              smallint not null,
  teamPointsQ8              smallint not null,
  opptAbbr                  varchar(3) not null,
  opptConference            varchar(4) not null,
  opptDivision              varchar(9) not null,
  opptLocation              varchar(4) not null,
  opptResult                varchar(4) not null,
  opptPoints                smallint not null,
  opptAssists               smallint not null,
  opptTurnovers             smallint not null,
  opptSteals                smallint not null,
  opptBlocks                smallint not null,
  opptPersonalFouls         smallint not null,
  opptFieldGoalAttempts     smallint not null,
  opptFieldGoalMade         smallint not null,
  opptThreePointAttempts    smallint not null,
  opptThreePointMade        smallint not null,
  opptFreeThrowAttempts     smallint not null,
  opptFreeThrowMade         smallint not null,
  opptReboundsOffense       smallint not null,
  opptReboundsDefense       smallint not null,
  opptPointsQ1              smallint not null,
  opptPointsQ2              smallint not null,
  opptPointsQ3              smallint not null,
  opptPointsQ4              smallint not null,
  opptPointsQ5              smallint not null,
  opptPointsQ6              smallint not null,
  opptPointsQ7              smallint not null,
  opptPointsQ8              smallint not null,
  official1LastName         varchar(25) not null,
  official1FirstName        varchar(25) not null,
  official2LastName         varchar(25) not null,
  official2FirstName        varchar(25) not null,
  official3LastName         varchar(25) not null,
  official3FirstName        varchar(25) not null,
  constraint ck_team_box_score_seasonType check (seasonType in ('Post','Regular','Pre')),
  constraint ck_team_box_score_teamAbbr check (teamAbbr in ('MIA','NY','DAL','OKC','HOU','DEN','NO','DET','ORL','MIL','CHI','MIN','UTA','LAC','CHA','SAC','IND','BKN','CLE','ATL','WAS','BOS','MEM','POR','GS','LAL','PHO','TOR','PHI','SA')),
  constraint ck_team_box_score_teamConference check (teamConference in ('West','East')),
  constraint ck_team_box_score_teamDivision check (teamDivision in ('Central','Atlantic','Northwest','Pacific','Southeast','Southwest')),
  constraint ck_team_box_score_teamLocation check (teamLocation in ('Away','Home')),
  constraint ck_team_box_score_teamResult check (teamResult in ('Loss','Win')),
  constraint ck_team_box_score_opptAbbr check (opptAbbr in ('MIA','NY','DAL','OKC','HOU','DEN','NO','DET','ORL','MIL','CHI','MIN','UTA','LAC','CHA','SAC','IND','BKN','CLE','ATL','WAS','BOS','MEM','POR','GS','LAL','PHO','TOR','PHI','SA')),
  constraint ck_team_box_score_opptConference check (opptConference in ('West','East')),
  constraint ck_team_box_score_opptDivision check (opptDivision in ('Central','Atlantic','Northwest','Pacific','Southeast','Southwest')),
  constraint ck_team_box_score_opptLocation check (opptLocation in ('Away','Home')),
  constraint ck_team_box_score_opptResult check (opptResult in ('Loss','Win')),
  constraint pk_team_box_score primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table official_box_score;

drop table player_box_score;

drop table team_box_score;

SET FOREIGN_KEY_CHECKS=1;
