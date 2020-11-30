package edu.csc413.tankgame.model;


public class DefaultAITank extends Entity{
    public DefaultAITank(String id, double x, double y, double angle) {
        super(id, x, y, angle);
    }

    public void move(GameState gameState){
        moveForward();
        turnRight();

    }
}
