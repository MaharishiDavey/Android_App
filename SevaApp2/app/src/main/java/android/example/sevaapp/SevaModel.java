package android.example.sevaapp;

public class SevaModel {
    private String bkt_name;
    private int bkt_smk;
    private int bkt_image;
    private String bkt_num;

    // Constructor
    public SevaModel(String bkt_name, int bkt_smk, int bkt_image, String bkt_num) {
        this.bkt_name = bkt_name;
        this.bkt_smk = bkt_smk;
        this.bkt_image = bkt_image;
        this.bkt_num=bkt_num;
    }

    // Getter and Setter
    public String getBkt_name() {
        return bkt_name;
    }

    public void setBkt_name(String bkt_name) {
        this.bkt_name = bkt_name;
    }

    public int getBkt_smk() {
        return bkt_smk;
    }

    public void setBkt_smk(int bkt_smk) {
        this.bkt_smk = bkt_smk;
    }

    public int getBkt_image() {
        return bkt_image;
    }

    public void setCourse_image(int bkt_image) {
        this.bkt_image = bkt_image;
    }

    public String getBkt_num() {
        return bkt_num;
    }

    public void setBkt_num(String bkt_num) {
        this.bkt_num = bkt_num;
    }
}
