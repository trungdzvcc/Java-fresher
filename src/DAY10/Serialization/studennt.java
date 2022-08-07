package DAY10.Serialization;

import java.io.Serializable;

public class studennt implements Serializable {
    private String name;
    private String gender;

    public studennt() {
    }

    public studennt(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "studennt{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
    public void Show(){
        System.out.println(toString());
    }

}
