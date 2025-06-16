
public class Song {

    public String sname;
    public String aname;
    public int len;
    public Song next;

    public Song(){
    }

    public Song(String sname, String aname, int len){
        this.sname = sname;
        this.aname = aname;
        this.len = len;
    }

    public void songInfo() {
        System.out.println("Title: " + sname + ", Artist: " + aname + ", Length: " + len + " minutes");
    }
}
