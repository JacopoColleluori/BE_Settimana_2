package blog;

import java.time.LocalDate;
import java.util.Arrays;

public class Articolo {

    //proprietà
    private final int id;
    private final String titolo;
    private final LocalDate data ;
    private final String categoria;
    private final String testo;
    private  Autore autore;
    private final Tags tags;

    //costruttore

    public Articolo(int id, String titolo, LocalDate data, String categoria, String testo, Autore autore, Tags tags) {
        this.id = id;
        this.titolo = titolo;
        this.data = data;
        this.categoria = categoria;
        this.testo = testo;
        this.autore = autore;
        this.tags = tags;
    }



    //getter e setter

    public int getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public LocalDate getData() {
        return data;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getTesto() {
        return testo;
    }

    public Autore getAutore() {
        return autore;
    }

    public void setAutore(Autore autore) {
        this.autore = autore;
    }

    public Tags getTags() {
        return tags;
    }

    @Override
    public String toString() {
        return "\n Articolo n. "+(id+1)+"\n" + titolo+" \n"+
                " data : " + data +" \n"+
                " categoria : '" + categoria + " \n" +
                " testo : \n" + testo + " \n" +
                 autore +" \n"+
                " tags : " + Arrays.toString(tags.getTagArticolo()) +"\n";
    }
    //metodi
}
