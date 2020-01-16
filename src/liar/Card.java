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
public class Card {
    int number;
    String pattern;
    public Card(int CardNumber,String CardPattern){
        number = CardNumber;
        pattern = CardPattern;
    }
    public int getNumber(){
        return number;
    }
    public String getPattern(){
        return pattern;
    }
}
