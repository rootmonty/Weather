package monty.weather;

import com.google.gson.annotations.SerializedName;

/**
 * Created by monty on 26/8/16.
 */
public class WeatherDetails {

    @SerializedName("dt")
    int dt;
   // @SerializedName("temp")
   // double temp;
   // @SerializedName("humidity")
   // double humidity;
   @SerializedName("main")
    Main main;

    public void setDt(int dt){this.dt=dt;}
    public void setMain(Main main){this.main= main;}

    //  public void setTemp(double temp){this.temp=temp;}
   // public void setHumidity(double humidity){this.humidity=humidity;}

    public int getDt(){return dt;}
    public Main getMain(){return main;}

    //// public double getTemp(){return temp;}
  //  public double getHumidity(){return humidity;}

}
