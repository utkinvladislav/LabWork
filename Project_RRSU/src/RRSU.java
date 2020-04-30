  
import java.awt.*;
import java.awt.event.*;
import java.awt.image.AffineTransformOp;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class RRSU extends JFrame {
private JButton button = new JButton("Вывести данные");
JButton button2 = new JButton("Вывести мнемосхему");
JButton button3 = new JButton("Информация");
JButton button4 = new JButton("Информация о GitHub");
JLabel label = new JLabel("Кнопка информации добавлена");
<<<<<<< HEAD

JLabel label1 = new JLabel("Смольников satyrdushekrad@yandex.ru");

JLabel UtkinLabel = new JLabel("Уткин В., почта: mihut1@yandex.ru");

=======
JLabel ren = new JLabel("Рахматуллина Рената, johnnytheskull@yandex.ru");
>>>>>>> refs/remotes/origin/RenyaBranch
public static JTextField lenghtField;
public static JTextField edgarsField;
public RRSU() {
super("ЛАБА1 RRSU");
this.setBounds(100,100,600,500);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

Container container = this.getContentPane();
<<<<<<< HEAD

container.setLayout(new GridLayout(5,3,2,2));


container.setLayout(new GridLayout(5,3,2,2));


=======
container.setLayout(new GridLayout(4,3,2,2));
>>>>>>> refs/remotes/origin/RenyaBranch

button.addActionListener(new ButtonEventListener());
container.add(button);
lenghtField = new JTextField("Окно для вывода информации");
lenghtField.setEditable(false);
container.add(lenghtField);
edgarsField = new JTextField("Почта Разяпова: jitnikov.p@yandex.ru");
edgarsField.setEditable(false);
container.add(edgarsField);
button2.addActionListener(new ButtonEventListener2());
button3.addActionListener(new ButtonEventListener3());
button4.addActionListener(new ButtonEventListener4());

container.add(button2);
container.add(button3);
container.add(button4);
container.add(label);
container.add(ren);

container.add(label1);

container.add(UtkinLabel);



String Path = "src/logo.jpg";
Image img = null;
File f;
f = new File(Path);
try {
img = ImageIO.read(f);
} catch(IOException ioe) {
JOptionPane.showConfirmDialog(null, "Что-то неправильно!\n" + ioe.toString(),
"Error!", JOptionPane.PLAIN_MESSAGE);
System.exit(0);
}
Image scaledImg = img.getScaledInstance(290, 160, AffineTransformOp.TYPE_BILINEAR);
JLabel picLabel = new JLabel(new ImageIcon(scaledImg));
container.add(picLabel);

}
class ButtonEventListener3 implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		 RRSU.lenghtField.setText(RRSU2.getInfo());
	}
}
class ButtonEventListener4 implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		 RRSU.lenghtField.setText("Проект размещён в репозитории \n utkinvladislav/LabWork");
	}
}

class ButtonEventListener2 implements ActionListener {
public void actionPerformed(ActionEvent e) {

	String Path = "src/Mnemo.jpg";
	Image img = null;
	File f;
	f = new File(Path);
	try {
	img = ImageIO.read(f);
	} catch(IOException ioe) {
	JOptionPane.showConfirmDialog(null, "Что-то неправильно!\n" + ioe.toString(),
	"Error!", JOptionPane.PLAIN_MESSAGE);
	System.exit(0);
	}
	Image scaledImg = img.getScaledInstance(750, 750, AffineTransformOp.TYPE_BILINEAR);
	JLabel picLabel = new JLabel(new ImageIcon(scaledImg));
	JFrame win = new JFrame();
	win.add(picLabel);
	win.setBounds(200,200,800,800);
	win.setVisible(true);
	
}
}

class ButtonEventListener implements ActionListener {
public void actionPerformed(ActionEvent e) {

RRSU3 lenghtWin = new RRSU3();
lenghtWin.setVisible(true);

}
}

public static void main(String[] args) {
RRSU app = new RRSU();
app.setVisible(true);
}
}