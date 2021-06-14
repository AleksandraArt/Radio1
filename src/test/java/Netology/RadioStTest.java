package Netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    class radioStTest {

        @Test
        public void increaseVolume() {
            RadioSt radioSt = new RadioSt(10, 0, 6,
                    0, 9, 6);
            radioSt.setMaxVolume(100);
            radioSt.setMinVolume(0);
            radioSt.setCurrentVolume(6);
            radioSt.decreaseVolume();
            int expected = 5;

            assertEquals(expected, radioSt.getCurrentVolume());
        }

        @Test
        public void increaseVolumeMin() {
            RadioSt radioSt = new RadioSt(10, 0, 6,
                    0, 9, 6);
            radioSt.setMaxVolume(100);
            radioSt.setMinVolume(0);
            radioSt.setCurrentVolume(1);
            radioSt.decreaseVolume();
            int expected = 0;

            assertEquals(expected, radioSt.getCurrentVolume());
        }

        @Test
        public void increaseVolumeMax() {
            RadioSt radioSt = new RadioSt(10, 0, 6,
                    0, 9, 6);
            radioSt.setMaxVolume(100);
            radioSt.setMinVolume(0);
            radioSt.setCurrentVolume(10);
            radioSt.decreaseVolume();
            int expected = 9;

            assertEquals(expected, radioSt.getCurrentVolume());
        }

        @Test
        public void decreaseVolumeMin() {
            RadioSt radioSt = new RadioSt(10, 0, 6,
                    0, 9, 6);
            radioSt.setMaxVolume(100);
            radioSt.setMinVolume(0);
            radioSt.setCurrentVolume(0);
            radioSt.decreaseVolume();
            int expected = 0;

            assertEquals(expected, radioSt.getCurrentVolume());
        }

        @Test
        public void decreaseVolumeMax() {
            RadioSt radioSt = new RadioSt(10, 0, 6,
                    0, 9, 6);
            radioSt.setMaxVolume(100);
            radioSt.setMinVolume(0);
            radioSt.setCurrentVolume(10);
            radioSt.decreaseVolume();
            int expected = 9;

            assertEquals(expected, radioSt.getCurrentVolume());
        }

        @Test
        public void decreaseVolume() {
            RadioSt radioSt = new RadioSt(10, 0, 6,
                    0, 9, 6);
            radioSt.setMaxVolume(100);
            radioSt.setMinVolume(0);
            radioSt.setCurrentVolume(5);
            radioSt.decreaseVolume();
            int expected = 4;

            assertEquals(expected, radioSt.getCurrentVolume());
        }

        @Test
        public void setCurrentVolume() {
            RadioSt radioSt = new RadioSt(10, 0, 6,
                    0, 9, 6);
            radioSt.setMaxVolume(100);
            radioSt.setMinVolume(0);
            radioSt.setCurrentVolume(5);
            int expected = 5;

            assertEquals(expected, radioSt.getCurrentVolume());
        }

        @Test
        public void setCurrentVolumeMin() {
            RadioSt radioSt = new RadioSt(10, 0, 6,
                    0, 9, 6);
            radioSt.setMaxVolume(100);
            radioSt.setMinVolume(0);
            radioSt.setCurrentVolume(0);
            int expected = 0;

            assertEquals(expected, radioSt.getCurrentVolume());
        }

        @Test
        public void setCurrentVolumeMax() {
            RadioSt radioSt = new RadioSt(10, 0, 6,
                    0, 9, 6);
            radioSt.setMaxVolume(100);
            radioSt.setMinVolume(0);
            radioSt.setCurrentVolume(100);
            int expected = 100;

            assertEquals(expected, radioSt.getCurrentVolume());
        }

        @Test
        public void setCurrentVolumeUnder() {
            RadioSt radioSt = new RadioSt(10, 0, 6,
                    0, 9, 6);
            radioSt.setMaxVolume(100);
            radioSt.setMinVolume(0);
            radioSt.setCurrentVolume(-1);
            int expected = 0;

            assertEquals(expected, radioSt.getCurrentVolume());
        }

        @Test
        public void setCurrentVolumeOver() {
            RadioSt radioSt = new RadioSt(10, 0, 6,
                    0, 9, 6);
            radioSt.setMaxVolume(100);
            radioSt.setMinVolume(0);
            radioSt.setCurrentVolume(150);
            int expected = 100;

            assertEquals(expected, radioSt.getCurrentVolume());
        }

        @Test
        public void nextRadioStation() {
            RadioSt radioSt = new RadioSt(10, 0, 6,
                    0, 9, 6);
            radioSt.setMaxRadioStation(9);
            radioSt.setMinRadioStation(0);
            radioSt.setCurrentRadioStation(6);
            radioSt.nextRadioStation();
            int expected = 7;

            assertEquals(expected, radioSt.getCurrentRadioStation());
        }

        @Test
        public void prevRadioStation() {
            RadioSt radioSt = new RadioSt(10, 0, 6,
                    0, 9, 6);
            radioSt.setMaxRadioStation(9);
            radioSt.setMinRadioStation(0);
            radioSt.setCurrentRadioStation(6);
            radioSt.prevRadioStation();
            int expected = 5;

            assertEquals(expected, radioSt.getCurrentRadioStation());
        }

        @Test
        public void setCurrentRadioStation() {
            RadioSt radioSt = new RadioSt(10, 0, 6,
                    0, 9, 6);
            radioSt.setMaxRadioStation(9);
            radioSt.setMinRadioStation(0);
            radioSt.setCurrentRadioStation(6);
            int expected = 6;

            assertEquals(expected, radioSt.getCurrentRadioStation());
        }

        @Test
        public void nextRadioStationMax() {
            RadioSt radioSt = new RadioSt(10, 0, 6,
                    0, 9, 6);
            radioSt.setMaxRadioStation(9);
            radioSt.setMinRadioStation(0);
            radioSt.setCurrentRadioStation(0);
            radioSt.prevRadioStation();
            int expected = 9;

            assertEquals(expected, radioSt.getCurrentRadioStation());
        }

        @Test
        public void prevRadioStationMin() {
            RadioSt radioSt = new RadioSt(10, 0, 6,
                    0, 9, 6);
            radioSt.setMaxRadioStation(9);
            radioSt.setMinRadioStation(0);
            radioSt.setCurrentRadioStation(9);
            radioSt.nextRadioStation();
            int expected = 0;

            assertEquals(expected, radioSt.getCurrentRadioStation());
        }

        @Test
        public void setCurrentRadioStationUnder() {
            RadioSt radioSt = new RadioSt(10, 0, 6,
                    0, 9, 6);
            radioSt.setMaxRadioStation(9);
            radioSt.setMinRadioStation(0);
            radioSt.setCurrentRadioStation(-1);
            int expected = 0;

            assertEquals(expected, radioSt.getCurrentRadioStation());
        }

        @Test
        public void setCurrentRadioStationOver() {
            RadioSt radioSt = new RadioSt(10, 0, 6,
                    0, 9, 6);
            radioSt.setMaxRadioStation(9);
            radioSt.setMinRadioStation(0);
            radioSt.setCurrentRadioStation(15);
            int expected = 9;

            assertEquals(expected, radioSt.getCurrentRadioStation());
        }


    }