package LocadordeVeiculos;
import javax.swing.JOptionPane;
public class CadastroVeiculo {
    public static void main(String[] args) {       
       int escolha;
       do{ //Veiculo car= new Veiculo();
        VeiculoPasseio carP= new VeiculoPasseio();
        VeiculoCarga carC= new VeiculoCarga();        
        JOptionPane.showMessageDialog(null, "Bem vindo ao Autos Zé!");
        String e=JOptionPane.showInputDialog(null, "Digite (1) para Veiculos de passeio\nDigite (2) para Veiculos de carga\nDigite (0) para Sair");   
        escolha=Integer.parseInt(e);
//Colocar menu
        if(escolha==1){
            carP.insert();
            carP.setKm();
            JOptionPane.showMessageDialog(null, "Valor: "+carP.Valor+"\n"+"Data de cadastro: "+carP.Dt_cadastro+"\n"+"KMs rodados: "+carP.getKm()+"\n");
        }
        if(escolha==2){
            carC.insert();
            carC.setKm();
            JOptionPane.showMessageDialog(null, "Valor: "+carP.Valor+"\n"+"Data de cadastro: "+carP.Dt_cadastro+"\n"+"KMs rodados: "+carP.getKm()+"\n"+"Tipo de Carga: "+carC.TipodeCarga);
        }      
       }while(escolha!=0);
        
    }
}  
    