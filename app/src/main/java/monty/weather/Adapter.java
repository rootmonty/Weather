package monty.weather;

import android.content.Context;
import android.nfc.Tag;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.WeatherViewHolder> {

    public static final String TAG = Adapter.class.getSimpleName();
    private List<WeatherDetails> list;
    private int rowLayout;
    private Context context;


    public static class WeatherViewHolder extends RecyclerView.ViewHolder {
        //LinearLayout moviesLayout;
        TextView dt;
        TextView temp;
        TextView humidity;
        //TextView rating;


        public WeatherViewHolder(View v) {
            super(v);
          //  moviesLayout = (LinearLayout) v.findViewById(R.id.movies_layout);
            dt = (TextView) v.findViewById(R.id.tv1);
            temp = (TextView) v.findViewById(R.id.tv2);
            humidity = (TextView) v.findViewById(R.id.tv3);
           // rating = (TextView) v.findViewById(R.id.rating);
        }
    }

    public Adapter(List<WeatherDetails> weather, int rowLayout, Context context) {
        this.list = weather;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public Adapter.WeatherViewHolder onCreateViewHolder(ViewGroup parent,
                                                            int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new WeatherViewHolder(view);
    }


    @Override
    public void onBindViewHolder(WeatherViewHolder holder, final int position) {
        holder.dt.setText("dt" + list.get(position).getDt()); //this is okay according to you ?yep
        holder.temp.setText("temperature:"+ (list.get(position).getMain().getTemp())); // this ? na getting 0.0 value
      //  Log.d("Gomchik", list.get(position).toString());
       // Log.i(TAG,String.valueOf(list.get(position).getTemp()));
        holder.humidity.setText("Pressure :" + (list.get(position).getMain().getHumidity()));
       // Log.i(TAG,String.valueOf(list.get(position).getHumidity()));
        //holder.rating.setText(movies.get(position).getVoteAverage().toString());
        // call me okay bhyya just give me two min I will come out of house n call u    `
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}