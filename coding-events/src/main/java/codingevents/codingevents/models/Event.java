package codingevents.codingevents.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.util.Objects;

public class Event {
    private int id;
    private static int nextId = 1;
    @NotBlank(message = "name required")
    @Size(min = 3, max = 50, message = "Name must be 3-50 characters.")
    private String name;
    @NotBlank(message="Location cannot be left blank.")
    private String location;

    @Positive(message="Number of attendees must be one or more.")
    private int numberOfAttendees;
    @Size(max = 500, message = "Description too long!")
    private String description;
    @NotBlank
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;

    public Event(String name, String location, int numberOfAttendees,String description, String contactEmail) {
        this.name = name;
        this.description = description;
        this.location = location;
        this.numberOfAttendees = numberOfAttendees;
        this.contactEmail = contactEmail;
        this.id = nextId;
        nextId++;
    }

    public Event() {}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public int getId() {
        return id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return name;
    }


}
