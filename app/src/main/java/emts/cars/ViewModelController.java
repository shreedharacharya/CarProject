package emts.cars;

import java.util.ArrayList;

public interface ViewModelController {
    void initializeView();

    void loadData(ArrayList<Cars.Vehicle> cars);
}
