public class College {
    private String collegeName;
    private String location;
    private String phoneNumber;
    private final int STUDENTCAP = 1000;

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
    public void cheer(){
        System.out.println("Cheering for the college...");
    }

    public int getSTUDENTCAP() {
        return STUDENTCAP;
    }
}
