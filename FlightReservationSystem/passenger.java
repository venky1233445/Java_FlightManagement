package FlightReservationSystem;

import java.util.Scanner;
import java.util.UUID;

import static java.lang.Math.random;

public class passenger {
    String passengerId;
    String name;
    String age;
    String Gmail;
    String gender;


    public String getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String gmail) {
        Gmail = gmail;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String UpdateInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Users details");
        System.out.println("please Enter the name");
        name = sc.next();
        System.out.println("please Enter  the age");
        age = sc.next();
        System.out.println("please Enter the gender");
        gender = sc.next();
        System.out.println("please Enter  the gmail account");
        Gmail = sc.next();
        System.out.println("verifying the details.....");

        System.out.println("please confirm the details you provided (yes/no)");
        String status = sc.nextLine();
        System.out.println("----------------------");
        if (status.equalsIgnoreCase("no")) {
            System.out.println("failed to verify details");
            System.out.println("-------------------------");
        }
        else {
            if (Gmail.equals(getGmail()) && name.equals(getName()) && age.equals(getAge()) && gender.equals(getGender()))
            {
                System.out.println("details verified Successfully @");
                System.out.println(" please wait generating passenegr id........");
                passengerId = "PASS-" + UUID.randomUUID().toString().substring(0, 8);
                System.out.println("successfully created passenger Id : " +passengerId);

        }
            else{
                System.out.println("failed to generate passenger id ");
            }


    }


       return passengerId;
    }

   public void   getPassengerDetails(){
       System.out.println("Name:" +getName()+ " "+ "passengerid :"+getPassengerId()+" "
               +"Age:"+getAge()+" "+ "Gender :"+getGender()+" " +"Gamil :"+ getGmail() );


    }



}
