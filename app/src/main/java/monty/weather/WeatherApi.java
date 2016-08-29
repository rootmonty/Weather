package monty.weather;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by monty on 26/8/16.
 */
public interface WeatherApi {

    @GET("/data/2.5/forecast/city?q=Allahabad,India")
    Call<WeatherResponse> getWeatherforecast(@Query("APPID") String apikey);
    //Bhyya aapko json tree bhi dikhata hun browser men maine object sahi define kia hai aap ye verify karlo udhr
    //se, kk
    

}
