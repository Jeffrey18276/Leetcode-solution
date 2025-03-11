import java.util.Scanner;

public class Main {


    public static int numberOfSubstrings(String s) {
        int res = 0;
        int n = s.length();
        int l = 0, r = 0;
        int[] freq = new int[3];

        while (r < n) {
            freq[s.charAt(r) - 'a']++;
            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                res += n - r;
                freq[s.charAt(l) - 'a']--;
                l++;
            }
            r++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string containing only 'a', 'b', and 'c': ");
        String input = scanner.next();

        int result = numberOfSubstrings(input);

        System.out.println("Number of valid substrings: " + result);

        scanner.close();

    }
}