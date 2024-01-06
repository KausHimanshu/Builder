public class Client {
    public static void main(String[] args) {

//        Builder builder = Student.getBuilder();
//        builder.setName("Mohan");
//        builder.setAge(20);
//        builder.setBatch("Advance");
//
//        Student student = new Student(builder);
//        System.out.println("DEBUG");
        Student student = Student.getBuilder().setName("Mohan").setAge(20).setBatch("Advance").build();
    }
}