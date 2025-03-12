package com.sergio;

class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>{

    private int distance = 0;
    private int numberOfVictories = 0;

    public void drive() {
        this.distance += 10;
    }

    public int getDistanceTravelled() {
        return this.distance;
    }

    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories += numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        if (this.getNumberOfVictories()>o.getNumberOfVictories()) {
            return 1;
        }else if (this.getNumberOfVictories()<o.getNumberOfVictories()) {
            return -1;
        }else {
            return 0;
        }
    }
}
