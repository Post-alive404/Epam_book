package by.epam.learn.finalvar;

public class Card {
    public final long BANK_ID;

    public Card(){
        BANK_ID = 100_000;
    }
    public Card(long id){
        BANK_ID = id;
    }

    public final boolean checkRights(final int NUMBER){
        int value = 1;
        final int CODE = 42 + value;
        return CODE == NUMBER;
    }
}
