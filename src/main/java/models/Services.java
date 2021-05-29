package models;

public abstract class Services {
    protected String id;

    public Services() {
    }

    protected abstract String showInfo();

    public Services(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
