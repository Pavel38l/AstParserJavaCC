import lombok.SneakyThrows;

import java.io.FileNotFoundException;

/**
 * @author Burdyug Pavel
 * Запуск
 * clean -> compile -> run Main
 * При изменении в описании грамматики, запустить maven-плагин clean, затем comnpile
 * и только после этого запускать
 */
public class Main {
    @SneakyThrows
    public static void main(String[] args) throws FileNotFoundException {
        // Здесь разбирается выражения из файла в корне проекта
        AstParser.main(args, "input");
    }
}
