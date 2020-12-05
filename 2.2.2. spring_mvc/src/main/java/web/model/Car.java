package web.model;

public class Car {

    private String model;
    private String serial;
    private String date;

    public Car() {
    }

    public Car(String model, String serial, String date) {
        this.model = model;
        this.serial = serial;
        this.date = date;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", serial='" + serial + '\'' +
                ", date=" + date +
                '}';
    }
}