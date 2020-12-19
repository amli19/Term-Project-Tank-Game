package edu.csc413.tankgame.model;


public class DefaultAITank extends Tank{


    public DefaultAITank(String id, double x, double y, double angle) {
        super(id, x, y, angle);
    }
    private static final double TURN_SPEED = Math.toRadians(3.0);


//    @Override
//    public void shoot(int x, int y, int angle, GameState gameState) {
//        super.shoot(x, y, angle, gameState);
//    }

    public void move(GameState gameState){
        moveForward();
//        super.move(gameState);
//
//        double dx = PlayerTank.getX()- getX();
//        double dy = PlayerTank.getY() - getY();
//        double angleToPlayer = Math.atan2(dy,dx);
//        double angleDifference = getAngle() - angleToPlayer;
//        angleDifference -= Math.floor(angleDifference / Math.toRadians(360.0)+0.5) * Math.toRadians(360.0);
//
//        if(angleDifference< -TURN_SPEED){
//            turnRight();
//        }
//        else if(angleDifference > TURN_SPEED){
//            turnLeft();
//        }
//
//        double distance = Math.sqrt(dx * dx + dy * dy);
//        if(distance<400.0){
//            moveForward();
//        }
//        else if(distance<200.0){
//            moveBackward();
//        }


    }
}
