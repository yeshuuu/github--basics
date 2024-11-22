public class ReverseString {
        public static int isStringReeverse(int num){
    
            int reversenum = 0;
            while(num > 0){
              int  result = num % 10;
               reversenum= reversenum * 10 + result;
               num = num /10;
            }
            return reversenum;
        }            
        public static void main(String[] args) {
    
            System.out.println(isStringReeverse(123));
            System.out.println(isStringReeverse(213645));
            
        }
        
    }