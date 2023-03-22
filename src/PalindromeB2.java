import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeB2 {
    public String solution(String str) {
        String answer="NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(tmp)) answer="YES";
        return answer;
    }

    public static void main(String[] args) throws IOException {
        PalindromeB1 T = new PalindromeB1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        System.out.println(T.solution(str));
    }
}
