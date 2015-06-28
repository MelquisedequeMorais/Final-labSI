package View;

import javax.swing.table.AbstractTableModel;


public class TabelaModelParticipantes extends AbstractTableModel {

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
				name = "Nome";
				break;
			case 1:
				name = "Cotas";
				break;
			case 2:
				name = "Telefone";
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
				valor = "2";
				break;
			case 2:
				valor = "(83) 9321-3241";
				break;
		}
		return valor;
	}
    
}