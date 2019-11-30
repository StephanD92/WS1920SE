package Kapitel56;

public class TestFrame2{
	
	public static void main(String[] args) {
		
		MeinFrameKing frame = new MeinFrameKing("Hello");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(MeinFrameKing.EXIT_ON_CLOSE);
		
		MeinFrameKing frame2 = new MeinFrameKing("undschonwiederHallo");
		frame2.setVisible(true);
		frame2.setDefaultCloseOperation(MeinFrameKing.HIDE_ON_CLOSE);

		
	}
}