package ru.job4j.condition;

/**
 * @author Sergey Kosenok
 * @version 1.0
 * @since 2019-05-02
 */
public class DummyBot {

    public String botAnswer(String question) {
        if (question.equals("Привет, Бот.")) {
            return "Привет, умник.";
        } else if (question.equals("Пока.")) {
                return "До скорой встречи.";
        } else {
            return "Я слишком тупой для таких сложных вопросов.";
        }
    }

}
