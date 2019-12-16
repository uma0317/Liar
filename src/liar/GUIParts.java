/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liar;

import java.util.ArrayList;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;

/**
 *
 * @author f1610801320
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
    
    //カード選択
    Image fieldCardsFrameImage;
    ImageView currentPlayerView, fieldCardsFrameImageView;
    Button startButton, desicionButton;
    ArrayList<ComboBox<Integer>> cardDropDownForm;
    Label fieldCardLabel, themeCardLabel;
    Label[] patternLabel, currentNumberOfCardList;
    
    //ダウト確認
    Image themeFrameImage, doubtButtonImage;
    ImageView doubtPlayerView, themeFrameImageView;
    Label timerLabel, numberOfCardLabel;
    
    //ダウト結果
    Label doubtTitleLabel, doubtResultLabel, messageLabel;
    
    protected void initButton() {
        gameStartBtn = new Button("ゲーム開始");
        gameStartBtn.setStyle("-fx-background-color: #fo8o84; -fx-text-fill: #FFFFFF");
    }
    
    protected void initComboBox() {
        
    }
    
    protected void initImage() {
        
    }
    
    protected void initImageView() {
        
    }
    
    protected void initLabel() {
        
    }
    
    protected void GUIParts() {
        
    }
    
    protected static void setCardDropDownForm(int[] divideCardData) {
        
    }
    
    protected static void setTimerLable(int time) {
        
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
