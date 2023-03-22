import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
found7, time: study; Yduts; emit, 7Dnuof

s = FOUNDTIMESTUDYYDUTSEMITDNUOF
YES
 */
public class PalindromeB3 {
        public String solution(String s) {
            String answer="NO";
            // replaceAll(정규식 가능 "[^A-Z]" -> 알파벳 대문자가 아닌것들을 "" 빈문자 처리해라)
            s=s.toUpperCase().replaceAll("[^A-Z]", "");
//            System.out.println("s = " + s);
            // StringBuilder -> 뒤집고 -> 다시 문자열로~
            String tmp = new StringBuilder(s).reverse().toString();
            if (s.equals(tmp)) answer="YES";
            return answer;
        }

        public static void main(String[] args) throws IOException {
            PalindromeB3 T = new PalindromeB3();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str=br.readLine();
            System.out.println(T.solution(str));
        }
    }

