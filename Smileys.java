import java.util.*;

public class SimleysFullVersion {

 public static void main(String[] args) {
     Scanner reader = new Scanner (System.in);
     System.out.println("Enter characters: ");
     // charInTheFrame designates the characters/symbols in the frame
     String charInTheFrame = reader.nextLine();
        printWithSmileys(charInTheFrame);
 }

private static void printWithSmileys(String charInTheFrame) {

    Scanner reader = new Scanner (System.in);
    System.out.println("Enter frame characters: ");
    // frameChar designates the characters/symbols that compose the frame
    String frameChar = reader.nextLine();

     int charInTheFrameLength = charInTheFrame.length();
     int frameCharLength = frameChar.length();
     // emptySpace designates the space between the characters/symbols composing the frame and those within the frame
     String emptySpace = "";
     int emptySpaceLength = 0;

     System.out.println("The picture looks like this: ");

/*First Major Possibility*/       
if (frameCharLength > charInTheFrameLength) { 


/*Subgroup 1: First Major Possibility*/   
  if ((frameCharLength - charInTheFrameLength) % 2 == 0) {

     while (emptySpaceLength < (frameCharLength - charInTheFrameLength) / 2) {
        emptySpace += " ";
        emptySpaceLength++;
     }
        printBottomTopRow(3, frameChar);
        System.out.println(frameChar + emptySpace + charInTheFrame + emptySpace + frameChar);
        printBottomTopRow(3, frameChar);
  } 

/*Subgroup 2: First Major Possibility*/
  else if (frameCharLength - charInTheFrameLength == 1) {

      while (emptySpaceLength < (2 * frameCharLength - charInTheFrameLength) / 2) {
          emptySpace += " ";
          emptySpaceLength++;
      }
          int bottomTopRow = ((charInTheFrameLength + 4 * (frameCharLength)) / frameCharLength);
          printBottomTopRow(bottomTopRow, frameChar);
          if (charInTheFrameLength%2 !=0){
          System.out.println(frameChar + emptySpace + charInTheFrame + emptySpace + " " + frameChar);
          }
            else
             System.out.println(frameChar + emptySpace + charInTheFrame + emptySpace + frameChar);
             printBottomTopRow(bottomTopRow, frameChar);
  } 

/*Subgroup 3: First Major Possibility*/          
  else {

     while (emptySpaceLength < (frameCharLength - charInTheFrameLength) / 2) {
         emptySpace += " ";
         emptySpaceLength++;
     }
           int bottomTopRow = ((charInTheFrameLength + 3 * (frameCharLength)) / frameCharLength);
           printBottomTopRow(bottomTopRow, frameChar);
           System.out.println(frameChar + emptySpace + charInTheFrame + emptySpace + " " + frameChar);
           printBottomTopRow(bottomTopRow, frameChar);
  }

}


/*Second Major Possibility*/      
if (frameCharLength == charInTheFrameLength){ 

     while (emptySpaceLength < frameCharLength) {
         emptySpace += " ";
         emptySpaceLength++;
     }
        int bottomTopRow = ((charInTheFrameLength + 4 * (frameCharLength)) / frameCharLength);
        printBottomTopRow(bottomTopRow, frameChar);
        System.out.println(frameChar + emptySpace + charInTheFrame + emptySpace + frameChar);
        printBottomTopRow(bottomTopRow, frameChar);
}


/*Third Major Possibility*/      
if (frameCharLength < charInTheFrameLength) { 

/*Subgroup 1: Third Major Possibility*/ 
  if (charInTheFrameLength % frameCharLength == 0){

     while (emptySpaceLength < frameCharLength) {
         emptySpace += " ";
         emptySpaceLength++;
     }
         int bottomTopRow = ((charInTheFrameLength + 4 * (frameCharLength)) / frameCharLength);
         printBottomTopRow(bottomTopRow, frameChar);
         System.out.println(frameChar + emptySpace + charInTheFrame + emptySpace + frameChar);
         printBottomTopRow(bottomTopRow, frameChar);
  }

/*Subgroup 2: Third Major Possibility*/   
  else if  ((frameCharLength - (charInTheFrameLength % frameCharLength)) == 1){

      while (emptySpaceLength < (frameCharLength+1)/2) {
          emptySpace += " ";
          emptySpaceLength++;
      }
          int bottomTopRow = ((4*frameCharLength + (charInTheFrameLength/frameCharLength)*(frameCharLength)) / frameCharLength);
          printBottomTopRow(bottomTopRow, frameChar);
          if ((frameCharLength+1)%2 !=0){
          System.out.println(frameChar + emptySpace + charInTheFrame + emptySpace + " " + frameChar);
          }
            else 
               System.out.println(frameChar + emptySpace + charInTheFrame + emptySpace + frameChar);
               printBottomTopRow(bottomTopRow, frameChar);
 }

/*Subgroup 3: Third Major Possibility*/         
else  {

      while (emptySpaceLength < (frameCharLength-(charInTheFrameLength % frameCharLength))/2) {
          emptySpace += " ";
          emptySpaceLength++;
      }
          int bottomTopRow = ((3*frameCharLength + (charInTheFrameLength/frameCharLength)*(frameCharLength)) / frameCharLength);
          printBottomTopRow(bottomTopRow, frameChar);
          if ((frameCharLength-(charInTheFrameLength % frameCharLength))%2 !=0){
          System.out.println(frameChar + emptySpace + charInTheFrame + emptySpace + " " + frameChar);
          }
            else 
              System.out.println(frameChar + emptySpace + charInTheFrame + emptySpace + frameChar);
              printBottomTopRow(bottomTopRow, frameChar);
            }
 }

}

    public static void printBottomTopRow(int rowLength, String symbol) {
        for (int i = 0; i < rowLength; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }
}
