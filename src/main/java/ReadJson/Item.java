package ReadJson;

/**
 *
 */
public class Item {
    private String tempstamp;
    private Event event;

    public Item() {
    }

    public Item(String tempstamp) {
        this.tempstamp = tempstamp;
    }

    public Item(Event event) {
        this.event = event;
    }

    public Item(String tempstamp, Event event) {
        this.tempstamp = tempstamp;
        this.event = event;
    }

    public String getTempstamp() {
        return tempstamp;
    }

    public void setTempstamp(String tempstamp) {
        this.tempstamp = tempstamp;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
