
public class Launcher {

    public static void main(String[] args) {

        SoccerTeam alpha = new SoccerTeam("Alpha", 90);
        SoccerTeam betta = new SoccerTeam("Betta", 30);

        BaseBallTeam zetta = new BaseBallTeam("Zetta", 60);
        BaseBallTeam omega = new BaseBallTeam("Omega", 10);

        League<SoccerTeam> soccer = new League<>("Soccer");
        League<BaseBallTeam> baseball = new League<>("Baseball");

        soccer.addTeam(alpha);
        soccer.addTeam(betta);

        baseball.addTeam(zetta);
        baseball.addTeam(omega);

        soccer.showTeamsInRank();
        baseball.showTeamsInRank();

    }

}
