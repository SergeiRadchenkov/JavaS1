package ru.geekbrains.case2_1;

public class HWcase2_1 {
    static class Answer {
        public void printPrimeNums(){
            boolean isPrime;
            for(int i = 2; i < 1000; i++) {
                isPrime = i == 1;
                for(int j = 2; j < 1000; j++) {
                    if (i >= j && i % j == 0) {
                        if(j == i) {
                            isPrime = true;
                        }
                        break;
                    }
                }
                if(isPrime) System.out.println(i);
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
