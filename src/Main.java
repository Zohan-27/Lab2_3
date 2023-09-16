import java.util.Scanner;

// Класс Visualization
class Visualization {
    private int width;
    private int height;
    private String backgroundColor;
    private boolean isInteractive; // Новое поле

    public Visualization(int width, int height, String backgroundColor, boolean isInteractive) {
        this.width = width;
        this.height = height;
        this.backgroundColor = backgroundColor;
        this.isInteractive = isInteractive;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public boolean isInteractive() {
        return isInteractive;
    }

    public void setInteractive(boolean isInteractive) {
        this.isInteractive = isInteractive;
    }

    public void displayInfo() {
        System.out.println("Визуализация:");
        System.out.println("Ширина: " + width);
        System.out.println("Высота: " + height);
        System.out.println("Цвет заднего фона: " + backgroundColor);
        System.out.println("Интерактивна?: " + isInteractive);
    }
}

// Класс VisualizationFrame
class VisualizationFrame {
    private String frameType;
    private boolean isResizable;
    private int zIndex;

    public VisualizationFrame(String frameType, boolean isResizable, int zIndex) {
        this.frameType = frameType;
        this.isResizable = isResizable;
        this.zIndex = zIndex;
    }

    public String getFrameType() {
        return frameType;
    }

    public void setFrameType(String frameType) {
        this.frameType = frameType;
    }

    public boolean isResizable() {
        return isResizable;
    }

    public void setResizable(boolean resizable) {
        isResizable = resizable;
    }

    public int getZIndex() {
        return zIndex;
    }

    public void setZIndex(int zIndex) {
        this.zIndex = zIndex;
    }

    public void increaseZIndex() {
        this.zIndex++;
    }

    public void displayInfo() {
        System.out.println("Фрейм визуализации:");
        System.out.println("Тип фрейма: " + frameType);
        System.out.println("Возможность изменения размера: " + isResizable);
        System.out.println("Z-индекс: " + zIndex);
    }
}

// Класс VisualizationLayer
class VisualizationLayer {
    private String layerName;
    private int opacity;
    private boolean isVisible;

    public VisualizationLayer(String layerName, int opacity, boolean isVisible) {
        this.layerName = layerName;
        this.opacity = opacity;
        this.isVisible = isVisible;
    }

    public String getLayerName() {
        return layerName;
    }

    public void setLayerName(String layerName) {
        this.layerName = layerName;
    }

    public int getOpacity() {
        return opacity;
    }

    public void setOpacity(int opacity) {
        this.opacity = opacity;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    public void displayInfo() {
        System.out.println("Слой визуализации:");
        System.out.println("Имя слоя: " + layerName);
        System.out.println("Прозрачность: " + opacity);
        System.out.println("Видимый?: " + isVisible);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueInput = true;

        do {
            System.out.println("Введите данные для визуализации:");
            System.out.print("Ширина: ");
            int width = scanner.nextInt();
            System.out.print("Высота: ");
            int height = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Цвет фона: ");
            String backgroundColor = scanner.nextLine();
            System.out.print("Интерактивная визуализация (true/false): ");
            boolean isInteractive = scanner.nextBoolean();

            Visualization visualization = new Visualization(width, height, backgroundColor, isInteractive);

            System.out.println("\nВведите данные для фрейма визуализации:");
            System.out.print("Разрешение изменения размера (true/false): ");
            boolean isResizable = scanner.nextBoolean();
            scanner.nextLine(); // Добавьте эту строку, чтобы прочитать символ новой строки

            System.out.print("Тип фрейма: ");
            String frameType = scanner.nextLine();
            System.out.print("Z-индекс: ");
            int zIndex = scanner.nextInt();


            VisualizationFrame frame = new VisualizationFrame(frameType, isResizable, zIndex);

            System.out.println("\nВведите данные для слоя визуализации:");
            System.out.print("Имя слоя: ");
            String layerName = scanner.next();
            System.out.print("Прозрачность: ");
            int opacity = scanner.nextInt();
            System.out.print("Видимость (true/false): ");
            boolean isVisible = scanner.nextBoolean();

            VisualizationLayer layer = new VisualizationLayer(layerName, opacity, isVisible);

            scanner.nextLine();

            System.out.println("");

            visualization.displayInfo();
            System.out.println("");
            frame.displayInfo();
            System.out.println("");
            layer.displayInfo();

            System.out.print("Продолжить ввод данных? (true/false): ");
            continueInput = scanner.nextBoolean();
            scanner.nextLine();

        } while (continueInput);

        scanner.close();
    }
}
