package android.example.grantprakasanseva;

public class details {
    private String bkt_name;
    private String bkt_num;
    private int bkt_smk;
    private int image;


    public details(String a, int b, int c, String d){
        bkt_name = a;
        bkt_smk = b;
        image = c;
        bkt_num = d;
    }

    public String getBkt_name(){
        return bkt_name;
    }

    public String getBkt_num(){
        return bkt_num;
    }

    public int getBkt_smk(){
        return bkt_smk;
    }

    public int getImage() {
        return image;
    }

}
