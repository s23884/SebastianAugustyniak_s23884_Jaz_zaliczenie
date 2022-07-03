package pl.pjatk.sebaug;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

public class PojoTwo {
     private String s;

     public PojoTwo(String s) {
         this.s = s;
         sayHI();
     }
           public void sayHI() {
               System.out.println("HI" +s);

    }
}
