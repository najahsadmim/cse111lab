
public class Playlist {

    public String name;
    public Song start;


    public Playlist(){
    }

    public Playlist(String name) {
        this.name = name;
        System.out.println(name + " created.");
    }

    public void info(){
        System.out.println(name+" has the following songs: ");
        if (start==null){
            System.out.println("No songs in "+name);
        }
        else{
            int count=1;
            Song temp=start;
            while(temp!=null){
                System.out.println("Song-"+count);
                System.out.println("Title: " + temp.sname + ", Artist: " + temp.aname + ", Length: " + temp.len + " minutes");
                temp=temp.next;
                count++;
            }
        }
    }

    public void addSong(Song s){
        if (start==null){
            start=s;
        }
        else{
            Song temp=start;
            while(temp!=null){
                if (temp.next==null){
                    break;
                }
                temp=temp.next;
            }
            temp.next=s;
        }
        System.out.println(s.sname+" added to "+name);
    }

    public void addSong(Song s, int pos){
        if (pos==0){
            s.next=start;
            start=s;
        }
        else{
            Song temp=start;
            int count=0;
            while(temp!=null && count<pos-1){
                temp=temp.next;
                count++;
            }
            if (temp==null){
                System.out.println("Cannot add song to Index"+pos+".");
                return;
            }
            s.next=temp.next;
            temp.next=s;
        }
        System.out.println(s.sname+" added to "+name);
    }

    public void playSong(String sname){
        Song temp=start;
        boolean found=false;
        while (temp!=null){
            if (sname==temp.sname){
                found=true;
                System.out.println("Playing " + sname + " by " + temp.aname);
            }
            temp=temp.next;
        }
        if (!found){
            System.out.println(sname + " not found in "+ name);
        }
    }

    public void playSong(int pos){
        Song temp=start;
        boolean found=false;
        int count=0;
        while (temp!=null){
            if (pos==count){
                found=true;
                System.out.println("Playing " + temp.sname + " by " + temp.aname);
            }
            temp=temp.next;
            count++;
        }
        if (!found){
            System.out.println("Song at Index "+pos+" not found in "+name);
        }
    }

    public void deleteSong(String sname){
        Song temp=start;
        while (temp.next!=null){
            if (temp.next.sname==sname){
                temp.next=temp.next.next;
                System.out.println(sname+ " deleted from "+name);
                return;
            }
            temp=temp.next;
        }

        if (start.sname==sname){
            start=start.next;
            System.out.println(sname+ " deleted from "+name);
            return;
        }
        System.out.println(sname+ " not found in "+name);
    }

    public int totalSong(){
        int count=0;
        Song temp=start;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public void merge(Playlist p){
        if (p.start!=null){
            Song temp=p.start;
            while (temp!=null){
                Song newSong=new Song(temp.sname, temp.aname, temp.len);
                if (start==null) {
                    start=newSong;
                } 
                else {
                    Song temp2=start;
                    while (temp2.next!=null) {
                        temp2=temp2.next;
                    }
                    temp2.next=newSong;
                }
                temp=temp.next;
            }
            System.out.println("Merge completed!");
        }
    }
    
}
