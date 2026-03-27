public class CustomEnumExample {

    // Перечисление уровней сложности с дополнительными методами
    public enum DifficultyLevel {
        EASY("Легкий", 1, 10),
        MEDIUM("Средний", 2, 20),
        HARD("Сложный", 3, 30),
        EXPERT("Эксперт", 4, 50);

        private final String displayName;
        private final int level;
        private final int baseScore;

        DifficultyLevel(String displayName, int level, int baseScore) {
            this.displayName = displayName;
            this.level = level;
            this.baseScore = baseScore;
        }

        // Геттеры
        public String getDisplayName() {
            return displayName;
        }

        public int getLevel() {
            return level;
        }

        public int getBaseScore() {
            return baseScore;
        }

        // Дополнительный метод для расчета итогового счета с множителем
        public int calculateScore(int multiplier) {
            return baseScore * multiplier * level;
        }

        // Дополнительный метод для проверки, доступен ли уровень
        public boolean isAvailable(int userLevel) {
            return userLevel >= this.level;
        }

        // Дополнительный метод для получения следующего уровня
        public DifficultyLevel nextLevel() {
            DifficultyLevel[] levels = values();
            int nextIndex = (this.ordinal() + 1) % levels.length;
            return levels[nextIndex];
        }

        @Override
        public String toString() {
            return displayName + " (Уровень " + level + ")";
        }
    }

    public static void main(String[] args) {
        // Демонстрация использования
        DifficultyLevel current = DifficultyLevel.MEDIUM;

        System.out.println("Текущий уровень: " + current);
        System.out.println("Базовый счет: " + current.getBaseScore());
        System.out.println("Счет с множителем 3: " + current.calculateScore(3));

        // Проверка доступности
        System.out.println("Доступен для уровня 1: " + current.isAvailable(1));
        System.out.println("Доступен для уровня 3: " + current.isAvailable(3));

        // Переход на следующий уровень
        System.out.println("Следующий уровень: " + current.nextLevel());

        // Перебор всех уровней
        System.out.println("\nВсе уровни сложности:");
        for (DifficultyLevel level : DifficultyLevel.values()) {
            System.out.println(level + " - " + level.getDisplayName());
            System.out.println("  Базовый счет: " + level.getBaseScore());
            System.out.println("  Счет x5: " + level.calculateScore(5));
            System.out.println();
        }
    }
}