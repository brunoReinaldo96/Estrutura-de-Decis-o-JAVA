import javax.swing.*;
public class atividade {
   public static void main(String args[]) {
      int num1, num2, quociente;
      double potencia;
      String msg = "";

      num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro:"));
      num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro:"));

      
      quociente = (int)num1 / (int)num2;
      potencia = Math.pow(num1, num2);

      msg = msg + "O quociente da divisão entre " + num1 + " e " + num2 + " é: " + quociente + "\n";
      msg = msg + "A potência de " + num1 + " elevado a " + num2 + " é: " + potencia;
      JOptionPane.showMessageDialog(null,msg);

      System.exit(0);
   } 
}