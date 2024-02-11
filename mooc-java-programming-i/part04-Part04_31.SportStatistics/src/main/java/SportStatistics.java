
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Team> teams = new ArrayList<Team>();
        //get file name from user 
        System.out.println("File:");
        String file = scanner.nextLine();
        // read data
        teams = readData(file);
        //search about team
        System.out.println("Team:");
        String teamName = scanner.nextLine();

        for (Team t : teams) {
            if (t.getName().equals(teamName)) {

                System.out.println("Games: " + t.getGames());
                System.out.println("Wins: " + t.getWinnedGames());
                System.out.println("Losses: " + t.getLosedGams());
            }

        }
        if (!isInList(teamName, teams)) {
            System.out.println("Games: " + 0);
            System.out.println("Wins: " + 0);
            System.out.println("Losses: " + 0);

        }

//        teams.forEach((t) -> {
//            System.out.println(t);
//        });
    }

    public static List<Team> readData(String file) {
        List<Team> teams = new ArrayList<>();
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String next[] = fileScanner.nextLine().split(",");

                if (getIndexByName(next[0], teams) == -1 && getIndexByName(next[1], teams) == -1) {
                    boolean oneIsWinner = Integer.valueOf(next[2]) > Integer.valueOf(next[3]);
                    Team team1 = new Team(next[0], 1, oneIsWinner ? 1 : 0, !oneIsWinner ? 1 : 0);
                    Team team2 = new Team(next[1], 1, !oneIsWinner ? 1 : 0, oneIsWinner ? 1 : 0);

                    teams.add(team1);
                    teams.add(team2);
                } else if (!teams.isEmpty()) {
                    if (isInList(next[0], teams)) {
                        int objectIndex = getIndexByName(next[0], teams);
                        teams.get(objectIndex).increaseGames();
                        if (Integer.valueOf(next[2]) > Integer.valueOf(next[3])) {
                            teams.get(objectIndex).increasewiinned();
                        } else {
                            teams.get(objectIndex).increaseLosed();
                        }

                    } else if (!isInList(next[0], teams)) {
                        boolean oneIsWinner = Integer.valueOf(next[2]) > Integer.valueOf(next[3]);
                        teams.add(new Team(next[0], 1, oneIsWinner ? 1 : 0, !oneIsWinner ? 1 : 0));

                    }

                    if (isInList(next[1], teams)) {
                        int objectIndex = getIndexByName(next[1], teams);
                        teams.get(objectIndex).increaseGames();
                        if (Integer.valueOf(next[3]) > Integer.valueOf(next[2])) {
                            teams.get(objectIndex).increasewiinned();
                        } else {
                            teams.get(objectIndex).increaseLosed();
                        }

                    } else if (!isInList(next[1], teams)) {
                        boolean oneIsWinner = Integer.valueOf(next[3]) > Integer.valueOf(next[2]);
                        teams.add(new Team(next[1], 1, !oneIsWinner ? 1 : 0, oneIsWinner ? 1 : 0));

                    }

                }

            }

        } catch (Exception e) {
        }

        return teams;
    }

    public static boolean isInList(String teamName, List<Team> ts) {
        boolean isExist = false;

        for (Team iT : ts) {
            if (iT.getName().equals(teamName)) {
                return true;
            }

        }

        return isExist;
    }

    public static int getIndexByName(String name, List<Team> ts) {
        for (int i = 0; i < ts.size(); i++) {
            if (ts.get(i).getName().equals(name)) {
                return i;

            }

        }
        return -1;
    }

}
