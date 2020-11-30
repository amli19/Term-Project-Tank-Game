package edu.csc413.tankgame.model;

public class PlayerTank extends Tank{
    public PlayerTank(String id, double x, double y, double angle) {
        super(id, x, y, angle);
    }
    public void move(GameState gameState){
        switch(gameState.getDirection()) {
            case GameState.Forward:
                moveForward();
                break;
            case GameState.Backward:
                moveBackward();
                break;
            case GameState.Left:
                turnLeft();
                break;
            case GameState.Right:
                turnRight();
                break;
        }

    }

}
