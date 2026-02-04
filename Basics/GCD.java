int getGCD(int a , int b ){
  while( a > 0, b > 0){
    if(a > b){
      a  = a % b;
    }else{
      b = b % a;
    }
  }
  if(a == 0)return b;
  return a ;
}

//Step,  a   b   Comparison  Operation  Result
//Start 20,12,a>b,20%12,                a=8
//Loop  2,8,12,b>a,12%8,                b=4
//Loop  3,8,4,a>b,8%4,                  a=0
//End,  0,4,a==0,returnb                  4
