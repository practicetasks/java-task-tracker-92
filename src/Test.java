public class Test {
    public static void main(String[] args) {
        Task task = new Task("прочесть статью про MongoDb", "...");

        Epic epic = new Epic("написать систему авторизаций", ".....");

        Subtask subtask1 = new Subtask("придумать модель данных", "....", epic);
        Subtask subtask2 = new Subtask("написать логику хранения данных", "....", epic);
        Subtask subtask3 = new Subtask("написать юнит-тесты", "....", epic);
    }
}
