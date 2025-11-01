package Strings;

public class problems {
    void subString() {
        String s = "abc";
        for (int i = 0; i <= 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                System.out.println(s.substring(i, j));
            }
        }
    }
    static public String common(String s1, String s2) {
        int n = Math.min(s1.length(), s2.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                sb.append(s1.charAt(i));
            } else {
                break;
            }
        }
        return sb.toString();

    }
    boolean validPalindrome(){
        String s="A man, a plan, a canal: Panama";
        int start=0;
        int end=s.length()-1;
        while(start<end){
            while(start<end && !Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }
            while(start<end && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            char startChar=s.charAt(start);
            char endChar=s.charAt(end);
            if(Character.toLowerCase(startChar)!=Character.toLowerCase(endChar)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        problems p = new problems();
        //p.subString();
        p.validPalindrome();
        System.out.println(p.validPalindrome());
    }
}
