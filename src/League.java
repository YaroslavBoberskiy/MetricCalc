import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T extends Team> {

    private String leagueName;
    private List<T> teams = new ArrayList<>();

    public League(String leagueName) {
        this.leagueName = leagueName;
    }

    public void addTeam (T team) {
        this.teams.add(team);
    }

    public void showTeamsInRank () {

        Collections.sort(teams);

        for (T t:teams
             ) {
            System.out.println(t.getName() + " rating - " + t.getRating());
        }

    }


}
