package service;

import java.util.LinkedList;
import java.util.Iterator;

public class AppointmentService {

    private LinkedList<String> appointments = new LinkedList<>();

    public void initializeAppointments() {
        // TODO: Add 3 normal appointments
        appointments.add("Alice - Advisor Meeting");
        appointments.add("Bob - Financial Aid Consultation");
        appointments.add("Charlie - Course Selection");
        // TODO: Add 1 urgent appointment at the beginning
        appointments.addFirst("URGENT: David - Academic Probation Review");
    }

    public void cancelLast() {
        // TODO: Remove last appointment
        if (!appointments.isEmpty()) {
            String removed = appointments.removeLast();
            System.out.println("Cancelled last appointment: " + removed);
        } else {
            System.out.println("No appointments to cancel.");
        }
    }

    public void showFirstAndLast() {
        // TODO: Print first and last appointment
        if (!appointments.isEmpty()) {
            System.out.println("First appointment: " + appointments.getFirst());
            System.out.println("Last appointment: " + appointments.getLast());
        } else {
            System.out.println("No appointments available.");
        }
    }

    public void printAppointments() {
        // TODO: Traverse using Iterator
        System.out.println("=== Appointment List ===");
        Iterator<String> it = appointments.iterator();
        while (it.hasNext()) {
            System.out.println("- " + it.next());
        }
    }
}
