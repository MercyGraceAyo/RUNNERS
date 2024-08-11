/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.balexcompany;

import java.util.*;
    class Runner{
        private String name;
        private int time;
        
      public Runner(String name, int time){
          this.name= name;
          this.time= time;
          
      }  
      public String getName(){
          return name;
      }
      public int getTime(){
          return time;
      }
      
    public String toString(){
        return name  + " with time "  + time  +  "minutes";
    }   
   }

public class Runnertest {

    public static void main(String[] args) {
          List <Runner>runner= new ArrayList<>();
        //list of runners
        runner.add(new Runner("Elena",431));
        runner.add(new Runner("Thomas",273));
        runner.add(new Runner("Hamilton",278));
        runner.add(new Runner("Suzie",329));
        runner.add(new Runner("Phil",445));
        runner.add(new Runner("Matt",402));
        runner.add(new Runner("Alex ",388));
        runner.add(new Runner("Emma",275));
        runner.add(new Runner("John",243));
        runner.add(new Runner("James",334));
        runner.add(new Runner("Jane",412));
        runner.add(new Runner("Emiley",393));
        runner.add(new Runner("Daniel",299));
        runner.add(new Runner("Neda",343));
        runner.add(new Runner("Aaron",317));
        runner.add(new Runner("Kate",265));
    //sorting runners in ascending order
    Collections.sort(runner,new Comparator<Runner>(){
        public int compare(Runner r1,Runner r2){
            return Integer.compare(r1.getTime(),r2.getTime());
        }
    });
    //output
    if(runner.size()>0){
        Runner fastest1 = runner.get(0);
        System.out.println("Fastest Runner: " + fastest1);
    }
  if(runner.size()>1){
        Runner fastest2 = runner.get(1);
        System.out.println("2nd fastest runner" + fastest2);
    }
              
}
  }

