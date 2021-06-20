package _java_exe.java2Exe8.src.main.java;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 6151742
 */
public class Building implements IBuilding {

    @Override
    public void method1() {
        System.out.println("Hello from method-1");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void method2() {
        System.out.println("Hello from method-2");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mehod3() {
        System.out.println("Hello from method-3");
    }

}

class House extends Building {

    private Window[] windows = new Window[2];
    private Door[] doors = new Door[2];

    //Constructors
    public House() {
        windows[0] = new Window("Bedroom Window");
        windows[1] = new Window("Living Room Window");
        doors[0] = new Door("Bedroom Door");
        doors[1] = new Door("Living Room Door");
    }

    public Door[] getDoors() {
        return doors;
    }

    public Window[] getWindows() {
        return windows;
    }

}

class Window extends Common {

    public Window(String windowName) {
        super(windowName);
    }

    // Methods
    public void close() {
    }

}

class Door extends Common {

    public Door(String doorName) {
        super(doorName);
    }

    // Methods
    public void open() {
    }

}

abstract class Common {

    private String name;

    public Common(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }
}
