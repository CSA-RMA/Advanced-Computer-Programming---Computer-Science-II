
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        if(!this.guessedLetters.contains(letter)){ // if the letter has already been guessed, nothing happens if the word does not contains the guessed letter, number of faults increase
            if(this.word.contains(letter)){
                guessedLetters += letter;
            }
            else {
                guessedLetters += letter;
                numberOfFaults ++;
            }
        }
        // the letter is added among the already guessed letters
    }

    public String hiddenWord() {
        String METO_I="";
        if (guessedLetters.length()==0){
            METO_I="";
            for(int i=0;i<word.length();i++){
                METO_I+="_";
            }
        }
        else {
            METO_I="";
            for(int i=0;i<word.length();i++){
                int idk=0;
                for(int i2=0;i2<guessedLetters.length();i2++){
                    if(word.charAt(i)==guessedLetters.charAt(i2)){
                        METO_I+=guessedLetters.charAt(i2);
                    } 
                    else if(idk==guessedLetters.length()-1) {
                        METO_I+="_";
                    }
                    else {
                        idk+=1;
                    }
                }
            }
        }
        return METO_I;
    }
}
