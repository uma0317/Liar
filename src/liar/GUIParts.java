/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liar;

import java.util.ArrayList;
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
    Button  desicionButton;
    ArrayList<ComboBox<Integer>> cardDropDownForm;
    Label fieldCardLabel, themeCardLabel;
    Label[] patternLabel, currentNumberOfCardList;
    
    //ダウト確認
    Button daubtButton;
    Image themeFrameImage, doubtButtonImage;
    ImageView doubtPlayerView, themeFrameImageView;//doubtPlayerView->afraid-icon.png
    Label timerLabel, numberOfCardLabel,handCardLabel;
    
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
        
    }
    
    protected void initComboBox() {
        inputPlayerNumForm = new ComboBox<Integer>();
        inputPlayerNumForm.getItems().addAll(3, 4, 5, 6, 7, 8);
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
        
        nextPlayerLabel = new Label("次は　　　　　　の番だ");
        nextPlayerLabel.setFont(new Font(40));
        
        handCardLabel = new Label("残りカード枚数:"+"16");
        handCardLabel.setFont(new Font(20));
        
        numberOfCardLabel = new Label("出されたカードは "+"\n\t"+"K");
        numberOfCardLabel.setFont(new Font(30));
        
        timerLabel = new Label("null");
       
    }
    
    protected void GUIParts() {
        
    }
    
    protected static void setCardDropDownForm(int[] divideCardData) {
        
    }
    
    protected  void setTimerLable(int time) {
         
         timerLabel = new Label(""+time);
         timerLabel.setFont(new Font(20));
    }
    
    protected static void setFieldCardLabel(int num) {
        
    }
    
    protected static void setThemeLabel(int theme) {
        
    }
    
    protected static void setDoubtTitleLabel(boolean judge) {
        
    }

    protected static void setDoubtResultLabel(boolean judge, int theme, int garbage) {
        
    }
    
    protected static void setMessageLabel(boolean judge) {
        
    }
    
    protected static void setCurrentNumberOfLabel(int cardDataNum) {
        
    }
}
