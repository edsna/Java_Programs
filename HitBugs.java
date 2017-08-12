public class HitBugs{
  public static void main (String argv[]){
    SmellyBug sb;
    sb=new SmellyBug("Puff","flower");
    sb.hitSmelly(2);
  
    YellyBug yb;
    yb=new YellyBug("Fluff","ehhh",2);
    yb.hitYelly(2);
  }
}