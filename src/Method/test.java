package Method;

import java.awt.*;

public class test extends Frame
{
	Label lbl = new Label("이름");
	TextField txt = new TextField(10);
	Button btn = new Button("확인");
	public void TextField() {
		this.setLayout(new FlowLayout());
		this.add(lbl);
		this.add(txt);
		this.add(btn);
	}
	public static void main(String[] args)
	{
		Frame f = new Frame("test");
		
		f.setSize(200,100);
		f.setTitle("test");
		f.setVisible(true);
	}

}