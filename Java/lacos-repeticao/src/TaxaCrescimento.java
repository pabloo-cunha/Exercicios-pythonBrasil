public class TaxaCrescimento {
    public static void main(String[] args) {
      int paisA = 80000;
      int paisB = 200000;
      
      float taxaA = 0.03f;
      float taxaB = 0.015f;

      int count = 0;

      do{
        paisA += (paisA * taxaA);
        paisB += (paisB * taxaB);

        count ++;
      } while(paisA <= paisB);

      System.out.println("O pais A alcançará o pais B em " + count + " anos");
    }

}
