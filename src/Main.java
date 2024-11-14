public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!!!");
        var box = 5;
        System.out.println(box);
        box = box + 2;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);
        box = box * 3;
        System.out.println(box);
        box = box / 4;
        System.out.println(box);
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend - 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var mass1 = 78.2;
        System.out.println(mass1);
        var mass2 = 82.7;
        System.out.println(mass2);
        var total = mass1 + mass2;
        System.out.println(total);
        var difference = mass2 - mass1;
        System.out.println(difference);
        var surplus = mass2 % mass1;
        System.out.println(surplus);
        var totalHours = 640;
        System.out.println(totalHours);
        var workDay = 8;
        System.out.println(workDay);
        var totally = totalHours / workDay;
        System.out.println("Всего в компании работает" + " " + totally + " " + "человек");
        var totallyNew = totally + 94;
        System.out.println(totallyNew);
        var hoursNew = totallyNew * workDay;
        System.out.println("Если в компании работает" + " " + totallyNew + " " + "человека, то всего" + " " + hoursNew + " " + "часов работы может быть поделено между сотрудниками!!!");
        int myInt = 10;
        byte myByte = 5;
        short myShort = 15;
        long myLong = 100000L;
        float myFloat = 3.14f;
        double myDouble = 2.71828;
        System.out.println("Значение переменной myInt с типом int равно " + myInt);
        System.out.println("Значение переменной myByte с типом byte равно " + myByte);
        System.out.println("Значение переменной myShort с типом short равно " + myShort);
        System.out.println("Значение переменной myLong с типом long равно " + myLong);
        System.out.println("Значение переменной myFloat с типом float равно " + myFloat);
        System.out.println("Значение переменной myDouble с типом double равно " + myDouble);
        double decimalValue = 27.12;
        long largeLongValue = 987_678_965_549L;
        float floatValue = 2.786f;
        short shortValue = 569;
        int negativeByteValue = -159;
        int intValue = 27897;
        byte smallByteValue = 67;
        System.out.println("Значение переменной decimalValue с типом double равно " + decimalValue);
        System.out.println("Значение переменной largeLongValue с типом long равно " + largeLongValue);
        System.out.println("Значение переменной floatValue с типом float равно " + floatValue);
        System.out.println("Значение переменной shortValue с типом short равно " + shortValue);
        System.out.println("Значение переменной negativeByteValue с типом byte равно " + negativeByteValue);
        System.out.println("Значение переменной intValue с типом int равно " + intValue);
        System.out.println("Значение переменной smallByteValue с типом byte равно " + smallByteValue);

        int studentsLudmila = 23;
        int studentsAnna = 27;
        int studentsEkaterina = 30;

        int totalPaper = 480;

        int totalStudents = studentsLudmila + studentsAnna + studentsEkaterina;
        int paperPerStudent = totalPaper / totalStudents;

        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги.");

        int bottlesInTwoMinutes = 16; // Производительность: 16 бутылок за 2 минуты
        int minutesInTwoMinutes = 2;

        // Производительность в бутылках за 1 минуту
        int bottlesPerMinute = bottlesInTwoMinutes / minutesInTwoMinutes;

        // Расчеты для различных промежутков времени
        int bottlesIn20Minutes = bottlesPerMinute * 20;
        int bottlesPerDay = bottlesPerMinute * 1440; // 1440 минут в сутках
        int bottlesIn3Days = bottlesPerMinute * 1440 * 3;
        int bottlesInMonth = bottlesPerMinute * 1440 * 30; // Предположим, что в месяце 30 дней

                // Вывод результатов
        System.out.println("За 20 минут машина произвела " + bottlesIn20Minutes + " штук бутылок.");
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + bottlesIn3Days + " штук бутылок.");
        System.out.println("За 1 месяц машина произвела " + bottlesInMonth + " штук бутылок.");

        int totalPaintCans = 120; // Всего банок краски
        int whiteCansPerClass = 2; // Количество банок белой краски на один класс
        int brownCansPerClass = 4; // Количество банок коричневой краски на один класс
        int totalCansPerClass = whiteCansPerClass + brownCansPerClass; // Общее количество банок на класс

        // Расчет количества классов
        int numberOfClasses = totalPaintCans / totalCansPerClass;

        // Расчет количества банок каждого цвета
        int totalWhiteCans = numberOfClasses * whiteCansPerClass;
        int totalBrownCans = numberOfClasses * brownCansPerClass;

        // Вывод результата
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + totalWhiteCans +
                " банок белой краски и " + totalBrownCans + " банок коричневой краски.");

        // Определяем вес ингредиентов
        int bananas = 5 * 80;           // 5 бананов по 80 грамм
        int milk = 200 * 105 / 100;      // 200 мл молока, где 100 мл = 105 грамм
        int iceCream = 2 * 100;          // 2 брикета мороженого по 100 грамм
        int eggs = 4 * 70;               // 4 яйца по 70 грамм

        // Рассчитываем общий вес в граммах
        int totalWeightGrams = bananas + milk + iceCream + eggs;

        // Переводим в килограммы
        double totalWeightKilograms = totalWeightGrams / 1000.0;

        // Выводим результат
        System.out.println("Вес спортзавтрака: " + totalWeightGrams + " грамм.");
        System.out.println("Вес спортзавтрака: " + totalWeightKilograms + " килограмм.");

        double targetWeightLossKg = 7.0;  // Нужно сбросить 7 кг
        double minDailyLossGrams = 250.0; // Минимальная потеря в день в граммах
        double maxDailyLossGrams = 500.0; // Максимальная потеря в день в граммах

        // Переводим килограммы в граммы
        double targetWeightLossGrams = targetWeightLossKg * 1000;

        // Количество дней при минимальной и максимальной потерях
        int daysMinLoss = (int) Math.ceil(targetWeightLossGrams / minDailyLossGrams);
        int daysMaxLoss = (int) Math.ceil(targetWeightLossGrams / maxDailyLossGrams);

        // Среднее количество дней
        int averageDays = (daysMinLoss + daysMaxLoss) / 2;

        // Вывод результатов
        System.out.println("Для похудения на 7 кг при потере 250 грамм в день потребуется " + daysMinLoss + " дней.");
        System.out.println("Для похудения на 7 кг при потере 500 грамм в день потребуется " + daysMaxLoss + " дней.");
        System.out.println("В среднем потребуется " + averageDays + " дней для похудения.");

        // Изначальные месячные зарплаты сотрудников
        double salaryMasha = 67760;
        double salaryDenis = 83690;
        double salaryKristina = 76230;

        // Процент повышения
        double increasePercentage = 0.10;

        // Новые зарплаты после повышения
        double newSalaryMasha = salaryMasha * (1 + increasePercentage);
        double newSalaryDenis = salaryDenis * (1 + increasePercentage);
        double newSalaryKristina = salaryKristina * (1 + increasePercentage);

        // Годовой доход до и после повышения
        double annualIncomeMashaBefore = salaryMasha * 12;
        double annualIncomeDenisBefore = salaryDenis * 12;
        double annualIncomeKristinaBefore = salaryKristina * 12;

        double annualIncomeMashaAfter = newSalaryMasha * 12;
        double annualIncomeDenisAfter = newSalaryDenis * 12;
        double annualIncomeKristinaAfter = newSalaryKristina * 12;

        // Разница в годовом доходе
        double differenceMasha = annualIncomeMashaAfter - annualIncomeMashaBefore;
        double differenceDenis = annualIncomeDenisAfter - annualIncomeDenisBefore;
        double differenceKristina = annualIncomeKristinaAfter - annualIncomeKristinaBefore;

        // Вывод результатов
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + differenceMasha + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + differenceDenis + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + differenceKristina + " рублей.");
        }
}
