/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;
/**
 *
 * @author Raziel Martínez
 */
public class Generics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballleague = new League<>("La Liga");
        Team<FootballPlayer> Campers = new Team<>("Campers");
        Team<FootballPlayer> Deckers = new Team<>("Deckers");
        Team<FootballPlayer> Kekers = new Team<>("Kekers");
        Team<BaseballPlayer> Borrowski = new Team<>("Borrowskis");
        Campers.matchResult(Deckers, 1, 0);
        Campers.matchResult(Kekers, 0, 2);

        footballleague.add(Borrowski);
        footballleague.add(Deckers);
        footballleague.add(Kekers);
        footballleague.add(Campers);
        
    }
    
}
