/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liar;

import java.util.ArrayList;
import java.util.Arrays;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.animation.Timeline;
import static liar.GUIParts.cardDropDownForm;

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
        subTitleLabel.setTranslateY(-180);
        playerFormMessageLabel.setTranslateX(-30);
        inputPlayerNumForm.setTranslateX(30);
        gameStartBtn.setTranslateY(150);
        gameStartBtn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                input = new InputControl(inputPlayerNumForm.getValue());
                input.countThemeCard();
                input.changeCurrentPlayer();
                transitionScene(primaryStage, cardChoiseScene);
                
                ArrayList<Card> fieldCards = input.getFieldCards();
                int size = fieldCards.size();
                GUIParts.setFieldCardLabel(size);
                
                int themeCard = input.getThemeCard();
                GUIParts.setThemeCardLabel(themeCard);
                
                int[] cardData = input.divideHandCard();
                GUIParts.setCardDropDownForm(cardData);
            }
        });
        pane.getChildren().addAll(gameStartBtn, inputPlayerNumForm, playerFormMessageLabel, titleLabel, subTitleLabel);
        
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
        StackPane pane = new StackPane();
        themeCardLabel.setTranslateY(-220);
        themeCardLabel.setTranslateX(220);
        fieldCardLabel.setTranslateY(-20);

        System.out.println("size: " + cardDropDownForm.size());
//        for (int i = 0; i < 5; i++) {
//            ComboBox<Integer> dropDown = cardDropDownForm.get(i);
//            dropDown.setTranslateX(width / 5 * i - width / 2);
//            pane.getChildren().add(dropDown);
//        }
        
        int x = -200;
        int y = 100;
        for (int i = 0; i < cardDropDownForm.size(); i++) {
            ComboBox<Integer> dropDown = cardDropDownForm.get(i);
            switch((i + 1) % 3) {
                case 0:
                    y = 100;
                    break;
                case 1:
                    x += 50;
                    y = 0;
                    break;
                case 2:
                    y = 50;
                    break;
            }
            dropDown.setTranslateX(x);
            dropDown.setTranslateY(y);
            pane.getChildren().add(dropDown);
        }
        desicionButton.setTranslateX(150);
        desicionButton.setTranslateY(50);
        desicionButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Player currentPlayer = input.getCurrentPlayer();
                int sum   = 0;
                int index = 0;
                Card[] selectedCards = new Card[13];
                
                for (int i = 0; i < cardDropDownForm.size(); i++) {
                    ComboBox<Integer> dropDown = cardDropDownForm.get(i);
                    if(dropDown.getValue() != 0) {
                        int val = dropDown.getValue();
                        for (int j = 0; j < val; j++) {
                            selectedCards[index] = new Card(i + 1, ""); //ほんとはマークも確認したほうが良い
                            index++;
                        }
                        sum += val;
                    }
                }
                
                //4枚までしか同時に出せない
                if(sum > 4) return; 
                
                input.setFieldCards(selectedCards);
                input.setGarbageCards(selectedCards);
                currentPlayer.deleteCardData(selectedCards);
                
                ArrayList<Card> cardData = currentPlayer.getCardData();
                int size = cardData.size();
                setCurrentNumberOfLabel(size);
                System.out.println(Arrays.toString(selectedCards));
                System.out.println("sum: " + sum);
            }
        });
        
        pane.getChildren().addAll(fieldCardLabel, themeCardLabel, desicionButton);
        Scene scene = new Scene(pane, 300, 250);
        cardChoiseScene = scene;
    }
    
    private void setDoubtCheckScene(Stage primaryStage) {
        StackPane pane = new StackPane();
        pane.setStyle("-fx-background-color: #FFFFFF;");
        daubtButton.setTranslateY(200);
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
        
        Circle TimerCircle = new Circle();
        
        TimerCircle.setTranslateY(-30);
        TimerCircle.setRadius(130.0f);
        TimerCircle.setStroke(Color.rgb(251,89,74,1));
        TimerCircle.setFill(null);
        
        timerLabel.setTranslateY(-10);
        
        pane.getChildren().addAll(daubtButton,doubtPlayerView,handCardLabel,numberOfCardLabel,timerLabel,TimerCircle);
        
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
