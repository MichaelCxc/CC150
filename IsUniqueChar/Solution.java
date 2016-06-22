

class Demo{
  public boolean IsUnique(String str){
    if(str.length()>128){
      return false;
    }
    Boolean[] uniqueBoo= new Boolean[128];
    for(int i=0;i<str.length();i++){
      int val = str.charAt(i);
      if(uniqueBoo[val]){
        return false;
      }
      uniqueBoo[val]=true;
    }
    return true;
  }

  public static void main(String[] args){
    Demo dm = new Demo();
    if(dm.IsUnique("asodijfwaekrn")){
      System.out.println("True");
    }else{
      System.out.println("False");
    }

  }
}
