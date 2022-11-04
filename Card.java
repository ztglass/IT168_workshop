public class Card {
    String suit;
    int number;
    
    public Card(String suit, int number){
        this.suit = suit;
        this.number = number;
    }

    public String getCard(){
        String result = "";
        switch (this.number){
            case 1:
                result = "Ace of " + this.suit;
                break;
            case 11:
                result = "Jack of " + this.suit;
                break;
            case 12:
                result = "Queen of " + this.suit;
                break;
            case 13:
                result = "King of " + this.suit;
                break;
            default:
                result = (result + this.number + " of " + this.suit);
        }
        return result;
    }
}
