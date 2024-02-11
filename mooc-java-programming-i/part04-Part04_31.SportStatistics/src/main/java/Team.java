/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed Mostafa
 */
public class Team {
 
    private String name;

    private int games;
    
    private int winnedGames;
    
    private int losedGams;

    public Team(String name, int games, int winnedGames, int losedGams) {
        this.name = name;
        this.games = games;
        this.winnedGames = winnedGames;
        this.losedGams = losedGams;
    }
    
    /**
     * Get the value of losedGams
     *
     * @return the value of losedGams
     */
    public int getLosedGams() {
        return losedGams;
    }

    /**
     * Get the value of winnedGames
     *
     * @return the value of winnedGames
     */
    public int getWinnedGames() {
        return winnedGames;
    }

   

    /**
     * Get the value of games
     *
     * @return the value of games
     */
    public int getGames() {
        return games;
    }

   
    public String getName() {
        return name;
    }

   
   public  void increaseGames(){
    this.games++;
    }
   
   
   public  void increasewiinned(){
    this.winnedGames++;
    } 
   
   
   public  void increaseLosed(){
    this.losedGams++;
    } 

    @Override
    public String toString() {
        return "Team{" + "name=" + name + ", games=" + games + ", winnedGames=" + winnedGames + ", losedGams=" + losedGams + '}';
    }
   
   
}
