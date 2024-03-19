import java.util.Random;

class leK{
    static final String[] BULLSHIT_TAB = new String[]{"HI!",
                                         "ça c'est pas la question", 
                                         "ça se voit qu'il n'y a pas d'investissment de votre coté", 
                                         "Vous n'avez juste pas lu le document", 
                                         "C'est vous qui vous créez des excuses", 
                                         "vous n'avez pas posé de questions en amphi", 
                                         "je serai jamais derrière vous, vous êtes pas des gamins", 
                                         "Vous faites vraiment les gamins",
                                         "tout le temps je le disais, tout le temps", 
                                         "je ne suis pas votre parent", 
                                         "cette information, concrètement, je ne l'avais pas", 
                                         "C'est vous qui me faites des reproches... pas moi",
                                         "Je trouve ça bizare...",
                                         "Si tu dit pas non, c'est que tu consent"};
                                       

    static final int TAILLE = BULLSHIT_TAB.length();
    
    static String bullshit(){
        Random rnd = new Random();
        return BULLSHIT_TAB[rnd.nextInt(TAILLE -1) ];
    }


    public static void main(String[] args){
        for (int i = 0; i < 10; i++){
            System.out.println(bullshit());
        }
    }

}
