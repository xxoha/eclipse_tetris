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
        		"*��Ʈ���� ���迡 ���� �� ȯ���մϴ�* \n "
        		+ "Created by Prachi\n\n"
        		+ "<���� ����>\n"
        		+ " �� ������ ���� ���缭 ���� �����ϸ� �˴ϴ�.\n"
        		+ " ����Ű : \n"
        		+ " 1. ���� : ���� ����Ű\n"
        		+ " 2. ������ : ������ ����Ű\n"
        		+ " ȸ��Ű : \n"
        		+ " 1. ���� �������� ȸ�� : ���� ����Ű\n"
        		+ " 2. ������ �������� ȸ��:�Ʒ��� ����Ű\n"
        		+ " ��� ����߸��� : �����̽���\n"
        		+ " �Ͻ�����     : ��ư P");
        add(board);
        board.start();

        setSize(300, 400);
        setTitle("TETRIS");
        addWindowListener(new WindowAdapter() {
      	  public void windowClosing(WindowEvent e) {
      		  int result = JOptionPane.showConfirmDialog(null, 
      	        "���ӿ��� �����ðڽ��ϱ�?", "Exit Program Message Box",
      	        JOptionPane.YES_NO_OPTION);

      	    if (result == JOptionPane.YES_OPTION) {
      	    	JOptionPane.showMessageDialog(board, "������ �� ������!");
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