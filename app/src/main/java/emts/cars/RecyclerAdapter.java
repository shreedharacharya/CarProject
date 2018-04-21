package emts.cars;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    List<Cars.Vehicle> cars;
    public RecyclerAdapter(List<Cars.Vehicle> cars) {
        this.cars = cars;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.car_name_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Cars.Vehicle car = cars.get(position);
        if(car.getName() != null && !car.getName().isEmpty()){
            holder.carName.setText(car.getName());
        }else {
            holder.carName.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return cars.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView carName;
        public MyViewHolder(View itemView) {
            super(itemView);

            carName = itemView.findViewById(R.id.car_name);
        }
    }
}
