package edu.csc413.tankgame.model;

public abstract class Entity {
    private final String id;
    private double x;
    private double y;
    private double angle;
    private static final double MOVEMENT_SPEED = 2.0;
    private static final double TURN_SPEED = Math.toRadians(3.0);
    private boolean forward;
    public abstract void move(GameState state);


    public Entity(String id, double x, double y, double angle) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.angle = angle;
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

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getAngle() {
        return angle;
    }



    private double getShellX() {
        return getX() + 30.0 * (Math.cos(getAngle()) + 0.5);
    }

    private double getShellY() {
        return getY() + 30.0 * (Math.sin(getAngle()) + 0.5);
    }


}
