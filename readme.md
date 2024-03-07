# Design Patterns 

## Behavioral Design Patterns

### 1- Memento Pattern

We use the Memento pattern for implementing **Undo** mechanisms.

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
The State pattern allows an object to behave differently when its state changes.

`src/state/`

`Main.java`:

```java
public static void main(String[] args) {
    var canvas = new Canvas();
    canvas.setCurrentTool(new EraserTool());
    canvas.mouseDown();
    canvas.mouseUp();
}
```

### 3- Iterator Pattern
The Iterator pattern provides a consistent way to sequentially access elements within a collection (like an array or list) without revealing its underlying implementation.

`src/iterator/`

`Main.java`:
```java
public static void main(String[] args) {
    var history = new BrowseHistory();
    history.push("a");
    history.push("b");
    history.push("c");

    Iterator iterator = history.createIterator();
    while (iterator.hasNext()){
        var url = iterator.current();
        System.out.println(url);
        iterator.next();
    }
}
```
### 4- Strategy Pattern

`src/strategy/`

`Main.java`
```java
public static void main(String[] args) {
var imageStorage = new ImageStorage(
        new JpegCompressor(),
        new BlackAndWhiteFilter());
imageStorage.store("A");
}
```
### 5- Template Method Pattern
`src/template/`

```java
public static void main(String[] args) {
    var auditTrail = new AuditTrail();
    var task = new TransferMoneyTask(auditTrail);
    task.execute();
    }
```
### 6- Command Pattern
Allows decouple a sender from a receiver. The sender will talk to the receive through a command. Commands can be undone and persisted.

`src/command/`
```java
public static void main(String[] args) {
    var service = new CustomerService();
    var command = new AddCustomerCommand(service);
    var button = new Button(command);
    button.click();
}
```
### 7- Observer Pattern
Allows an object notify other objects when its state changes.
### 8- Mediator Pattern
Allows an object to encapsulate the communication between other
objects.
### 9- Chain of Responsibility Pattern
Allows building a chain of objects to process a request.
### 10- Visitor Patter
Allows adding new operations to an object structure without modifying it.
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
