public class EvenOdd{
  public static void main(string[]args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter any number: ");
    int num = in.nextInt();
    if (num % 2 == 0 ){
      System.out.println( num + "is even");
    }
    else {
      System.out.println(num + "is odd");
    }
  }
} 
