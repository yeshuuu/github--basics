public class palindrome {
    public static Boolean isPalindrome(String s){

        s= s.toLowerCase();

        for(int i = 0; i < s.length()/2 ; i++){
           if (s.charAt(i)!= s.charAt(s.length()-1-i))
                  return false;
           } 
           return true;
        }
       
    public static void main (String[] args){

        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("Language"));
        System.out.println(isPalindrome("apple"));
        System.out.println(isPalindrome("pop"));

    }
}
