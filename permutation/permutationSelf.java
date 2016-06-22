public class permutationSelf{
  public boolean permutationCheck(String str1, String str2){
    if(str1.length()!=str2.length()){
      return false;
    }
    if(str1.length()==0==str2.length()){
      return true;
    }
    int i=0;
    int j=str1.length()-1;
    while(j>=0){
      if(str1.charAt(i)!=str2.charAt(j)){
        return false;
      }
      i++;
      j--;
    }
    return true;
  }
}
