package Controller;

import javax.swing.JOptionPane;


public class Conexao_DB {
    public static void conectaDrive() {
    try { // Conectando o driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            JOptionPane.showMessageDialog(null, "Sistema em funcionamento");


       } catch (Exception ex) { // Erro driver não encontrado
            JOptionPane.showMessageDialog(null, "ERRO D001 \nDriver ou Banco de Dados ausente\nContate o suporte (11) 4002-8922" , "Erro no sistema", 0);
        }
}
}
