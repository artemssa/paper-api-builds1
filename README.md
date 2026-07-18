# HelloPlugin

Простой плагин для Paper 1.21.1, который пишет "Привет" всем игрокам на сервере каждую секунду.

## Установка

1. Скачай `.jar` файл из [Releases](https://github.com/artemssa/paper-api-builds1/releases)
2. Положи его в папку `plugins/` на сервере
3. Перезагрузи сервер командой `/reload confirm`

## Компиляция

```bash
# Требуется Java 21+
mvn clean package
```

Готовый файл будет в папке `target/HelloPlugin-1.0-SNAPSHOT.jar`

## Версия

- **Minecraft**: 1.21.1
- **Java**: 21+
- **Server Software**: Paper

## Что делает плагин?

Пишет каждому онлайн игроку сообщение "Привет, [имя]!" каждую секунду в зелёном цвете.