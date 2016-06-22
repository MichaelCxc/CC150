public class Solution2{
  public boolean permutation(String str1, String str2){
    if(str1.length()!=str2.length())
      return false;
    int[] ascArray = new int[256];
    char[] str1CharArray= str1.toCharArray();
    for(char a : str1CharArray){
      ascArray[a]++;
    }
    for(int i=0;i<str2.length();i++){
      int c= (int)str2.charAt(i);
      if(--ascArray[c]<0){
        return false;
      }

    }
    return true;
  }
}
