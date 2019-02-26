package interfaz;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.neodatis.odb.ODB;

public class Etiqueta {
	public JPanel contentPane;
	public JLabel lblResultado;
	public JButton btnDepar;
	public JButton btnEmple;
	public JButton btnEstadDepar;
	public JButton btnEstadEmple;
	public ODB odb;
	public String BBDD;

	public Etiqueta(JButton btnDepar, JButton btnEmple, JButton btnEstadDepar, JButton btnEstadEmple, ODB odb) {
		this.btnDepar = btnDepar;
		this.btnEmple = btnEmple;
		this.btnEstadDepar = btnEstadDepar;
		this.btnEstadEmple = btnEstadEmple;
		this.odb = odb;
	}
}