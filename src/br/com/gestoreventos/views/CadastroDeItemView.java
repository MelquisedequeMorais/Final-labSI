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
public class CadastroDeItemView extends JFrame{
    	
    private final JPanel painelGeral;
    private final JTextField campoDescricao;
	
    public CadastroDeItemView() {
		setTitle("Gestor de Eventos - Cadastrar Item");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		painelGeral = new JPanel();
		painelGeral.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(painelGeral);
		painelGeral.setLayout(null);
			
		JPanel painelCabecalho = new JPanel();
		painelCabecalho.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		painelCabecalho.setBounds(1, 1, 598, 58);
		painelGeral.add(painelCabecalho);
		painelCabecalho.setLayout(null);
			
		JLabel logoMarca = new JLabel("");
		logoMarca.setIcon(new ImageIcon(CadastroDeItemView.class.getResource("/icones/logoMarca.png")));
		logoMarca.setBounds(6, 6, 412, 46);
		painelCabecalho.add(logoMarca);
			
		JButton btFecharPrograma = new JButton("");
		btFecharPrograma.setIcon(new ImageIcon(CadastroDeItemView.class.getResource("/icones/btSair.png")));
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
			
		JLabel labelItem = new JLabel("Item");
		labelItem.setBounds(18, 5, 84, 28);
		labelItem.setForeground(Color.RED);
		labelItem.setFont(new Font("Dialog", Font.BOLD, 18));
		painelCentral.add(labelItem);
			
		JButton btVoltar = new JButton("");
		btVoltar.setIcon(new ImageIcon(CadastroDeItemView.class.getResource("/icones/btVoltar.png")));
		btVoltar.setBounds(551, 0, 41, 37);
		painelCentral.add(btVoltar);
                btVoltar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dispose();
			}
		});
			
		JButton btAplicar = new JButton("");
		btAplicar.setIcon(new ImageIcon(CadastroDeItemView.class.getResource("/icones/btConfirmar.png")));
		btAplicar.setBounds(507, 0, 41, 37);
		painelCentral.add(btAplicar);
                btAplicar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane m = new JOptionPane();
                    m.showMessageDialog(CadastroDeItemView.this, "Dados Salvo com sucesso!!");  
                    m.setFocusable(true); 
			}
		});
			
		JPanel painelInferior = new JPanel();
		painelInferior.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		painelInferior.setBounds(1, 101, 597, 175);
		painelGeral.add(painelInferior);
		painelInferior.setLayout(null);
			
		campoDescricao = new JTextField();
		campoDescricao.setText("Digite a descrição do item...");
		campoDescricao.setToolTipText("");
		campoDescricao.setForeground(Color.LIGHT_GRAY);
		campoDescricao.setBounds(6, 28, 572, 28);
		painelInferior.add(campoDescricao);
		campoDescricao.setColumns(10);
			
		JComboBox<Object> comboBoxResponsavel = new JComboBox<Object>();
		comboBoxResponsavel.setForeground(Color.GRAY);
		comboBoxResponsavel.setModel(new DefaultComboBoxModel<Object>(new String[] {"Responsavel"}));
		comboBoxResponsavel.setBounds(201, 68, 374, 27);
		painelInferior.add(comboBoxResponsavel);
			
		JComboBox<Object> comboBoxQuantidade = new JComboBox<Object>();
		comboBoxQuantidade.setForeground(Color.GRAY);
		comboBoxQuantidade.setModel(new DefaultComboBoxModel<Object>(new String[] {"Quantidade..."}));
		comboBoxQuantidade.setBounds(6, 68, 170, 27);
		painelInferior.add(comboBoxQuantidade);
	}    
}
