package tetris;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.awt.Image;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;


public class Tetris extends JFrame {
	    public static void main(String[] args) {

        Tetris game = new Tetris();
        game.setLocationRelativeTo(null);
        game.setVisible(true);
        
        ImageIcon img = new ImageIcon("screenshots/tetris.png");
    	game.setIconImage(img.getImage());
    	

    } 

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel statusbar,score;
	
	

    public Tetris() {
    	
    	    	
    	getContentPane().setBackground(Color.GRAY);
    	
    	
    	score = new JLabel("Score:");
        statusbar = new JLabel(" 0");
        add(score, BorderLayout.SOUTH);
        add(statusbar, BorderLayout.SOUTH);
        Board board = new Board(this);
        JOptionPane.showMessageDialog(board,
        		"*테트리스 세계에 오신 걸 환영합니다* \n "
        		+ "Created by Prachi\n\n"
        		+ "<게임 설명서>\n"
        		+ " 빈 공간에 블럭을 맞춰서 줄을 제거하면 됩니다.\n"
        		+ " 조작키 : \n"
        		+ " 1. 왼쪽 : 왼쪽 방향키\n"
        		+ " 2. 오른쪽 : 오른쪽 방향키\n"
        		+ " 회전키 : \n"
        		+ " 1. 왼쪽 방향으로 회전 : 위쪽 방향키\n"
        		+ " 2. 오른쪽 방향으로 회전:아래쪽 방향키\n"
        		+ " 블록 떨어뜨리기 : 스페이스바\n"
        		+ " 일시정지     : 버튼 P");
        add(board);
        board.start();

        setSize(300, 400);
        setTitle("TETRIS");
        addWindowListener(new WindowAdapter() {
      	  public void windowClosing(WindowEvent e) {
      		  int result = JOptionPane.showConfirmDialog(null, 
      	        "게임에서 나가시겠습니까?", "Exit Program Message Box",
      	        JOptionPane.YES_NO_OPTION);

      	    if (result == JOptionPane.YES_OPTION) {
      	    	JOptionPane.showMessageDialog(board, "다음에 또 만나요!");
      	    	System.exit(0);
      	    	
      	    }

      	    else if ((result == JOptionPane.NO_OPTION) || (result == JOptionPane.CLOSED_OPTION )){
      	    	setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
      	    }
      	    

        	    
        	  }
        	});
   }

   public JLabel getStatusBar() {
       return statusbar;
   }
 


}