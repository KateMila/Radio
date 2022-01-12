package ru.netology;

public class Radio {

    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int CurrentStation) {
        if (CurrentStation < 0) {
            return;
        }
        if (CurrentStation > 9) {
            return;
        }
        this.currentStation = CurrentStation;
    }

    public void switchToNextStation(int currentStation) {
        if (currentStation < 9) {
            this.currentStation = currentStation + 1;
        } else if (currentStation == 9) {
            this.currentStation = 0;
        }
    }

    public void swithToPreviousStation(int currentStation) {
        if (currentStation == 0) {
            this.currentStation = 9;
        } else if (currentStation <= 9) {
            this.currentStation = currentStation - 1;
        }
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume(int currentVolume) {
        if (currentVolume < 10) {
            this.currentVolume = currentVolume + 1;
        } else if (currentVolume == 10) {
            this.currentStation = 0;
        }
    }

    public void reduceVolume(int currentVolume) {
        if (currentVolume == 0) {
            this.currentVolume = 10;
        } else if (currentVolume <= 10) {
            this.currentVolume = currentVolume - 1;
        }
    }


}
