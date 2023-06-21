package Alchole_free.Cockpybara.sample;

public class SampleRecipe {
    String strDrink;
    String dateModified;
    Long idDrink;
    Boolean strAlcoholic;
    String strCategory;
    /**
     * Image Path
     */
    String strDrinkThumb;
    String strGlass;
    Boolean strIBA;
    String strIngredient1, strIngredient2 ,strIngredient3;
    String strInstructions;
    String strMeasure1, strMeasure2, strMeasure3;
    String strVideo;

    public SampleRecipe(String strDrink, String dateModified, Long idDrink, Boolean strAlcoholic, String strCategory, String strDrinkThumb, String strGlass, Boolean strIBA, String strIngredient1, String strIngredient2, String strIngredient3, String strInstructions, String strMeasure1, String strMeasure2, String strMeasure3, String strVideo) {
        this.strDrink = strDrink;
        this.dateModified = dateModified;
        this.idDrink = idDrink;
        this.strAlcoholic = strAlcoholic;
        this.strCategory = strCategory;
        this.strDrinkThumb = strDrinkThumb;
        this.strGlass = strGlass;
        this.strIBA = strIBA;
        this.strIngredient1 = strIngredient1;
        this.strIngredient2 = strIngredient2;
        this.strIngredient3 = strIngredient3;
        this.strInstructions = strInstructions;
        this.strMeasure1 = strMeasure1;
        this.strMeasure2 = strMeasure2;
        this.strMeasure3 = strMeasure3;
        this.strVideo = strVideo;
    }

    public String getStrDrink() {
        return strDrink;
    }

    public String getDateModified() {
        return dateModified;
    }

    public Long getIdDrink() {
        return idDrink;
    }

    public Boolean getStrAlcoholic() {
        return strAlcoholic;
    }

    public String getStrCategory() {
        return strCategory;
    }

    public String getStrDrinkThumb() {
        return strDrinkThumb;
    }

    public String getStrGlass() {
        return strGlass;
    }

    public Boolean getStrIBA() {
        return strIBA;
    }

    public String getStrIngredient1() {
        return strIngredient1;
    }

    public String getStrIngredient2() {
        return strIngredient2;
    }

    public String getStrIngredient3() {
        return strIngredient3;
    }

    public String getStrInstructions() {
        return strInstructions;
    }

    public String getStrMeasure1() {
        return strMeasure1;
    }

    public String getStrMeasure2() {
        return strMeasure2;
    }

    public String getStrMeasure3() {
        return strMeasure3;
    }

    public String getStrVideo() {
        return strVideo;
    }
}
