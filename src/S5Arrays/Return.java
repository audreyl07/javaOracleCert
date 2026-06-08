package S5Arrays;

public class Return {
    public static void main(String[] args) {
        boolean isCheck = true;
        System.out.println("Before the return statement");
        if (isCheck){
            return;
        } System.out.println("this statement will not be executed ");

        String [] cars = {"BMW", "Mercedes", "Ferrari", "Opel", "Ford"};
        for (String car: cars){
            if (car == "Opel"){
                return;
            }
            System.out.println(car);
        }
        System.out.println("this statement will not be executed ");
        /*
        int k=1;
        switch (k) {
            case 1:
                System.out.println("k is one");
                break;
            case 2:
                System.out.println("k is two");
                return;
        }
        System.out.println("outside");

         */
    }
}
