package br.com.gestoreventos.models;

import javax.swing.table.AbstractTableModel;


public class TabelaModelRelatorio extends AbstractTableModel {

    private static final long serialVersionUID = 1L;
	private static final int QTD_LINHAS = 30;
	
	public int getRowCount() 
	{	return QTD_LINHAS;
	}

	public int getColumnCount()
	{	return 3;
	}
	
	public String getColumnName(int column)
	{	String name = null;
		switch (column)
		{	case 0:
				name = "Participante";
				break;
			case 1:
				name = "Valor a pagar";
				break;
			case 2:
				name = "Banco";
				break;
                       	case 3:
				name = "Conta Corrente";
				break;
		}
		return name;
	}

	public Object getValueAt(int rowIndex, int columnIndex)
	{	String valor = null;
		switch (columnIndex)
		{	case 0:
				valor = "Fulano de Tal";
				break;
			case 1:
				valor = "30,00";
				break;
			case 2:
				valor = "Caixa Economica";
				break;
                        case 3:
				valor = "230894234-3";
				break;
		}
		return valor;
	}
    
}