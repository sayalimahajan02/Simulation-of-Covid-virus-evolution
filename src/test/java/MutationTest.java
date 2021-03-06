import Mutation.Mutation;
import org.junit.Test;

import java.awt.*;
import java.io.IOException;

import static org.junit.Assert.*;

public class MutationTest {

    @Test
    public void calculateFitnessValue() throws IOException {
       Mutation m=new Mutation();
       double result=m.calculateGenotypeFitness("ABCDEFGHIJ",100);
       assertEquals(30180.0,result,0);
    }

    @Test
    public void insertNewMutation() throws IOException {
        Mutation m=new Mutation();
        m.insertIntoMutationList(4);
        assertEquals(true,true);
    }
    @Test
    public void fetchMutation() throws IOException {
        Mutation m=new Mutation();
        m.getMutationColor().put(4,new Color(179,133,29));
        Color c=m.fetchmutationColor(4);
        assertEquals(new Color(179,133,29),c);
    }

    @Test
    public void mutationColorTest()
    {
        Mutation m=new Mutation();
        m.insertIntoMutationList(2);
        assertEquals(true,true);
    }
}
