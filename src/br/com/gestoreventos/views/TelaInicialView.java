/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gestoreventos.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author ericgaldino
 */
public class TelaInicialView extends JFrame implements MouseListener{
    
        
    private static final TelaInicialView instance = new TelaInicialView();
    private final JPanel painelGeral;
    private final JTable tabelaEventos;
    
    	public TelaInicialView() {
		setAlwaysOnTop(true);
		setTitle("Gestor de Eventos - Tela Inicial");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 800, 700);
		painelGeral = new JPanel();
		painelGeral.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(painelGeral);
		painelGeral.setLayout(null);
                setLocationRelativeTo(null);
		
		JPanel painelCabecalho = new JPanel();
		painelCabecalho.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		painelCabecalho.setBounds(6, 6, 788, 70);
		painelGeral.add(painelCabecalho);
		painelCabecalho.setLayout(null);
		
		JLabel logoMarca = new JLabel("");
		logoMarca.setIcon(new ImageIcon(TelaInicialView.class.getResource("/icones/logoMarca.png")));
		logoMarca.setBounds(6, 6, 394, 58);
		painelCabecalho.add(logoMarca);
		
		JButton btFecharPrograma = new JButton("");
		btFecharPrograma.setBounds(739, 27, 41, 37);
		painelCabecalho.add(btFecharPrograma);
		btFecharPrograma.setIcon(new ImageIcon(TelaInicialView.class.getResource("/icones/btSair.png")));
                btFecharPrograma.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
			}
		});
		
		
		JButton btParticipantes = new JButton("");
		btParticipantes.setBounds(698, 26, 38, 39);
		painelCabecalho.add(btParticipantes);
		btParticipantes.setIcon(new ImageIcon(TelaInicialView.class.getResource("/icones/btParticipantes.png")));
                btParticipantes.addActionListener(new ActionListener() {
                @Override
		public void actionPerformed(ActionEvent e) {
                GerenciadorDeParticipanteView viewGerenciadorDeParticipantes = new GerenciadorDeParticipanteView();
                viewGerenciadorDeParticipantes.setVisible(true); 
				viewGerenciadorDeParticipantes.setLocationRelativeTo(null);
				viewGerenciadorDeParticipantes.setAlwaysOnTop(true);
                                dispose();
			}
		});
		
		
		JPanel painelSubCabecalho = new JPanel();
		painelSubCabecalho.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		painelSubCabecalho.setBounds(6, 79, 788, 37);
		painelGeral.add(painelSubCabecalho);
		painelSubCabecalho.setLayout(null);
		
		JButton btAdicionar = new JButton("");
		btAdicionar.setBounds(708, 3, 32, 32);
		painelSubCabecalho.add(btAdicionar);
		btAdicionar.setIcon(new ImageIcon(TelaInicialView.class.getResource("/icones/btAdicionar.png")));
		btAdicionar.addActionListener(new ActionListener() {
                @Override
		public void actionPerformed(ActionEvent e) {
                CadastroDeEventoView viewCadastroDeEvento = new CadastroDeEventoView();
                    viewCadastroDeEvento.setVisible(true); 
                    viewCadastroDeEvento.setLocationRelativeTo(null);
                    viewCadastroDeEvento.setAlwaysOnTop(true);
			}
		});
		
		JButton btLupa = new JButton("");
		btLupa.setIcon(new ImageIcon(TelaInicialView.class.getResource("/icones/btLupa.png")));
		btLupa.setBounds(743, 3, 35, 32);
		painelSubCabecalho.add(btLupa);
                btLupa.addActionListener(new ActionListener() {
                @Override
		public void actionPerformed(ActionEvent e) {
                    JOptionPane m = new JOptionPane();
                    m.showMessageDialog(TelaInicialView.this, "Campo de busca ainda não implementado!!");  
                    m.setFocusable(true);  
			}
		});
		
		JLabel labelEventos = new JLabel("Eventos");
		labelEventos.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		labelEventos.setForeground(Color.RED);
		labelEventos.setBounds(6, 15, 80, 16);
		painelSubCabecalho.add(labelEventos);
		
		JPanel painelTabelaEventos = new JPanel();
		painelTabelaEventos.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		painelTabelaEventos.setBounds(6, 117, 788, 555);
		painelGeral.add(painelTabelaEventos);
		painelTabelaEventos.setLayout(new BorderLayout(0, 0));
		
		tabelaEventos = new JTable(new TabelaModel());
                tabelaEventos.addMouseListener(this);
		JScrollPane tabelaComScroll = new JScrollPane(tabelaEventos);
		painelTabelaEventos.add(tabelaComScroll, BorderLayout.CENTER);		
	}
        
     	
    @Override
    public void mouseClicked(MouseEvent e) {	
        int clicadas = e.getClickCount();
                 if (clicadas == 2){	
                     TelaPrincipalSelectedView telaClicada = new TelaPrincipalSelectedView();
                     telaClicada.setVisible(true);
                     telaClicada.setLocationRelativeTo(null);
                     telaClicada.setAlwaysOnTop(true);
                     dispose();   
                 }
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
    
    public static TelaInicialView getInstance(){
            return instance;
    }


}
