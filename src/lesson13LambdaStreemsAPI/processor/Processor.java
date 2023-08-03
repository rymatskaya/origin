package lesson13LambdaStreemsAPI.processor;

public class Processor {
    private String model;
    private Integer ClockSpeed;

    public Processor(String model, Integer clockSpeed) {
        this.model = model;
        ClockSpeed = clockSpeed;
    }

    public Integer getClockSpeed() {
        return ClockSpeed;
    }

    public String getModel() {
        return model;
    }
}
