package com.liu.leetcode;

/**
 * @author liulinlin1 on 2016/9/26.
 */
public class ConvertANumberToHexadecimal {
    public static void main(String[] args) {
        System.out.println(Integer.SIZE);
        System.out.println(Integer.numberOfLeadingZeros(Integer.parseInt("10", 2)));
    }

    public static String toHex(int num) {
        int mag = Integer.SIZE - Integer.numberOfLeadingZeros(num);
        int chars = Math.max(((mag + 3) / 4), 1);
        char[] buf = new char[chars];
        final char[] digits = {
                '0', '1', '2', '3', '4', '5',
                '6', '7', '8', '9', 'a', 'b',
                'c', 'd', 'e', 'f'
        };
        int charPos = chars;
        do {
            buf[0 + --charPos] = digits[num & 15];
            num >>>= 4;
        } while (num != 0 && charPos > 0);
        return new String(buf);
    }

    // 大神的做法，比较好理解，
    public String toHex1(int num) {
        char[] map = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        if (num == 0) return "0";
        StringBuilder result = new StringBuilder();
        while (num != 0) {
            result.append(map[(num & 15)]);
            num >>>= 4;
        }
        return result.reverse().toString();
    }

}
