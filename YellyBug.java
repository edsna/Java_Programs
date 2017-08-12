
  
  public class YellyBug extends Bug{
   private String yell;
   int num;
  public YellyBug(String nam, String yel,int numYell){
    super (nam);
    yell=yel;
    num=numYell;
  }
  public void hitYelly (int hty){
    hit (hty);
    for (int count = 0; count < hty; count++){
      System.out.println (yell);
    }
  }
  }