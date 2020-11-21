import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Context context = new Context();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Choose the strategy :");
            String strategyClassName = scanner.nextLine();
            IStrategy strategy =(IStrategy) Class.forName(strategyClassName).newInstance();
            context.setStrategy(strategy);
            System.out.println("-----------------------------");
            context.process();

        }

    }
}
