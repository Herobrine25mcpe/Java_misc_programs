public class RabinKarp
{
    public static void main(String[] args)
    {
        String T = "abaabab";
        String P = "b";

        rabinKarp(T,P,256,13);
    }

    // d = 256
    // q = 13
    private static void rabinKarp(String T, String P, int d, int q)
    {
        final int n = T.length();
        final int m = P.length();

        int h = hash(d,m-1,q); // calculates d^(m-1) mod q

        int p = 0;
        int t0 = 0;

        // pre-processing
        for (int i = 0;i < m;i++)
        {
            p = (d*p + P.charAt(i)) % q;
            t0 = (d*t0 + T.charAt(i)) % q;
        }

        // matching
        for (int s = 0;s <= n-m;s++)
        {
            if (p == t0)
            {
                int j;
                for (j = 0;j < m;j++)
                {
                    if (P.charAt(j) != T.charAt(s+j)) break;
                }

                if (j == m) System.out.println("Pattern occurs with shift " + s);
            }

            if (s < n-m)
            {
                t0 = ((d*(t0 - T.charAt(s)*h) + T.charAt(s+m))) % q;
                t0 = (t0+q) % q;  // handle negative modulo
            }
        }
    }

    private static int hash(int d, int p, int q){
        int h = 1;
        for (int i = 0;i < p;i++) h = (h*d) % q;
        return h;
    }
}
