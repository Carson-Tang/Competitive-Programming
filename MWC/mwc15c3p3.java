import java.io.*;
import java.util.*;

public class Main {
    static char [][] grid;
    static int [][] dir = {{1,0},{0,1},{-1,0},{0,-1},{-1,-1},{1,1},{1,-1},{-1,1}};
    static int n;
    static boolean flag = false;
    public static void main(String[] args) throws IOException {
        Reader r = new Reader();
        n = r.nextInt();
        int q = r.nextInt();
        grid = new char[n][n];
        for (int i = 0; i < n; i++) {
            String[] tok = r.readLine().split(" ");
            for (int k = 0; k < n; k++) {
                grid[i][k] = tok[k].charAt(0);
            }
        }
        for (int i = 0; i < q; i++) {
            String s = r.readLine();
            flag=false;
            for(int k = 0; k < n; k++){
                for(int j = 0; j < n; j++){
                    if(s.charAt(0)==grid[k][j]){
                        boolean [][] vis = new boolean[n][n];
                        found(s.substring(1,s.length()),vis,k,j);
                    }
                }
            }
            System.out.println((flag) ? "good puzzle!" : "bad puzzle!");
        }
    }
    static void found(String s, boolean [][] vis, int k, int j){
        if(s.isEmpty()){
            flag=true;
            return;
        }
        vis[k][j]=true;
        for(int i = 0; i < 8; i++) {
            int xc = k + dir[i][0];
            int yc = j + dir[i][1];
            if (xc > -1 && yc > -1 && xc < n && yc < n) {
                if (!vis[xc][yc] && grid[xc][yc] == s.charAt(0)) {
                    found(s.substring(1, s.length()), vis, xc, yc);
                }
            }
        }
    }
    static class Reader
    {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException
        {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException
        {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1)
            {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do
            {
                ret = ret * 10 + c - '0';
            }  while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException
        {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');

            if (c == '.')
            {
                while ((c = read()) >= '0' && c <= '9')
                {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }
}
