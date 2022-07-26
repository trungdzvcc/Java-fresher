package Ktth;

public interface ParentCar {
    // Thay đổi số
    public void changeGear( int newValue);
    // tăng tốc
    public void speedUp(int increment);
    // Phanh
    public void applyBrakes(int decrement);
}
