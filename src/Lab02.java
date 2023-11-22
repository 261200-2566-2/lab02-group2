public class Lab02 {
    public static void main(String[] args) {
        AirPurifier a = new AirPurifier("Xiaomi Pro" , "X1");
        a.show();
        a.turnOn();
        a.show();
        a.setSpeed(50);
        a.show();
        a.turnOff();
        a.show();
        a.setSpeed(100);
        AirPurifier b = new AirPurifier("Samsung" , "01");
        AirPurifier C = new AirPurifier("Samsung" , "02");

        System.out.println("Number of AirPurifier:"+ AirPurifier.numberPurifier);

        System.out.println(AirPurifier.models[0]+" : "+AirPurifier.modelsNumber[0]);
        System.out.println(AirPurifier.models[1]+" : "+AirPurifier.modelsNumber[1]);

        System.out.println("Most popular model : " + AirPurifier.mostPopularModel());
    }
}
