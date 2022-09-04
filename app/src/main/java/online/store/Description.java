package online.store;

public class Description {

    private final String description;
    private final String attribute;

    public Description(String description, String attribute) {
        this.description = description;
        this.attribute = attribute;
    }


    public String getDescription() {
        return description;
    }

    public String getAttribute() {
        return attribute;
    }


}
