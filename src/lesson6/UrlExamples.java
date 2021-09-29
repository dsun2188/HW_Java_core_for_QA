package lesson6;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlExamples {

//1. С помощью http запроса получить в виде json строки погоду в Санкт-Петербурге на период времени,
// пересекающийся со следующим занятием (например, выборка погода на следующие 5 дней - подойдет)
//2. Подобрать источник самостоятельно. Можно использовать api accuweather, порядок следующий: зарегистрироваться,
// зарегистрировать тестовое приложение для получения api ключа, найдите нужный endpoint и изучите документацию.
// Бесплатный тарифный план предполагает получение погоды не более чем на 5 дней вперед (этого достаточно для
// выполнения д/з).

        public static void main(String[] args) throws MalformedURLException {
            URL url = new URL("http://smirnov:password@geekbrains.ru:80/courses?type=qa&level=super#1");

            System.out.println(url.getAuthority());
            System.out.println(url.getHost());
            System.out.println(url.getPath());
            System.out.println(url.getQuery());

            URL url1 = new URL("https", "geekbrains.ru", 443, "/courses");
        }
    }
