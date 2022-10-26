class Company {
  float salary = 70000;
}
class Director extends Company {
  int bonus = 30000;
  public static void main(String arg[]) {
    Director d=new Director();
    System.out.println("Director salary is:"+d.salary);
    System.out.println("bonus of Director is:"+d.bonus);
  }
}