package parcial_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Manager {
    public Fibonacci lista = new Fibonacci(1000000);
    public Splitter listasDivididas = new Splitter(lista.sucesion);

    public void ejecutar() {
        File listaOG = new File("C:\\Users\\Alan\\Documents\\UDLAP\\2 Semestre\\POO\\parcial_3\\Listas", "Fibonacci.txt");
        File listaPar = new File("C:\\Users\\Alan\\Documents\\UDLAP\\2 Semestre\\POO\\parcial_3\\Listas", "FibonacciPar.txt");
        File listaImpar = new File("C:\\Users\\Alan\\Documents\\UDLAP\\2 Semestre\\POO\\parcial_3\\Listas", "FibonacciImpar.txt");
        if (listaOG.exists() == false)    {
            try {
                listaOG.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (PrintWriter writer = new PrintWriter("C:\\Users\\Alan\\Documents\\UDLAP\\2 Semestre\\POO\\parcial_3\\Listas\\" + "Fibonacci.txt")) {
            writer.println(lista.sucesion);
            writer.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if (listaPar.exists() == false)    {
            try {
                listaOG.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (PrintWriter writer = new PrintWriter("C:\\Users\\Alan\\Documents\\UDLAP\\2 Semestre\\POO\\parcial_3\\Listas\\" + "FibonacciPar.txt")) {
            writer.println(listasDivididas.listaPar);
            writer.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if (listaImpar.exists() == false)    {
            try {
                listaOG.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (PrintWriter writer = new PrintWriter("C:\\Users\\Alan\\Documents\\UDLAP\\2 Semestre\\POO\\parcial_3\\Listas\\" + "FibonacciImpar.txt")) {
            writer.println(listasDivididas.listaImpar);
            writer.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
