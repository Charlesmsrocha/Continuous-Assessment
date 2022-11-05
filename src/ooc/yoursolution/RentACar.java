package ooc.yoursolution;

import java.util.List;
import ooc.enums.Make;
import ooc.enums.Month;

public class RentACar extends Car implements RentACarInterface {

    @Override
    public List<CarInterface> getCars() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void setCars(List<CarInterface> cars) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void setName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean checkAvailability(Month month, int day, Make make, int lengthOfRent) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public int getCarAvailable(Month month, int day, Make make, int lengthOfRent) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean bookCar(Month month, int day, Make make, int lengthOfRent) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public int getNumberOfCars() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
