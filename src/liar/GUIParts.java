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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.text.Font;

/**
 *
 * @author f1712290040
 */
public class GUIParts {
    Image[][] iconImage;
    ImageView[][] iconImageView;
    Label playerDispLabel1, playerDispLabel2;
    
    //カード配布
    Button gameStartBtn;
    Image imageRight, imageLeft;
    ImageView imageRightView, imageLeftView;
    Label playerFormMessageLabel, titleLabel, subTitleLabel;
    ComboBox<Integer> inputPlayerNumForm;
    
    //ゲーム終了
    Image finalResultImageRight, finalResultImageLeft;
    ImageView finalResultImageRightView, finalResultImageLeftView;
    Label finalResultTitleLabel;
    
    //プレイヤー確認
    Image DaubtButtonImage;
    Button startButton;
    Label nextPlayerLabel;
    
    
    //カード選択
    Image fieldCardsFrameImage;
    ImageView currentPlayerView, fieldCardsFrameImageView;
    static Button startButton, desicionButton;
    static ArrayList<ComboBox<Integer>> cardDropDownForm;
    static Label fieldCardLabel, themeCardLabel;
    Label[] patternLabel, currentNumberOfCardList;
    
    //ダウト確認
    Button daubtButton;
    Image themeFrameImage, doubtButtonImage;
    ImageView doubtPlayerView, themeFrameImageView;//doubtPlayerView->afraid-icon.png
    static Label timerLabel, numberOfCardLabel, handCardLabel;
    
    //ダウト結果
    Label doubtTitleLabel, doubtResultLabel, messageLabel;
    
    protected void initButton() {
        gameStartBtn = new Button("ゲーム開始");
        gameStartBtn.setStyle("-fx-background-color: #f08084; -fx-text-fill: #FFFFFF");
        

        startButton = new Button("はじめる");
        startButton.setStyle("-fx-background-color: #fb594a; -fx-text-fill: #FFFFFF;-fx-pref-height: 6.0em;-fx-pref-width: 6.0em;-fx-background-radius: 16.0em;-fx-border-radius: 16.0em;");
        startButton.setFont( new Font(30));
        
        DaubtButtonImage = new Image("file:C:\\Users\\f1712290040\\Documents\\GitHub\\Liar\\src\\resources\\doubtButton.png");
        daubtButton = new Button(" ");
        daubtButton.setGraphic(new ImageView(DaubtButtonImage));
        
        desicionButton = new Button("決定");

    }
    
    protected void initComboBox() {
        inputPlayerNumForm = new ComboBox<Integer>();
        inputPlayerNumForm.getItems().addAll(3, 4, 5, 6, 7, 8);
        inputPlayerNumForm.setValue(3);
        
        //カード選択シーン
        cardDropDownForm = new ArrayList<ComboBox<Integer>>();
        for (int i = 0; i < 13; i++) {
            cardDropDownForm.add(new ComboBox<Integer>());
        }
    }
    
    protected void initImage() {
        
    }
    
    protected void initImageView() {
        Image image1 = new Image("file:C:\\Users\\f1712290040\\Documents\\GitHub\\Liar\\src\\resources\\Player\\player7\\normal-icon.png" );
        currentPlayerView = new ImageView(image1);
         Image image2 = new Image("file:C:\\Users\\f1712290040\\Documents\\GitHub\\Liar\\src\\resources\\Player\\player7\\normal-icon.png" );
        doubtPlayerView= new ImageView(image2);
     
        
    }
    
    protected void initLabel() {
        playerFormMessageLabel = new Label("プレイヤー数");
        titleLabel = new Label("だうと");
        titleLabel.setFont(new Font(40));

        subTitleLabel = new Label("-ライアーゲーム予選-");
        subTitleLabel.setFont(new Font(20));
        
        //カード選択シーン
        fieldCardLabel = new Label();
        themeCardLabel = new Label();

        //ダウと確認
        numberOfCardLabel = new Label();
    }
    
    protected void GUIParts() {
        
    }
    
    protected static void setCardDropDownForm(int[] divideCardData) {
//        for (int i = 0; i < divideCardData.length; i++) {
//            ComboBox<Integer> dropDown = new ComboBox<Integer>();
//            for (int j = 0; j < divideCardData[i]; j++) {
//                dropDown.getItems().add(j + 1);
//            }
//            cardDropDownForm.add(dropDown);
//        }
        for (int i = 0; i < divideCardData.length; i++) {
            ComboBox<Integer> dropDown = cardDropDownForm.get(i);
            
            for (int j = 0; j <= divideCardData[i]; j++) {
                dropDown.getItems().add(j);
            }
            dropDown.setValue(0);
        }
    }
    
    protected  void setTimerLable(int time) {
         
         timerLabel = new Label(""+time);
         timerLabel.setFont(new Font(20));
    }
    
    protected static void setFieldCardLabel(int num) {
        fieldCardLabel.setText(num + "枚");
    }
    
    protected static void setThemeCardLabel(int theme) {
        themeCardLabel.setText("次出すのは " + theme);
    }
    
    protected static void setDoubtTitleLabel(boolean judge) {
        
    }

    protected static void setDoubtResultLabel(boolean judge, int theme, int garbage) {
        
    }
    
    protected static void setMessageLabel(boolean judge) {
        
    }
    
    protected static void setCurrentNumberOfLabel(int cardDataNum) {
        numberOfCardLabel.setText("残りカード数: " + cardDataNum);
    }
}
