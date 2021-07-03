package pj.s18946.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

// główny kontroler aplikacji
@Controller
@RequestMapping("/controller")
public class controller {

    private final MyService myService;
// wstrzykiwanie MyService
    public controller(MyService myService) {
        this.myService = myService;
    }

    // endpoint pozwalający na otrzymanie informacji o sredniej watrosci waluty
    // z wczesniejszym przekazaniem przez uzytkownika nazwy waluty, daty od, daty do(podanych w dniach)
    // w odpowiedzi otrzymujemy obikt json typu currency
    String pattern = "yyyy-MM-dd";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    @GetMapping("/currency/{currencyName}/{datefrom}/{dateto}")
    ResponseEntity<currency> currency(@PathVariable String currencyName, @PathVariable Date datefrom, @PathVariable Date dateto)
    {
        return ResponseEntity.ok(new currency());
//        double average = myService.getCurrency(currencyName,datefrom,dateto);
//        currency NEWCURRENCY = new currency(0,currencyName,dateto,datefrom,average,new Date());
//        return ResponseEntity.ok(myService.addCurrency(NEWCURRENCY));
    }

}