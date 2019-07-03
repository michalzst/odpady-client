package michal.odpadyclient.Client;

import michal.odpadyclient.Objects.Pojazd;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
public class PojazdClient {
    private RestTemplate restTemplate = new RestTemplate();
    private Pojazd pojazd;

    public Pojazd[] getPojazd() {
        ResponseEntity<Pojazd[]> exchange = restTemplate.exchange("https://odpady-api.herokuapp.com/wydruk-api", HttpMethod.GET, HttpEntity.EMPTY, Pojazd[].class);
        return exchange.getBody();
    }
}
