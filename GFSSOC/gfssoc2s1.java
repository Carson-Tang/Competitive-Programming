import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] t = br.readLine().split(" ");
        String [] to = br.readLine().split(" ");
        int s = Integer.parseInt(t[0]);
        int m = Integer.parseInt(t[1]);
        int l = Integer.parseInt(t[2]);
        double a = Double.parseDouble(to[0]);
        double b = Double.parseDouble(to[1]);
        double c = Double.parseDouble(to[2]);
        double f=0;
        int count = 0;
        while(s+m+l>2){
            if(s>2){
                s-=3;
                if(l>0){
                    l--;
                } else if (m>0){
                    m--;
                } else if (s>0){
                    s--;
                }
                f += a*3;
            } else if (s>1){
                s-=2;
                f += a*2;
                if(m>0){
                    m--;
                    f += b;
                    if(l>0){
                        l--;
                    } else if (m>0){
                        m--;
                    } else if (s>0){
                        s--;
                    }
                } else if(l>0){
                    l--;
                    f += c;
                    if(l>0){
                        l--;
                    } else if (m>0){
                        m--;
                    } else if (s>0){
                        s--;
                    }
                }
            } else if (s>0){
                s--;
                f += a;
                if(m>1){
                    m-=2;
                    f += b*2;
                    if(l>0){
                        l--;
                    } else if (m>0){
                        m--;
                    } else if (s>0){
                        s--;
                    }
                } else if (l>1){
                    l-=2;
                    f += c*2;
                    if(l>0){
                        l--;
                    } else if (m>0){
                        m--;
                    } else if (s>0){
                        s--;
                    }
                }
            } else if (m>2){
                m-=3;
                f += b*3;
                if(l>0){
                    l--;
                } else if (m>0){
                    m--;
                }
            } else if (m>1){
                m-=2;
                f += b*2;
                if(l>0) {
                    l--;
                    f += c;
                    if(l>0){
                        l--;
                    } else if (m>0){
                        m--;
                    }
                }
            } else if (m>0){
                m-=1;
                f += b;
                if(l>1){
                    l-=2;
                    f += c*2;
                    if(l>0){
                        l--;
                    } else if (m>0){
                        m--;
                    }
                }
            } else if (l>2){
                l-=3;
                f += c*3;
                if(l>0){
                    l--;
                }
            }
        }
        f += a*s;
        f += b*m;
        f += l*c;
        System.out.println(String.format("%.2f", f));
    }
}
