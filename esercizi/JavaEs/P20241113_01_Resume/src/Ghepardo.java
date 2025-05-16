
public class Ghepardo extends Mammifero implements Must, Req, Comparable<Ghepardo>{

    @Override
    public String Verso() {
        return "Roarrr";
    }
    private Double speed;
    @Override
    public String toString() {
        return "Ghepardo [speed=" + speed + ", toString()=" + super.toString() + "]";
    }
    public Double getSpeed() {
        return speed;
    }
    public void setSpeed(Double speed) {
        this.speed = speed;
    }
    public Ghepardo(Integer freqResp, Integer freqCardio, Double speed) {
        super(freqResp, freqCardio);
        this.speed = speed;
    }
    public Ghepardo() {
        super();
    }
    @Override
    public String GetClassName() {
        return "Ghepardo";
    }
    @Override
    public String GetVersion() {
        return "1.0";
    }
    @Override
    public String GetSerial() {
        return "AI48";
    }
    @Override
    public int compareTo(Ghepardo o) {
        Integer ret = speed.compareTo(o.speed);
        if (ret != 0) {
            return ret;
        } else {
            return getFreqCardio().compareTo(o.getFreqCardio());
        }
    }
}
