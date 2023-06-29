/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apptempo;

// @author Julianoacs

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class AppTempo {

   
    public static void main(String[] args) {
        String city = "New York"; // Defina a cidade desejada
        String apiKey = "YOUR_API_KEY"; // Substitua pelo seu próprio API key

        try {
            String weatherData = getWeatherData(city, apiKey);
            System.out.println("Condições do Tempo em " + city + ":");
            System.out.println(weatherData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getWeatherData(String city, String apiKey) throws IOException {
        String apiUrl = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey;

        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            response.append(line);
        }

        reader.close();

        return response.toString();
       
    }
    
}
