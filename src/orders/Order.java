package orders;

import java.util.List;
import java.util.UUID;

public class Order {
    private UUID idGood;   //	 идентификатор
    private List<Good> goods;   // название товара
    private String dateOrder;   //	 дату оформления заказа

    public Order(UUID idGood, List<Good> goods, String dateOrder) {
        this.idGood = idGood;
        this.goods = goods;
        this.dateOrder = dateOrder;
    }

    public String getDateOrder() {
        return dateOrder;
    }

    @Override
    public String toString() {
        String s =  " ( ";
        for (Good good: goods) {
            s +=  good.getNameGood() + " ";
        }
        s+=") ";
        return " id:" + this.idGood +
               " товары " + s +
                "\tдата заказа: " + this.dateOrder;

    }
}
