package michal.odpadyclient.Client;

import michal.odpadyclient.Objects.Wydruk;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
public class WydrukClient {
    private RestTemplate restTemplate = new RestTemplate();
    private Wydruk wydruk;

    public Wydruk[] getWydruk() {
        ResponseEntity<Wydruk[]> exchange = restTemplate.exchange("https://odpady-api.herokuapp.com/wydruk-api", HttpMethod.GET, HttpEntity.EMPTY, Wydruk[].class);
        return exchange.getBody();
    }
}
