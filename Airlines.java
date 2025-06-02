class Passenger {
    String name;
    String passportNumber;

    Passenger(String name, String passportNumber) {
        this.name = name;
        this.passportNumber = passportNumber;
    }
}

class Reservation {
    Passenger passenger;
    String flightNumber;

    Reservation(Passenger passenger, String flightNumber) {
        this.passenger = passenger;
        this.flightNumber = flightNumber;
    }
}

class TicketBooking {
    Reservation reservation;
    double price;

    TicketBooking(Reservation reservation, double price) {
        this.reservation = reservation;
        this.price = price;
    }

    void bookTicket() {
        System.out.println("Ticket booked for " + reservation.passenger.name + " on flight " + reservation.flightNumber);
    }
}

class Employee {
    String name;
    String role;

    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    void assistBooking() {
        System.out.println(name + " is assisting with the booking.");
    }
}