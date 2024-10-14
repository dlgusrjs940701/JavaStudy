package _24_상속_인터페이스;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WordMainFrame extends JFrame implements ActionListener, ItemListener {
	private JPanel title_p = new JPanel(); // 컴포넌트&컨테이너.
	// 기본 레이아웃이 flow 레이아웃.. 가운데부터하나씩 정렬
	private JLabel t = new JLabel("단어장 프로그램");
	private JPanel center_p = new JPanel();
	private JPanel center_1 = new JPanel();
	private JPanel center_2 = new JPanel();
	private JPanel center_3 = new JPanel();

	// DB작업을 위한 인터페이스 변수 선언
	DBdao dbdao = null;

	JLabel c1 = new JLabel("단어입력");
	JButton c1btn = new JButton("저장");
	JPanel c1c = new JPanel();
	JLabel c2 = new JLabel("영어");
	JLabel c3 = new JLabel("한글");
	JTextField j1 = new JTextField();
	JTextField j2 = new JTextField();

	JPanel c22 = new JPanel();
	JLabel c22l = new JLabel("단어리스트");
	List c22list = new List();
	JButton c22btn = new JButton("선택단어삭제");

	JLabel c5 = new JLabel("단어수정");
	JButton c5btn = new JButton("수정");
	JPanel c5c = new JPanel();
	JLabel c6 = new JLabel("영어");
	JLabel c7 = new JLabel("한글");
	JTextField j5 = new JTextField();
	JTextField j6 = new JTextField();

	ArrayList<WordDTO> w = null;

	public WordMainFrame(DBdao d) {
		this.dbdao = d; // DB 작업을 위한 객체 주소를
		// 외부(메인클래스가 되네요)로 부터 주입 받는다.

		this.setBounds(100, 100, 500, 180);
		title_p.add(t);
		center_p.setBackground(Color.yellow);
		this.add(title_p, "North");
		this.add(center_p, "Center");
		center_1.setBackground(Color.red);
		center_2.setBackground(Color.cyan);
		center_3.setBackground(Color.green);
		// 위 3개의 패널을 center_p 에 추가시키는데
		center_p.setLayout(new GridLayout());
		center_p.add(center_1);
		center_p.add(center_2);
		center_p.add(center_3);

		// center_1 작업
		c1c.setBackground(Color.gray);
		c1c.setLayout(new GridLayout(2, 2));
		c1c.add(c2);
		c1c.add(j1);
		c1c.add(c3);
		c1c.add(j2);
		center_1.setLayout(new BorderLayout());
		center_1.add(c1, "North");
		center_1.add(c1btn, "South");
		center_1.add(c1c, "Center");

		c1btn.addActionListener(this);
		// center_2작업
		c22.setLayout(new BorderLayout());
		c22.add(c22l, "North");
		c22.add(c22list, "Center");
		c22.add(c22btn, "South");
		center_2.setLayout(new BorderLayout());
		center_2.add(c22, "Center");
		c22list.addItemListener(this);
		c22btn.addActionListener(this);
		
		// center_3 작업
		j5.setEnabled(false);
		// 수정안되게 하는 기능
		
		c5c.setBackground(Color.gray);
		c5c.setLayout(new GridLayout(2, 2));
		c5c.add(c6);
		c5c.add(j5);
		c5c.add(c7);
		c5c.add(j6);
		center_3.setLayout(new BorderLayout());
		center_3.add(c5, "North");
		center_3.add(c5btn, "South");
		center_3.add(c5c, "Center");
		c5btn.addActionListener(this);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		w = dbdao.selectAll();
		for (WordDTO t : w) {
			c22list.add(t.getEng() + ":" + t.getKor());
		}
	}

	@Override // 인터페이스를 구현 할 메서드
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("dddd");
		if (e.getSource() == c1btn) {
			String eng = j1.getText();
			String kor = j2.getText();
			System.out.println(eng + "/" + kor);

			// DTO에저장하고 DAO를 통해서 db에 저장..
			WordDTO wdto = new WordDTO();
			wdto.setEng(eng);
			wdto.setKor(kor);
			dbdao.add(wdto);
		}else if(e.getSource()==c5btn) {
			String eng=j5.getText();
			String kor=j6.getText();
			WordDTO wdto=new WordDTO();
			wdto.setEng(eng);
			wdto.setKor(kor);
			dbdao.mod(wdto);
			// dao에세 넘겨서 수정한다. 단, 영어단어는 수정 불가로
			
		}else if(e.getSource()==c22btn) {
			String eng=j5.getText();
			WordDTO wdto=new WordDTO();
			wdto.setEng(eng);
			dbdao.delete(wdto);
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		int selectNum = c22list.getSelectedIndex();
		System.out.println(selectNum + "이 선택됨");
		WordDTO tempdto=w.get(selectNum);
		j5.setText(tempdto.getEng());
		j6.setText(tempdto.getKor());
	}

}
