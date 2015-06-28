package br.com.gestoreventos.views;


import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class TabelaModel extends AbstractTableModel {

    private static final long serialVersionUID = 1L;
	private static final int QTD_LINHAS = 50;
	
	public int getRowCount() 
	{	return QTD_LINHAS;
	}

	public int getColumnCount()
	{	return 4;
	}
	
	public String getColumnName(int column)
	{	String name = null;
		switch (column)
		{	case 0:
				name = "Evento";
				break;
			case 1:
				name = "Local";
				break;
			case 2:
				name = "Data";
				break;
			case 3:
				name = "Dias";
				break;
		}
		return name;
	}

	public Object getValueAt(int rowIndex, int columnIndex)
	{	String valor = null;
		switch (columnIndex)
		{	case 0:
				valor = "Churrascão";
				break;
			case 1:
				valor = "Casa de Mura";
				break;
			case 2:
				valor = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
				break;
			case 3:
				valor = Integer.toString(10);
				break;
		}
		return valor;
	}
    
}