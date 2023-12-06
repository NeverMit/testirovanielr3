package lr7.Martin;

public class RadioStation {
    private String name;
    private double frequency;

    public RadioStation(String name, double frequency) {
        this.name = name;
        this.frequency = frequency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public static int countRadioStationsWithWords(RadioStation[] radioStations, int minWords, int maxWords){
        int count=0;
        for(RadioStation station:radioStations){
            String[] words=station.getName().split(" ");
            if(words.length>=minWords && words.length<=maxWords)
                count++;
        }
        return count;
    }
}
