import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
gooG
YES
 */
public class PalindromeB1 {
        public String solution(String str) {
            String answer="YES";
            str=str.toLowerCase();
            int len =str.length();
            for (int i=0; i<len/2; i++) {
                if (str.charAt(i) != str.charAt(len-i-1)) return "NO";
            }
            return answer;
        }

        public static void main(String[] args) throws IOException {
            PalindromeB1 T = new PalindromeB1();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str=br.readLine();
            System.out.println(T.solution(str));
        }
    }

