import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
g0en2T0s8eSoft

208
 */
public class ExtractNumberB1 {
    public int solution(String s) {
        int answer = 0;
        for (char x : s.toCharArray()) {
            // 아스키코드 48 ~ 57 는 0~9 -> 숫자만 추출
            if(x>=48 && x<=57) answer=answer*10+(x-48);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        ExtractNumberB1 T = new ExtractNumberB1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}

