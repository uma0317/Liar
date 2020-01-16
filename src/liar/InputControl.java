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
    //private ArrayList<ArrayList<Card[]>> players=new ArrayList<ArrayList<Card[]>>();//playerを格納
    private ArrayList<Player> players=new ArrayList<Player>();//playerを格納
    private ArrayList<Card> fieldCards=new ArrayList<Card>();//山カードデータ
    private ArrayList<Card[]> onePlayerCardList = new ArrayList<Card[]>();//「新規」一人当たりのカード格納
            
            
            
    public Player getPlayer(int playerID){//プレイヤーIDを取得
        return players.get(playerID);
    }
    
    public Player getCurrentPlayer(){//currentPlayerの取得
        return currentPlayer;
    }
    
    public Player getDoubtPlayer(){//doubtPlayerの取得
        return doubtPlayer;
    }
    
    public  int getThemeCard(){//themeCardの取得
        return themeCard;
    }
    
    public ArrayList<Card> getFieldCards(){//山カードデータを取得
        return fieldCards; 
    }
    public void setFieldCards(Card cards[]){//山カードデータのセット
        for(int n=0;n<cards.length;n++){
            fieldCards.add(cards[n]);
        }
    }
    
    public void setGarbageCards(Card[] cards){//garbageCardsにセット
        garbageCards = cards;
    }
    
    public void clearFieldCards(){//山カードデータをすべて削除
        fieldCards.clear();
    }
    
    public int[] divideHandCard(){//Playerのカードデータをトランプ１から13それぞれの枚数をカウントして長さ13の配列で返す
        int divideCard[] = new int[13];
        int work = 0;
        ArrayList<Card> cardData = currentPlayer.getCardData();
        for(int number = 0;number<divideCard.length;number++){
            if((number+1)==cardData.get(work).getNumber())
                divideCard[number]++;
        }
        return divideCard;
    }
    
    public void countThemeCard(){//themeCardの値を1増やす。14以上になるときは1にする
        themeCard++;
        if(themeCard>13)
               themeCard=1;
    }
    
    public void changeCurrentPlayer(){//currentPlayerにplayersから現在のPlayerを取得し代入する
        count++;
        currentPlayer = players.get(count%playerNum);
    }
    //--------------------------↓カード配布---------------------------------------------------------
    
    private void createPlayer(){//プレイヤーのインスタンスをプレイヤー数生成し、playersに格納する
        for(int n=0;n<playerNum;n++){
            Player player = new Player();
            players.add(player);
        }
    }
    
    private void cardDistribute(){//各プレイヤーにカードを配布する
        int onePlayerCard = 52/playerNum;//一人当たりの手札の枚数
        int surplusCard = 52%playerNum;//余りのカード
       
        for(int n=0;n<playerNum;n++){
            for(int i=n*onePlayerCard;i<(n+1)*onePlayerCard;i++){//0~12、13~25、26~38、39~51
                onePlayerCardList.set(i,initCards);
                Player.setCardData(onePlayerCardList);
            }
        }
    }
    
    private void cardShuffle(){//randomを用いてcardをシャッフルする
        int SHUFFLE_LENGTH = 52;
        int i = SHUFFLE_LENGTH;
        do{
            int j= (int)Math.random()*(i+1);
            Card tmp = initCards[i];
            initCards[i] = initCards[j];
            initCards[j] = tmp;
            i++;
        }while(i>0);
    }
//--------------------------↓ダウト選択--------------------------------------------------------------
    
    public void setDoubtPlayer(Player player){//doubtPlayerをセットする
        doubtPlayer = player;
    }
    
    //--------------------------↓ダウト結果--------------------------------------------------------------
    
   
    public void cardProcess(boolean flag){//ダウト判定によってcurrentPlayerかdoubtPlayerにfieldCardsを渡す
        if(flag){
            currentPlayer.setCardData(getFieldCards().toArray(new Card[getFieldCards().size()]));
            doubtPlayer.deleteCardData(getFieldCards().toArray(new Card[getFieldCards().size()]));
        }
        else{
            doubtPlayer.setCardData(getFieldCards().toArray(new Card[getFieldCards().size()]));
            currentPlayer.deleteCardData(getFieldCards().toArray(new Card[getFieldCards().size()]));
        }
    }
    
    public boolean doubtCheck(){//ダウトの正誤判定を行う。garbageCardsとthemeCardを比べて正しくないときはtrueを返す。
        Boolean flag = false;
        for(int n=0;n<garbageCards.length;n++){
            Card card = garbageCards[n];
            if(themeCard!=card.getNumber())
              flag = true;     
        }
        return flag;
    }
    
    public boolean winnerCheck(){//currentPlayerの手札が0枚の時、trueを返す
        ArrayList<Card>cardData =currentPlayer.getCardData();
        if(cardData.isEmpty())
            return true;
        else 
            return false;
    }
    



}
