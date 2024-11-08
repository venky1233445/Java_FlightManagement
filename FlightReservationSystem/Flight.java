package FlightReservationSystem;

public abstract  class Flight {
    String Flightnumber;
    String departureDate;
    String desTination;
    String Airline;
    protected int capacity;
    protected double price;


    abstract void bookTicket();
    abstract void cancelTicket();
    abstract void availabilityOfSeats();
    abstract void duration();
    abstract void calculatePrice(int persons);

    public Flight(String Flightnumber,String departureDate,String desTination,String Airline,int capacity,double price ){
        this.Flightnumber= Flightnumber;
        this.departureDate = departureDate;
        this.desTination = desTination;
        this.Airline = Airline;
        this.capacity= capacity;

        this.price= price;
    }

    public void displayFlightinfo(){
        System.out.println("flightno: "+Flightnumber+"departureDate: "+departureDate+"Destination: "+desTination+
                "Avalableseats :"+capacity+"price of ticket:"+price);

    }



}
