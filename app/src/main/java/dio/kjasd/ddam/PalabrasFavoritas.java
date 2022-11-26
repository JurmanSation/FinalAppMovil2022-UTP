package dio.kjasd.ddam;

public class PalabrasFavoritas {
    private String KeyWord;
    private String Frase;
    private Integer Orden;

    public PalabrasFavoritas(String keyWord, String frase, Integer Orden) {
        KeyWord = keyWord;
        Frase = frase;
        this.Orden = Orden;
    }

    public String getKeyWord() {
        return KeyWord;
    }

    public void setKeyWord(String keyWord) {
        KeyWord = keyWord;
    }

    public String getFrase() {
        return Frase;
    }

    public void setFrase(String frase) {
        Frase = frase;
    }

    public Integer getOrden() {
        return Orden;
    }

    public void setOrden(Integer Orden) {
        this.Orden = Orden;
    }
}
