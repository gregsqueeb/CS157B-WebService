/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package webservice;

import com.cdyne.ws.weatherws.WeatherReturn;

/**
 *
 * @author Greg
 */
public class WebService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String zipCode = "95192";
        System.out.printf("\nCity weather for ZIP code %s\n", zipCode);
        WeatherReturn wr = getCityWeatherByZIP(zipCode);
        System.out.println("  City:        " + wr.getCity());
        System.out.println("  State:       " + wr.getState());
        System.out.println("  Description: " + wr.getDescription());
        System.out.println("  Temperature: " + wr.getTemperature());
        
        System.out.println(getWhoIS("sunny.com"));

    }

    private static WeatherReturn getCityWeatherByZIP(java.lang.String zip) {
        com.cdyne.ws.weatherws.Weather service = new com.cdyne.ws.weatherws.Weather();
        com.cdyne.ws.weatherws.WeatherSoap port = service.getWeatherSoap12();
        return port.getCityWeatherByZIP(zip);
    }

    private static String getWhoIS(java.lang.String hostName) {
        net.webservicex.Whois service = new net.webservicex.Whois();
        net.webservicex.WhoisSoap port = service.getWhoisSoap12();
        return port.getWhoIS(hostName);
    }



}
