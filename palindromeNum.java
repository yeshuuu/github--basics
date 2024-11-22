class palindromeNum {

    public static Boolean isPalindromeNum(int num){

        int reversenum = 0;
        int number =num;

        while(num > 0){
          int  result = num%10;
           reversenum= reversenum * 10 + result;
           num = num/10; 
        }
        return number == reversenum;
    }
    public static void main(String[] args) {

        System.out.println(isPalindromeNum(-121));
        System.out.println(isPalindromeNum(1231));
        System.out.println(isPalindromeNum(12121));
    }
    
}
