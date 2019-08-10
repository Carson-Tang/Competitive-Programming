import java.io.*;
import java.util.*;

public class Main {
    static long [][][] bit;
    static int n;
    public static void main(String[] args) throws IOException {
        Reader r = new Reader();
        n = r.nextInt();
        bit = new long[n+1][n+1][n+1];
        int [][][] val = new int[n+1][n+1][n+1];
        int q = r.nextInt();
        long tot = 0;
        for(int i = 0; i < q; i++){
            int in = r.nextInt();
            if(in==19){
                int x = r.nextInt(), y = r.nextInt(), z = r.nextInt(), l = r.nextInt();
                int change = l-val[x][y][z];
                val[x][y][z]=l;
                update(x,y,z,change);
            } else {
                int x1 = r.nextInt(), y1 = r.nextInt(), z1 = r.nextInt();
                int x2 = r.nextInt(), y2 = r.nextInt(), z2 = r.nextInt();
                tot+=query(x1,y1,z1,x2,y2,z2);
            }
        }
        System.out.println(tot);
    }
    public static void update(int x, int y, int z, int v){
        for(int xx = x; xx<= n; xx += xx&-xx){
            for(int yy = y; yy<=n; yy += yy&-yy){
                for(int zz = z; zz<=n; zz+= zz&-zz){
                    bit[xx][yy][zz]+=v;
                }
            }
        }
    }
    public static long sum(int x, int y, int z){
        long tot = 0;
        for(int xx = x; xx>0; xx-=xx&-xx){
            for(int yy = y; yy>0; yy-= yy&-yy){
                for(int zz = z; zz>0; zz -= zz&-zz){
                    tot+=bit[xx][yy][zz];
                }
            }
        }
        return tot;
    }
    public static long query(int x1, int y1, int z1, int x2, int y2, int z2){
        return sum(x2,y2,z2)-sum(x1-1,y2,z2)
                -sum(x2,y1-1,z2)-sum(x2,y2,z1-1)
                +sum(x1-1,y1-1,z2)+sum(x1-1,y2,z1-1)
                +sum(x2,y1-1,z1-1)-sum(x1-1,y1-1,z1-1);
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
