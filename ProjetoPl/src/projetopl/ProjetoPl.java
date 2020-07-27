package projetopl;


import javax.swing.JOptionPane;

public class ProjetoPl {

    public static void main(String[] args) {
        Funcionario func = new Funcionario();
       
       func.setCpf(Integer.parseInt(JOptionPane.showInputDialog("Digite seu CPF: ")));
       func.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano em que vc entrou na empresa")));
       func.setSalario(5000);
       func.descobre_nivel(func.getAno(), null, func.getSalario());
    }
    
}
