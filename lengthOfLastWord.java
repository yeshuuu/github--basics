public class lengthOfLastWord {
    public static int lengthOfLastWord(String s){
        s = s.trim();
        int count = 0;
        for(int i = s.length()-1 ; i >=0 ;i--){
            if(s.charAt(i)==' '){
                break;
            }
                count++;                 
            }
            return count;
        } 
        public static void main(String[] args){
            System.out.println(lengthOfLastWord("Hello World"));
            System.out.println(lengthOfLastWord("   fly me   to  the moon  "));
            System.out.println(lengthOfLastWord("luffy is still joyboy"));
        }

} 
