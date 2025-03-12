package com.sergio;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int i = 0; i < this.birdsPerDay.length; i++) {
            if(this.birdsPerDay[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int daysCount = 0;

        if(numberOfDays <= this.birdsPerDay.length) {
            for(int i = 0; i < numberOfDays; i++) {
                daysCount += this.birdsPerDay[i];
            }
            return daysCount;
        } else {
            for(int i = 0; i < this.birdsPerDay.length; i++) {
                daysCount += this.birdsPerDay[i];
            }
            return daysCount;
        }
    }

    public int getBusyDays() {
        int busyDays = 0;

        for (int i = 0; i < this.birdsPerDay.length; i++) {
            if(this.birdsPerDay[i] >= 5)
                busyDays++;
        }

        return busyDays;
    }
}
