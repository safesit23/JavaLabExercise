package Exercise;

public class StringMutation {
    public static void main(String[] args) {
        String mySentence="Ymj%vznhp%gwt|s%kt}%ozru%t{jw%ymj%qf~%itl";
        int encode = 5;
        String mySentenceMutate=encrypt(mySentence,encode);
        System.out.println(mySentenceMutate);
        
    }
    
    public static String encrypt(String sentence, int encode){
    String mySentenceMutate="";
        for(int i=0;i<sentence.length();i++){
            mySentenceMutate=mySentenceMutate + (char)(sentence.charAt(i)-encode);
        }   
    return mySentenceMutate;
    }
}
