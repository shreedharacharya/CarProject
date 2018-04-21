package emts.cars;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Cars {

    @SerializedName("vehicles")
    private ArrayList<Vehicle> vehicles;

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

     class Vehicle {

        @SerializedName("name")
        private String name;

        public String getName() {
            return name;
        }
    }
}

