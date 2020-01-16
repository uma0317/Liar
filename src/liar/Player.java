/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liar;

/**
 *
 * @author f1610801320
 */
public class Player {
    imageView[] iconimage;
    ArrayList<Card> cardData;
    public void deleteCardData(Card[] cards){
        for(int n=0;n<cards.length;n++){
            Card card = cards[n];
            for(int m=0;m<cardData.length;m++){
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
    public imageView getIconImage(int expression){
        return iconImage[expression];
    }
    public void Player(String playerImage){
        
    }
}
