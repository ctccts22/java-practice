import java.io.*;
import java.util.*;

public class ReverseWordB1 {

    public static void main(String[] args) throws IOException {
        ReverseWordB1 T = new ReverseWordB1();
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
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp); // Add the reversed string to the answer list
        }
        return answer;
    }
}
