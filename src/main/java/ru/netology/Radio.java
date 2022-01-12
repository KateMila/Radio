package ru.netology;

public class Radio {

    private int currentStation;
    private int currentSoundLevel;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int CurrentStation){
        if (CurrentStation<0){
            return;
        }
        if (CurrentStation>9){
            return;
        }
        this.currentStation=CurrentStation;
    }

    public void setSwitchToNextStation(int currentStation){
        if (currentStation<9) {
            this.currentStation=currentStation+1;
    } else if (currentStation==9){
            this.currentStation=0;
        }
    }
    public void swithToPreviousStation(int currentStation){
        if (currentStation==0){
            this.currentStation=9;
        }else if (currentStation<=9){
            this.currentStation=currentStation-1;
        }
    }

    public int getCurrentSoundLevel() {
        return currentSoundLevel;
    }
    public void setCurrentSoundLevel(int currentSoundLevel){
        if (currentSoundLevel<0){
            return;
        }
        if (currentSoundLevel>10){
            return;
        }
        this.currentSoundLevel=currentSoundLevel;
    }
    public void switchToNextSoundLevel(int currentSoundLevel){
        if (currentSoundLevel < 10) {
            this.currentSoundLevel = currentSoundLevel + 1;
        } else if (currentSoundLevel == 10) {
            this.currentStation = 0;
        }
    }
    public void switchToPreviousSoundLevel(int currentSoundLevel){
        if (currentSoundLevel==0){
            this.currentSoundLevel=10;
        }else if (currentSoundLevel<=10){
            this.currentSoundLevel=currentSoundLevel-1;
        }
    }


}
