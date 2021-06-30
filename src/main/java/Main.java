import lombok.SneakyThrows;

/**
 * @author Burdyug Pavel
 * JavaCC - используется для генерации парсеров, используя язык описывающий грамматику
 * Документация - https://javacc.github.io/javacc/
 * Примеры использования JavaCC - https://javacc.github.io/javacc/tutorials/examples.html
 * Исходные коды примеров с постороением AST дерева, используя jjtree - один из скриптов JavaCC
 *
 * Для использования JavaCC необходима ее установка
 * Есть 2 варианта
 * 1. Установка вручную - описана в руководстве https://javacc.github.io/javacc/#getting-started
 * Если коротко нужно (для Windows):
 * Скачать исходники(архив) из руководства
 * Распоковать в папку Java (где установлены jdk и jre)
 * Скачать бинарные файлы (jar) из руководство
 * Создать в папке из архива папку target и вставить туда джарник
 * Добавить папку scripts в Path переменую окружения Windows
 * Тогда в командной строке должны стать доступны комманды javacc, jjtree
 *
 * 2. Настройка через Maven (у меня не получилось)
 * Я думал, что можно установить зависимость и maven плогин и выполнять, команды выше как maven goals, но не срослось
 * Maven зависимость - https://mvnrepository.com/artifact/net.java.dev.javacc/javacc
 * Maven плагин - https://github.com/phax/ph-javacc-maven-plugin
 * В проекте есть неудачная попытка сконфигурить maven плагин
 * Зато в ItelliJ Idea есть плагин для JavaCC файлов (*.jj, *.jjt)
 *
 *
 * Запуск парсера
 * Для запуска сгенерированного парсера не требуется javacc
 *
 * Генерация парсера (при измененении или с нуля)
 * Для генерации парсера по правилам описанным в AstParser.jjt нужно
 * При изменении в этом проекте:
 * -Выполнить файл generate-parser.bat, составленный для этого проекта (генерерует и собирает парсер)
 * (Или выполнить все команды ниже)
 * Рассмотрим команды из файла
 * jjtree src/main/java/AstParser.jjt - генерирует основные файлы узлов и файл AstParser.jj
 * (папка для генерации задана в AstParser.jjt)
 * javacc src/main/java/AstParser.jj - генерация оставшихся файлов
 * При этом часть файлов: AstIdent.java, AstValue.java, AstOperator.java написаны вручную
 * Поэтому при генерации с нуля нужно скопировать эти файлы в необходимую папку
 */
public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        AstParser.main(args, "input");
    }
}
