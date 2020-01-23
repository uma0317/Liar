/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liar;

/**
 *
 * @author f1712290040
 */
import javafx.application.Application;
import javafx.stage.Stage;
import java.util.*;
public class InputControl {
    private int playerNum;
    private Card card;
    private Card[] initCards = new Card[52];
    private Card[] garbageCards;
    private int themeCard;
    private int count;
    private Player currentPlayer;
    private Player doubtPlayer;
    //private ArrayList<ArrayList<Card[]>> players=new ArrayList<ArrayList<Card[]>>();//playerを格納
    private ArrayList<Player> players=new ArrayList<Player>();//playerを格納
    private ArrayList<Card> fieldCards=new ArrayList<Card>();//山カードデータ
    private ArrayList<Card[]> onePlayerCardList = new ArrayList<Card[]>();//「新規」一人当たりのカード格納
            
    InputControl(int playerNum) {
        this.playerNum = playerNum;
        for(int i = 0; i < 4; i++) {
            for(int n = 0; n < 13; n++) {
                Card card;
                String pattern = null;
                switch(i) {
                    case 0:
                        pattern = "Heart";
                        break;
                    case 1:
                        pattern = "Diamond";
                        break;
                    case 2:
                        pattern = "Spade";
                        break;
                    case 3:
                        pattern = "Club";
                        break;
                    default:
                        System.out.println("out");
                }
                card = new Card(n + 1, pattern);
                initCards[n + 13 * i] = card;
            }
        }
        cardShuffle();
        createPlayer(playerNum);
        cardDistribute(playerNum);

    }
            
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

        
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < cardData.size(); j++) {
                if((i + 1) == cardData.get(j).getNumber())
                    divideCard[i]++;
            }
        }
        
//        for(int number = 0; number < divideCard.length; number++){
//            System.out.println((number+1) + ": " + cardData.get(number).getNumber());
//        }
//        System.out.println(Arrays.toString(divideCard));
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
//        GUIParts.currentPlayerView = currentPlayer.getIconImage(playerNum);
    }
    //--------------------------↓カード配布---------------------------------------------------------
    
    private void createPlayer(int playerNum){//プレイヤーのインスタンスをプレイヤー数生成し、playersに格納する
        for(int n = 0; n < playerNum; n++){
            Player player = new Player();
            players.add(player);
        }
    }
    
    private void cardDistribute(int playerNum){//各プレイヤーにカードを配布する
        int onePlayerCard = 52/playerNum;//一人当たりの手札の枚数
        int surplusCard = 52%playerNum;//余りのカード
        for(int n = 0; n < playerNum; n++){
            Card[] cards = new Card[onePlayerCard];
            for(int i = 0; i < onePlayerCard; i++){//0~12、13~25、26~38、39~51
                cards[i] = initCards[i + onePlayerCard * n];
            }
            onePlayerCardList.add(cards);
            players.get(n).setCardData(onePlayerCardList.get(n));
        }
    }
    
    private void cardShuffle(){//randomを用いてcardをシャッフルする
        Random rand = new Random();
        for (int i = initCards.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            Card tmp = initCards[index];
            initCards[index] = initCards[i];
            initCards[i] = tmp;
        }
//        for (int j = 0; j < 52; j++) {
//            System.out.println(j + ": " + initCards[j]);
//        }
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
