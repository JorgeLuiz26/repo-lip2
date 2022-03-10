import javax.swing.JOptionPane;

public class CriaUsuario {

	public static void main(String[] args) {
	 int rm = 82648;
	 String nome = "Jorge";
	 String username = nome+"_"+rm;
	 
	 JOptionPane.showMessageDialog(null,
			 "RM: " + rm + "\n" +
			 "Nome: " + nome + "\n" +
			 "Usuario: " + username);

	}

}
