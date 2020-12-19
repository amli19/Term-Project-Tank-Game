package edu.csc413.tankgame.model;

public class PlayerTank extends Tank{
    private static final double TURN_SPEED = Math.toRadians(3.0);
    public PlayerTank(String id, double x, double y, double angle) {
        super(id, x, y, angle);
    }


//    @Override
//    public void shoot(int x, int y, int angle, GameState gameState) {
//        super.shoot(x, y, angle, gameState);
//    }
}
