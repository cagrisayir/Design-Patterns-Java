# Design Patterns 

## Behavioral Design Patterns

### 1- Memento Pattern

We use this pattern for implementing **Undo** mechanisms.

`src/mementom/`

`Main.java`:

````java
import mementom.Editor;
import mementom.History;

public class Main_Memento {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();
        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");

        editor.restore(history.pop());
        System.out.println(editor.getContent());
    }
}
````

### 2- State Pattern
### 3- Iterator Pattern
### 4- Strategy Pattern
### 5- Template Method Pattern
### 6- Command Pattern
### 7- Observer Pattern
### 8- Mediator Pattern
### 9- Chain of Responsibility Pattern
### 10- Visitor Patter

## Structural Design Patterns

### 1- Composite Pattern
### 2- Adapter Pattern
### 3- Decorator Pattern
### 4- Facade Pattern
### 5- Flyweight Pattern
### 6- Bridge Pattern
### 7- Proxy Pattern

## Creational Design Patterns

### 1- Prototype Pattern
### 2- Singleton Pattern
### 3- Factory Method Pattern
### 4- Abstract Factory Pattern
### 5- Builder Pattern
