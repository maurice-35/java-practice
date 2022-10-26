// import java.lang.String;
// import java.lang.System;

class Company{
  float salary=70000;
}

class Director extends Company{
  int bonus=30000;

  public static void main(String args[]){
    Director d=new Director();
    System.out.println("Director salary is:" + d.salary);
    System.out.println("Bonus of Director is:" + d.bonus);
  }
}

class Family {
  void rent() {System.out.println("renting...");}
  }
  class Father extends Family {
  void work() {System.out.println("working...");}
  }
  class Son extends Father {
  void school() {System.out.println("schooling...");}
  }
  class TestInheritance2 {
  public static void main(String args[]) {
  Son s=new Son();
  s.rent();
  s.work();
  s.school();
  }
  }
  

