import java.awt.*;
import java.awt.event.*;

class MyGui extends Frame implements ActionListener {
    Label l;
    public MyGui() {



        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        l = new Label("Hello World");
        Label l1 = new Label("Hi");
        Button b = new Button("Click Me");
        b.addActionListener(this);
        
        add(l);
        add(l1);
        add(b);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("OK");
    }
}

public class MyFrame {
    public static void main(String[] args) {
        MyGui mg = new MyGui();
    }
}