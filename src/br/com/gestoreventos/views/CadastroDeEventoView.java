/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gestoreventos.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author ericgaldino
 */
public class CadastroDeEventoView extends JFrame{
    
    	private final JPanel painelGeral;
	private final JTextField campoDescricao;
	private final JTextField campoLocal;
	private final JTextField campoData;
	private final JTextField campoGastoTotal;
	private final JTextField campoCotasTotal;
	private final JTextField campoValorCotas;
	private final JTextField campoDias;
        
    	public CadastroDeEventoView() {
		setTitle("Gestor de Eventos - Cadastrar Evento");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		painelGeral = new JPanel();
		painelGeral.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(painelGeral);
		painelGeral.setLayout(null);
                setResizable(false);
                setLocationRelativeTo(null); 
		
		JPanel painelCabecalho = new JPanel();
		painelCabecalho.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		painelCabecalho.setBounds(1, 1, 598, 58);
		painelGeral.add(painelCabecalho);
		painelCabecalho.setLayout(null);
		
		JLabel logoMarca = new JLabel("");
		logoMarca.setIcon(new ImageIcon(CadastroDeEventoView.class.getResource("/icones/logoMarca.png")));
		logoMarca.setBounds(6, 6, 412, 46);
		painelCabecalho.add(logoMarca);
		
		JButton btFecharPrograma = new JButton("");
		btFecharPrograma.setIcon(new ImageIcon(CadastroDeEventoView.class.getResource("/icones/btSair.png")));
		btFecharPrograma.setBounds(551, 15, 41, 37);
                btFecharPrograma.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
                            System.exit(0);
			}
		});
		painelCabecalho.add(btFecharPrograma);
		
		JPanel painelCentral = new JPanel();
		painelCentral.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		painelCentral.setBounds(1, 61, 598, 39);
		painelGeral.add(painelCentral);
		painelCentral.setLayout(null);
		
		JLabel labelEvento = new JLabel("Evento");
		labelEvento.setBounds(18, 5, 84, 28);
		labelEvento.setForeground(Color.RED);
		labelEvento.setFont(new Font("Lucida Grande", Font.BOLD, 19));
		painelCentral.add(labelEvento);
		
		JButton btExcluir = new JButton("");
		btExcluir.setIcon(new ImageIcon(CadastroDeEventoView.class.getResource("/icones/btMenos.png")));
		btExcluir.setBounds(416, 0, 41, 37);
		painelCentral.add(btExcluir);
                btExcluir.addActionListener(new ActionListener() {
                @Override
		public void actionPerformed(ActionEvent e) {
                    JOptionPane m = new JOptionPane();
                    m.showMessageDialog(CadastroDeEventoView.this, "Evento apagado com SUCESSO!!");  
                    m.setFocusable(true);  
                    dispose();
			}
		});
		
		JButton btAdicionar = new JButton("");
		btAdicionar.setIcon(new ImageIcon(CadastroDeEventoView.class.getResource("/icones/btAdicionar.png")));
		btAdicionar.setBounds(461, 0, 41, 37);
		painelCentral.add(btAdicionar);
		
		JButton btBuscar = new JButton("");
		btBuscar.setIcon(new ImageIcon(CadastroDeEventoView.class.getResource("/icones/btLupa.png")));
		btBuscar.setBounds(505, 0, 41, 37);
		painelCentral.add(btBuscar);
                btBuscar.addActionListener(new ActionListener() {
                @Override
		public void actionPerformed(ActionEvent e) {
                    JOptionPane m = new JOptionPane();
                    m.showMessageDialog(CadastroDeEventoView.this, "Campo de busca ainda não implementado!!!");  
                    m.setFocusable(true);  
			}
		});
		
		JButton btImpressora = new JButton("");
		btImpressora.setIcon(new ImageIcon(CadastroDeEventoView.class.getResource("/icones/btImpressora.png")));
		btImpressora.setBounds(551, 0, 41, 37);
		painelCentral.add(btImpressora);
                btImpressora.addActionListener(new ActionListener() {
                @Override
		public void actionPerformed(ActionEvent e) {
                    JOptionPane m = new JOptionPane();
                    m.showMessageDialog(CadastroDeEventoView.this, "Dados do Evento enviado para impressora!!");  
                    m.setFocusable(true);  
                    dispose();
			}
		});
		
		JButton btVoltar = new JButton("");
		btVoltar.setIcon(new ImageIcon(CadastroDeEventoView.class.getResource("/icones/btVoltar.png")));
		btVoltar.setBounds(372, 0, 41, 37);
		painelCentral.add(btVoltar);
                btVoltar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dispose();
			}
		});
		
		JButton btAplicar = new JButton("");
		btAplicar.setIcon(new ImageIcon(CadastroDeEventoView.class.getResource("/icones/btConfirmar.png")));
		btAplicar.setBounds(328, 0, 41, 37);
		painelCentral.add(btAplicar);
                btAplicar.addActionListener(new ActionListener() {
                @Override
		public void actionPerformed(ActionEvent e) {
                    JOptionPane m = new JOptionPane();
                    m.showMessageDialog(CadastroDeEventoView.this, "Dados salvo com SUCESSO!!!");  
                    m.setFocusable(true);  
			}
		});
		
		JPanel painelInferior = new JPanel();
		painelInferior.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		painelInferior.setBounds(1, 101, 597, 175);
		painelGeral.add(painelInferior);
		painelInferior.setLayout(null);
		
		campoDescricao = new JTextField();
		campoDescricao.setText("Digite a descrição do Evento...");
		campoDescricao.setToolTipText("");
		campoDescricao.setForeground(Color.LIGHT_GRAY);
		campoDescricao.setBounds(14, 13, 572, 28);
		painelInferior.add(campoDescricao);
		campoDescricao.setColumns(10);
		
		campoLocal = new JTextField();
		campoLocal.setForeground(Color.LIGHT_GRAY);
		campoLocal.setText("Digite o local do Evento...");
		campoLocal.setColumns(10);
		campoLocal.setBounds(15, 49, 572, 28);
		painelInferior.add(campoLocal);
		
		campoData = new JTextField();
		campoData.setForeground(Color.LIGHT_GRAY);
		campoData.setText("Data do Evento...");
		campoData.setBounds(16, 87, 134, 28);
		painelInferior.add(campoData);
		campoData.setColumns(10);
		
		JComboBox datePicker = new JComboBox();
		datePicker.setToolTipText("");
		datePicker.setBounds(162, 88, 80, 27);
		painelInferior.add(datePicker);
		
		campoGastoTotal = new JTextField();
		campoGastoTotal.setForeground(Color.LIGHT_GRAY);
		campoGastoTotal.setText("Gasto total...");
		campoGastoTotal.setBounds(16, 127, 110, 28);
		painelInferior.add(campoGastoTotal);
		campoGastoTotal.setColumns(10);
		
		campoCotasTotal = new JTextField();
		campoCotasTotal.setForeground(Color.LIGHT_GRAY);
		campoCotasTotal.setText("Cotas total...");
		campoCotasTotal.setBounds(143, 128, 96, 28);
		painelInferior.add(campoCotasTotal);
		campoCotasTotal.setColumns(10);
		
		campoValorCotas = new JTextField();
		campoValorCotas.setForeground(Color.LIGHT_GRAY);
		campoValorCotas.setText("Valor cotas...");
		campoValorCotas.setBounds(251, 127, 106, 28);
		painelInferior.add(campoValorCotas);
		campoValorCotas.setColumns(10);
		
		campoDias = new JTextField();
		campoDias.setForeground(Color.LIGHT_GRAY);
		campoDias.setText("Dias...");
		campoDias.setBounds(254, 88, 70, 28);
		painelInferior.add(campoDias);
		campoDias.setColumns(10);
	}
}
