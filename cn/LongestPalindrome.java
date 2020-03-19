package cn;

/**
 * @author Gamigo
 * @create 2020/3/19 17:23
 * @description 409. 最长回文串
 */
public class LongestPalindrome {

    public int longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s.length() > 0 ? 1 : 0;
        }
        // 计数数组
        int[] tool = new int[123];
        char[] ss = s.toCharArray();
        for (int i = 0; i < ss.length; i++) {
            tool[ss[i]]++;
        }
        // 记录回文串长度
        int result = 0;
        // 记录出现奇数次的字符个数
        int count = 0;
        // 魔法值65和122：题目中指定范围是大小写字母，A码点65，z码点122。
        for (int i = 65; i <= 122; i++) {
            if (tool[i] == 0) {
                continue;
            }

            if (tool[i] % 2 == 0) {
                result += tool[i];
            } else {
                result += tool[i] - 1;
                count++;
            }
        }
        if (count >= 1) {
            return ++result;
        }

        return result;

    }

    public static void main(String[] args) {
        LongestPalindrome l = new LongestPalindrome();
        String s = "aaaaaa";
        int i = l.longestPalindrome(s);
        System.out.println("i = " + i);
    }
}
