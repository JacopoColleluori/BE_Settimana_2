package blog.sottoClassi;

import blog.Articolo;
import blog.Autore;
import blog.Tags;

import java.time.LocalDate;

public class ArticoloFantasy extends Articolo {
    private final String descrizione;


    public ArticoloFantasy(int id, String titolo, LocalDate data, String categoria, String testo, Autore autore, Tags tags, String descrizione) {
        super(id, titolo, data, categoria, testo, autore, tags);
        this.descrizione=descrizione;
    }
}
