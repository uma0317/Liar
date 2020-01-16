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
import javafx.stage.Stage;

/**
 *
 * @author f1610801320
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
//        setPlayerDispScene(primaryStage);
        setCardChoiseScene(primaryStage);
//        setDoubtCheckScene(primaryStage);
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
        subTitleLabel.setTranslateY(-180);
        playerFormMessageLabel.setTranslateX(-30);
        inputPlayerNumForm.setTranslateX(30);
        gameStartBtn.setTranslateY(150);
        gameStartBtn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                transitionScene(primaryStage, cardChoiseScene);
            }
        });
        pane.getChildren().addAll(gameStartBtn, inputPlayerNumForm, playerFormMessageLabel, titleLabel, subTitleLabel);
        
        Scene scene = new Scene(pane, 300, 250);
        gameStartScene = scene;
    }
    
    private void setGameEndScene(Stage primaryStage) {
        
    }
    
    private void setPlayerDispScene(Stage primaryStage) {
        
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
