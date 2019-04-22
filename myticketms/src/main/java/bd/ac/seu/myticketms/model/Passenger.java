package bd.ac.seu.myticketms.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Passenger {
    @Id
    private String nid;
    private String name;
    private String mobile;
    private String email;

    public Passenger(String nid, String name, String mobile, String email) {
        this.nid = nid;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "nid='" + nid + '\'' +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
