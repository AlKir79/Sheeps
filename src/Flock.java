import java.util.ArrayList;

public class Flock {
private
    ArrayList <Sheep> baran = new ArrayList<Sheep>();
    private int number = 10;
    Flock(){
        for (int i=0; i<number; i++){
            baran.add(new Sheep());
        }
    }
    void getInfo(){
        System.out.println("Баран \t Вес \t Вес шерсти");
        int num=1;
        for(int i=0; i<number;i++){
            System.out.println("  "+num+" \t"+baran.get(i).getWeightSheep()+"\t\t"+baran.get(i).getWeightWool());
            num++;
        }
    }
    void addSheep(){
        baran.add(new Sheep());
    }

    Sheep getSheep(int index) {
        return baran.get(index);
    }
    void delSheep(int index) {
        baran.remove(index);
    }
    void oneDayHerd(){
       for(int i=0;i<10;i++){
           baran.get(i).oneDay();
        }
    }
}
