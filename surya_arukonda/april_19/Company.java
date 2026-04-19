class Company {
    int id;
    String name;

    Company(int id, String name) {
        this.id = id;
        this.name = name;
    }

    String getDetails() {
        return id + " - " + name;
    }
