package FlightReservationSystem;


import java.sql.SQLOutput;
import java.util.Scanner;

public class FlightReservation extends FlightAdmin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to Flight Reservation ");
        passenger passenger = new passenger();
        while(true){
            System.out.println("\n-----Welcome To Flight Reservation System");
            System.out.println("\n--- Flight Reservation System ---");
            System.out.println("1. Book Domestic Flight");
            System.out.println("2. Book International Flight");
            System.out.println("3. View Availability");
            System.out.println("4. Cancel Ticket");
            System.out.println("5. Update Passenger Information");
            System.out.println("6.Departure & Arrival timings");
            System.out.println("7. Flight Info");
            System.out.println("8. delete details");
            System.out.println("9. add/update details");
            System.out.println("8. Exit");

            System.out.print("Select an option: "+"\n");
            int option = sc.nextInt();

            switch (option) {

                case 1:
                    passenger.UpdateInfo();
                    System.out.println("-------Booking Tickets----------");
                    domesticFlight.bookTicket();
                    System.out.println("----------------Welcome to passenger ticket detalils---------------------");
                    passenger.getPassengerDetails();
                    break;

                case 2:
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
                    if (choice.equalsIgnoreCase("1")) {
                        System.out.println(" welcome to Domestic Flight Seats");
                        domesticFlight.availabilityOfSeats();
                    } else {
                        System.out.println(" welcome to InternationalFlight Seats");
                        internationalflight.availabilityOfSeats();
                    }
                    break;
                case 4:
                    System.out.println("----------------Welcome  to cancel process----------------------");
                    System.out.println("Choose option for Cancelling process 1.DomesticFlight , 2.InternationalFlight: ");
                    String random = sc.next();
                    if (random.equalsIgnoreCase("1")) {
                        System.out.println("Welcome to DomesticAirlines Ticket cancelling");
                        domesticFlight.cancelTicket();
                    } else {
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
                    System.out.println("Domestic departure &Arrival :");
                    domesticFlight.duration();

                    System.out.println("International  departure &Arrival :");
                    internationalflight.duration();
                    break;

                case 7:
                    System.out.println("Domestic About Flight Info");

                    domesticFlight.displayFlightinfo();
                    System.out.println("International  About Flight Info");

                    internationalflight.displayFlightinfo();
                    break;

                case 8:
                    Scanner kc = new Scanner(System.in);
                    System.out.println("section:  1.Domestic, 2.international");
                    int kit = kc.nextInt();
                    if (kit == 1) {
                        System.out.println("delete Details flight info .....");
                        domesticFlight.delete();
                        System.out.println("Displaying details");
                        domesticFlight.displayFlightinfo();

                    }
                    if (kit == 2) {
                        System.out.println("delete Details flight info .....");
                        internationalflight.delete();
                        System.out.println("Displaying details");
                        internationalflight.displayFlightinfo();
                      }
                    else {
                        System.out.println("Invalid Option from list");

                    }
                    break;


                case 9:
                    System.out.println(" update Details Flight info.....");
                    int options;
                    Scanner ks = new Scanner(System.in);
                    System.out.println("section:  1.Domestic, 2.international, 3.AddingInfo Domestic ,4.Adding Info International");
                    options = ks.nextInt();
                    if (options==1) {
                        System.out.println("welcome to Updates");
                        System.out.println("1.Update All Information");
                        System.out.println(" 2.update New Airline");
                        System.out.println("3.Update FlightNo");
                        System.out.println("4.Update Fromdate");
                        System.out.println("5.Update to date");
                        System.out.println("6.update Capacity");
                        System.out.println("7.Update New Price");
                        int choices = ks.nextInt();
                        switch (choices) {
                         case 1:
                             System.out.println("provide new update  Airline  NO...");
                            String airline = ks.next();
                            domesticFlight.setAirline(airline);
                            System.out.println("provide new Update Flightno... ");
                            String flightNo = ks.next();
                            domesticFlight.setFlightnumber(flightNo);
                            System.out.println("provide new  Update From Date...");
                            String From = ks.next();
                            domesticFlight.setDepartureDate(From);
                            System.out.println("Provide Update To date...");
                            String to = ks.next();
                            domesticFlight.setDesTination(to);
                            System.out.println(" provide Update capacity in numbers............");
                            int volume = ks.nextInt();
                            domesticFlight.setCapacity(volume);
                            System.out.println("Provide Update new price....");
                            int newprice = ks.nextInt();
                            domesticFlight.setPrice(newprice);
                            System.out.println("New  Updated  information......");
                            domesticFlight.displayFlightinfo();
                            break;
                            case 2:
                                System.out.println("Change Airline Update");
                                String NewAirline = ks.next();
                                domesticFlight.setAirline(NewAirline);
                                System.out.println("Changed Successfully");
                                domesticFlight.displayFlightinfo();
                                break;
                            case 3:
                                System.out.println("Change FlightNO");
                                String Flightnumber = ks.next();
                                domesticFlight.setFlightnumber(Flightnumber);
                                System.out.println("Successfully Changed");
                                domesticFlight.displayFlightinfo();
                                break;
                            case 4:
                                System.out.println("change From date");
                                String newFRom = ks.next();
                                domesticFlight.setDepartureDate(newFRom);
                                System.out.println("Successfully Changed");
                                domesticFlight.displayFlightinfo();
                                break;
                            case 5:

                                System.out.println("Change To date");
                                String NewTo = ks.next();
                                domesticFlight.setDesTination(NewTo);
                                System.out.println("Successfully Changed");
                                domesticFlight.displayFlightinfo();
                                break;
                            case 6:
                                System.out.println("Change CAPACITY");
                                int capa = ks.nextInt();
                                domesticFlight.setCapacity(capa);
                                System.out.println("Successfully Changed");
                                domesticFlight.displayFlightinfo();
                                break;
                            case 7 :
                                System.out.println("Change Price");
                                double pricei = ks.nextDouble();
                                domesticFlight.setPrice(pricei);
                                System.out.println("Successfully Changed");
                                domesticFlight.displayFlightinfo();
                                break;
                            case 8:
                                System.out.println("Exit");
                                return;
                            default:
                                System.out.println("Invalid options please try again");
                        }
                    }
                    if (options == 2) {
                        Scanner kd = new Scanner(System.in);
                        System.out.println("welcome to Updates");
                        System.out.println("1.Update All Information");
                        System.out.println(" 2.update New Airline");
                        System.out.println("3.Update FlightNo");
                        System.out.println("4.Update Fromdate");
                        System.out.println("5.Update to date");
                        System.out.println("6.update Capacity");
                        System.out.println("7.Update New Price");
                        int coach = kd.nextInt();
                       switch (coach){
                           case 1:
                               System.out.println("provide All data Information...");
                               System.out.println("provide Airline  NO...");
                               String airline = kd.next();
                               internationalflight.setAirline(airline);
                               System.out.println("provide new Flightno... ");
                               String flightNo = kd.next();
                               internationalflight.setFlightnumber(flightNo);
                               System.out.println("provide new From Date...");
                               String From = kd.next();
                               internationalflight.setDepartureDate(From);
                               System.out.println("Provide To date...");
                               String to = kd.next();
                               internationalflight.setDesTination(to);
                               System.out.println(" provide capacity in numbers............");
                               int volume = kd.nextInt();
                               internationalflight.setCapacity(volume);
                               System.out.println("Provide new price....");
                               int newprice = kd.nextInt();
                               internationalflight.setPrice(newprice);
                               System.out.println("Updated information......");
                               internationalflight.displayFlightinfo();
                               break;
                           case 2:
                               System.out.println("Change Airline Update");
                               String NewAirliness = kd.next();
                               internationalflight.setAirline(NewAirliness);
                               System.out.println("Changed Successfully");
                               internationalflight.displayFlightinfo();
                               break;
                           case 3:
                               System.out.println("Change FlightNO");
                               String Flightnumbers = kd.next();
                               internationalflight.setFlightnumber(Flightnumbers);
                               System.out.println("Successfully Changed");
                              internationalflight.displayFlightinfo();
                               break;
                           case 4:
                               System.out.println("change From date");
                               String newFRoms = kd.next();
                              internationalflight.setDepartureDate(newFRoms);
                               System.out.println("Successfully Changed");
                               internationalflight.displayFlightinfo();
                               break;
                           case 5:

                               System.out.println("Change To date");
                               String NewTos = kd.next();
                               internationalflight.setDesTination(NewTos);
                               System.out.println("Successfully Changed");
                            internationalflight.displayFlightinfo();
                               break;
                           case 6:
                               System.out.println("Change CAPACITY");
                               int capact = kd.nextInt();
                               internationalflight.setCapacity(capact);
                               System.out.println("Successfully Changed");
                               internationalflight.displayFlightinfo();
                               break;
                           case 7 :
                               System.out.println("Change Price");
                               double pricein = kd.nextDouble();
                               internationalflight.setPrice(pricein);
                               System.out.println("Successfully Changed");
                               internationalflight.displayFlightinfo();
                               break;
                           case 8:
                               System.out.println("Exit");
                               return;
                           default:
                               System.out.println("Invalid options please try again");

                       }


                    }
                    if (options == 3){
                        Scanner sk = new Scanner(System.in);

                        System.out.println("Provide Flight no.....");
                        String No = sk.next();
                        System.out.println("Provide From date information..");
                        String fromdate=sk.next();
                        System.out.println("provide toDate ....");
                        String Todate = sk.next();
                        System.out.println("provide seats....");
                        int seats = sk.nextInt();
                        System.out.println("provide new price....");
                        double price = sk.nextDouble();
                        domesticFlight.update(No,fromdate,Todate,seats,price);
                        System.out.println("adding new one successsfully");
                        System.out.println("information updated....");
                        domesticFlight.displayFlightinfo();
                       break;
                    }
                    if (options==4){
                        Scanner sdc = new Scanner(System.in);

                        System.out.println("Provide Flight no.....");
                        String No = sdc.next();
                        System.out.println("Provide From date information..");
                        String fromdate=sdc.next();
                        System.out.println("provide toDate ....");
                        String Todate = sdc.next();
                        System.out.println("provide seats....");
                        int seats = sdc.nextInt();
                        System.out.println("provide new price....");
                        double price = sdc.nextDouble();
                        internationalflight.update(No,fromdate,Todate,seats,price);
                        System.out.println("adding new one successsfully");
                        System.out.println("information updated");
                      internationalflight.displayFlightinfo();
                    }
                    else {
                        System.out.println("Invalid option");
                    }
                    break;

                    case 10 :
                    System.out.println("Thank you for choosing us");
                    System.out.println("&");
                    System.out.println("Visit Again");
                    System.out.println("----------");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");




            }

        }

    }
}
