
/**
 * Write a description of UniqueChar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;

public class UniqueChar {
    public boolean judgeUnique(String str){
        boolean[] deter = new boolean[256];
        for(int i=0;i<=str.length()-1;i++){
            if(deter[str.charAt(i)]){
                return false;
            }
            deter[str.charAt(i)]=true;
        }
        
        return true;
        
    } 
    public void test(){
        System.out.println(judgeUnique("abcdefghijklmnopq"));
    }
}
