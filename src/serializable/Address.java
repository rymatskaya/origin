package serializable;

import java.io.Serializable;

public class Address  {

    private static final long serialVersionUID=2L;
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
