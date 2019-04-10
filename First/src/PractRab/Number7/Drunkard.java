package PractRab.Number7;

import java.util.ArrayDeque;

public class Drunkard {
    public static String work(int word[]){
        String res = "";
        ArrayDeque<Integer> wordArray = new ArrayDeque<Integer>();
        for(int i = 0; i<word.length;i++){
            if(word[i]>0){
                wordArray.add(word[i]);
                res+=",0";
            }
            else if(word[i] == 0){
                if(wordArray.isEmpty()){
                    res+= ",-1";
                }
                else{
                    res+="," + (int) wordArray.pop();
                }
            }
        }
        return res;
    }
}
