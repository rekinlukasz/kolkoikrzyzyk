package kolkoikrzyzyk;

public enum Symbol {
    CIRCLE(" O "), CROSS(" X "), EMPTY(" _ ");

    private String description;
    Symbol(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

