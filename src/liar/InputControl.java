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
import javafx.application.Application;
import javafx.stage.Stage;
import java.util.*;
public class InputControl {
    private int playerNum;
    private Card card;
    private Card[] initCards=new Card[52];
    private Card[] garbageCards;
    private int themeCard;
    private int count;
    private Player currentPlayer;
    private Player doubtPlayer;
    private ArrayList<Player> players=new ArrayList<Player>();
    private ArrayList<Card> fieldCards=new ArrayList<Card>();
    
            
            
            
    public Player getPlayer(int playerID){
    }
    
    public Player getCurrentPlayer(){
    }
    
    public Player getDoubtPlayer(){
    }
    
    public  int getThemeCard(){
    }
    
    public ArrayList<Card> getFieldCards(){
    
    }
    public void setFieldCards(Card cards[]){
    }
    
    public void setGarbageCards(Card[] cards){
        garbageCards = cards;
    }
    
    public void clearFieldCards(){
    }
    
    public int[] divideHandCard(){
    }
    
    public void countThemeCard(){
        themeCard++;
        if(themeCard>13)
               themeCard=1;
    }
    
    public void changeCurrentPlayer(){
        count++;
        currentPlayer = players.get(count%playerNum);
    }
    
    //カード配布
    private void createPlayer(){
    }
    
    private void cardDistribute(){
    }
    
    private void cardShuffle(){
        int SHUFFLE_LENGTH = 52;
        int i = SHUFFLE_LENGTH;
        do{
            int j= (int)Math.random()*(i+1);
            Card tmp = initCards[i];
            initCards[i] = initCards[j];
            initCards[j] = tmp;
        }while(i>0);
    }

    //ダウト選択
    public void setDoubtPlayer(Player player){
    }
    
    //ダウト結果
    public void cardProcess(boolean flag){
    }
    
    public boolean doubtCheck(){
        return true;
    }
    
    public boolean winnerCheck(){
        return true;
    }



}
