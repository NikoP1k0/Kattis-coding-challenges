package Easy.K;

import java.io.*;

public class kakor {
    public static long cookies(int N, int[] A) {
        long sum = 0;
        for(int i = 0; i < N; i++){
            sum += A[i];
        }

        return sum;
    }

    public static void main(String... args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter w = new PrintWriter(new BufferedOutputStream(System.out));
        int N = Integer.parseInt(r.readLine());
        String[] aStr = r.readLine().split(" ");
        int[] A = new int[N];
        for (int i = 0; i < N; ++i) {
            A[i] = Integer.parseInt(aStr[i]);
        }
        w.println(kakor.cookies(N, A));
        w.close();
    }
}
