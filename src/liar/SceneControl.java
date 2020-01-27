/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liar;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.animation.Timeline;

/**
 *
 * @author f1712290040
 */
public class SceneControl extends GUIParts{
    private InputControl input;
    static Scene gameStartScene, gameEndScene, playerDispScene, cardChoiseScene, doubtCheckScene, doubtPlayerCheckScene, doubtResultScene;
    
    SceneControl(Stage primaryStage, Stage secondaryStage) {
        initButton();
        initComboBox();
        initImage();
        initLabel();
        initImageView();
        
//        setGameEndScene(primaryStage);
        setGameStartScene(primaryStage);
        setPlayerDispScene(primaryStage);
        setCardChoiseScene(primaryStage);
        setDoubtCheckScene(primaryStage);
        setDoubtPlayerCheckScene(secondaryStage);
//        setDoubtResultScene(primaryStage);
//        transitionScene(primaryStage, gameStartScene);
    }
    
    static void transitionScene(Stage stage, Scene changeScene) {
        stage.setScene(changeScene);
        stage.show();
    }
    
    private void setGameStartScene(Stage primaryStage) {      
        StackPane pane = new StackPane();

        titleLabel.setTranslateY(-220);
        subTitleLabel.setTranslateY(-170);
        playerFormMessageLabel.setTranslateX(-30);
        inputPlayerNumForm.setTranslateX(30);
        gameStartBtn.setTranslateY(150);
        gameStartBtn.setScaleX(3);
         gameStartBtn.setScaleY(3);
         imageRightView.setTranslateX(250);
         imageRightView.setTranslateY(0);
         imageRightView.setScaleX(0.9);
          imageRightView.setScaleY(0.9);
         imageLeftView.setTranslateX(-250);
         imageLeftView.setTranslateY(0);
         imageLeftView.setScaleX(0.9);
          imageLeftView.setScaleY(0.9);
        gameStartBtn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                transitionScene(primaryStage, cardChoiseScene);
            }
        });
        pane.getChildren().addAll(gameStartBtn, inputPlayerNumForm, playerFormMessageLabel, titleLabel,subTitleLabel,imageRightView,imageLeftView);
        
        Scene scene = new Scene(pane, 300, 250);
        gameStartScene = scene;
    }
    
    private void setGameEndScene(Stage primaryStage) {
        
    }
    
    private void setPlayerDispScene(Stage primaryStage) {
        StackPane pane = new StackPane();
        pane.setStyle("-fx-background-color: #FFFFFF;");
        startButton.setTranslateY(100);
        startButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                transitionScene(primaryStage, cardChoiseScene);
            }
        });
        currentPlayerView.setTranslateX(-150);
        currentPlayerView.setTranslateY(-200);
        currentPlayerView.setScaleX(0.8);
        currentPlayerView.setScaleY(0.8);
        nextPlayerLabel.setTranslateX(-140);
        nextPlayerLabel.setTranslateY(-200);
        pane.getChildren().addAll(startButton,currentPlayerView,nextPlayerLabel);
        
        Scene scene = new Scene(pane, 300, 250);
        playerDispScene = scene;
    }
    
    private void setCardChoiseScene(Stage primaryStage) {
        Button btn = new Button();
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("カードチョイス");
            }
        });
        
        StackPane pane = new StackPane();
        pane.getChildren().add(btn);
        
        Scene scene = new Scene(pane, 300, 250);
        cardChoiseScene = scene;
    }
    
    private void setDoubtCheckScene(Stage primaryStage) {
        StackPane pane = new StackPane();
        pane.setStyle("-fx-background-color: #FFFFFF;");
        daubtButton.setTranslateY(0);
        daubtButton.setScaleX(0.5);
        daubtButton.setScaleY(0.5);
        daubtButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                transitionScene(primaryStage, cardChoiseScene);
            }
        });
        doubtPlayerView.setTranslateX(-300);
        doubtPlayerView.setTranslateY(-200);
        doubtPlayerView.setScaleX(0.5);
        doubtPlayerView.setScaleY(0.5);
        handCardLabel.setTranslateX(-300);
        handCardLabel.setTranslateY(-250);
        numberOfCardLabel.setTranslateX(270);
        numberOfCardLabel.setTranslateY(-220);
        
        passButton. setTranslateY(150);
        passButton.setScaleX(0.5);
        passButton.setScaleY(0.5);
       /* Circle TimerCircle = new Circle();
        
        TimerCircle.setTranslateY(-30);
        TimerCircle.setRadius(130.0f);
        TimerCircle.setStroke(Color.rgb(251,89,74,1));
        TimerCircle.setFill(null);
         */pane.getChildren().addAll(daubtButton,passButton,doubtPlayerView,handCardLabel,numberOfCardLabel);
       
         
             Scene scene = new Scene(pane, 300, 250);
            doubtCheckScene = scene;
           
               
               
            
            
        
    }
    
    private void setDoubtPlayerCheckScene(Stage secondaryStage) {
                Button btn = new Button();
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("ゲーム開始");
            }
        });
        
        StackPane pane = new StackPane();
        pane.getChildren().add(btn);
        
        Scene scene = new Scene(pane, 300, 250);
        doubtPlayerCheckScene = scene;
    }
    
    private void setDoubtResultScene(Stage primaryStage) {
        
    }
}