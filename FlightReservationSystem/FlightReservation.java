package FlightReservationSystem;

import java.util.Scanner;

public class FlightReservation extends FlightAdmin{
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to Flight Reservation ");
        passenger passenger = new passenger();
        boolean flagship =true ;
        while(flagship){
            System.out.println("\n-----Welcome To Flight Reservation System");
            System.out.println("\n--- Flight Reservation System ---");
            System.out.println("1. Book Domestic Flight");
            System.out.println("2. Book International Flight");
            System.out.println("3. View Availability");
            System.out.println("4. Cancel Ticket");
            System.out.println("5. Update Passenger Information");
            System.out.println("6.Departure & Arrival timings");
            System.out.println("7. Flight Info");
            System.out.println("8. Exit");
            System.out.print("Select an option: "+"\n");
            int option = sc.nextInt();

            switch (option){

                case 1:
                    passenger.UpdateInfo();
                    System.out.println("-------Booking Tickets----------");
                   domesticFlight.bookTicket();
                    System.out.println("----------------Welcome to passenger ticket detalils---------------------");
                   passenger.getPassengerDetails();
                   break;

                case 2 :
                    passenger.UpdateInfo();
                    System.out.println("-------Booking Tickets----------");
                    internationalflight.bookTicket();
                    System.out.println("----------------Welcome to passenger ticket detalils---------------------");
                    passenger.getPassengerDetails();

                    break;

                case 3:
                    System.out.println("----------------Welcome to seats availability process----------------------");
                    System.out.println("Choose option for Availability  1.DomesticFlight , 2.InternationalFlight: ");
                   String choice = sc.nextLine();
                    if(choice.equalsIgnoreCase("1")){
                        System.out.println(" welcome to Domestic Flight Seats");
                        domesticFlight.availabilityOfSeats();
                    }
                    else {
                        System.out.println(" welcome to InternationalFlight Seats");
                        internationalflight.availabilityOfSeats();
                    }
                    break;
                case 4:
                    System.out.println("----------------Welcome  to cancel process----------------------");
                    System.out.println("Choose option for Cancelling process 1.DomesticFlight , 2.InternationalFlight: ");
                    String random = sc.next();
                    if (random.equalsIgnoreCase("1")){
                        System.out.println("Welcome to DomesticAirlines Ticket cancelling");
                        domesticFlight.cancelTicket();
                    }
                    else {
                        System.out.println("Welcome to International Airlines Ticket cancelling");
                        internationalflight.cancelTicket();
                    }
                    break;

                case 5:
                    System.out.println("----------------Welcome to passenger information----------------------");

                    System.out.println("Verify Passenger Details...........");
                    passenger.getPassengerDetails();
                    break;

                case 6:
                    System.out.println("Welcome to departure & arrival lounge");
                    System.out.println("Domestic departure &Arrival :" );
                    domesticFlight.duration();

                    System.out.println("International  departure &Arrival :");
                    internationalflight.duration();
                    break;

                case 7 :
                    System.out.println("Domestic About Flight Info");

                    domesticFlight.displayFlightinfo();
                    System.out.println("International  About Flight Info");

                    internationalflight.displayFlightinfo();
                    break;
                case 8 :
                    System.out.println("Thank you for choosing us");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");




            }

        }

    }
}
