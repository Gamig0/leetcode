package cn;

/**
 * @author Gamigo
 * @create 2020/3/24 12:00
 * @description 125. 验证回文串
 */
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        // 过滤字符串
        String filterS = filterString(s);

        char[] chars = filterS.toCharArray();

        int i = 0;
        int j = chars.length;
        while (i <= j) {
            if (chars[i] != chars[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private String filterString(String s) {
        String numberAndAlphabet = s.replaceAll("[^A-Za-z0-9]", "");
        return numberAndAlphabet.toLowerCase();
    }


}
