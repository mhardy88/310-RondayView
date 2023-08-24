package com.example.a310_rondayview;

import com.google.firebase.Timestamp;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class EventTest extends TestCase {

    public Event event;

    @Before
    public void setUp() {
        event = new Event(
                "event123",
                "Club A",
                "Sample Event",
                "This is a sample event",
                "Sample Location",
                new Timestamp(new Date()),
                "https://sample-image-url.com/image.jpg",
                "https://sample-profile-image-url.com/profile.jpg"
        );
    }

    @Test
    public void testGetEventID() {
        assertEquals("event123", event.getEventID());
    }

    @Test
    public void testGetClubName() {
        assertEquals("Club A", event.getClubName());
    }

    @Test
    public void testGetTitle() {
        assertEquals("Sample Event", event.getTitle());
    }

    @Test
    public void testGetDescription() {
        assertEquals("This is a sample event", event.getDescription());
    }

    @Test
    public void testGetLocation() {
        assertEquals("Sample Location", event.getLocation());
    }

    @Test
    public void testGetDateTime() {
        assertNotNull(event.getDateTime());
    }

    @Test
    public void testGetImageURL() {
        assertEquals("https://sample-image-url.com/image.jpg", event.getImageURL());
    }

    @Test
    public void testGetEventClubProfilePicture() {
        assertEquals("https://sample-profile-image-url.com/profile.jpg", event.getEventClubProfilePicture());
    }

    @Test
    public void testUpdateDetails() {
        // You can write test cases for the updateDetails() method here
        // For example, checking if the event details are updated correctly
    }

    @Test
    public void testDelete() {
        // You can write test cases for the delete() method here
        // For example, checking if the event is properly deleted
    }
}