package randomfRdation;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import randomfoodframe.FrameBase;
import randomfoodframe.Manual;
import randomfoodframe.ManualInfo2;
import rnadomfoodVO.Data;
import rnadomfoodVO.RestaurantDto;
import rnadomfoodVO.Run;

public class Cfood extends JPanel {
	
	public Cfood() {
		
		//�⺻ JFrame ����
		setBackground(Color.white);
		setLayout(null);
		setSize(600, 2000);
		
		
		ImageIcon backImg = new ImageIcon("�ڷΰ���1.png");
		ImageIcon homeImg = new ImageIcon("Ȩ��ư.png");
		ImageIcon againImg = new ImageIcon("�ٽ���õ�ޱ�.png");
		ImageIcon reservationImg = new ImageIcon("�����ϱ�.png");
		
		
		//��ư ����
		JButton Backbutton = new JButton(backImg);
		JButton ftFirstTime = new JButton(homeImg);
		JButton again = new JButton(againImg);
		JButton reservation = new JButton(reservationImg);
		
		Backbutton.setContentAreaFilled(false);
		ftFirstTime.setContentAreaFilled(false);
		again.setContentAreaFilled(false);
		reservation.setContentAreaFilled(false);
		Backbutton.setBorderPainted(false);
		

		//��ư������ ����
		Backbutton.setBounds(10,20,80,70);
		ftFirstTime.setSize(200, 200);
		again.setSize(200, 200);
		reservation.setSize(200, 200);
		
		
		ftFirstTime.setLocation(
				((int) getSize().getWidth() / 2) - 310, 
				(int) getLocation().getY() / 2 + 570);
		again.setLocation(
				((int) getSize().getWidth() / 2) - 110, 
				(int) getLocation().getY() / 2 + 570);
		reservation.setLocation(
				((int) getSize().getWidth() / 2) +90, 
				(int) getLocation().getY() / 2 + 570);
		
		//��ư�߰�
		add(Backbutton);
		add(ftFirstTime);
		add(again);
		add(reservation);
		
		//�ؽ�Ʈ������ �߰�
		TextArea font=new TextArea();
		font.setBounds(0, 350, 600, 300);
		add(font);
		
		//�ѽ� ���� ���
		Data data = new Data();
		RestaurantDto dto = Run.getRandomRestaurantByCategory2(data, "�߽�");
		
		font.append("�Ĵ��̸�: \t"+dto.getPlaceName()+"\n");
		font.append("��ǥ�޴�: \t"+dto.getPlaceBest()+"\n");
		font.append("�ּ�: \t\t"+dto.getAddressName()+"\n");
		font.append("�����ּ�: \t"+dto.getPlaceUrl()+"\n");
		font.setFont(new Font("����", Font.BOLD, 22)); 
		
		ImageIcon kFoodPhoto=new ImageIcon(dto.getImage());
		JLabel kFphotoset=new JLabel(kFoodPhoto);
		kFphotoset.setSize(600,300);
		kFphotoset.setLocation(-15,100);
		add(kFphotoset);
		
		
		
		//��ư�׼�
		  
		
		//�ڷΰ���
		Backbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getDispose();
				FrameBase.getInstance(new ManualInfo2());
			}
		});
		
		//ó������
		ftFirstTime.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getDispose();
				FrameBase.getInstance(new Manual());
			}
		});
		
		//�ٽ���õ�ޱ�
		again.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getDispose();
				FrameBase.getInstance(new Cfood());
				
				
			}
		});
		
		//�����ϱ�
		reservation.addActionListener(new ActionListener() {
					
		@Override
		public void actionPerformed(ActionEvent e) {
			FrameBase.getDispose();
			
			FrameBase.getInstance(new Reservation());
		}
		});
				
		
	}
	
	


}
