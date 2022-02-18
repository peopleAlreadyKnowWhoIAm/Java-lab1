package ua.lpnu.students.labs.first.hotel;

public record Hotel(
    String name,
    long numOfVisitorsPerYear,
    int numOfRooms,
    HotelStatus status,
    boolean hasDinner,
    String adress
){
    public Hotel{
        Hotel.numOfHotels++;
    }

    public Hotel(final String name, final int numOfRooms, final String adress){
        this(name, -1, numOfRooms, HotelStatus.MIDDLE_PRICE, false, adress);
    }

    public Hotel(){
        this(noneInfMessage, -1, noneInfMessage);
    }

    @Override
    public String toString(){
        return 
            name + "\n\t" + 
            visitorsMessage + ((numOfVisitorsPerYear == -1)? noneInfMessage: numOfVisitorsPerYear) +"\n\t"+
            roomsMessage + ((numOfRooms == -1)? noneInfMessage: numOfRooms) +"\n\t"+
            statusMessage + status.toString() +"\n\t"+
            dinnerMessages[((hasDinner == true)?0:1)]+"\n\t"+
            adressMessage + adress
        ;
    }

    protected void finalize(){
        Hotel.numOfHotels--;
    }


    private static final String visitorsMessage = " Visitors per year: ";
    private static final String roomsMessage = " There are that number of rooms: ";
    private static final String[] dinnerMessages = {
        " There is dinner in the hotel ",
        " There is not dinner in the hotel "
    };
    private static final String adressMessage = " Address of the hotel: "; 
    private static final String noneInfMessage = "none information";
    private static final String statusMessage = " The status of the hotel: ";

    private static int numOfHotels = 0;
    public static int getNumOfHotels() {
        return numOfHotels;
    }

}
