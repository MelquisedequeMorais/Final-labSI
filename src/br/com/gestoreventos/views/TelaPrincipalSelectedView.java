/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gestoreventos.views;

import View.TabelaModelItens;
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
public class TelaPrincipalSelectedView extends JFrame{

    	private final JPanel painelGeral;
                
	public TelaPrincipalSelectedView() {
                this.setLocationRelativeTo(null); 
		setAlwaysOnTop(true);
		setTitle("Gestor de Eventos - Tela Principal");
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
		logoMarca.setIcon(new ImageIcon(TelaPrincipalSelectedView.class.getResource("/icones/logoMarca.png")));
		logoMarca.setBounds(6, 6, 394, 58);
		painelCabecalho.add(logoMarca);
		
		JButton btFecharPrograma = new JButton("");
		btFecharPrograma.setBounds(739, 27, 41, 37);
		painelCabecalho.add(btFecharPrograma);
		btFecharPrograma.setIcon(new ImageIcon(TelaPrincipalSelectedView.class.getResource("/icones/btSair.png")));
                btFecharPrograma.addActionListener(new ActionListener() {
                @Override
		public void actionPerformed(ActionEvent e) {
                    System.exit(0);
			}
		});
		
		JButton btParticipantes = new JButton("");
		btParticipantes.setBounds(698, 26, 38, 39);
		painelCabecalho.add(btParticipantes);
		btParticipantes.setIcon(new ImageIcon(TelaPrincipalSelectedView.class.getResource("/icones/btParticipantes.png")));
                btParticipantes.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                GerenciadorDeParticipanteView gerenciadorParticipante = new GerenciadorDeParticipanteView();
                gerenciadorParticipante.setVisible(true); 
				gerenciadorParticipante.setLocationRelativeTo(null);
				gerenciadorParticipante.setAlwaysOnTop(true);
			}
		});
		
		
		JPanel painelSubCabecalho = new JPanel();
		painelSubCabecalho.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		painelSubCabecalho.setBounds(6, 79, 788, 37);
		painelGeral.add(painelSubCabecalho);
		painelSubCabecalho.setLayout(null);
		
		JButton btImpressora = new JButton("");
		btImpressora.setBounds(708, 3, 32, 32);
		painelSubCabecalho.add(btImpressora);
		btImpressora.setIcon(new ImageIcon(TelaPrincipalSelectedView.class.getResource("/icones/btImpressora.png")));
                btImpressora.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                RelatorioView viewRelatorio = new RelatorioView();
                        viewRelatorio.setVisible(true); 
	         	viewRelatorio.setLocationRelativeTo(null);
        		viewRelatorio.setAlwaysOnTop(true);
			}
		});
		
		JButton btMinimizarEventos = new JButton("");
		btMinimizarEventos.setIcon(new ImageIcon(TelaPrincipalSelectedView.class.getResource("/icones/minimizar.png")));
		btMinimizarEventos.setBounds(743, 3, 35, 32);
		painelSubCabecalho.add(btMinimizarEventos);
                
		
		JLabel labelEventos = new JLabel("Eventos");
		labelEventos.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		labelEventos.setForeground(Color.RED);
		labelEventos.setBounds(6, 15, 80, 16);
		painelSubCabecalho.add(labelEventos);
		
		JButton btLupaEventos = new JButton("");
		btLupaEventos.setIcon(new ImageIcon(TelaPrincipalSelectedView.class.getResource("/icones/btLupa.png")));
		btLupaEventos.setBounds(668, 3, 35, 32);
		painelSubCabecalho.add(btLupaEventos);
                btLupaEventos.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane m = new JOptionPane();
                    m.showMessageDialog(TelaPrincipalSelectedView.this, "Campo de busca ainda não implementado!!");  
                    m.setFocusable(true); 
			}
		});
		
		JButton btAdicionarEventos = new JButton("");
		btAdicionarEventos.setIcon(new ImageIcon(TelaPrincipalSelectedView.class.getResource("/icones/btAdicionar.png")));
		btAdicionarEventos.setBounds(630, 3, 32, 32);
		painelSubCabecalho.add(btAdicionarEventos);
                btAdicionarEventos.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                CadastroDeEventoView viewCadastroDeEvento = new CadastroDeEventoView();
                viewCadastroDeEvento.setVisible(true); 
				viewCadastroDeEvento.setLocationRelativeTo(null);
				viewCadastroDeEvento.setAlwaysOnTop(true);
			}
		});
		
		JButton btExcluir = new JButton("");
		btExcluir.setIcon(new ImageIcon(TelaPrincipalSelectedView.class.getResource("/icones/btMenos.png")));
		btExcluir.setBounds(591, 3, 32, 32);
		painelSubCabecalho.add(btExcluir);
                btExcluir.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane m = new JOptionPane();
                    m.showMessageDialog(TelaPrincipalSelectedView.this, "Dados excluido com sucesso!!");  
                    m.setFocusable(true); 
			}
		});
		
		JPanel painelTabela = new JPanel();
		painelTabela.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		painelTabela.setBounds(6, 117, 788, 555);
		painelGeral.add(painelTabela);
		painelTabela.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 776, 292);
		painelTabela.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel painelParticipantes = new JPanel();
		painelParticipantes.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		painelParticipantes.setBounds(6, 301, 395, 248);
		painelTabela.add(painelParticipantes);
		painelParticipantes.setLayout(null);
		
		JPanel cabecalhoParticipante = new JPanel();
		cabecalhoParticipante.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		cabecalhoParticipante.setBounds(6, 6, 383, 42);
		painelParticipantes.add(cabecalhoParticipante);
		cabecalhoParticipante.setLayout(null);
		
		JButton btAplicarParticipantes = new JButton("");
		btAplicarParticipantes.setIcon(new ImageIcon(TelaPrincipalSelectedView.class.getResource("/icones/btAdicionar.png")));
		btAplicarParticipantes.setBounds(267, 6, 32, 32);
		cabecalhoParticipante.add(btAplicarParticipantes);
                btAplicarParticipantes.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                CadastroDeParticipanteView viewCadastroParticipante = new CadastroDeParticipanteView();
                                viewCadastroParticipante.setVisible(true); 
				viewCadastroParticipante.setLocationRelativeTo(null);
				viewCadastroParticipante.setAlwaysOnTop(true);
			}
		});
		
		JButton btLupaParticipantes = new JButton("");
		btLupaParticipantes.setIcon(new ImageIcon(TelaPrincipalSelectedView.class.getResource("/icones/btLupa.png")));
		btLupaParticipantes.setBounds(305, 6, 35, 32);
		cabecalhoParticipante.add(btLupaParticipantes);
                btLupaParticipantes.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane m = new JOptionPane();
                    m.showMessageDialog(TelaPrincipalSelectedView.this, "Campo de busca ainda não implementado!!");  
                    m.setFocusable(true); 
			}
		});
		
		JButton btMaximizarParticipante = new JButton("");
		btMaximizarParticipante.setIcon(new ImageIcon(TelaPrincipalSelectedView.class.getResource("/icones/maximizar.png")));
		btMaximizarParticipante.setBounds(345, 6, 32, 32);
		cabecalhoParticipante.add(btMaximizarParticipante);
                btMaximizarParticipante.addActionListener(new ActionListener() {
                @Override
		public void actionPerformed(ActionEvent e) {
                GerenciadorDeParticipanteView gerenciadorParticipante = new GerenciadorDeParticipanteView();
                    gerenciadorParticipante.setVisible(true); 
                    gerenciadorParticipante.setLocationRelativeTo(null);
                    gerenciadorParticipante.setAlwaysOnTop(true);
                    dispose();
			}
		});
		
		JLabel labelParticipantes = new JLabel("Participantes");
		labelParticipantes.setForeground(Color.RED);
		labelParticipantes.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		labelParticipantes.setBounds(6, 20, 122, 16);
		cabecalhoParticipante.add(labelParticipantes);
		
		JPanel painelTabelaParticipantes = new JPanel();
		painelTabelaParticipantes.setBounds(6, 50, 383, 192);
		painelParticipantes.add(painelTabelaParticipantes);
		painelTabelaParticipantes.setLayout(new BorderLayout(0, 0));
		
		JPanel painelItens = new JPanel();
		painelItens.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		painelItens.setBounds(404, 301, 378, 248);
		painelTabela.add(painelItens);
		painelItens.setLayout(null);
		
		JPanel cabecalhoItens = new JPanel();
		cabecalhoItens.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		cabecalhoItens.setBounds(6, 6, 366, 41);
		painelItens.add(cabecalhoItens);
		cabecalhoItens.setLayout(null);
		
		JButton btLupaItens = new JButton("");
		btLupaItens.setIcon(new ImageIcon(TelaPrincipalSelectedView.class.getResource("/icones/btLupa.png")));
		btLupaItens.setBounds(288, 6, 35, 32);
		cabecalhoItens.add(btLupaItens);
                btLupaItens.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane m = new JOptionPane();
                    m.showMessageDialog(TelaPrincipalSelectedView.this, "Campo de busca ainda não implementado!!");  
                    m.setFocusable(true); 
			}
		});
		
		JButton btAdicionarItens = new JButton("");
		btAdicionarItens.setIcon(new ImageIcon(TelaPrincipalSelectedView.class.getResource("/icones/btAdicionar.png")));
		btAdicionarItens.setBounds(250, 6, 32, 32);
		cabecalhoItens.add(btAdicionarItens);
                btAdicionarItens.addActionListener(new ActionListener() {
                @Override
		public void actionPerformed(ActionEvent e) {
                CadastroDeItemView cadastroDeItem = new CadastroDeItemView();
                    cadastroDeItem.setVisible(true); 
                    cadastroDeItem.setLocationRelativeTo(null);
                    cadastroDeItem.setAlwaysOnTop(true);
			}
		});
		
		JButton btMaximizarItens = new JButton("");
		btMaximizarItens.setIcon(new ImageIcon(TelaPrincipalSelectedView.class.getResource("/icones/maximizar.png")));
		btMaximizarItens.setBounds(328, 6, 32, 32);
		cabecalhoItens.add(btMaximizarItens);
                btMaximizarItens.addActionListener(new ActionListener() {
                @Override
		public void actionPerformed(ActionEvent e) {
                GerenciadorDeItensView gerenciadorDeItens = new GerenciadorDeItensView();
                    gerenciadorDeItens.setVisible(true); 
                    gerenciadorDeItens.setLocationRelativeTo(null);
                    gerenciadorDeItens.setAlwaysOnTop(true);
                    dispose();
			}
		});
		
		JLabel labelItens = new JLabel("Itens");
		labelItens.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		labelItens.setForeground(Color.RED);
		labelItens.setBounds(6, 19, 61, 16);
		cabecalhoItens.add(labelItens);
		
		JPanel painelTabelaItens = new JPanel();
		painelTabelaItens.setBounds(6, 48, 366, 194);
		painelItens.add(painelTabelaItens);
		painelTabelaItens.setLayout(new BorderLayout(0, 0));
		
		JTable tabelaItens = new JTable(new TabelaModelItens());
		tabelaItens.setCellSelectionEnabled(true);
		JScrollPane tabelaComScrollItens = new JScrollPane(tabelaItens);
		painelTabelaItens.add(tabelaComScrollItens, BorderLayout.NORTH);
		
		JTable tabelaEventos = new JTable(new TabelaModel());
		JScrollPane painelTabelaEventos = new JScrollPane(tabelaEventos);
		panel.add(painelTabelaEventos, BorderLayout.NORTH);		
		
		JPanel painelDeParticipantes = new JPanel();
		painelDeParticipantes.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		JTable tabelaParticipantes = new JTable(new TabelaModelParticipantes());
		tabelaParticipantes.setCellSelectionEnabled(true);
		JScrollPane tabelaComScrollParticipantes = new JScrollPane(tabelaParticipantes);
		painelTabelaParticipantes.add(tabelaComScrollParticipantes, BorderLayout.NORTH);
	}
}
