package lr7.Martin;

import java.util.Scanner;

public class lr7Martin {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        RadioStation[] radioStations=new RadioStation[3];
        radioStations[0]=new RadioStation("RADIO NRG",88.2);
        radioStations[1]=new RadioStation("RADIO RETRO FM",105.2);
        radioStations[2]=new RadioStation("RADIO1",10.2);
        System.out.println(" оличество радиостанций с 2-4 словами в названии: "
                +RadioStation.countRadioStationsWithWords(
                        radioStations,
                2,
                4));
    }

}
