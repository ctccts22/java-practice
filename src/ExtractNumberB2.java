import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
g0en2T0s8eSoft

208
 */
public class ExtractNumberB2 {
    public int solution(String s) {
        String answer = "";
        for (char x : s.toCharArray()) {
            // .isDigit() 숫자만~
           if (Character.isDigit(x)) {
               answer += x;
           }
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) throws IOException {
        ExtractNumberB2 T = new ExtractNumberB2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}