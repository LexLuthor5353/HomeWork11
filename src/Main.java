import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> toDoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите операцию и введите ее номер: ");
            System.out.println();
            System.out.println("0. Выход из прораммы");
            System.out.println("1. Добавить дело");
            System.out.println("2. Показать дело");
            System.out.println("3. Удалить дело по номеру");
            System.out.println("4. Удалить дело по названию");
//            System.out.println("5. Удаление по ключевому слову");
            System.out.println("6. Удаление по ключевому слову через поиск по совпадению");
            System.out.println("Ваш выбор ");
            String input = scanner.nextLine();

            if (input.equals("0")) {
                break;
            }
            int operations = Integer.parseInt(input);

            switch (operations) {
                case 1:
                    System.out.println("Введите название задачи: ");
                    input = scanner.nextLine();
                    toDoList.add(input);
                    System.out.println("Добавлено!");
                    System.out.println("Ваш список дел: ");
                    for (int i = 0; i < toDoList.size(); i++) {
                        System.out.println((i + 1) + ". " + toDoList.get(i).toString());
                    }
                    break;

                case 2:
                    if (toDoList.isEmpty()) {
                        System.out.println("Список дел пуст!");
                    } else System.out.println("Ваш список дел: ");
                    for (int i = 0; i < toDoList.size(); i++) {
                        System.out.println((i + 1) + ". " + toDoList.get(i).toString());
                    }

                    break;

                case 3:
                    if (toDoList.isEmpty()) {
                        System.out.println("Список дел пуст!");
                    } else {
                        System.out.println("Введите номер для удаления: ");
                        input = scanner.nextLine();
                        int userNum = Integer.parseInt(input);
                        int del = userNum - 1;
//                        int del = Integer.parseInt(input);
                        if (del >= 0 && del < toDoList.size()) {
                            toDoList.remove(del);
                            System.out.println("Удалена запись: " + userNum);
                        }
                    }
                    break;

                case 4:
                    if (toDoList.isEmpty()) {
                        System.out.println("Список дел пуст!");
                    } else {
                        System.out.println("Введите задачу для удаления: ");
                        input = scanner.nextLine();
                        input.equals(input);
                        toDoList.remove(input);
                        System.out.println("Удалена запись: " + input);
                    }
                    break;

//                case 5:
//                    if (toDoList.isEmpty()) {
//                        System.out.println("Список дел пуст!");
//                    }else {
//                        System.out.println("Введите ключевое слово для удаления: ");
//                        input = scanner.nextLine();
//                        String searchKey = input;
//                    } else if (toDoList.contains(searchKey)) {
//                        toDoList.remove(input);
//                        System.out.println("Удалено!");
//                    } else {
//                        System.out.println("Запись " + input + " не найдена!");
//                    }
//                    break;

                case 6:
                    if (toDoList.isEmpty()) {
                        System.out.println("Список дел пуст!");
                    } else {
                        System.out.println("Введите ключевое слово для удаления: ");
                        input = scanner.nextLine();
                        if (input.isEmpty()) {
                            System.out.println("Ошибка - введена путсая строка!");
                        } else {
                            Iterator<String> iterator = toDoList.iterator();
                            int count = 0;

                            while (iterator.hasNext()) {
                                String delTasks = iterator.next();
                                if (delTasks != null && delTasks.contains(input)) {
                                    iterator.remove();
                                    count++;
                                }
                            }
                            System.out.println("Удалены дела с словом: " + input);
                            System.out.println("В количестве: " + count + " дел");
                        }
                    }
                    break;

                default:
                    System.out.println("Такой операции нет!");
            }
        }
    }
}