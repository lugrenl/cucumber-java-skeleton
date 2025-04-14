package io.cucumber.skeleton;

public class Belly {
    private int cukes;
    private boolean Growl;
    private boolean bellyIsEmpty;
    private int waitingHour;
    private final int digestionTime;

    public Belly() {
        this.digestionTime = 1;
    }

    public void eat(int cukes) {
        this.cukes += cukes;
        this.bellyIsEmpty = false;
        this.Growl = false;
        this.waitingHour = 0;
    }

    public void setBellyIsEmpty() {
        this.cukes = 0;
        this.Growl = true;
        this.bellyIsEmpty = true;
    }

    public void timeToWait(int hour) {
        this.waitingHour += hour;
        if (this.waitingHour >= digestionTime) {
            this.setBellyIsEmpty();
        }
    }

    public int getCukes() {
        return cukes;
    }

    public boolean isGrowl() {
        return Growl;
    }

    public boolean isBellyIsEmpty() {
        return bellyIsEmpty;
    }

    public int getWaitingHour() {
        return waitingHour;
    }
}
