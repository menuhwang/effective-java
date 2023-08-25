package ch2.item9;

import java.io.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());

            while (n > 0) {
                bw.write(n-- + "\n");
            }

            bw.flush();
        }
    }
}
