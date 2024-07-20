package Programmers.PROGRAMMERS_12930;

public class PROGRAMMERS_12930_KSH {
    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();

        String[] list = s.split(" ", -1);

        for (int i = 0; i < list.length; i++) {
            char[] charArray = list[i].toCharArray();
            for (int j = 0; j < charArray.length; j++) {
                if (j % 2 == 0) {
                    charArray[j] = Character.toUpperCase(charArray[j]);
                } else {
                    charArray[j] = Character.toLowerCase(charArray[j]);
                }
            }
            if (i != list.length - 1) {
                sb.append(new String(charArray) + " ");
            } else {
                sb.append(new String(charArray));
            }
        }

        return sb.toString();
    }
}