package projetopl;

import javax.swing.JOptionPane;

public class Funcionario {
    public int cpf;
    public String nivel;
    public double salario;
    public int ano;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    
    public String descobre_nivel(int ano, String nivel, double salario){
        
        if ((2020 - ano) >= 30){
            nivel = "ABC";
            JOptionPane.showMessageDialog(null,"Seu nível é: ABC" + "\nSeu salário é: " + salario*5);
        }
        else if ((2020 - ano) >= 15) {
            nivel = "DEF";
            JOptionPane.showMessageDialog(null,"Seu nível é: DEF" + "\nSeu salário é: " + salario*3 );
        }
        else{
            nivel = "GHI";
            JOptionPane.showMessageDialog(null,"Seu nível é: GHI" + "\nSeu salário é: " + salario*2);
        }
        return nivel;
       }
    
  
}
