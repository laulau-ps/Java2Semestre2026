package aulas;
// importing Java AWT class
import java.awt.*;

// extending Frame class to our class AWTExample1
public class ExemploAWT1 extends Frame {

    // initializing using constructor
    ExemploAWT1() {

        // creating a button
        Button botao = new Button("Clique aqui!");

        // setting button position on screen
        botao.setBounds(30,100,80,30);

        // adding button into frame
        add(botao);

        // frame size 300 width and 300 height
        setSize(300,300);

        // setting the title of Frame
        setTitle("Exemplo Aperte o Botão");

        // no layout manager
        setLayout(null);

        // now frame will be visible, by default it is not visible
        setVisible(true);
    }

    // main method
    public static void main(String args[]) {

// creating instance of Frame class
        ExemploAWT1 f = new ExemploAWT1();

    }

}