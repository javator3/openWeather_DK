package pl.sda.openweathet;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.openweathet.model.Weather;


import java.io.IOException;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;


public class Main {
    public static void main(String[] args) throws MalformedURLException {

        ObjectMapper objectMapper = new ObjectMapper();

        URL url =  new URL("http://api.apixu.com/v1/current.json?key=c58fd33d79104bb385190240191002&q=Toru%C5%84");
        Weather[] weathers;
        try {
            Weather weather =  objectMapper.readValue(url, Weather.class);
            System.out.println("Pogoda : ");
            System.out.println(weather);

        } catch (IOException e) {
                e.printStackTrace();
        }


    }
}
