package cn;

/**
 * @author Gamigo
 * @create 2020/3/24 11:59
 * @description 125. 验证回文串
 */
public class ValidPalindrome1 {

    public boolean isPalindrome(String s) {
        // 过滤字符串
        String filterS = filterString(s);

        String reverseS = reverseString(filterS);

        return reverseS.equalsIgnoreCase(filterS);
    }

    public String filterString(String s) {
        return s.replaceAll("[^A-Za-z0-9]", "");
    }

    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

}
