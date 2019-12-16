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
    private int Playernum;
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
    }
    
    public void clearFieldCards(){
    }
    
    public int[] divideHandCard(){
    }
    
    public void countThemeCard(){
    }
    
    public void changeCurrentPlayer(){
    }
    
    //カード配布
    private void createPlayer(){
    }
    
    private void cardDistribute(){
    }
    
    private void cardShuffle(){
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
