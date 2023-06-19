public class Sheep {
    private double weightSheep; // private
    private double weightWool;
    Sheep(){
        double weight = (Math.random()*(30-15)+15);
        double wool = (Math.random()*(5-3)+3);
        double scale = Math.pow(10,2);
        this.weightSheep = Math.ceil(weight*scale)/scale;
        this.weightWool= Math.ceil(wool*scale)/scale;
    }
    Sheep(double weightSheep, double weightWool){
        this.weightSheep = weightSheep;
        this.weightWool = weightWool;
    }

    void setWeightSheep(double weightSheepSheep) {
        this.weightSheep = weightSheepSheep;
    }

    void setWeightWool(double weightWool) {
        this.weightWool = weightWool;
    }

    double getWeightSheep(){
        return weightSheep;
    }
    double getWeightWool(){
        return weightWool;
    }
    void oneDay(){
        setWeightSheep(getWeightSheep()+1);
        setWeightWool(getWeightWool()+0.1);
    }
}
