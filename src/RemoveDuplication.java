import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Ksekkset
kset
 */
public class RemoveDuplication {
    public String solution(String str) {
        String answer="";
        for (int i =0; i<str.length(); i++) {
            // System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
            // indexOf() 는 문자열에 문자가 두번 발생하면 처음 발생한 인덱스를 반환한다.
            if (str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        RemoveDuplication T = new RemoveDuplication();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str= br.readLine();
        System.out.println(T.solution(str));
    }
}
