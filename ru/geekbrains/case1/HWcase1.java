package ru.geekbrains.case1;

public class HWcase1 {
    static class Answer {
        public int countNTriangle(int n){
            return n * (n + 1) / 2;
        }
    }
    
    public static class Printer{ 
        public static void main(String[] args) { 
          int n = 0;
          
          if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            n = 5;
          }
          else{
            n = Integer.parseInt(args[0]);
          }     
          
          // Вывод результата на экран
          Answer ans = new Answer(); 
          int itresume_res = ans.countNTriangle(n);     
          System.out.println(itresume_res);
        }
    }
}