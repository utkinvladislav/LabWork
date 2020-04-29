import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class RRSU3 extends JFrame{
	static JTextField lenghtField;
	JButton okBut;
	public RRSU3() {
		super("������� ����� ������");
		this.setBounds(100,100,400,100);
		
		Container container = this.getContentPane();
		container.setLayout(new GridLayout(2,1));

		lenghtField = new JTextField("0");
		okBut = new JButton("ok");
		
		container.add(lenghtField);
		container.add(okBut);
		
		okBut.addActionListener(new ButtonEventListener3());
		
}
}


class ButtonEventListener3 implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		double height = 8;
		double width = 0.9;
		double length;
		length = Double.parseDouble(RRSU3.lenghtField.getText());
		double result = 10000*height*width*length;
		String[] ArrFIO = new String [4];
		ArrFIO[0] = "������� �.�.\n";
		ArrFIO[1] = "����� �.�.\n";
		ArrFIO[2] = "���������� �.�.\n";
		ArrFIO[3] = "������������ �.�.\n";

		JOptionPane.showMessageDialog(null, "����� �� \n" + "�������� ��������������� ����������� ����������� �����������" + "\n" + "��� ���������: \n" +
		ArrFIO[0] + ArrFIO[1] + ArrFIO[2] + ArrFIO[3] +
		"\n" + "��������� �������� ������ ��������������� (90x800x " 
		+ length + "): \n" + result
		,
		"������ ��-218",
		JOptionPane.PLAIN_MESSAGE);
		}
	}
