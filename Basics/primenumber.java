Public class questions{
  public static void main(String[]args)
  Scanner in = new Scanner(System.in);
  int n = in.nextInt();
  System.out.println(is Prime(n));
  }

  Static boolean is Prime(int n){
   if(n<=1){
   return False;
   }
   int c= 2 ;
   while(c*c <= n){
    if(n%c == 0){
      return Flase;
      }
      c++;
      }
      return c*c > n;
      }
    }
