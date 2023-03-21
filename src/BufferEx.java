import java.io.*;
import java.util.StringTokenizer;

public class BufferEx {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());

        for (int i= 0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int sum = a+b;

            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
    }
}

/*
5
1 1
12 34
5 500
40 60
1000 1000

2
46
505
100
2000
*/