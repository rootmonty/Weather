package monty.weather;

import com.google.gson.annotations.SerializedName;

/**
 * Created by monty on 27/8/16.
 */
public class Main {

    @SerializedName("temp")
    double temp;
    @SerializedName("humidity")
    double humidity;

    public void setTemp(double temp){this.temp = temp;}
    public void setHumidity(double humidity){this.humidity = humidity;}

    public double getTemp(){return temp;}
    public double getHumidity(){return humidity;}
}
