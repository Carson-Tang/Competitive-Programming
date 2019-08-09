import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Reader r = new Reader();
        int n = r.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = r.nextInt();
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[n];
        int val;
        for (int i = n - 1; i > 0; i--) {
            while (!s.isEmpty() && arr[i] > arr[s.peek()]) {
                val = s.pop();
                ans[val] = val - i;
            }
            s.add(i);
        }
        System.out.print(0 + " ");
        for (int i = 1; i < n; i++) {
            if (ans[i] != 0) System.out.print(ans[i] + " ");
            else System.out.print(i + " ");
        }
    }
    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }
    }
}
