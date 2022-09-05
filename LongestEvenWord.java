public class LongestEvenWord {

    public static void main(String[] args) {
        String str ="Be not afraid of greatness," +
                " some are born great, some achieve greatness, and some have greatness thrust upon them.";
       String updStr = str.replace(",","");
       String[] word = updStr.split(" ");
       int size = 0;
       String finalWord ="";
       for(String w : word){
          if(w.length()>size && w.length()%2==0){
                size = w.length();
                finalWord = w;
          }
       }
        System.out.println(finalWord);
    }
}
