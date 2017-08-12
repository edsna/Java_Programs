public class SmellyBug extends Bug{
  private String smell;
  public SmellyBug(String nam, String sml){
    super (nam);
    smell=sml;
  }
  public void hitSmelly (int ht){
    hit (ht);
    System.out.println ("I smell "+smell);
  }
}
  