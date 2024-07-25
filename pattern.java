public class pattern {
    //HOLLOW RECTANGLE

    // public static void hollow_rectangle(int totRows, int totCols){
    //     for(int i =1; i<=totRows; i++){
    //         for(int j=1; j<=totCols; j++){
    //             if(i == 1 || i == totRows || j == 1 || j == totCols){
    //                 System.out.print("*");
    //             }else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

   
    
        // public static void inverted_pyramid(int n) {
        //     // outer
        //     for (int i = n; i >= 1; i--) {
        //         // spaces
        //         for (int j = 1; j <= n - i; j++) {
        //             System.out.print(" ");
        //         }
        //         // stars
        //         for (int j = 1; j <= (2 * i) - 1; j++) {
        //             System.out.print("*");
        //         }
        //         System.out.println();
        //     }
        // }

        public static void interted_halfNumber(int n){
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n-i+1; j++){
                    System.out.print(j+" ");

                }
                System.out.println();
            }
        }

        public static void triangle(int n){
            int counter =1;
            for(int i=1; i<=n; i++){
                for(int j=1; j<=i; j++){
                    System.out.print(counter +" ");
                    counter++;
                }
                System.out.println();
            }
        }

        public static void butterfly(int n){
            //1st half
            for(int i=1; i<=n; i++){
                //star
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                for(int j=1; j<=2*(n-i); j++){
                    System.out.print(" ");
                }
                //star
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
             //2nd half
             for(int i=n; i>=1; i--){
                //star
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                for(int j=1; j<=2*(n-i); j++){
                    System.out.print(" ");
                }
                //star
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
             }
        }

        public static void diamond(int n){
            for(int i=1; i<=n; i++){
                //spaced
                for(int j =1; j<=(n-i); j++){
                    System.out.print(" ");
                }
                //star
                for(int j=1; j<=(2*i)-1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            //2nd half
            for(int i=n; i>=1; i--){
                for(int j =1; j<=(n-i); j++){
                    System.out.print(" ");
                }
                //star
                for(int j=1; j<=(2*i)-1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
          
    
        public static void main(String[] args) {
            // hollow_rectangle(4, 5);
            // inverted_pyramid(4);
            // interted_halfNumber(5);
            // triangle(5);
            // butterfly(4);
            diamond(9);
        }
    }
    
