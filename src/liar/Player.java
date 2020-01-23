/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liar;

import java.util.ArrayList;
import java.util.Arrays;
import javafx.scene.image.ImageView;
/**
 *
 * @author f1610801320
 */
public class Player {
    ImageView[] iconimage;
    ArrayList<Card> cardData = new ArrayList<Card>();
    
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
    public void Player(String playerImage){
        
    }
}
