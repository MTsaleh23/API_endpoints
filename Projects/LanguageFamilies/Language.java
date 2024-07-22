public class Language{

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    public Language(String inputName, int numS, String region ,String WO ){
        name = inputName;
        numSpeakers = numS;
        regionsSpoken = region;
        wordOrder = WO;

    }

    public void getInfo(){
        System.out.println(name + " is spoken by " + numSpeakers +
                " people mainly in " + regionsSpoken +
                ".\n The language follows the word order: "
                + wordOrder + " .");

    }

    public static void main(String[] args){
        System.out.println("welcome to Languages classes");

        Language spanish = new Language("Spanish", 555000000,
                "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
        spanish.getInfo();

        Mayan kiche = new Mayan("Ki'che'", 2330000);

        Mayan Poqomam = new Mayan("Poqomam", 11300);
        Poqomam.getInfo();

        SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1110000000);
        mandarin.getInfo();

        SinoTibetan burmese = new SinoTibetan("Burmese", 43000000);
        burmese.getInfo();

    }
}