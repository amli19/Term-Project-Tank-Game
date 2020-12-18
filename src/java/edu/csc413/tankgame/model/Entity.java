package edu.csc413.tankgame.model;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public abstract class Entity {
    private final String id;
    private static double x;
    private static double y;
    private static double angle;
    private double MOVEMENT_SPEED;
    private double TURN_SPEED = Math.toRadians(3.0);
    private static double height;
    private static double width;
    private boolean forward;//is also going forward?

    public void move(GameState state){

    }


    public Entity(String id, double x, double y, double angle,  double height, double width) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.angle = angle;
        this.height=height;
        this.width=width;

    }


    protected void moveForward() {
        forward=true;
        x += MOVEMENT_SPEED * Math.cos(angle);
        y += MOVEMENT_SPEED * Math.sin(angle);
    }

    protected void moveBackward() {
        forward=false;
        x -= MOVEMENT_SPEED * Math.cos(angle);
        y -= MOVEMENT_SPEED * Math.sin(angle);
    }

    protected void turnLeft() {
        angle -= TURN_SPEED;
        if(forward){
            moveForward();
        }
        else{moveBackward();}
    }

    protected void turnRight() {
        angle += TURN_SPEED;
        if(forward){
            moveForward();
        }
        else{moveBackward();}
    }

    public String getId() {
        return id;
    }

    public static double getX() {
        return x;
    }

    public static double getY() {
        return y;
    }

    public static double getAngle() {
        return angle;
    }


    public static double getHeight() {
        return height;
    }

    public static double getWidth() {
        return width;
    }




    public void add(Entity entity) {

    }
}
