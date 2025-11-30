package assignmant_2;

public class Main {
    public static void main(String[] args) {


      double[][] exampleInput = {
          {1.0, Double.NaN, 3.0},
          {Double.NaN, Double.NaN, 2.0},
          {4.0, 5.0, Double.NaN}
       }; //exampleInput from instructions

      double[][] result = idw(exampleInput); 

      for (int i = 0; i < result.length; i++) {
        for (int j = 0; j < result[i].length; j++) {
             System.out.print(result[i][j] + "  ");
            }
            System.out.println(); // same length matrix-after returning
        }
    }

    static double[][] idw(double[][] data) { //idw method
        
          int rows = data.length;
          int cols = data[0].length; 
          double[][] result = new double[rows][cols]; //new matrix

         for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {

     if  (!Double.isNaN (data[i][j])) {
         result[i][j] = data[i][j];
         continue; // known values will return the same 
    } 

    double weightedSum = 0.0;
    double weightSum = 0.0;
         for (int x = 0; x < rows; x++) {
    for (int y = 0; y < cols; y++) {
      if (Double.isNaN(data[x][y])){
       continue; // all distances needs to be calculated with every value 
       // just for double.NaN values 
   }
      
   int dx = i - x; 
   int dy = j - y;

  double dist = Math.sqrt ((dx*dx) + (dy*dy)); // calculating distance
   if (dist == 0) {
      weightedSum = data[x][y];
      weightSum = 1.0;
      break; // avoiding dividing with 0
   }

  double w = 1/(dist*dist); // p=2 (dist*dist)- value from instructions
  weightedSum += data[x][y] * w; 
  weightSum += w; // weight calculation

   }
 }
         
  result[i][j] = weightedSum / weightSum; // new values formula

   } 
 }
         
  return result; 
  }

  
}

