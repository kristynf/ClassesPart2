public class College {
    private String collegeName;
    private String location;
    private String phoneNumber;

    public College(){

    }
    public College(String collegeName,String location,String phoneNumber){
        this.collegeName = collegeName;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }
    public String getCollegeName(){
        return this.collegeName;
    }
    public void setCollegeName(String collegeName){
        this.collegeName = collegeName;
    }
    public String getLocation(){
        return this.location;
    }
    public void setLocation(String location){
        this.location = location;
    }
}
