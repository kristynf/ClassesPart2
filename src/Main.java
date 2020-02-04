public class Main {
    public static void main(String[]arg){
        Course course = new Course();
        course.cheer();

        ///abstract classes can't be instantiated
        //Animal animal = new Animal(){

        //}
        Dog dog = new Dog ();
        dog.talk();

        //final
        College college = new College();
        System.out.println((college.getSTUDENTCAP()));
    }
}
