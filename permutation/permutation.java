
/**
 * Write a description of permutation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class permutation {
    public boolean judgeAnagram(String str1, String str2){
        if(str1.length()!=str2.length())
            return false;
            
        int[] val= new int[256];
        
        for(int i =0;i<str1.length();i++){
            val[str1.charAt(i)]++;
        }
        
        for(int i=0;i<str2.length();i++){
            val[str2.charAt(i)]--;
            if(val[str2.charAt(i)]<0)
                return false;
            
            
        }
        return true;
    }
    public void test(){
        System.out.println(judgeAnagram("abcdefghijkl","jabdcefghilk"));
    }

}
