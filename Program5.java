//import stuff here?

//Your code here

public class Program5 {
    static double average(int miles, int gallons){
        double mg = (double) miles / gallons;
        mg = Math.round(mg*Math.pow(10,1)); 
        mg /=10;
        return mg;
    }
    public static void main(String[] args){
        int royale_miles = 286;
        int royale_gallons = 9;
        int koopa_miles = 412;
        int koopa_gallons = 40;
        int pipe_miles = 361;
        int pipe_gallons = 18;
        int band_miles = 161;
        int band_gallons = 11;
        
        System.out.println("Mushroom Cup Prix Racer Average");
        System.out.println("Royale averaged " + average(royale_miles, royale_gallons) + "m/g");
        System.out.println("Koopa King averaged " + average(koopa_miles, koopa_gallons) + "m/g");
        System.out.println("Pipe frame averaged " + average(pipe_miles, pipe_gallons) + "m/g");
        System.out.println("Bandwagon averaged " + average(band_miles, band_gallons) + "m/g");
        
    }
     
}

//Paste console output below:
/*

Mushroom Cup Prix Racer Average
Royale averaged 31.8m/g
Koopa King averaged 10.3m/g
Pipe frame averaged 20.1m/g
Bandwagon averaged 14.6m/g

*/
