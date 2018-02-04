public class Astronomer {
    private String name;
    private long id;
    private int height;
    private double weight;
    private boolean nation;
    private String nationname;
    private double pweight;
    private String planet;
    private static int countall;
    private static int countthai;
    private static int countmercury;
    private static int countvenus;
    private static int countjupiter;
    private static int countsaturn;
    
    public Astronomer(){
        countall++;
    }
    
    public Astronomer(String name,long id,int height,double weight,String nation,String planet){
        countall++;
        this.name=name;
        this.id=id;
        this.height=height;
        this.weight=weight;
        this.nationname=name;
        if(nation.equals("Thailand")){
            countthai++;
            this.nation=true;
        }else{
            this.nation=false;
        }
        this.planet=planet;
        if(planet.equals("Mercury")){
            countmercury++;
            this.pweight=weight*0.4;
        }else if(planet.equals("Venus")){
            countvenus++;
            this.pweight=weight*0.9;
        }else if(planet.equals("Jupiter")){
            countjupiter++;
            this.pweight=weight*2.5;
        }else if(planet.equals("Saturn")){
            countsaturn++;
            this.pweight=weight*1.1;
        }
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public void setId(long id){
        this.id=id;
    }
    
    public void setHeight(int height){
        this.height=height;
    }
    
    public void setWeight(double weight){
        this.weight=weight;
    }
    
    public void setNation(String nation){
        if(nation.equals("Thailand")){
            countthai++;
            this.nation=true;
        }else{
            this.nation=false;
        }
        this.nationname=nation;
    }
    
    public void setPlanet(int planet){
        if(planet==1){
            countmercury++;
            this.planet="Mercury";
            weightConverter(0.4);   //this.pweight=weight*0.4;
        }else if(planet==2){
            countvenus++;
            this.planet="Venus";
            weightConverter(0.9);   //this.pweight=weight*0.9;
        }else if(planet==3){
            countjupiter++;
            this.planet="Jupiter";
            weightConverter(2.5);   //this.pweight=weight*2.5;
        }else if(planet==4){
            countsaturn++;
            this.planet="Saturn";
            weightConverter(1.1);   //this.pweight=weight*1.1;
            
        }
        
    }
    
    public static int getCountall(){
        return countall;
    }
    
    public static int getCountthai(){
        return countthai;
    }
    
    public static int getCountmercury(){
        return countmercury;
    }
    
    public static int getCountvenus(){
        return countvenus;
    }
    
    public static int getCountjupiter(){
        return countjupiter;
    }
    
    public static int getCountsaturn(){
        return countsaturn;
    }
    
    public void weightConverter(double value){
        this.pweight=weight*value;
    }
    
    public String toString(){
        return ""+name+" ("+nationname+") ID-"+id+",From Earth:"+weight+" kg To "+planet+": "+pweight+" kg";
    }
}
