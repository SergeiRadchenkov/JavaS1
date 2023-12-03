package ru.geekbrains.case2;

public class HWcase2 {
    static class Answer {
        public void printPrimeNums() {
            int count = 0;
            for (int i = 2; i <= 1000; i++) {
                for (int j = 1; i >= j; j++) {
                    if (i % j == 0) {
                        count = count + 1;
                    }                    
                }
                if (count == 2) 
                    System.out.println(i);
                count = 0; 
            }
        }
    }
    
    public static class Printer{ 
        public static void main(String[] args) { 
          
          Answer ans = new Answer();      
          ans.printPrimeNums();
        }
    }
}
