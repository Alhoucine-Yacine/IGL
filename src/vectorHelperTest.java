import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by JUV on 15/10/2017.
 */
public class vectorHelperTest {
   /* @Test
    public void minMax() throws Exception {

    }*/

    @Test
    public void inverser() throws Exception {
        vectorHelper v=new vectorHelper();
        v.intTab[0]=1;
        v.intTab[1]=5;
        v.intTab[2]=-1;
        v.nbElements=3;
        v.inverser();
        int tab[]={-1, 5, 1};
        assertEquals(tab[0],v.intTab[0]);
        assertEquals(tab[1],v.intTab[1]);
        assertEquals(tab[2],v.intTab[2]);

    }

   /* @Test
    public void somme2Vecs() throws Exception {

    }

    @Test
    public void ind_petit() throws Exception {

    }

    @Test
    public void tri_Sel() throws Exception {

    }*/

}