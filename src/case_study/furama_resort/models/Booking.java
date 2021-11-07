package case_study.furama_resort.models;

public class Booking implements Comparable<Booking> {
    private String bookingCode;
    private int startDay;
    private int endDay;
    private String customerCode;
    private String serviceName;
    private String serviceType;
    public Booking() {
    }

    public Booking(String bookingCode, int startDay, int endDay, String customerCode, String serviceName, String serviceType) {
        this.bookingCode = bookingCode;
        this.startDay = startDay;
        this.endDay = endDay;
        this.customerCode = customerCode;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public int getStartDay() {
        return startDay;
    }

    public void setStartDay(int startDay) {
        this.startDay = startDay;
    }

    public int getEndDay() {
        return endDay;
    }

    public void setEndDay(int endDay) {
        this.endDay = endDay;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        return this.bookingCode + "," + this.startDay + "," + this.endDay + "," + this.customerCode + "," + this.serviceName + "," + this.serviceType;
    }


    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Booking)){
            return false;
        }
        Booking booking = (Booking) obj;

        return this.bookingCode.equals(booking.bookingCode);// 2 đối tượng có bookingCode bằng nhau thì bằng nhau
    }

    @Override
    public int compareTo(Booking o) {
        int result = this.startDay - o.startDay;
        if (result == 0){
            result = this.endDay - o.endDay;
        }
        return result;
    }
}
