package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private String mark;
    private String model;
    private int horsePower;

    public Car() {
    }

    public Car(String mark, String model, int horsePower) {
        this.mark = mark;
        this.model = model;
        this.horsePower = horsePower;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
