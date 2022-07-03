package pl.pjatk.sebaug;

import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

//@Component
public class Cwiczenie1 {

    public Cwiczenie1(Cwiczenia11 cwiczenia11){
        System.out.println("Hello from Cwiczenie1");
        cwiczenia11.printHelloWorld();
    }
    public void metoda1(){
        System.out.println("Hello Cwiczenie1 from metoda1");
    }
}
