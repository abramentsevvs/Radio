package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    void shouldReturnWhenSetCurrentStationNumber10() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(7);

        radio.setCurrentStationNumber(10);

        int expected = 7;
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnWhenSetCurrentStationNumberMin2() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(7);

        radio.setCurrentStationNumber(-2);

        int expected = 7;
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void shouldUpStationIfPushNext() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(7);

        radio.next();

        int expected = 8;
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }


    @Test
    void shouldDownStationIfPushPrev() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(6);

        radio.prev();

        int expected = 5;
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSet0ToStationIfPushNext() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }


    @Test
    void shouldSet9ToStationIfPushPrev() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnIfSetCurrentVolume11() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.setCurrentVolume(11);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnIfSetCurrentVolumeMin1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.setCurrentVolume(-1);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldUpCurrentVolumeIfPushVolumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);

        radio.volumeUp();

        int expected = 3;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnIfCurrentVolumeEquals10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.volumeUp();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldDownCurrentVolumeIfPushVolumeDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.volumeDown();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnCurrentVolumeWhenPushVolumeDownIfCurrent0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.volumeDown();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

}