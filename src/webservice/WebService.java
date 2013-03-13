/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package webservice;
import java.io.BufferedReader;
import java.util.Random;
import java.io.InputStreamReader;
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
        
        BufferedReader stdin = 
                new BufferedReader(new InputStreamReader(System.in));
        String HELP_MESSAGE =
        "*** Commands: "
            + "\n\t create, load, "
            + "\n\t find_user <n>, find_forum <n>, find_thread <n>, find_post <n>  "
            + "\n\t users, forums, forum_posts, threads, quit "
            + "\n***";
        String command;
        WeatherReturn wr;
        
        
        do {
            System.out.print("\nCommand? ");
            
            try {
                command = stdin.readLine();
            }
            catch (java.io.IOException ex) {
                command = "?";
            }
            
            String parts[] = command.split(" ");
            
            if (parts[0].equalsIgnoreCase("domain") && parts.length < 3) {
                if(parts.length > 1){
                    System.out.println(getWhoIS(parts[1]));
                }
                else{
                    System.out.println("Enter a domain");
                }
            }
            else if (parts[0].equalsIgnoreCase("domain") && parts.length > 2 &&
                    parts[2].equalsIgnoreCase("zip")){
                if(parts.length < 4){
                    System.out.println("Enter a zip code");
                }
                else{
                    System.out.println(getWhoIS(parts[1]));
                    wr = getCityWeatherByZIP(parts[3]);
                    System.out.println("  City:        " + wr.getCity());
                    System.out.println("  State:       " + wr.getState());
                    System.out.println("  Description: " + wr.getDescription());
                    System.out.println("  Temperature: " + wr.getTemperature());
                }
            }
            else if (parts[0].equalsIgnoreCase("zip") && parts.length < 3) {
                if(parts.length > 1){
                    wr = getCityWeatherByZIP(parts[1]);
                    System.out.println("  City:        " + wr.getCity());
                    System.out.println("  State:       " + wr.getState());
                    System.out.println("  Description: " + wr.getDescription());
                    System.out.println("  Temperature: " + wr.getTemperature());
                }
                else{
                    System.out.println("Enter a zip code");
                }
            }
            else if (parts[0].equalsIgnoreCase("zipWeatherDomain") && parts.length < 3) {
                if(parts.length > 1){
                    wr = getCityWeatherByZIP(parts[1]);
                    System.out.println("  City:        " + wr.getCity());
                    System.out.println("  State:       " + wr.getState());
                    System.out.println("  Description: " + wr.getDescription());
                    System.out.println("  Temperature: " + wr.getTemperature());

                    if("".equals(wr.getDescription())){
                        System.out.println(getWhoIS("noWeather.com"));
                        
                    }
                    else{
                        System.out.println(getWhoIS(wr.getDescription().replaceAll(" ","") + ".com"));
                    }
                }
                else{
                    System.out.println("Enter a zip code");
                }
            }
            else if (parts[0].equalsIgnoreCase("zipDomain") && parts.length < 3) {
                if(parts.length > 1){
                    wr = getCityWeatherByZIP(parts[1]);
                    System.out.println("  City:        " + wr.getCity());
                    System.out.println("  State:       " + wr.getState());
                    System.out.println("  Description: " + wr.getDescription());
                    System.out.println("  Temperature: " + wr.getTemperature());
                    System.out.println(getWhoIS(parts[1] + ".com"));
                }
                else{
                    System.out.println("Enter a zip code");
                }
            }
            else if (parts[0].equalsIgnoreCase("random")){
                Random rand = new Random();
                int value = rand.nextInt(99999); 
                System.out.println(value);
                wr = getCityWeatherByZIP(Integer.toString(value));
                    System.out.println("  City:        " + wr.getCity());
                    System.out.println("  State:       " + wr.getState());
                    System.out.println("  Description: " + wr.getDescription());
                    System.out.println("  Temperature: " + wr.getTemperature());
                    if("".equals(wr.getDescription())){
                        System.out.println(getWhoIS("noWeather.com"));
                        
                    }
                    else{
                        System.out.println(getWhoIS(wr.getDescription().replaceAll(" ","") + ".com"));
                    }
                
                
            }
            else if (!command.equalsIgnoreCase("help")) {
                System.out.println(HELP_MESSAGE);
            }
        } while (!command.equalsIgnoreCase("quit"));
        
        

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
