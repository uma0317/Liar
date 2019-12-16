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
        
        setGameEndScene(primaryStage);
        setGameStartScene(primaryStage);
        setPlayerDispScene(primaryStage);
        setCardChoiseScene(primaryStage);
        setDoubtCheckScene(primaryStage);
        setDoubtPlayerCheckScene(secondaryStage);
        setDoubtResultScene(primaryStage);
        transitionScene(primaryStage, gameStartScene);
    }
    
    static void transitionScene(Stage stage, Scene changeScene) {
        stage.setScene(changeScene);
        stage.show();
    }
    
    private void setGameStartScene(Stage primaryStage) {
        Button btn = new Button();
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Stage secondaryStage = new Stage();
        
        Scene scene = new Scene(root, 300, 250);
    }
    
    private void setGameEndScene(Stage primaryStage) {
        
    }
    
    private void setPlayerDispScene(Stage primaryStage) {
        
    }
    
    private void setCardChoiseScene(Stage primaryStage) {
        
    }
    
    private void setDoubtCheckScene(Stage primaryStage) {
        
    }
    
    private void setDoubtPlayerCheckScene(Stage secondaryStage) {
        
    }
    
    private void setDoubtResultScene(Stage primaryStage) {
        
    }
}
