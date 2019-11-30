package Model;

public class PhongBan {
    int id;
    String stt,maphong,tenphong;

    public PhongBan() {
    }

    public PhongBan(int id, String stt, String maphong, String tenphong) {
        this.id = id;
        this.stt = stt;
        this.maphong = maphong;
        this.tenphong = tenphong;
    }

    public PhongBan(String stt, String maphong, String tenphong) {
        //ko cần id vì id sẽ tự tăng trong database
        this.stt = stt;
        this.maphong = maphong;
        this.tenphong = tenphong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }

    public String getMaphong() {
        return maphong;
    }

    public void setMaphong(String maphong) {
        this.maphong = maphong;
    }

    public String getTenphong() {
        return tenphong;
    }

    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }
}
