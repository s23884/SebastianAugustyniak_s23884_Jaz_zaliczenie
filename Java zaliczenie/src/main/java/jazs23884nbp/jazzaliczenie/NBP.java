package jazs23884nbp.jazzaliczenie;


import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.OutputStream;

@Service
public class NBP {
    final ExampleNonSpringClass exampleNonSpringClass;



    public NBP(ExampleNonSpringClass exampleNonSpringClass) {
        this.exampleNonSpringClass = exampleNonSpringClass;
    }

    public static NBPEntity getId(long id) {
        return null;
    }

    public static NBPEntity getWaluta(String code, String waluta, String startDate, String endDate) throws IOException {
        OutputStream exchange = ExampleNonSpringClass.getForEntity("http://api.nbp.pl/api/cenyzlota/" + code +
                "/" + waluta + "/" + startDate + "/" + endDate + "/", NBPEntity.class).getBody();
        return null;
    }
}

