package android.example.miwok;

public class words {
    private String mdefaulttranslator;
    private String mmiwoktranslator;
    private int isimage = -1;
    private int image = isimage;


    public words (String a, String b){
        mdefaulttranslator = a;
        mmiwoktranslator = b;
    }

    public words(String a, String b, int c){
        mdefaulttranslator = a;
        mmiwoktranslator = b;
        image = c;
    }

    public String getdefaulttranslator(){
        return mdefaulttranslator;
    }

    public String getmiwoktranslator(){
        return mmiwoktranslator;
    }

    public int getImage() {
        return image;
    }

    public boolean hasimage(){
        return image!=isimage;
    }

}
