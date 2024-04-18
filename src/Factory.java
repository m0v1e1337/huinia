import java.util.Scanner;

public class Factory {
    // Функция для расчета общей стоимости продукции на заводе
    public static double calculateTotalCost(double[] productCosts) {
        double totalCost = 0;
        for (double cost : productCosts) {
            totalCost += cost;
        }
        return totalCost;
    }

    // Функция для определения средней стоимости продукции на заводе
    public static double calculateAverageCost(double[] productCosts) {
        double totalCost = calculateTotalCost(productCosts);
        return totalCost / productCosts.length;
    }

    // Функция для определения наибольшей стоимости продукции на заводе
    public static double findMaxCost(double[] productCosts) {
        double maxCost = productCosts[0];
        for (double cost : productCosts) {
            if (cost > maxCost) {
                maxCost = cost;
            }
        }
        return maxCost;
    }

    public class Software {
        // Функция для проверки наличия обновлений ПО
        public boolean checkForUpdates() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Есть ли обновления для установки? (да/нет)");
            String response = scanner.nextLine();
            return response.equalsIgnoreCase("да");
        }

        // Функция для загрузки и установки обновлений ПО
        public void downloadAndUpdate() {
            System.out.println("Загрузка и установка обновлений...");
            // Пример: имитация загрузки и установки
            try {
                Thread.sleep(2000); // Имитация загрузки
                System.out.println("Обновления успешно установлены.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Функция для резервного копирования данных ПО
        public void backupData() {
            System.out.println("Начало резервного копирования данных...");
            // Пример: имитация процесса резервного копирования
            try {
                Thread.sleep(3000); // Имитация процесса резервного копирования
                System.out.println("Резервное копирование завершено.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static class CustomFunctions {
        // Функция, добавляющая дополнительный функционал к стандартной функции
        public static void enhancedPrint(String message) {
            // Добавление дополнительного функционала
            System.out.println("Custom: " + message);
        }

        // Функция, изменяющая поведение стандартной функции
        public static int customRandom(int min, int max) {
            return min + (int)(Math.random() * ((max - min) + 1));
        }
    }
}
