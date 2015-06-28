package View;

import javax.swing.table.AbstractTableModel;


public class TabelaModelItens extends AbstractTableModel {

    private static final long serialVersionUID = 1L;
	private static final int QTD_LINHAS = 10;
	
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
				name = "Item";
				break;
			case 1:
				name = "Quantidade";
				break;
			case 2:
				name = "Responsavel";
				break;
		}
		return name;
	}

	public Object getValueAt(int rowIndex, int columnIndex)
	{	String valor = null;
		switch (columnIndex)
		{	case 0:
				valor = "Picanha";
				break;
			case 1:
				valor = "2kg";
				break;
			case 2:
				valor = "Beltrano";
				break;
		}
		return valor;
	}
    
}