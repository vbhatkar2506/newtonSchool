import java.util.Scanner;

public class EasySorting {
    String names[];
        int length;
    
        public static void main(String[] args) {
            Main sorter = new Main();
            try (Scanner sc = new Scanner(System.in)) {
                String[] words = new String[5];
                for( int i = 0; i<5;i++)
                    {
                        words[i] = sc.nextLine();
                        }
                    sorter.sort(words);
   
                for (String i : words) {
                    System.out.print(i);
                    System.out.print(" ");
                }
            }
        }
    
        void sort(String array[])
        {
            if (array == null || array.length == 0) {
                return;
            }
            this.names = array;
            this.length = array.length;
            quickSort(0, length - 1);
        }
    
        void quickSort(int lowerIndex, int higherIndex) {
            int i = lowerIndex;
            int j = higherIndex;
            String pivot = this.names[lowerIndex + (higherIndex - lowerIndex) / 2];
    
            while (i <= j) {
                while (this.names[i].compareToIgnoreCase(pivot) < 0) {
                    i++;
                }
    
                while (this.names[j].compareToIgnoreCase(pivot) > 0) {
                    j--;
                }
    
                if (i <= j) {
                    exchangeNames(i, j);
                    i++;
                    j--;
                }
            }
            //call quickSort recursively
            if (lowerIndex < j) {
                quickSort(lowerIndex, j);
            }
            if (i < higherIndex) {
                quickSort(i, higherIndex);
            }
        }
    
        void exchangeNames(int i, int j) {
            String temp = this.names[i];
            this.names[i] = this.names[j];
            this.names[j] = temp;
        }
}
