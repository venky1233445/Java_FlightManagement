package FlightReservationSystem;

import java.util.Scanner;

public class InternationalFlight extends Flight{


    public InternationalFlight(String Flightnumber, String departureDate, String desTination, String Airline, int capacity, double price) {
        super(Flightnumber, departureDate, desTination, Airline, capacity, price);
    }

    @Override
    void bookTicket() {
        int tickets;
        System.out.println("Welcome to booking of Tickets.....");
        Scanner sc = new Scanner(System.in);
        int count =0;
        if(capacity>=0){
            System.out.println("please select the number of tickets ....");
            tickets = sc.nextInt();
            System.out.println("please select number of persons....");
            int person = sc.nextInt();
            if (tickets>0 && tickets<=capacity) {

                capacity = capacity - person;
                count++;
                System.out.println("selected tickets :" + tickets);
                System.out.println("Confirm the booking Ticket person: " + count + " " + person);
                System.out.println("Availability of Seats:s  " + capacity);
            }
            else {
                System.out.println("Insufficient of tickets available");
            }
            calculatePrice(person);

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
        if (Status.equalsIgnoreCase("yes")) {
            System.out.println("select the number of persons... ");
            int persons = sc.nextInt();
            capacity = capacity+persons;
            count--;
            System.out.println("cancel the ticket of a person :" + count);
            System.out.println("Availability of seats " + capacity);


        } else {
            System.out.println("Invalid cancellation request, Cannot cancel more than booked seats.");
        }

    }



    @Override
    void availabilityOfSeats() {
        int Availabilityseats;
       Availabilityseats =capacity;
        System.out.println("availability of Seats : "+Availabilityseats);


    }

    @Override
    void duration() {
        String Airlines = Airline;
        String deparDate = departureDate;
        String arrivaldate = desTination;
        System.out.println("Estimated time is 6hrs: "+Airlines+" "+deparDate+" "+arrivaldate);


    }

    @Override
    void calculatePrice(int persons) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please Assure Calculate price ");

        double baseprice= price*7;
        double GSt =  8 /100d;
        double windowseatPrice = 550;
        double insurance = 100d;
        System.out.println("-----please confirm Window seat (yes/no)----");
        String status = sc.nextLine();
        double totalfarecost = (baseprice)*GSt+ insurance+ baseprice;

        if(status.equalsIgnoreCase("yes")){
            totalfarecost +=windowseatPrice;
            System.out.println("Baseprice : "+baseprice+"\n"+"GSt :"+GSt+"\n "+ "WindowSeat price : "+windowseatPrice+"\n"+
                    "Insurance : "+insurance+"\n");
            System.out.println(("Total Fare Cost$ : " +totalfarecost+" $ "));


        }
        else {
            System.out.println("FareCost of ticket :: " +totalfarecost);

        }


    }
}
