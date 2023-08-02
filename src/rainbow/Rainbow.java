package rainbow;
public class Rainbow {
int color;

    public Rainbow() {

    }
    public void setColor(int color) {
        this.color = color;
    }

    public void setColor(int color1, int color2) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public String getColor(int color)
    {
        String text;
        switch (color) {
            case 0:
                text="Красный";
                break;
            case 1:
                text="Оранжевый";
                break;
            case 2:
                text="Жёлтый";
                break;
            case 3:
                text="Зелёный";
                break;
            case 4:
                text="Голубой";
                break;
            case 5:
                text="Синий";
                break;
            case 6:
                text="Фиолетовый";
                break;
            default:
                text="";
        }
        return text;
    }

    public String getColor(int color1, int color2)
    {
        String text;

        text=getColor(color1);
        String subs=text.substring(text.length()-2);

        if (subs.compareTo("ый")==0)
        {
            //text.replace("ый", "о-");
            text=text.substring(0, text.length()-2)+"о-";
        } else
        if (subs.compareTo("ий")==0)
        {
            //text.replace("ий", "е-");
            text=text.substring(0, text.length()-2)+"е-";
        } else
        {
            //text.replace("ой", "о-");
            text=text.substring(0, text.length()-2)+"о-";
        }

        return text+getColor(color2);
    }
}
