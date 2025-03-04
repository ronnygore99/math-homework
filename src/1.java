import java.util.Random;
class Main{
  public static void main(String[] args){
    Random rand = new Random();
    int min=10;
    int max=100;
    System.out.println(rand.nextInt(max-min+1)+min);
  }
}