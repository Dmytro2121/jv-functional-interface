package core.basesyntax;

import java.util.Random;
import java.util.function.Supplier;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для случайного
 * выбора цвета</p>
 */
public class RandomColor implements Supplier<String> {
    private static final String[] COLORS = {"red", "green", "blue", "yellow", "pink",
            "black", "white"};

    @Override
    public String get() {
        Supplier<String> pickColor = () -> COLORS[new Random().nextInt(COLORS.length)];
        return pickColor.get();
    }
}
