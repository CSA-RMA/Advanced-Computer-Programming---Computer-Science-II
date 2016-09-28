import java.util.ArrayList;
public class Team {
    String teamname;
    int maxsize=-1;
    ArrayList<Player> players=new ArrayList<>();
    public Team(String fc_Barcelona) {
        teamname=fc_Barcelona;
    }
    public String getName() {
        return teamname;
    }
    void addPlayer(Player brian) {
        if(maxsize<=-1||players.size()<maxsize) {
            players.add(brian);
        }
    }
    int goals() {
        int finalint=0;
        for(int i=0;i<players.size();i++) {
            finalint=finalint+players.get(i).getGoals();
        }
        return finalint;
    }
    void setMaxSize(int i) {
        maxsize=i;
    }
    int size() {
        return players.size();
    }
    public void printPlayers() {
        for(int i=0;i<players.size();i++) {
            System.out.println(players.get(i));
        }
    }
}