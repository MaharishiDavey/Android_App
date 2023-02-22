package android.example.vadodra_utara_alocation;

public class Rooms {

    private String room_no,capacity,free;

    Rooms(String a,String b,String c){
        room_no = a;
        capacity = b;
        free = c;
    }

    public String getroom_no(){
        return room_no;
    }

    public String getCapacity(){
        return capacity;
    }

    public String getFree(){
        return free;
    }


}
