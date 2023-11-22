public class AirPurifier {
    String model;
    String serialNo;
    boolean power;
    int speed = 0;
    static int numberPurifier=0;
    static int modelCount=0;
    static String[] models=new String[100];
    static int[] modelsNumber=new int[100];
    static String mostPopularModel(){
        int max = modelsNumber[0];
        if(modelCount==0) return "none";
        else{

            for(int i=1;i<modelCount;i++){
                if(modelsNumber[i]>max) max = i;
            }
        }
        return models[max];
    }
    void show(){
        System.out.println("Model : "+model);
        System.out.println("SerialNo : "+serialNo);
        System.out.println("Power : "+ power);
        System.out.println("Speed : "+speed);
    }
    void turnOn(){
        power=true;
        speed=1;
    }
    void turnOff(){
        speed = 0;
        power=false;
    }
    void setSpeed(int speed){
        if(power && speed>0 && speed<=100) {
            this.speed = speed;
        }else{
            System.out.println("Please turn on or set speed between 1-100");
        }
    }

    AirPurifier(String model, String serialNo){
        this.model = model;
        this.serialNo = serialNo;
        if(numberPurifier==0){
            models[0]=model;
            modelsNumber[0]=1;
            numberPurifier++;
            modelCount++;
        }else{
            boolean found=false;
            for(int i=0;i<modelCount;i++){
                if(!found){
                    if(models[i].equals(model)){
                        modelsNumber[i]++;
                        numberPurifier++;
                        found=true;
                    }
                }else {
                    break;
                }
            }
            if(!found){
                models[modelCount]=model;
                modelsNumber[modelCount]++;
                numberPurifier++;
                modelCount++;
            }
        }
    }

}
