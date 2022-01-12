package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    void setCurrentStation() {
        Radio station = new Radio();

        station.setCurrentStation(10);
        int expected = 0;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void switchToNextStation() {
        Radio station = new Radio();

        station.switchToNextStation(9);
        int expected = 0;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    void switchToNextStation1() {
        Radio station = new Radio();

        station.switchToNextStation(8);
        int expected = 9;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void swithToPreviousStation() {
        Radio station = new Radio();

        station.swithToPreviousStation(0);
        int expected = 9;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void swithToPreviousStation1() {
        Radio station = new Radio();

        station.swithToPreviousStation(9);
        int expected = 8;
        int actual = station.getCurrentStation();

        assertEquals(expected, actual);
    }


    @Test
    void setCurrentVolume() {
        Radio sound = new Radio();

        sound.setCurrentVolume(10);
        int expected = 10;
        int actual = sound.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume1() {
        Radio sound = new Radio();

        sound.setCurrentVolume(11);
        int expected = 0;
        int actual = sound.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    void setCurrentVolume2() {
        Radio sound = new Radio();

        sound.setCurrentVolume(0);
        int expected = 0;
        int actual = sound.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    void increaseVolume() {
        Radio sound = new Radio();

        sound.increaseVolume(10);
        int expected = 0;
        int actual = sound.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume1() {
        Radio sound = new Radio();

        sound.increaseVolume(8);
        int expected = 9;
        int actual = sound.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    void reduceVolume() {
        Radio sound = new Radio();

        sound.reduceVolume(10);
        int expected = 9;
        int actual = sound.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void reduceVolume1() {
        Radio sound = new Radio();

        sound.reduceVolume(0);
        int expected = 10;
        int actual = sound.getCurrentVolume();

        assertEquals(expected, actual);
    }

}