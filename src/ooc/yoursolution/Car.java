package ooc.yoursolution;

import java.util.Map;
import ooc.enums.Make;
import ooc.enums.Month;

public class Car implements CarInterface {

    private Make model;
    private Month calendar;
    private Car carId;
    private BookingSystem avaibility;
    private Map map;
    
    @Override
    public Map<Month, boolean[]> createAvailability() {
        System.out.println("We do not know how to proceed");
        return null;
    }

    @Override
    public Make getMake() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setMake(Make make) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getRate() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setRate(double rate) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Map<Month, boolean[]> getAvailability() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setAvailability(Map<Month, boolean[]> availability) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getId() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isAvailable(Month month, int day) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean book(Month month, int day) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setName(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean checkAvailability(Month month, int day, Make make, int lengthOfRent) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getCarAvailable(Month month, int day, Make make, int lengthOfRent) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean bookCar(Month month, int day, Make make, int lengthOfRent) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getNumberOfCars() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
