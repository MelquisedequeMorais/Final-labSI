/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gestoreventos.views;

import View.TabelaModelItens;
import br.com.gestoreventos.models.TabelaModelRelatorio;
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
public class RelatorioView extends JFrame{
    
  	private JPanel painelGeral;  
        
    	public RelatorioView() {
		setAlwaysOnTop(true);
		setTitle("Gestor de Eventos - Relatorio");
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
		logoMarca.setIcon(new ImageIcon(RelatorioView.class.getResource("/icones/logoMarca.png")));
		logoMarca.setBounds(6, 6, 394, 58);
		painelCabecalho.add(logoMarca);
		
		JButton btFecharPrograma = new JButton("");
		btFecharPrograma.setBounds(739, 27, 41, 37);
		painelCabecalho.add(btFecharPrograma);
		btFecharPrograma.setIcon(new ImageIcon(RelatorioView.class.getResource("/icones/btSair.png")));
                btFecharPrograma.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
			}
		});
		
		JButton btParticipantes = new JButton("");
		btParticipantes.setBounds(698, 26, 38, 39);
		painelCabecalho.add(btParticipantes);
		btParticipantes.setIcon(new ImageIcon(RelatorioView.class.getResource("/icones/btParticipantes.png")));
		btParticipantes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                CadastroDeParticipanteView viewCadastroDeParticipante = new CadastroDeParticipanteView();
                viewCadastroDeParticipante.setVisible(true); 
                viewCadastroDeParticipante.setLocationRelativeTo(null);
                viewCadastroDeParticipante.setAlwaysOnTop(true);
			}
		});
		
		JPanel painelSubCabecalho = new JPanel();
		painelSubCabecalho.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		painelSubCabecalho.setBounds(6, 79, 788, 37);
		painelGeral.add(painelSubCabecalho);
		painelSubCabecalho.setLayout(null);
		
                JButton btImprimir = new JButton("");
		btImprimir.setBounds(708, 3, 32, 32);
		painelSubCabecalho.add(btImprimir);
		btImprimir.setIcon(new ImageIcon(GerenciadorDeItensView.class.getResource("/icones/btImpressora.png")));
		btImprimir.addActionListener(new ActionListener() {
                @Override
		public void actionPerformed(ActionEvent e) {
                        JOptionPane m = new JOptionPane();
                        m.showMessageDialog(RelatorioView.this, "Dados do relatorio enviado para impressora!!");  
                        m.setFocusable(true);  
			}
		});
                
		JButton btConfiguracoes = new JButton("");
		btConfiguracoes.setIcon(new ImageIcon(RelatorioView.class.getResource("/icones/btConfiguracoes.png")));
		btConfiguracoes.setBounds(743, 3, 35, 32);
		painelSubCabecalho.add(btConfiguracoes);
                btConfiguracoes.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane m = new JOptionPane();
                        m.showMessageDialog(RelatorioView.this, "Impressora já configurada, pronta para impressão!!");  
                        m.setFocusable(true);  
			}
		});
		
		JLabel labelItens = new JLabel("Relatorio Geral");
		labelItens.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		labelItens.setForeground(Color.RED);
		labelItens.setBounds(6, 6, 150, 16);
		painelSubCabecalho.add(labelItens);
		
		JButton btVoltar = new JButton("");
		btVoltar.setIcon(new ImageIcon(RelatorioView.class.getResource("/icones/btVoltar.png")));
		btVoltar.setBounds(672, 3, 35, 32);
		painelSubCabecalho.add(btVoltar);
                btVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                TelaPrincipalSelectedView viewInicial = new TelaPrincipalSelectedView();
                        viewInicial.setVisible(true); 
	         	viewInicial.setLocationRelativeTo(null);
        		viewInicial.setAlwaysOnTop(true);
                        dispose();
			}
		});
		
		JPanel painelTabelaItens = new JPanel();
		painelTabelaItens.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		painelTabelaItens.setBounds(6, 117, 788, 555);
		painelGeral.add(painelTabelaItens);
		painelTabelaItens.setLayout(new BorderLayout(0, 0));
		
		
		JTable tabelaItensMaximizados = new JTable(new TabelaModelRelatorio());
		JScrollPane tabelaItens = new JScrollPane(tabelaItensMaximizados);
		painelTabelaItens.add(tabelaItens, BorderLayout.CENTER);		
		
		
	}
}
