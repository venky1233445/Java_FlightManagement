package FlightReservationSystem;

import java.util.Scanner;

public class DomesticFlights extends Flight{

    public DomesticFlights(String Flightnumber, String departureDate, String desTination, String Airline, int capacity, double price) {
        super(Flightnumber, departureDate, desTination, Airline, capacity, price);
    }



    @Override
    void bookTicket() {
        int tickets ;
        System.out.println("Welcome to booking of Tickets");
        Scanner sc = new Scanner(System.in);
       int count =0;
        if(capacity>=0){
            System.out.println("please select the number of tickets ");
            tickets = sc.nextInt();
            System.out.println("please select number of persons");
            int person = sc.nextInt();

            if (tickets>0 && tickets<=capacity) {

                capacity = capacity - person;
                count++;
                System.out.println("selected tickets :" + tickets);
                System.out.println("Confirm the booking Ticket person: "+count + " persons :" + person);
                System.out.println("Availability of Seats:  " + capacity);

                calculatePrice(person);
            }
           else {
                System.out.println("Insufficient of tickets available");
            }


        }
        else{
            System.out.println("insufficient seats available " +capacity);
        }



    }

    @Override
    void cancelTicket() {
        System.out.println("Ticket Cancellation process");
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("please confirm the cancel(yes/no)");
        String Status = sc.next();
        System.out.println("select the number of persons... ");
        int persons = sc.nextInt();
        if(persons>0 && persons< capacity){
        if (Status.equalsIgnoreCase("yes")) {


            capacity = capacity + persons;
            count--;
            System.out.println("cancel the ticket of a person  no of count :" + count + " "+persons);
            System.out.println("Availability of seats " + capacity);

        }
        } else {
            System.out.println("Invalid cancellation request, Cannot cancel more than booked seats.");
        }

    }

    @Override
    void availabilityOfSeats() {
        int Availabilityseats;
        Availabilityseats = capacity;
        System.out.println("availability of Seats : "+Availabilityseats);


    }

    @Override
    void duration() {
        String flight = Airline;
        String Departurdate = departureDate;
        String Arrivaldate  = desTination;
        System.out.println("Estimated time is 2hrs"+flight+" "+Departurdate+" "+Arrivaldate+" "+Arrivaldate);

    }



    @Override
    void calculatePrice(int persons) {
        Scanner sc = new Scanner(System.in);
        double baseprice= price;
        double GSt = 8/100d;
        double windowseatPrice = 250;
        double insurance = 50d;

        double totalbaseprice = baseprice*persons*GSt;
        double totalinsurance = insurance*persons;

        System.out.println("----------please confirm Window seat (yes/no)----------");
        String status = sc.nextLine();
        double totalfarecost = totalbaseprice+ totalinsurance+ baseprice;

        if(status.equalsIgnoreCase("yes")){
            totalfarecost +=windowseatPrice*persons;
            System.out.println("Baseprice : " +baseprice+ " \n" +"GSt : "+GSt+ "\n " + "WindowSeat price : " +windowseatPrice+
                    "\n"+ "Insurance : "+ insurance+ "\n");
            System.out.println(("Total Fare Cost$ :" +totalfarecost+ "$"));


        }
        else {
            System.out.println("FareCost of ticket" +totalfarecost);

        }


    }
}
