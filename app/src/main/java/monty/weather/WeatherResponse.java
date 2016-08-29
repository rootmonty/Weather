package monty.weather;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by monty on 26/8/16.
 */
public class WeatherResponse {
    @SerializedName("cnt")
    int cnt;
    @SerializedName("list")
    List<WeatherDetails> weatherlist;


    public void setCnt(int cnt){this.cnt=cnt;}
    public void setWeatherlist(List<WeatherDetails> list){this.weatherlist = list;}

    public int getCnt(){return cnt;}
    public List<WeatherDetails> getWeatherlist(){return weatherlist;}


}
