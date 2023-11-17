package reservetion;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
    String passengerName;
    int busNo;
    Date date;

    Booking() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name of passenger: ");
        passengerName = s.next();
        System.out.println("Enter the Bus No: ");
        busNo = s.nextInt();
        System.out.println("Enter the date in dd-MM-yyyy");
        String dateInput = s.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            Date parsedDate = dateFormat.parse(dateInput);
            // Set the parsed date to the 'date' field if parsing is successful
            this.date = parsedDate;
        } catch (ParseException e) {
            e.printStackTrace();
            // Handle parsing exception here (e.g., provide a default date or ask for input again)
        }
    }

    boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
        int capacity = 0;
        for (Bus bus : buses) {
            if (bus.getBusNo() == busNo)
                capacity = bus.getCapacity();
        }

        int booked = 0;
        for (Booking b : bookings) {
            if (b.busNo == busNo && b.date.equals(date)) {
                booked++;
            }
        }

        return booked < capacity;
    }
}
