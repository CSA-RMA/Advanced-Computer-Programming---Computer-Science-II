public class StringUtils {
    public static boolean included(String word, String searched) {
        if(word.trim().toUpperCase().contains(searched.trim().toUpperCase()) && word!=null && searched!=null) {
            return true;
        }
        return false;
    }
}
