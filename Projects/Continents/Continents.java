import java.util.Random;

//print out a continent and the largest city in that continent, based on the value of an integer
public class Continents {
    public String cityName;
    //public String continentName;
    public String countryName;
    public Continents(String city, String country){
        countryName = country;
        cityName = city;
        //continentName = continent;
    }

    public String toString(){
        String description = " biggest city is: "+ cityName+" in "+countryName;
        return description;
    }

    public static void main(String[] args) {

        Continents northAmerica = new Continents("Mexico City","Mexico");
        Continents southAmerica = new Continents("Sao Paulo","Brazil");
        Continents europe = new Continents("Moscow","Russia");
        Continents africa = new Continents("Lagos","Nigeria");
        Continents asia = new Continents("Shanghai","China");
        Continents australia = new Continents("Sydney","Australia");
        Continents antarctica = new Continents("McMurdo Station","US");
        System.out.println("europe" + europe);

        Random rand = new Random();
        int randomNum = rand.nextInt(9) + 1;
        System.out.println("the random number is: " + randomNum);
        switch(randomNum){
            case 1:
                System.out.println( "North America: "+northAmerica.cityName+", " + northAmerica.countryName);
                break;
            case 2:
                System.out.println("South America: "+southAmerica.cityName+", " + southAmerica.countryName);
                break;
            case 3:
                System.out.println("Europe: "+ europe.cityName +", " + europe.countryName);
                break;
            case 4:
                System.out.println("Africa: "+ africa.cityName +", " + africa.countryName);
                break;
            case 5:
                System.out.println("Asia: "+ asia.cityName +", " + asia.countryName);
                break;
            case 6:
                System.out.println("Australia: "+ australia.cityName +", " + australia.countryName);
                break;
            case 7:
                System.out.println("Antarctica: "+ antarctica.cityName +", " + antarctica.countryName);
                break;
            default:
                System.out.println("Undefined continent!");

        }

    }

}
