/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liar;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.application.Application;

/**
 *
 * @author f1712290040
 */

public  class CountDown {
    
    
    protected static void initLine() {


        Timeline line = new Timeline(new KeyFrame(Duration.millis(1000), new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
            System.out.println("test");
            }
        }));
        line.setCycleCount(20);
        line.play();

    }
    
    protected static void CountDown(){
      //  initLine();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   /* private  int time;
    private static Timeline line;
    private static void initLine(){
         line = new Timeline(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>(){
        @Override
            public void handle(ActionEvent event) {
              System.out.println("test1");
            }
    }
    ));
     line.setCycleCount(1);
        line.play();
    }
    public static void CountDown(){
     initLine();
    }
    
    */
}
