package parcial_3;

import java.util.List;
import java.util.ArrayList;

public class Fibonacci {
    public List<Integer> sucesion = new ArrayList<Integer>();
    
    public Fibonacci(int limit)  {
        int z = 0;
        int x = 0;
        int y = 1;
        while (z <= limit)    {
            this.sucesion.add(z);
            z = x + y;
            y = x;
            x = z;
        }
        this.sucesion.add(z);
    }
    
}
