package edu.csc413.tankgame.model;

import javax.swing.text.html.parser.Entity;

public class DefaultAITank extends Tank{
    public DefaultAITank(String id, double x, double y, double angle) {
        super(id, x, y, angle);
    }

    public void move(GameState gameState){
        super.moveForward();

    }
}
