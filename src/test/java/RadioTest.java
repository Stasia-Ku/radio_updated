import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetNextStation() {
        Radio radio = new Radio(10);

        radio.nextStation();
        assertEquals(1, radio.getStation());

        radio.setStation(9);

        radio.nextStation();
        assertEquals(0, radio.getStation());
    }

    @Test
    void shouldSetPrevStation() {
        Radio radio = new Radio(10);

        radio.prevStation();
        assertEquals(9, radio.getStation());

        radio.prevStation();
        assertEquals(8, radio.getStation());
    }

    @Test
    void shouldSetStation() {
        Radio radio = new Radio(10);

        radio.setStation(5);
        assertEquals(5, radio.getStation());

        radio.setStation(10);
        assertEquals(5, radio.getStation());

        radio.setStation(-1);
        assertEquals(5, radio.getStation());
    }

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio(10);

        radio.increaseVolume();
        assertEquals(1, radio.getVolume());

        radio.setVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio(10);

        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());

        radio.setVolume(50);
        radio.decreaseVolume();
        assertEquals(49, radio.getVolume());
    }
}
