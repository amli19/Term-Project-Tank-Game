package edu.csc413.tankgame;

import edu.csc413.tankgame.model.Entity;
import edu.csc413.tankgame.model.GameState;
import edu.csc413.tankgame.model.Shell;
import edu.csc413.tankgame.model.Tank;
import edu.csc413.tankgame.view.MainView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class ButtonPress implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

//    ActionListener act = new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            if (e.getActionCommand().equals("start_ac")) {
//
//            }
//            else {
//
//            }
//
//        }
//    };
//    MainView mainView = new MainView(act);
//    GameState gameState = new GameState();
//
//    @Override
//    public void keyTyped(KeyEvent e) {
//
//    }
//
//    @Override
//    public void keyPressed(KeyEvent e) {
//
////                int keyC = e.getKeyCode();
////                if(keyC==KeyEvent.VK_W){
////                    Tank.move();
////                }
////                if(keyC==KeyEvent.VK_S){
////                    Tank.move(GameState.);
////                }
////                if(keyC==KeyEvent.VK_L){
////                    Tank.move(GameState.);
////                }
////                if(keyC==KeyEvent.VK_D){
////                    Tank.move(GameState.);
////                }
////                if (keyC==KeyEvent.VK_SPACE){
////                    Tank.shoot(gameState.addEntity(/*make a shell*/));
////                }
////                if(keyC==KeyEvent.VK_ESCAPE){
////                    mainView.setScreen(MainView.Screen.START_MENU_SCREEN);
////                }
//    }
//
//    @Override
//    public void keyReleased(KeyEvent e) {
////        int keyC = e.getKeyCode();
////        if(keyC==KeyEvent.VK_W){
////            Tank.move();
////        }
////        if(keyC==KeyEvent.VK_S){
////            Tank.move(GameState.);
////        }
////        if(keyC==KeyEvent.VK_L){
////            Tank.move(GameState.);
////        }
////        if(keyC==KeyEvent.VK_D){
////            Tank.move(GameState.);
////        }
//
//
//    }
}
