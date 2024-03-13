import java.util.Random;

class leK{
    String[] BULLSHIT_TAB = new String[]{"HI!",
                                         "ça c'est pas la question", 
                                         "ça se voit qu'il n'y a pas d'investissment de votre coté", 
                                         "Vous n'avez juste pas lu le document", 
                                         "C'est vous qui vous créez des excuses", 
                                         "vous n'avez pas posé de questions en amphi", 
                                         "je serai jamais derrière vous, vous êtes pas des gamins", 
                                         "tout le temps je le disais", 
                                         "je ne suis pas votre parent", 
                                         "cette information, concrètement, je ne l'avais pas", 
                                         "C'est vous qui me faites des reproches... pas moi",
                                         "Je trouve ça bizare..."};

    static String bullshit(){
        Random rnd = new Random();
        rnd = rnd.nextInt();
        return BULLSHIT_TAB[rnd];
    }


    public static void main(String[] args){
        while (true){
            return bullshit();
        }
    }

}
