package pj.s18946.demo;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;


@Service
public class MyService {

    private final RestTemplate restTemplate;
    private final currencyReposytory cUrrencyReposytory;

    public MyService(RestTemplate restTemplate, currencyReposytory cUrrencyReposytory) {
        this.restTemplate = restTemplate;
        this.cUrrencyReposytory = cUrrencyReposytory;
    }

    public double getCurrency(String currencyName, Date datefrom, Date dateto)
    {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String url = "http://api.nbp.pl/api/exchangerates/rates/a/" + currencyName +"/" + formatter.format(datefrom).toString() + "/" + formatter.format(dateto).toString() +"/";
        URLClass urlClass = restTemplate.getForObject(url, URLClass.class);

        return urlClass.getRates().stream().mapToDouble(x-> x.getMid()).average().orElse(0.0);
    }


    public currency addCurrency(currency c){
        return cUrrencyReposytory.save(c);
    }

}
