package longestCommonPrefix;

import java.util.Scanner;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        int arrlen = strs.length;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arrlen; i++) {
            if (strs[i].length() < smallest) {
                smallest = strs[i].length();
            }
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < smallest; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < arrlen; j++) {
                if (strs[j].charAt(i) != c) {
                    return result.toString();
                }
            }
            result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = in.nextInt();
        in.nextLine(); // consume the newline character left by in.nextInt()

        String sent[] = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("String( " + i + "):");
            sent[i] = in.nextLine();
        }

        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(sent));
        in.close();
    }

}
