package de.do1eh.engine;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class LevelInfo extends JFrame
{

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;
	private JPanel	contentPane;

	

	/**
	 * Create the frame.
	 */
	public LevelInfo(String text)
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 100, 400, 600);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		
		
		JTextPane textPane = new JTextPane();
		textPane.setText(text);
		
		scrollPane.setViewportView(textPane);
		
		contentPane.add(scrollPane, BorderLayout.CENTER);
	}

}
