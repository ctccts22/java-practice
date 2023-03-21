import java.util.*;

public class ReverseWordV2 {


    public static void main(String[] args) {
        ReverseWordV2 T = new ReverseWordV2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = kb.next();
        }
        for (String x : T.solution(n, str)) {
            System.out.println(x);
        }
    }

    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0;
            int rt = x.length()-1;
            while (lt<rt) {
                char tmp = s[rt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            // static class method : valueOf
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }
}

