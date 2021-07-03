package pj.s18946.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/controller")
public class controller {

    private final MyService myService;

    public controller(MyService rentialService) {
        this.myService = rentialService;
    }

    @GetMapping("/currency/{currencyName}/{datefrom}/{dateto}")
    ResponseEntity<currency> getAllMovies(@PathVariable String currencyName, @PathVariable Date datefrom, @PathVariable Date dateto)
    {
        double average = myService.getCurrency(currencyName,datefrom,dateto);
        return ResponseEntity.ok(new currency());
    }

}