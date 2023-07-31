package Orders;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Good {
    private UUID idGood;   //	 идентификатор
    private String nameGood;   // название товара
    private String dateGood;   //	 дату изготовления

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Good good = (Good) o;
        return Objects.equals(nameGood, good.nameGood) && Objects.equals(dateGood, good.dateGood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameGood, dateGood);
    }

    public String getNameGood() {
        return nameGood;
    }

    public void setNameGood(String nameGood) {
        this.nameGood = nameGood;
    }

    public Good(UUID idGood, String nameGood, String dateGood) {
        this.idGood = idGood;
        this.nameGood = nameGood;
        this.dateGood = dateGood;
    }

    @Override
    public String toString() {
        return " id:" + this.idGood +
                " \tнаименование товара: " + this.nameGood +
                "\tдата изготовления: " + this.dateGood;
    }
}
