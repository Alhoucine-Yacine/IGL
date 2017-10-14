import java.util.Scanner;

/**
 * Created by JUV on 13/10/2017.
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

    private int formule(int x){
       return x*2;
    }

    public void appFormulea(){
        for (int i = 0 ; i < nbElements ; i++ ){
            intTab[i]=formule(intTab[i]);
        }
    }



    public void minMax(){
        mintab=intTab[0];
        maxtab=intTab[0];
        for (int i=1;i<nbElements;i++){
            if (intTab[i]>maxtab) maxtab=intTab[i];
            if (intTab[i]<mintab) mintab=intTab[i];

        }

    }



    public void inverser() {
        int intTab2[] = new int[max];
        int j=0;
        for (int i=nbElements-1;i>=0;i--) {
            this.intTab2[j]=intTab[i];
            j++;
        }
        for (int i=0;i<nbElements;i++)
            intTab[i]=this.intTab2[i];
    }



    public void somme2Vecs() throws differentLengthExceeption {
        if(nbElements!= nbElements2) throw new differentLengthExceeption();
        else for(int i=0;i<nbElements;i++) intTab3[i]=intTab2[i]+intTab[i];
        nbElements3=nbElements;
    }



    public int ind_petit(int b1,int b2){
        int petit=intTab[b1];
        int ind=b1;
        for (int i=b1+1;i<b2;i++){
            if (intTab[i]<petit) {
                petit=intTab[i];
                ind=i;

            }

        }
    return ind;
    }

    public void Tri_Sel(){
        for(int i=0;i<nbElements-1;i++)

        { int x= intTab[ind_petit(i,nbElements)];

            intTab[ind_petit(i,nbElements)]=intTab[i];
            intTab[i]=x;}


    }





    public static void main (String args[]){
        int nn;
        Scanner sc=new Scanner(System.in);
        System.out.println("Entrer la taille de 1er Vecteur : ");
        nn=sc.nextInt();
        vectorHelper v=new vectorHelper();
        v.lect1d(nn,1);
        v.appFormulea();
        System.out.println(v);
        v.minMax();
        System.out.println(" le min est " + v.mintab + " ,le max est "+v.maxtab);
        v.Tri_Sel();
        System.out.println(v);
        v.inverser();
        System.out.println(v);
        System.out.println("Entrer la taille de 2eme Vecteur : ");
        nn=sc.nextInt();
        v.lect1d(nn,2);
        System.out.println(v);
        try {
            v.somme2Vecs();
        } catch (differentLengthExceeption differentLengthExceeption) {
            System.out.println("la taille des deux vecteurs est différente ! ");
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------\n"+ v);
        System.out.println("Good bye my friend !");


    }
}
