public class DigitCounter{
  public static int count(int n){
    int cnt = 0;
    while(n> 0){
      int lastDigit = n%10;
      cnt = cnt+ 1;
      n = n/10;
    }
    return cnt;
  }
  public static void main(string[]args){
    int number = 12345;
    System.out.println("Total Digits :" + count(number));
  }
}
