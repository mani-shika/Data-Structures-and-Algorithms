public class largest{
  public static void main(string[]args)
  scanner in = new scanner(system.in);
    int a = in.nextTnt();
    int b = in.nextInt();
    int c = in.nextInt();

   int max = a;
     if(b > max){
         max = b;
     }
     if (c > max){
       max = c;
     }
     system.out.println(max);
}
