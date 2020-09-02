public class Radio {
    private int station;
    private int volume;
    private int minStation;
    private int maxStation;
    private int minVolume;
    private int maxVolume;

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getStation() {
        return station;
    }

    public int getVolume() {
        return volume;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void nextStation() {
        this.station++;
        if(this.station > this.maxStation) {
            this.station = this.minStation;
        }
    }

    public void prevStation() {
        this.station--;
        if(this.station < this.minStation) {
            this.station = this.maxStation;
        }
    }

    public void setStation(int station) {
        if(station >= this.minStation && station <= this.maxStation) {
            this.station = station;
        }
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void increaseVolume() {
        if (this.volume < this.maxVolume) {
            this.volume++;
        }
    }

    public void decreaseVolume() {
        if (this.volume > this.minVolume) {
            this.volume--;
        }
    }
}
