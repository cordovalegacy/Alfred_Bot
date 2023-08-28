import static java.lang.System.out;

public class App {

    public static void main(String[] args) {
        
        //these are just instances, and then we can call on Quotes class methods
        Quotes greetBot = new Quotes();
        Quotes currentDate = new Quotes();
        Quotes wittyRemark = new Quotes();
        Quotes auction = new Quotes();

        out.println(greetBot.guestGreeting("Brendan"));
        out.println(greetBot.guestGreeting("Brendan", "At an investor party"));
        out.println(currentDate.dateAnnouncement());
        out.println(wittyRemark.beforeAlexa("I really wish I had Alfred as my bot"));
        out.println(wittyRemark.beforeAlexa("Alexa....hello? Can you hear me?"));
        out.println(wittyRemark.beforeAlexa("I'm Batman.."));
        out.println(auction.brucesBalance("Mona Lisa", 1000000, true));
        out.println(auction.brucesBalance("Kit, the car from that 80's show", 250000, false));

    }

}