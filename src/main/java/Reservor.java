import java.util.Date;

public class Reservor {
    private String name;
    private String ReservedAt;

    public String getName()
    {
        return this.name;
    }
    private String setName(String name)
    {
        this.name = name;
        return name;
    }

    public String getReservedAt() {
        return ReservedAt;
    }
    private String setReservedAt(String date)
    {
        return ReservedAt = date;
    }

    public Reservor(String name, String reservedAt)
    {
        this.name = name;
        this.ReservedAt = reservedAt;
    }

}
