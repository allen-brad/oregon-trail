/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;

import java.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author MasterCraft Computer
 */
public class Player implements Serializable
{
    //class instance variables
    private String name;
    OccupationType occupation; //this will get set after object is created
    private ArrayList<Game> games = new ArrayList<Game>();
    private Wagon wagon;

    public Wagon getWagon() {
        return wagon;
    }

    public void setWagon(Wagon wagon) {
        this.wagon = wagon;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public OccupationType getOccupation() {
        return occupation;
    }

    public void setOccupation(OccupationType occupation) {
        this.occupation = occupation;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + Objects.hashCode(this.occupation);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.occupation, other.occupation)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", occupation=" + occupation + '}';
    }

    
    
    public Player() 
    {
    
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }
    
    
}