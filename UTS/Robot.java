package UTS;

public class Robot {
    String name;
    int CPUSpeed;
    int Power;

    public void increasePower() {
        this.Power += 10;
    }

    public void reducePower() {
        this.Power -= 10;
    }    
}
