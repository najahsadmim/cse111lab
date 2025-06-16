
public class CinemexTicket extends MovieTicket {

    public static int ticketc = 0;
    public String genre;
    public String status;
    public String ticketid;

    public CinemexTicket(String movie, String showtime, String genre, String date) {
        super(movie, date, showtime, 0.0);
        this.genre = genre;
        this.status = "Not Paid";
        ticketc++;
        this.ticketid=genTicketID(movie, "Regular");
        this.seat = "Regular";
    }

    public CinemexTicket(String movie, String showtime, String genre, String date, String seat) {
        super(movie, date, showtime, 0.0);
        this.genre = genre;
        this.status = "Not Paid";
        ticketc++;
        this.ticketid=genTicketID(movie, seat);
        this.seat = seat;
    }

    public static int getTotalTickets(){
        return ticketc;
    }

    public String genTicketID(String movie, String seat){
        String id="";
        String words[]=movie.split(" ");
        for (int i=0; i<words.length; i++){
            if (words[i]!="and"){
                id+=words[i];
                if (i<words.length-1){
                    if (words[i+1]!="and"){
                        id+="-";
                    }
                }
            }
        }
        id+="-"+seat.charAt(0)+"-"+ticketc;
        return id;
    }

    public void calculateTicketPrice(){
        double seatPrice=0;
        if (super.getPrice()>0){
            System.out.println("Ticket price is already calculated successfully.");
        }
        else{
            if (seat=="Regular"){
                seatPrice=300;
            }
            else if (seat=="Premium"){
                seatPrice=450;
            }
            else if (seat=="IMAX 3D"){
                seatPrice=600;
            }

            double finalPrice=seatPrice;
            String[] time=showtime.split(":");
            int hr=Integer.parseInt(time[0]);

            if (hr>=18 && hr<=23){
                finalPrice+=finalPrice*0.15;
            }
            super.setPrice(finalPrice);
            System.out.println("Ticket price is already calculated successfully.");
        }

    }

    public String confirmPayment(){
        if (status=="Not Paid"){
            status="Paid";
            return "Payment Successful";
        }
        else{
            return "Ticket price is already paid!";
        }
    
    }
    public String toString() {
        return "Ticket ID: "+ticketid+ "\nMovie: " + super.getMovie() + "\nShowtime: " + showtime + "\nDate: " + date + "\nGenre: "+genre+ "\nSeat Type: "+ seat + "\nPrice(tk): "+super.getPrice()+ "\nStatus: "+status;
    }
}
