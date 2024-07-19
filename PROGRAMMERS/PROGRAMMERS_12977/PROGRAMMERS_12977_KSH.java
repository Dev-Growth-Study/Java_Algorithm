package Programmers.PROGRAMMERS_12977;

public class PROGRAMMERS_12977_KSH {
    public static void main(String[] args) {
        int[] list = {1, 2, 7, 6, 4};

        System.out.println(solution(list));
    }

    public static int solution(int[] list) {
        int answer = 0;

        for (int i = 0; i < list.length - 2; i++) {
            for (int j = i+1; j < list.length - 1; j++) {
                for (int k = j+1; k < list.length; k++) {
                    int makeSum = list[i] + list[j] + list[k];

                    if (isPrime(makeSum)) {
                        answer = answer + 1;
                    }
                }
            }
        }
        return answer;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
