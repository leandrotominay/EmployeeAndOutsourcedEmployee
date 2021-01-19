package application.entities;

public class OutsourcedEmployee extends Employee {

    private Double additionalCharge;

    // Construtores

    public OutsourcedEmployee(){
        super();
    }

    public OutsourcedEmployee(String name, Double hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }


    // Getters and Setters

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }


    // Métodos


    @Override
    public Double payment() {
        return super.payment() + additionalCharge * 1.1;
    }

}
