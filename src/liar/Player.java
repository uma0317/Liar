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
    public void deleteCardData(Card cards[]){
        n=0;
        m=0;
        while(n<cards.length){
            Card card = cards[n];
            while(m<cardData.length){
                if(Card.getNumber() == cardData[m].getNumber()){
                    
                }
            }
        }
            
    }
    public void setCardData(){
        n=0;
        while(n<cards.length){
            cardData.add(cards[n])
        }
    }
    public ArrayList<Card> getCardData(){
        return cardData;
    }
    public imageView[] getIconImage(int expression){
        return iconImage[expression];
    }
    public void Player(String ){
        
    }
}
