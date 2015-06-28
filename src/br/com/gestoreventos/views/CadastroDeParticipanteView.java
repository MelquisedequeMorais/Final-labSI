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
import javax.swing.DefaultComboBoxModel;
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
public class CadastroDeParticipanteView extends JFrame{
    
    	private final JPanel painelGeral;
	private final JTextField campoNome;
	private final JTextField campoEmail;
	private final JTextField campoTelefone;
	private final JTextField campoAgencia;
	private final JTextField campoConta;
	private final JTextField campoOperacao;
	private final JTextField campoResidencial;
        
    	public CadastroDeParticipanteView() {
		setTitle("Gestor de Eventos - Cadastrar Participante");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		painelGeral = new JPanel();
		painelGeral.setBorder(new EmptyBorder(5, 5, 5, 5));
		painelGeral.setLayout(null);
		setContentPane(painelGeral);
                setLocationRelativeTo(null); 
		

		JPanel painelCabecalho = new JPanel();
		painelCabecalho.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		painelCabecalho.setBounds(1, 1, 598, 58);
		painelGeral.add(painelCabecalho);
		painelCabecalho.setLayout(null);
		
		JLabel logoMarca = new JLabel("");
		logoMarca.setIcon(new ImageIcon(CadastroDeParticipanteView.class.getResource("/icones/logoMarca.png")));
		logoMarca.setBounds(6, 6, 412, 46);
		painelCabecalho.add(logoMarca);
		
		JButton btFecharPrograma = new JButton("");
		btFecharPrograma.setIcon(new ImageIcon(CadastroDeParticipanteView.class.getResource("/icones/btSair.png")));
		btFecharPrograma.setBounds(551, 15, 41, 37);
		painelCabecalho.add(btFecharPrograma);
                btFecharPrograma.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
			}
		});
		
		JPanel painelCentral = new JPanel();
		painelCentral.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		painelCentral.setBounds(1, 61, 598, 39);
		painelGeral.add(painelCentral);
		painelCentral.setLayout(null);
		
		JLabel labelParticipante = new JLabel("Participante");
		labelParticipante.setBounds(18, 5, 126, 28);
		labelParticipante.setForeground(Color.RED);
		labelParticipante.setFont(new Font("Lucida Grande", Font.BOLD, 19));
		painelCentral.add(labelParticipante);
		
		JButton btExcluir = new JButton("");
		btExcluir.setIcon(new ImageIcon(CadastroDeParticipanteView.class.getResource("/icones/btMenos.png")));
		btExcluir.setBounds(506, 0, 41, 37);
		painelCentral.add(btExcluir);
                btExcluir.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane m = new JOptionPane();
                    m.showMessageDialog(CadastroDeParticipanteView.this, "Participante apagado com SUCESSO!!");  
                    m.setFocusable(true);  
                    dispose();
			}
		});
		
		JButton btAdicionar = new JButton("");
		btAdicionar.setIcon(new ImageIcon(CadastroDeParticipanteView.class.getResource("/icones/btAdicionar.png")));
		btAdicionar.setBounds(551, 0, 41, 37);
		painelCentral.add(btAdicionar);
		
		JButton btVoltar = new JButton("");
		btVoltar.setIcon(new ImageIcon(CadastroDeParticipanteView.class.getResource("/icones/btVoltar.png")));
		btVoltar.setBounds(462, 0, 41, 37);
		painelCentral.add(btVoltar);
                btVoltar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dispose();
			}
		});
		
		JButton btAplicar = new JButton("");
		btAplicar.setIcon(new ImageIcon(CadastroDeParticipanteView.class.getResource("/icones/btConfirmar.png")));
		btAplicar.setBounds(418, 0, 41, 37);
		painelCentral.add(btAplicar);
                btAplicar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane m = new JOptionPane();
                    m.showMessageDialog(CadastroDeParticipanteView.this, "Dados salvo com SUCESSO!!");  
                    m.setFocusable(true);  
			}
		});

    
		
		JPanel painelInferior = new JPanel();
		painelInferior.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		painelInferior.setBounds(1, 101, 597, 175);
		painelGeral.add(painelInferior);
		painelInferior.setLayout(null);
		
		campoNome = new JTextField();
		campoNome.setText("Digite o nome...");
		campoNome.setToolTipText("");
		campoNome.setForeground(Color.LIGHT_GRAY);
		campoNome.setBounds(14, 13, 572, 28);
		painelInferior.add(campoNome);
		campoNome.setColumns(10);
		
		campoEmail = new JTextField();
		campoEmail.setForeground(Color.LIGHT_GRAY);
		campoEmail.setText("Digite o email...");
		campoEmail.setColumns(10);
		campoEmail.setBounds(15, 49, 572, 28);
		painelInferior.add(campoEmail);
		
		JComboBox comboBoxDdd = new JComboBox();
		comboBoxDdd.setForeground(Color.GRAY);
		comboBoxDdd.setModel(new DefaultComboBoxModel(new String[] {"DDD"}));
		comboBoxDdd.setBounds(124, 125, 86, 27);
		painelInferior.add(comboBoxDdd);
		
		JComboBox comboBoxBanco = new JComboBox();
		comboBoxBanco.setForeground(Color.GRAY);
		comboBoxBanco.setModel(new DefaultComboBoxModel(new String[] {"Banco filial..."}));
		comboBoxBanco.setToolTipText("");
		comboBoxBanco.setBounds(14, 86, 193, 27);
		painelInferior.add(comboBoxBanco);
		
		campoTelefone = new JTextField();
		campoTelefone.setForeground(Color.LIGHT_GRAY);
		campoTelefone.setText("Celular...");
		campoTelefone.setBounds(223, 123, 182, 28);
		painelInferior.add(campoTelefone);
		campoTelefone.setColumns(10);
		
		campoAgencia = new JTextField();
		campoAgencia.setForeground(Color.LIGHT_GRAY);
		campoAgencia.setText("Agencia...");
		campoAgencia.setBounds(219, 84, 134, 28);
		painelInferior.add(campoAgencia);
		campoAgencia.setColumns(10);
		
		campoConta = new JTextField();
		campoConta.setForeground(Color.LIGHT_GRAY);
		campoConta.setText("Conta...");
		campoConta.setBounds(365, 84, 152, 28);
		painelInferior.add(campoConta);
		campoConta.setColumns(10);
		
		campoOperacao = new JTextField();
		campoOperacao.setForeground(Color.LIGHT_GRAY);
		campoOperacao.setText("OP");
		campoOperacao.setBounds(530, 84, 56, 28);
		painelInferior.add(campoOperacao);
		campoOperacao.setColumns(10);
		
		campoResidencial = new JTextField();
		campoResidencial.setForeground(Color.LIGHT_GRAY);
		campoResidencial.setText("Residencial...");
		campoResidencial.setBounds(412, 123, 174, 28);
		painelInferior.add(campoResidencial);
		campoResidencial.setColumns(10);
		
		JComboBox comboBoxPais = new JComboBox();
		comboBoxPais.setModel(new DefaultComboBoxModel(new String[] {"COD PAIS"}));
		comboBoxPais.setToolTipText("");
		comboBoxPais.setForeground(Color.GRAY);
		comboBoxPais.setBounds(14, 125, 98, 27);
		painelInferior.add(comboBoxPais);
	}
}
