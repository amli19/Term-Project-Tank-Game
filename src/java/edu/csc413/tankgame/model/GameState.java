package edu.csc413.tankgame.model;

import edu.csc413.tankgame.ButtonPress;
import edu.csc413.tankgame.view.RunGameView;


import java.util.*;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
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


    //private GameState gameState;


    private final List<Entity> entity= new ArrayList<>();//new list of entities



    public void addEntity(Entity entity) {
        entity.add(entity);
    }


    public String getEntityID(){
        return PLAYER_TANK_ID;
    }
//    public Entity getID(String id){
//        return entity.get(id);
//    }

    public List<Entity> getEntity() {
        return entity;
    }

    public void shoot(GameState gameState){

    }



    ButtonPress buttonPress = new ButtonPress();




}
