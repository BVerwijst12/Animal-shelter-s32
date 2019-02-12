import java.text.SimpleDateFormat;


public class Animal {
    private String name;
    private Gender gender;
    private Reservor ReservedBy;

    public String getName(){
        return name;
    }
    private void setName(String newName){
        name = newName;
    }

    public Gender getGender() {
        return gender;
    }

    public Reservor getReservedBy() {
        return ReservedBy;
    }

    public Animal(String name, Gender gender)
    {
        this.name = name;
        this.gender = gender;
    }

    public Boolean Reserve(String reservedBy)
    {
        if (ReservedBy == null)
        {
            String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());

            ReservedBy = new Reservor(reservedBy, timeStamp);
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        String reserved = "not reserved";
        if (ReservedBy != null)
        {
            reserved = "reserved by " + ReservedBy.getName();
        }
        return "Animal{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                "" + reserved;
    }
}
