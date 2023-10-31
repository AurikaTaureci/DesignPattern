package org.example.designPatterns.bulder;

public class House {

    //1. Stabilirea câmpurilor obligatorii și a celor opționale
    //required
    private BasicHouse basicHouse;
    //optional
    private Garage garage;
    private SwimmingPool swimmingPool;
    private Garden garden;
    private FancyStatues fancyStatues;

    private House(){}

    //2. Crearea unei clase interne statice ce reprezintă „builder-ul” pentru clasă exterioară
    public static class HouseBuilder {
        private House instance = new House();

        //3. Adăugarea câmpurilor obligatorii ca parametrii constructorului din clasa inner HouseBuilder
        public HouseBuilder(BasicHouse basicHouse) {
            instance.basicHouse = basicHouse;
            System.out.println("Casa are pereti si acoperis");
        }

        //4. Adăugarea unei metode setNumeCamp/withNumeCamp în clasa inner HouseBuilder,
        // care primește o valoare pentru un câmp opțional și întoarce instanța curentă de HouseBuilder
        // withMethods
        public HouseBuilder withGarage(Garage garage) {
            instance.garage = garage;
            System.out.println("Casa cu garaj");
            return this;
        }

        public HouseBuilder withSwimmingPool(SwimmingPool  swimmingPool){
            instance.swimmingPool=swimmingPool;
            System.out.println("Casa cu piscina");
            return this;
        }

        public HouseBuilder withGarden(Garden garden){
            instance.garden=garden;
            System.out.println("Casa cu gradina");
            return  this;
        }

        public HouseBuilder withFancyStatues(FancyStatues fancyStatues){
            instance.fancyStatues = fancyStatues;
            System.out.println("casa u statui");
            return this;
        }

        //5. Crearea unei metode build() în clasa HouseBuilder care returnează instanța de clasă exterioară
        public House build(){
            return instance;
        }
    }

    //1.A crearea claselor interne
    static class BasicHouse{}
    static class Garage {}
    static class SwimmingPool {}
    static class Garden {}
    static class FancyStatues {}

}
