package LocadordeVeiculos;
import javax.swing.JOptionPane;
public class VeiculoCarga extends Veiculo{
    double Valor;
    String Dt_cadastro;
    private int Km;
    String TipodeCarga;
    
    void setKm(){
    String e=JOptionPane.showInputDialog(null, "Digite a quantidade de Km rodados");
    Km=Integer.parseInt(e);
  //System.out.println("Digite a quantidade de Km rodados");
  //Km=scan.nextInt();    
    }
    
    int getKm(){
    return Km;    
    }
    void insert(){
    String e=JOptionPane.showInputDialog(null, "Digite o Valor do carro");
    Valor=Integer.parseInt(e);
  //System.out.println("Digite o Valor do carro");
  //Valor=scan.nextDouble();
    String f=JOptionPane.showInputDialog(null, "Digite a Data de Cadastro");
    Dt_cadastro=String.valueOf(f);
  //System.out.println("Digite a Data de Cadastro");
  //Dt_cadastro=scan.next();
    String g=JOptionPane.showInputDialog(null, "Digite a Data de Cadastro");
    TipodeCarga=String.valueOf(g);
  //System.out.println("Digite o Tipo de carga");
  //TipodeCarga=scan.next();
    
    }
}
