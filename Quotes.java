import java.util.Date;
public class Quotes {

    public String guestGreeting(String name){
        return String.format("Welcome to Wayne Manor. Please, come in..%s", name);
    }

    public String guestGreeting(String name, String location){
        return String.format("Welcome to Wayne Manor. Please, come in..%s. Bruce is: %s", name, location);
    }

    public String dateAnnouncement(){
        Date currentDate = new Date();
        return String.format("Today's date is: %s", currentDate);
    }

    public String beforeAlexa(String sentence){
        if(sentence.indexOf("Alexa") != -1){
            return "Please, Alexa is so 2011";
        }
        else if(sentence.indexOf("Alfred") != -1){
            return "Now we are talking";
        }
        else{
            return "You may be our guest, but you gotta do better than that!";
        }
    }

    public String brucesBalance(String item, int price, boolean isSold){
        if(isSold){
            return String.format("The %s has been sold for %s", item, price);
        }
        else{
            return "Going, going, gone..";
        }
    }

}