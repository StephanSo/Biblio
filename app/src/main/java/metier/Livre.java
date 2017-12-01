package metier;

import java.util.ArrayList;

/**
 * Created by ssonnois on 01/12/2017.
 */

public class Livre {

    public static ArrayList<Livre> tousLesLivres = new ArrayList<>();
    private String titre;
    private String resume;
    private String isbn;


    public Livre(String unTitre, String unResume, String unIsbn){
        titre = unTitre;
        resume = unResume;
        isbn = unIsbn;
    }

    public static void addLivre(String unTitre, String unResume, String unIsbn){
        tousLesLivres.add(new Livre(unTitre,unResume,unIsbn));
    }
    public static void setTousLesLivres(ArrayList<Livre> laListe){
        tousLesLivres = laListe;
    }

    public String getTitre(){
        return titre;
    }
    public String getResume(){
        return resume;
    }

    public  String getIsbn(){
        return isbn;
    }
}

