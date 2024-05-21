package myExaple.locac_inner_class;

public class LocalInnerClass {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }

    static class Math {


        public void getResult() {
            class Deleniye {
                private int value1;
                private int value2;

                public int getValue1() {
                    return value1;
                }

                public void setValue1(int value1) {
                    this.value1 = value1;
                }

                public int getValue2() {
                    return value2;
                }

                public void setValue2(int value2) {
                    this.value2 = value2;
                }

                public int getDelimoye() {
                    return getValue1();
                }

                public int getDelitel() {
                    return getValue2();
                }

                public int getCastnoye() {
                    return getDelimoye() / getDelitel();
                }

                public int getostatok() {
                    return getDelimoye() % getDelitel();
                }
            }
            Deleniye a = new Deleniye();
            a.setValue1(10);
            a.setValue2(2);
            System.out.println("delimoye " + a.getDelimoye());
            System.out.println("delitel " + a.getDelitel());
            System.out.println("castnoye " + a.getCastnoye());
            System.out.println("ostatok " + a.getostatok());
        }
    }
}