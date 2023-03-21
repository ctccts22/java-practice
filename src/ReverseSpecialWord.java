import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReverseSpecialWord {

    public static void main(String[] args) throws IOException {
        ReverseSpecialWord T = new ReverseSpecialWord();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = br.readLine();
        }
        for (String x : T.solution(n, str)) {
            System.out.println(x);
        }
    }

    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = s.length - 1;
            while (lt < rt) {
                if (!Character.isAlphabetic(s[lt])) lt++;
                else if (!Character.isAlphabetic(s[rt])) rt--;
                else {
                    char tmp = s[lt];
                    s[lt] = s[rt];
                    s[rt] = tmp;
                    lt++;
                    rt--;
                }
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }
}