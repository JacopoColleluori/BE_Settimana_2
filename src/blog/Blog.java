package blog;

import java.util.Arrays;

public class Blog {

  private final Articolo[] articoli;

    public Blog(Articolo[] articoli) {
        this.articoli = articoli;
    }

    public Articolo[] getArticoli() {
        return articoli;
    }

    //metodi
    public String stampaArticoloPerId(int id){
        Articolo articoloApp = null;
        for (Articolo articolo : getArticoli()) {
            if (articolo.getId()==id){
               articoloApp=articolo;
            }
        }
        if(articoloApp != null){
            return "Il titolo dell'articolo e' :\n"+articoloApp.getTitolo() +"\n"+
                    "categoria: "+articoloApp.getCategoria()+";;\n"+
                    "data: " + articoloApp.getData()+" ;\n"+
                    "testo: " + articoloApp.getTesto()+" ;\n" +
                    articoloApp.getAutore().toString()+ " ;\n"+
                    "tags: " + Arrays.toString(articoloApp.getTags().getTagArticolo())+"\n";
        }else{
            return "non c'e' nessun articolo con l'id indicato \n";
        }

        }


    public String stampaArticoli() {
        return Arrays.toString(getArticoli());
   }

}
