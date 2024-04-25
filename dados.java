public class dados {
   public static void main(String args[]) {
      int numInt;
      double numReal,soma;
      char Caracter;

      numInt=Integer.parseInt(args[0]);
      numReal=Double.parseDouble(args[1]);
      Caracter=(args[2]).charAt(0);

      soma = (double)numInt + numReal ;

      System.out.println((double)numInt + " + " + numReal + " = " + soma + " sinal " + Caracter);

      System.exit(0);
   }
}
