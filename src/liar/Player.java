/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liar;

import java.util.ArrayList;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
/**
 *
 * @author f1712200261
 */
public class Player {
    ImageView[] iconimage;
    ArrayList<Card> cardData;
    
    public void deleteCardData(Card[] cards){
        for(int n=0;n<cards.length;n++){
            Card card = cards[n];
            for(int m=0; m < cardData.size();m++){
                Card cd = cardData.get(m);
                if(card.getNumber() == cd.getNumber()){
                    cardData.remove(m);
                }
            }
        }
            
    }
    public void setCardData(Card[] cards){
        for(int n=0;n<cards.length;n++){
            cardData.add(cards[n]);
        }
    }
    public ArrayList<Card> getCardData(){
        return cardData;
    }
    public ImageView getIconImage(int expression){
        return iconimage[expression];
    }
    public void Player(int playerNum){//(String playerImage){
        Image img0 = new Image("resources/Player/player" + (playerNum+1)+ "/afraid-icon.png" );
        Image img1 = new Image("resources/Player/player" + (playerNum+1)+ "/doubt-icon.png" );
        Image img2 = new Image("resources/Player/player" + (playerNum+1)+ "/normal-icon.png" );
        Image img3 = new Image("resources/Player/player" + (playerNum+1)+ "/truth-icon.png" );
        Image img4 = new Image("resources/Player/player" + (playerNum+1)+ "/win-icon.png" );
        
        iconimage = new ImageView[5];
        iconimage[0] = new ImageView(img0);
        iconimage[1] = new ImageView(img1);
        iconimage[2] = new ImageView(img2);
        iconimage[3] = new ImageView(img3);
        iconimage[4] = new ImageView(img4);
    }
}
