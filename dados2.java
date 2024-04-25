public class dados2 {
   public static void main(String args[]) {
      int n1 , n2 ;
      int mod, div ;
      double raiz , pot ;
      String msg = "";

      n1 = Integer.parseInt(args[0]);
      n2 = Integer.parseInt(args[1]);

      mod = n1 % n2;
      div = (int)n1 / (int)n2 ;
      raiz = Math.sqrt(n1);
      pot = Math.pow(n1, n2);

      msg = "n1 = "+ n1 + " n2 = "+ n2 + "\n";
      msg = msg + "Resto da divisao de n1 por n2 = "+ mod + "\n";
      msg = msg + "Quociente da divisao de n1 por n2 = " + div + "\n";
      msg = msg + "Raiz quadrada de n1 = " + raiz + "\n";
      msg = msg + "Potencia de n1 e n2 = " + pot + "\n";
      System.out.println(msg);
      System.exit(0);
   }
}
