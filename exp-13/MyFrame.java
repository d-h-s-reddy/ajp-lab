import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;
import javax.swing.*;
class jav extends Button implements Serializable,ActionListener{
    private int clickcount;
    public jav(){
        super("click me");
        clickcount=0;
        addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        clickcount=clickcount+1;
        setText(clickcount);
    }
    private void setText(int clickcount2) {
       System.out.println("no of times clicked "+clickcount2);
    }
}
public class MyFrame extends JFrame{
    public MyFrame(){
        super("click counter");
        jav j=new jav();
        getContentPane().add(j);
        pack();
        setVisible(true);
    }
    public static void main(String[] args) {
        new MyFrame();
    }
}
