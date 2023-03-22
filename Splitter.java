package parcial_3;

import java.util.List;
import java.util.ArrayList;

public class Splitter {
    public List<Integer> listaPar = new ArrayList<Integer>();
    public List<Integer> listaImpar = new ArrayList<Integer>();

    public Splitter(List<Integer> listaCompleta) {
        int limit = listaCompleta.size();
        for(int i = 0; i < limit; i++)  {
            if(listaCompleta.get(i) % 2 == 0)   {
                this.listaPar.add(listaCompleta.get(i));
            }
            else {
                this.listaImpar.add(listaCompleta.get(i));
            }
        }
    } 

}
