
package randomfoodframe;

import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameBase extends JFrame{

	private static FrameBase instance;

	private FrameBase(JPanel e) {
		//�ý��� ����(ȭ�� ũ�⸦ ��� ���� Toolkit)
		Toolkit tk = Toolkit.getDefaultToolkit();//�ػ�

		//�⺻ JFrame ����
		setTitle("������õ");
		setLayout(null); 	
		setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 300, 
				((int) tk.getScreenSize().getHeight()) / 2 - 400,
				600, 800);
		add(e);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x��ư
	}//������

	//�̱��� ����� ����Ϸ��� �Ѵ�
	public static void getInstance(JPanel e) {
			//static���� ���������Ƿ� �ش� �޼��尡 �����ں��ٵ� ���� ȣ��ȴ�
			instance = new FrameBase(e);//�����ڸ� ���� �⺻ ������ ����
			
			instance.getContentPane().removeAll();
			instance.getContentPane().add(e);
			
			instance.revalidate(); //���̾ƿ� �����ڿ��� ���̾ƿ������� �ٽ� ����ϵ��� ����
			instance.repaint(); //���̾ƿ��� ���� �׸���
	}//getInstance()
	
	@Override
	public void dispose() {
		super.dispose();
	}
	public static void getDispose() {
		instance.dispose();
	}
}
