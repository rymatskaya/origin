package port.main;

public class Constants {

    public static final int DENSITY_HIGH = 2000;
    public static final int DENSITY_SMALL = 1000;
    public static final int DIAGONAL_SMALL = 10;
    public static final int DIAGONAL_BIG = 20;
    public static final int MIN_HEIGHT = 10;
    public static final int MAX_HEIGHT = 100;

    public static final String INCORRECT_HEIGHT = "Заданное некорректное значение высоты контейнера" +
            "было заменено на случайно сгенерированное корректное (от 10 до 100).";
    public static final String CORRECT_HEIGHT = "Значение высоты контейнера было оставлено без изменений," +
            "поскольку новое значение было задано некорректно.";

    public static final String INCORRECT_DENSITY = "Заданное некорректное значение плотности воды " +
            "было заменено на случайно сгенерированное корректное (1000 или 2000).";
    public static final String CORRECT_DENSITY = "Значение плотности воды было оставлено без изменений," +
            "поскольку новое значение было задано некорректно.";

    public static final String INCORRECT_DIAGONAL = "Заданное некорректное значение диагонали" +
            " основания контейнера было заменено на случайно сгенерированное корректное (10 или 20).";
    public static final String CORRECT_DIAGONAL = "Значение диагонали контейнера было оставлено без изменений," +
            "поскольку новое значение было задано некорректно.";
}
