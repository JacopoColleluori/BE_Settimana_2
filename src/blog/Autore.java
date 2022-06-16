package blog;

import blog.interfacce.Scrittore;

public class Autore implements Scrittore {
    private final int id;
    private final String nome;
    private final String cognome;

    public Autore(int id, String nome, String cognome) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
    }



    @Override
    public String toString() {
        return "id Autore: "+id+", nome: " + nome +
                 " , cognome: " + cognome ;
    }


    public Articolo scriviArticolo(Articolo infoArticolo) {
        infoArticolo.setAutore(this);
        return infoArticolo;
    }
}
