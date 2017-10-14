import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by JUV on 14/10/2017.
 */
public class vectorHelper {
    public int max = 1000;
    public int nbElements = 0;
    public int nbElements2= 0;
    public int nbElements3= 0;
    public int intTab[] = new int[max];
    public int intTab2[] = new int[max];
    public int intTab3[] = new int[max];
    public int mintab,maxtab;
    Scanner sc = new Scanner(System.in);

    public void lect1d(int n,int nb) {
        for (int i = 0; i < n; i++) {
            if (nb==1) {
                intTab[i] = sc.nextInt();
                nbElements++;}
            else {
                intTab2[i] = sc.nextInt();
                nbElements2++;}
        }

    }

    public String toString() {
        String s = "{ ";
        for (int i = 0; i < nbElements; i++) {
            if (i==nbElements-1)s=s +intTab[i] +" }";
            else s = s  + intTab[i] + ", ";

        }

        if (nbElements2!=0)
            s=s+"\n{ ";
        for (int i = 0; i < nbElements2; i++) {
            if (i==nbElements2-1)s=s +intTab2[i] +" }";
            else s = s  + intTab2[i] + ", ";

        }
        if (nbElements3!=0)
            s=s+"\n{ ";
        for (int i = 0; i < nbElements3; i++) {
            if (i==nbElements3-1)s=s +intTab3[i] +" }";
            else s = s  + intTab3[i] + ", ";

        }


        return s;
    }

    public static void main (String args[]){
        System.out.print("hello world");


    }
}
