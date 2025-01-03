<div id="header" align="center">
    <h1>console-calculator</h1>
</div>

Это простой консольный калькулятор, написанный на java с учебными целями

<div id="header" align="center">
    <h3>Установка, компиляция и запуск программы</h3>
</div>

* Клонируем репозиторий на локальный компьютер
```
git clone https://github.com/AlexandrAnatoliev/console-calculator
```
* Компилируем программу (из главного каталога, в котором лежит src/ каталог):
```declarative
javac -d bin ./src/*
```
* Запускаем скомпилированную программу (из главного каталога):
```declarative
java -classpath ./bin/ src.Main 
```
* Cоберем скомпилированные файлы в jar-файл - архив классов
* В главном каталоге создадим файл-манифест manifest.mf, со следующим содержанием:
  
```declarative
main-class: src.Main
class-path: bin/
```
* Собираем jar-файл:
```declarative
jar -cmf manifest.mf calculator.jar -C bin .
```
* Запускаем jar-файл командой:
```declarative
java -jar calculator.jar 
```

<div id="header" align="center">
    <h3>Примеры использования, поддерживаемые команды</h3>
</div>

Члены вводимого выражения должны быть разделены пробелами:
```declarative
1 + 2
3 - 4
и тому подобное
```

Программа поддерживает следующие арифметические действия:
* сложение
* деление
* вычитание
* сложение

Also you may to get referential information by **help** command and to stop the program by **exit**
