public class Mayan extends Language{

    public Mayan(String languageName, int speakers) {
        super(languageName, speakers, "Central America", "verb-object-subject");
    }

    @Override
    public void getInfo(){
        System.out.println(name + " is spoken by " +
                numSpeakers + " people mainly in " + regionsSpoken +
                ".\n The language follows the word order: " + wordOrder +
                "Fun fact: " + name + " is an ergative language.");

    }

}