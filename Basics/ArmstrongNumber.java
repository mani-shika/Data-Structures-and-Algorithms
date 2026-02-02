class Solution {
    public boolean isArmstrong(int x) {
        if (x < 0) return false; //non negative

        int originalNumber = x;
        int digitCount = 0;// number of digits

        int temp = x; //temp = 153
        while (temp > 0) {
            temp = temp / 10;//153 becomes 15| temp = 15
            digitCount++;
        }

   
        int remainingNumber = x;
        int sumOfPowers = 0;

        while (remainingNumber > 0) {
            
            int lastDigit = remainingNumber % 10; //153%10 |last digit = 3

            
            sumOfPowers += Math.pow(lastDigit, digitCount); //3 *3*3 ,remaining 15

          
            remainingNumber = remainingNumber / 10;
        }

     
        return sumOfPowers == originalNumber;
    }
}
