import java.awt.*;
import java.awt.event.*;

public class MouseEvents extends Frame implements MouseListener, MouseMotionListener {

    Label label;

    MouseEvents() {
        label = new Label();
        label.setBounds(20, 50, 300, 20);
        add(label);
        
        addMouseListener(this);
        addMouseMotionListener(this);
        
        setSize(400, 400);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked at X: " + e.getX() + ", Y: " + e.getY());
    }

    public void mousePressed(MouseEvent e) { }
    public void mouseReleased(MouseEvent e) { }
    public void mouseEntered(MouseEvent e) { }
    public void mouseExited(MouseEvent e) { }

    public void mouseMoved(MouseEvent e) {
        label.setText("Mouse Moved to X: " + e.getX() + ", Y: " + e.getY());
    }

    public void mouseDragged(MouseEvent e) { }

    public static void main(String[] args) {
        new MouseEvents();
    }
}