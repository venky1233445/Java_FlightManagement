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
    public void setFlightnumber(String flightnumber) {
        Flightnumber = flightnumber;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public void setDesTination(String desTination) {
        this.desTination = desTination;
    }

    public void setAirline(String airline) {
        Airline = airline;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void delete(){
        this.Flightnumber= null;
        this.departureDate = null;
        this.desTination = null;
        this.capacity = 0;
        this.price=0.0;
    }
    public void update(String Flightnumber,String departureDate,String desTination,int capacity,double price){
        this.Flightnumber=  Flightnumber;
        this.departureDate = departureDate;
        this.desTination =desTination ;
        this.capacity = capacity ;
        this.price = price;

    }

    public void displayFlightinfo(){
        System.out.println("flightno: "+Flightnumber+", "+"departureDate: "+departureDate+", "+"Destination: "+desTination+", "+
                "Avalableseats :"+capacity+", "+"price of ticket:"+price);

    }

}



