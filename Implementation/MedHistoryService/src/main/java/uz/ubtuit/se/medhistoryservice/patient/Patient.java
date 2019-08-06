
 
package uz.ubtuit.se.medhistoryservice.patient;

import java.util.Date;
import sun.util.calendar.LocalGregorianCalendar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import uz.ubtuit.se.medhistoryservice.config.DBConnection;


/**
 *
 * @author bekturdi
 */
@Path(value = "patient")
public class Patient {

    public String name;
    public String surname;
    public String login;
    public String password;
    public String birthDate;
    public String address;
    public String phone;
    public String blood_group;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getBlood_group() {
        return blood_group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }

}
