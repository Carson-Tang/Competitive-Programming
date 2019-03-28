import java.io.*;
import java.util.*;
import java.math.*;
public class main {
    public static void main (String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = br.readLine().split(" ");
        BigInteger a = new BigInteger(tok[0]);
        BigInteger b = new BigInteger(tok[1]);
        System.out.println(a.modInverse(b));
    }
}
