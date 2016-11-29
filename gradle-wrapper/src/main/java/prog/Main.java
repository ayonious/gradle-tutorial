package prog;

import libs.Libs;

public class Main {
  public static void main(String[] args) {
    Libs libs = new Libs();
    if (args.length == 3) {
      int in1 = Integer.valueOf(args[1]);
      int in2 = Integer.valueOf(args[2]);
      if (args[0].equals("add")) {
        System.out.println("the result is: " + libs.add(in1, in2));
      } else if (args[0].equals("sub")) {
        System.out.println("the result is: " + libs.subt(in1, in2));
      } else {
        System.out.println("first args should be either add or sub currently its" + args[0]);
      }
    } else {
      System.out.println("there should be only 3 args currently there are " + args.length);
    }
  }
}
