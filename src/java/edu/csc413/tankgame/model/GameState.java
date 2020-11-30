package edu.csc413.tankgame.model;

import edu.csc413.tankgame.view.RunGameView;

import java.util.*;
import java.util.Collection;
import java.util.TreeMap;
/**
 * GameState represents the state of the game "world." The GameState object tracks all of the moving entities like tanks
 * and shells, and provides the controller of the program (i.e. the GameDriver) access to whatever information it needs
 * to run the game. Essentially, GameState is the "data context" needed for the rest of the program.
 */
public class GameState {
    public static final double TANK_X_LOWER_BOUND = 30.0;
    public static final double TANK_X_UPPER_BOUND = RunGameView.SCREEN_DIMENSIONS.width - 100.0;
    public static final double TANK_Y_LOWER_BOUND = 30.0;
    public static final double TANK_Y_UPPER_BOUND = RunGameView.SCREEN_DIMENSIONS.height - 120.0;

    public static final double SHELL_X_LOWER_BOUND = -10.0;
    public static final double SHELL_X_UPPER_BOUND = RunGameView.SCREEN_DIMENSIONS.width;
    public static final double SHELL_Y_LOWER_BOUND = -10.0;
    public static final double SHELL_Y_UPPER_BOUND = RunGameView.SCREEN_DIMENSIONS.height;

    public static final String PLAYER_TANK_ID = "player-tank";
    public static final String AI_TANK_ID_NEUTRAL = "ai-tank";
    // TODO: Feel free to add more tank IDs if you want to support multiple AI tanks! Just make sure they're unique.
    //public static final String AI_TANK_ID_MIRROR = "ai-tank-mirror";

    // TODO: Implement.
    // There's a lot of information the GameState will need to store to provide contextual information. Add whatever
    // instance variables, constructors, and methods are needed.
    private int direction;
    public static final int Forward = 1;
    public static final int Backward = 2;
    public static final int Left = 3;
    public static final int Right = 4;

    private final TreeMap<String, Entity> tanks = new TreeMap<>();
    public void addTank(Entity tank) {
        tanks.put(tank.getId(), tank);
    }
    public void movement(int direction){
        this.direction=direction;
        tanks.get(PLAYER_TANK_ID).move(this);
    }
    public Collection<Entity> getTanks(){
        return tanks.values();
    }

    public int getDirection() {
        return direction;
    }

}
