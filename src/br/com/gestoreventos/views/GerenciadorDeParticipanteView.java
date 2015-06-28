/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gestoreventos.views;

import View.TabelaModelParticipantes;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class GerenciadorDeParticipanteView extends JFrame{
    
    	private final JPanel painelGeral;
        
    	public GerenciadorDeParticipanteView() {
		setAlwaysOnTop(true);
		setTitle("Gestor de Eventos - Participantes Maximizados");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 800, 700);
		painelGeral = new JPanel();
		painelGeral.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(painelGeral);
		painelGeral.setLayout(null);
		
		JPanel painelCabecalho = new JPanel();
		painelCabecalho.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		painelCabecalho.setBounds(6, 6, 788, 70);
		painelGeral.add(painelCabecalho);
		painelCabecalho.setLayout(null);
		
		JLabel logoMarca = new JLabel("");
		logoMarca.setIcon(new ImageIcon(GerenciadorDeParticipanteView.class.getResource("/icones/logoMarca.png")));
		logoMarca.setBounds(6, 6, 394, 58);
		painelCabecalho.add(logoMarca);
		
		JButton btFecharPrograma = new JButton("");
		btFecharPrograma.setBounds(739, 27, 41, 37);
		painelCabecalho.add(btFecharPrograma);
		btFecharPrograma.setIcon(new ImageIcon(GerenciadorDeParticipanteView.class.getResource("/icones/btSair.png")));
                btFecharPrograma.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
			}
		});
		
		JButton btParticipantes = new JButton("");
		btParticipantes.setBounds(698, 26, 38, 39);
		painelCabecalho.add(btParticipantes);
		btParticipantes.setIcon(new ImageIcon(GerenciadorDeParticipanteView.class.getResource("/icones/btParticipantes.png")));
                
		
		JPanel painelSubCabecalho = new JPanel();
		painelSubCabecalho.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		painelSubCabecalho.setBounds(6, 79, 788, 37);
		painelGeral.add(painelSubCabecalho);
		painelSubCabecalho.setLayout(null);
		
		JButton btAdicionar = new JButton("");
		btAdicionar.setBounds(708, 3, 32, 32);
		painelSubCabecalho.add(btAdicionar);
		btAdicionar.setIcon(new ImageIcon(GerenciadorDeParticipanteView.class.getResource("/icones/btAdicionar.png")));
		btAdicionar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                CadastroDeParticipanteView viewCadastroDeEvento = new CadastroDeParticipanteView();
                    viewCadastroDeEvento.setVisible(true); 
                    viewCadastroDeEvento.setLocationRelativeTo(null);
                    viewCadastroDeEvento.setAlwaysOnTop(true);
			}
		});
		
		JButton btMinimizar = new JButton("");
		btMinimizar.setIcon(new ImageIcon(GerenciadorDeParticipanteView.class.getResource("/icones/minimizar.png")));
		btMinimizar.setBounds(743, 3, 35, 32);
		painelSubCabecalho.add(btMinimizar);
                btMinimizar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                TelaPrincipalSelectedView telaSelectedPrincipal = new TelaPrincipalSelectedView();
                    telaSelectedPrincipal.setVisible(true); 
                    telaSelectedPrincipal.setLocationRelativeTo(null);
                    telaSelectedPrincipal.setAlwaysOnTop(true);
                    dispose();
			}
		});
		
		JLabel labelParticipantes = new JLabel("Participantes");
		labelParticipantes.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		labelParticipantes.setForeground(Color.RED);
		labelParticipantes.setBounds(6, 6, 142, 16);
		painelSubCabecalho.add(labelParticipantes);
		
		JButton btVoltar = new JButton("");
		btVoltar.setIcon(new ImageIcon(GerenciadorDeParticipanteView.class.getResource("/icones/btVoltar.png")));
		btVoltar.setBounds(672, 3, 35, 32);
		painelSubCabecalho.add(btVoltar);
                btVoltar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                TelaPrincipalSelectedView telaSelectedPrincipal = new TelaPrincipalSelectedView();
                    telaSelectedPrincipal.setVisible(true); 
                    telaSelectedPrincipal.setLocationRelativeTo(null);
                    telaSelectedPrincipal.setAlwaysOnTop(true);
                    dispose();
			}
		});
		
		JButton btAplicar = new JButton("");
		btAplicar.setIcon(new ImageIcon(GerenciadorDeParticipanteView.class.getResource("/icones/btConfirmar.png")));
		btAplicar.setBounds(637, 3, 32, 32);
		painelSubCabecalho.add(btAplicar);
                btAplicar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane m = new JOptionPane();
                    m.showMessageDialog(GerenciadorDeParticipanteView.this, "Participantes associados ao Evento!!!");  
                    m.setFocusable(true);  
			}
		});
		
		JPanel painelTabelaParticipantes = new JPanel();
		painelTabelaParticipantes.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		painelTabelaParticipantes.setBounds(6, 117, 788, 555);
		painelGeral.add(painelTabelaParticipantes);
		painelTabelaParticipantes.setLayout(new BorderLayout(0, 0));
		
		
		JTable tabelaParticipantesMaximizado = new JTable(new TabelaModelParticipantes());
		JScrollPane tabelaParticipantesMaximizada = new JScrollPane(tabelaParticipantesMaximizado);
		painelTabelaParticipantes.add(tabelaParticipantesMaximizada, BorderLayout.CENTER);		
	}
}
