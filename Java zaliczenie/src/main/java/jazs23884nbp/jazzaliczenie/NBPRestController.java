package jazs23884nbp.jazzaliczenie;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("NBP")
public class NBPRestController {
    final NBP nbp;


    public NBPRestController(NBP nbp) {
        this.nbp = nbp;
    }

    @GetMapping("/waluta/{code}/{waluta}/{startDate}/{endDate}")
    public NBPEntity all(@PathVariable String code, @PathVariable String waluta, @PathVariable String startDate, @PathVariable
                         String endDate) throws IOException {
        return NBP.getWaluta(code, waluta, startDate, endDate);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> back(@PathVariable long id){
        return ResponseEntity.ok(NBP.getId(id));
    }

}
