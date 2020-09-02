import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int station;
    private int volume;
    private int minStation;
    private int maxStation;
    private int minVolume;
    private int maxVolume;

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
