package pl.sda.openweathet;

import com.fasterxml.jackson.databind.ObjectMapper;

import pl.sda.openweathet.model.Weather;

import java.io.IOException;
import java.net.URL;

public class WeatherService {
    private String url;
    private String apiKey;
    public WeatherService(String url, String apiKey) {
        this.url = url;
        this.apiKey = apiKey;
    }

    public void getCityWeather(String city)
    {
        ObjectMapper objectMapper = new ObjectMapper();
        try {

            URL urltmp = new URL(url + "?key="+apiKey+"&q="+city);
            Weather weather =  objectMapper.readValue(urltmp, Weather.class);
            System.out.println("\033[0mTemperatura w miescie:\033[1;31m "
                    + city + "\033[0m wynosi: \033[1;31m"
                    + weather.getCurrent().getTemp_c()+"\033[0m");

        } catch (IOException e) {
            System.out.println("Nie można pobrać danych dla miasta: " + city);
        }

    }


}
