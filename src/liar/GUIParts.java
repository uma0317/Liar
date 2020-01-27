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
import javafx.scene.paint.Color;

/**
 *
 * @author f1712200261
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
    ImageView currentPlayerExpressionView;
    Label doubtTitleLabel, doubtResultLabel, messageLabel;
    
    protected void initButton() {
        gameStartBtn = new Button("ゲーム開始");
        gameStartBtn.setStyle("-fx-background-color: #f08084; -fx-text-fill: #FFFFFF");

    }
    
    protected void initComboBox() {
        inputPlayerNumForm = new ComboBox<Integer>();
        inputPlayerNumForm.getItems().addAll(3, 4, 5, 6, 7, 8);
    }
    
    protected void initImage() {
        
    }
    
    protected void initImageView() {
        
    }
    
    protected void initLabel() {
        playerFormMessageLabel = new Label("プレイヤー数");
        titleLabel = new Label("だうと");
        titleLabel.setFont(new Font(40));

        subTitleLabel = new Label("-ライアーゲーム予選-");
        subTitleLabel.setFont(new Font(20));
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
    
    protected void setDoubtTitleLabel(boolean judge) {
        if(judge == true){
            doubtTitleLabel = new Label("-ダウト成功-");
            doubtTitleLabel.setTextFill(Color.rgb(38,168,38));
        }else{
            doubtTitleLabel = new Label("-ダウト失敗-");
            doubtTitleLabel.setTextFill(Color.rgb(251,89,74));
        }
    }

    protected void setDoubtResultLabel(boolean judge, int theme, int garbage) {
        if(judge == true){
            doubtResultLabel = new Label(theme + "ではなく" + garbage + "だった");
        }
    }
    
    protected void setMessageLabel(boolean judge) {
        if(judge == true){
            messageLabel = new Label("は嘘を見破った！");
        }else{
            messageLabel = new Label("は人を疑いすぎだ！");
        }
    }
    
    protected void setCPExpressionView(boolean judge){
        Player currentPlayer = new InputControl().getCurrentPlayer();
        if(judge == true){
            currentPlayerExpressionView = currentPlayer.getIconImage(1);
        }else{
            currentPlayerExpressionView = currentPlayer.getIconImage(3);
        }
    }
    protected static void setCurrentNumberOfLabel(int cardDataNum) {
        
    }
}
