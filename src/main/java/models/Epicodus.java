package models;

public class Epicodus {
    private String name;
    private String address;
    private String zipcode;
    private String phone;
    private String email;
    private String lastjob;
    private int age;
    private int id;


    public Epicodus(String name, String address, String zipcode, String phone, String email, String lastjob, int age) {
        this.name = name;
        this.address = address;
        this.zipcode = zipcode;
        this.phone = phone;
        this.email = email;
        this.lastjob = lastjob;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getLastJob() {
        return lastjob;
    }

    public void setLastJob(String lastJob) {
        this.lastjob = lastJob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Epicodus epicodus = (Epicodus) o;

        if (age != epicodus.age) return false;
        if (id != epicodus.id) return false;
        if (!name.equals(epicodus.name)) return false;
        if (address != null ? !address.equals(epicodus.address) : epicodus.address != null) return false;
        if (zipcode != null ? !zipcode.equals(epicodus.zipcode) : epicodus.zipcode != null) return false;
        if (phone != null ? !phone.equals(epicodus.phone) : epicodus.phone != null) return false;
        if (email != null ? !email.equals(epicodus.email) : epicodus.email != null) return false;
        return lastjob != null ? lastjob.equals(epicodus.lastjob) : epicodus.lastjob == null;

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (zipcode != null ? zipcode.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (lastjob != null ? lastjob.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + id;
        return result;
    }
}
