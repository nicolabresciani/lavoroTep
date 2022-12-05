import javax.swing.JFrame;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.*;

public class Paesaggio extends JFrame implements KeyListener{
    ImageIcon cactus;
    ImageIcon pavimento;
    JFrame f;
    JLabel l1;  
    JLabel l2;
    JPanel p;
    JPanel panelPavimento = (JPanel)getContentPane(); //pavimento 
    JPanel panelCactus = (JPanel)getContentPane();    //cactus
    JPanel panelDino = (JPanel)getContentPane();    //dino
    
    JLabel labelCactus = new JLabel();//CACTUS
    JLabel labelDino = new JLabel();//DINO
    JLabel labelPavimento = new JLabel();//PAVIMENTO
    public Paesaggio(){
        //JFrame frame = new JFrame("DINO");  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        panelPavimento.setLayout(null);
        panelCactus.setLayout(null);
        setResizable(false);
        //cactus
          
        labelCactus.setIcon(new ImageIcon("immagine/cactus.png"));
        panelCactus.add(labelCactus);
        Dimension sizeCactus = labelCactus.getPreferredSize();
        labelCactus.setBounds(800, 106, 500, 500);
        labelCactus.setSize(350,200);
        //dino
          
        labelDino.setIcon(new ImageIcon("immagine/dino.png"));
        panelDino.add(labelDino);
        Dimension sizeDino = labelDino.getPreferredSize();
        labelDino.setBounds(100, 106, 500, 500);//y nel salto 46
        labelDino.setSize(350,200);
        //pavimento
          
        labelPavimento.setIcon(new ImageIcon("immagine/pavimento.png"));
        panelPavimento.add(labelPavimento);
        Dimension sizePavimento = labelPavimento.getPreferredSize();
        labelPavimento.setBounds(-20, 100, 1846, 500);
        labelPavimento.setSize(1846,200);
        setLocation(300,300);
        setSize(1400, 500);
        setVisible(true); 
        addKeyListener(this);
        }  
    @Override
    public void keyPressed(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_UP){
            System.out.println("hai schiacciato");
            for(int i=0;i>-100;i--){
                labelDino.setBounds(100, i, 500, 500);//coordinate finali del salto su  
                System.out.println("volooooooo");
            }
            
            labelDino.setBounds(100, -50, 500, 500);
            System.out.println("ariat");
        }
    }
    public void keyReleased(KeyEvent e){
        
    }
    public void keyTyped(KeyEvent e) { 
        
    }
}   


