package pl.pjatk.sebaug;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

//@Component
public class Cwiczenie111 {

    private ApplicationContext applicationContext;
    public Cwiczenie111(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
        Cwiczenie1 cwiczenie1 = applicationContext.getBean("cwiczenie1", Cwiczenie1.class);
        Cwiczenia11 cwiczenia11 = applicationContext.getBean("cwiczenia11", Cwiczenia11.class);
        cwiczenie1.metoda1();
        cwiczenia11.metoda2();
    }

}