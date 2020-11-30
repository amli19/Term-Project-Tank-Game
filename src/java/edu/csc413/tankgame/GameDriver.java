package edu.csc413.tankgame;

import edu.csc413.tankgame.model.*;
import edu.csc413.tankgame.view.MainView;
import edu.csc413.tankgame.view.RunGameView;
import edu.csc413.tankgame.view.StartMenuView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * GameDriver is the primary controller class for the tank game. The game is launched from GameDriver.main, and
 * GameDriver is responsible for running the game loop while coordinating the views and the data models.
 */
public class GameDriver {
    // TODO: Implement.
    // Add the instance variables, constructors, and other methods needed for this class. GameDriver is the centerpiece
    // for the tank game, and should store and manage the other components (i.e. the views and the models). It also is
    // responsible for running the game loop.
    private final MainView mainView;
    private final RunGameView runGameView;
    private final GameState gameState;

    public GameDriver() {

        ActionListener act = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("start_ac")) {
                    mainView.setScreen(MainView.Screen.RUN_GAME_SCREEN);
                    runGame();
                }
                else {
                    mainView.closeGame();
                }

            }
        };

        mainView = new MainView(act);
        runGameView = mainView.getRunGameView();
        gameState = new GameState();
        //KeyListener for movement input

        KeyListener key = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyC = e.getKeyCode();
                if(keyC==KeyEvent.VK_W){
                    gameState.movement(GameState.Forward);
                }
                if(keyC==KeyEvent.VK_S){
                    gameState.movement(GameState.Backward);
                }
                if(keyC==KeyEvent.VK_L){
                    gameState.movement(GameState.Left);
                }
                if(keyC==KeyEvent.VK_D){
                    gameState.movement(GameState.Right);
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };

    }

    public void start() {
        // TODO: Implement.
        // This should set the MainView's screen to the start menu screen.
        mainView.setScreen(MainView.Screen.START_MENU_SCREEN);


    }

    private void runGame() {
        Entity playerTank = new PlayerTank(
                GameState.PLAYER_TANK_ID,
                RunGameView.PLAYER_TANK_INITIAL_X,
                RunGameView.PLAYER_TANK_INITIAL_Y,
                RunGameView.PLAYER_TANK_INITIAL_ANGLE);
        Entity aiTank = new DefaultAITank(
                GameState.AI_TANK_ID_NEUTRAL,
                RunGameView.AI_TANK_INITIAL_X,
                RunGameView.AI_TANK_INITIAL_Y,
                RunGameView.AI_TANK_INITIAL_ANGLE);

        runGameView.addDrawableEntity(
                GameState.PLAYER_TANK_ID,
                RunGameView.PLAYER_TANK_IMAGE_FILE,
                playerTank.getX(),
                playerTank.getY(),
                playerTank.getAngle()
        );
        runGameView.addDrawableEntity(
                GameState.AI_TANK_ID_NEUTRAL,
                RunGameView.AI_TANK_IMAGE_FILE,
                aiTank.getX(),
                aiTank.getY(),
                aiTank.getAngle()
        );
        Runnable gameRunner = () -> {
            while (update()) {
                runGameView.repaint();
                try {
                    Thread.sleep(8L);
                } catch (InterruptedException exception) {
                    throw new RuntimeException(exception);
                }
            }
        };
        gameState.addTank(playerTank);
        gameState.addTank(aiTank);

        new Thread(gameRunner).start();
    }

    // TODO: Implement.
    // update should handle one frame of gameplay. All tanks and shells move one step, and all drawn entities
    // should be updated accordingly. It should return true as long as the game continues.
    private boolean update() {
        //Ask all tank shells,etc to move

        //Ask to see if entity out of bounds

        //Check collisions

        //updates locations as things moves

        for(Entity tank: gameState.getTanks()){
            if(tank.getId()!=(GameState.PLAYER_TANK_ID)) {
                tank.move(gameState);
            }
        }

        for(Entity tank : gameState.getTanks()){
            runGameView.setDrawableEntityLocationAndAngle(
                    tank.getId(),
                    tank.getX(),
                    tank.getY(),
                    tank.getAngle());
        }
        return true;
    }

    public static void main(String[] args) {
        GameDriver gameDriver = new GameDriver();
        gameDriver.start();
    }
}
