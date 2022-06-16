import blog.Articolo;
import blog.Autore;
import blog.Blog;
import blog.sottoClassi.ArticoloFantasy;
import blog.sottoClassi.ArticoloNoir;
import blog.Tags;

import java.time.LocalDate;
import java.util.Scanner;

public class MainBlog {
    public static void main(String[] args) {

        /* creazione array di articoli*/
        Articolo[] articoli=new Articolo[4];

        /* creazione tag articoli*/
        String []tagArticolo={"sensazionalistico","cronaca-nera","morte"};

        String []tagArticolo1={"fantasy","matrimonio","happy-days"};
        String []tagArticolo2={"fantasy","guerra","sangue-e-sudore","violenza"};
        String []tagArticolo3={"cronaca-nera","storia","storia-vera","violenza","assassinio","killer"};

        /* creazione articoli e riempimento array*/
       articoli[0]=new Articolo(0,"Morte nella mafia",LocalDate.of(1990, 7,24),"cronaca nera", "morti ammazzati due mafiosi, due in meno", new Autore(0,"Tommaso","Buscetta")
                ,new Tags(tagArticolo));
        articoli[1]=new Articolo(1,"Due elfi si sono sposati",LocalDate.of(200, 4,21),"fantasy", "Due elfi si sono sposati nelle terre di mezzo", new Autore(1,"Mario","Rossi" )
                ,new Tags(tagArticolo1));

        articoli[2]=new ArticoloFantasy(2,"Battaglia tra titani",LocalDate.of(4500,10,20),"fantasy ,cronaca nera", "Ieri un guerriero ed un mago si sono date botte da orbi", new Autore(2,"Malphurion","GranTempesta" )
                ,new Tags(tagArticolo2),"Articolo di fantasia e di cronaca nera");

        articoli[3]=new ArticoloNoir(3,"JACK COLPISCE ANCORA!!!",LocalDate.of(1888, 3,22),"horror, realistico", "Jack colpisce ancora, due cortigiane sono state colpite e trovate " +
                "senza vita questa mattina dalla Scotland Yard", new Autore(3,"Frederick","Best" )
                ,new Tags(tagArticolo3),"Articolo di giallo e noir, con ambientazioni londinesi di fine '800");

        /*Utilizzo metodo interfaccia scrittore */
       Autore autore=new Autore(4,"Saverio","Raimondi");
       articoli[2]=autore.scriviArticolo(articoli[2]);

        /*creazione blog */
        Blog blog=new Blog(articoli);

        /* utilizzo metodo menu*/
        menu(blog);


    }
    /** metodo menu*/
static void menu(Blog blog){
    Scanner scan = new Scanner(System.in);
    int risposta;
    int id;
    do {
        System.out.println("""
                --Articoli del Blog Informazione--
                Premi 1 stampare e scegliere un articolo per id\s
                Premi 2 per stampare tutti gli articoli del blog\s
                Premi -1 per uscire\s
                """);
         risposta= scan.nextInt();
        switch(risposta){
            case 1 :
                    do {
                        System.out.println("immetti allora un id: ");
                        id=scan.nextInt();
                        System.out.println(blog.stampaArticoloPerId(id));
                    }while(id<0 || id>3);
                    break;


            case 2 :
                System.out.println( blog.stampaArticoli());
                break;
            case-1 :
                return;
            default:System.out.println("Richiesta non valida \n");
        }
    }while(risposta!=1 && risposta!=2);

}
}
