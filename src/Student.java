public class Student {
    private String name;
    private String phone;
    private int age;
    private double psp;
    private String batch;
    private int gradYear;

    private Student(Builder builder){
        if(builder.getAge()>100){
            throw new RuntimeException("Age cannot be greater than 100");
        }

        this.name = builder.getName();
        this.age = builder.getAge();
        this.batch = builder.getBatch();
        this.psp = builder.getPsp();
        this.phone = builder.getPhone();
        this.gradYear = builder.getGradYear();
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder {
        private String name;
        private String phone;
        private int age;
        private double psp;
        private String batch;
        private int gradYear;
        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getPhone() {
            return phone;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }

}
