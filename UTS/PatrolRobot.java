package UTS;

public class PatrolRobot extends Robot {
    Battery RobotBattery;

    public PatrolRobot(String name, int CPUSpeed, int Power, Battery battery) {
        this.name = "Patrol 23 " + name;
        this.CPUSpeed = CPUSpeed;
        this.Power = Power;
        this.RobotBattery = battery;
    }

    public void increasePower() {
        this.Power += 20;
    }
}
