
public class Person{
    public String name;
    public int age;
    public int count=0;
    public String dose1="Not Given";
    public String dose2="Not Given";
    public String type;
    public String vac1;

    public Person(){
    }

    public Person(String name, int age, String type){
        this.name=name;
        this.age=age;
        this.type=type;
    }
    public Person(String name, int age){
        this.name=name;
        this.age=age;
        this.type="General Citizen";
    }

    public void pushVaccine(Vaccine v){
        if (count<2){
            if (type=="Student" ||age>=25){
                if (count==0){
                    vac1=v.getName();
                    count+=1;
                    dose1="Given";
                    dose2="Please come after "+v.getDays()+" days";
                    System.out.println("1st dose done for "+name);
                }
            }
            else{
                System.out.println("Sorry "+name+", Minimum age for taking vaccine is 25 years now.");
            }
        }
        else{
        System.out.println("Sorry "+name+", you already received both doses.");
        }
    }

    public void pushVaccine(Vaccine v, String dose ){
        if (dose=="2nd Dose"){
            if (count==1){
                if (vac1==v.getName() && vac1!=null){ 
                    count+=1;
                    dose2="Given";
                    System.out.println("2nd dose done for "+name);
                }
                else{
                    System.out.println("Sorry "+name+", you can't take 2 different vaccines");
                }
            }
            else if(count==0){  //checks whether person took first dose
                System.out.println("Sorry " + name + ", invalid dose request.");
            }
            else{
                System.out.println("Sorry "+name+", you already received both doses.");
            }
        }
        else if (dose=="1st Dose"){
            pushVaccine(v);
        }
    }

    public void showDetail(){
        System.out.println("Name: "+name+" Age: "+age+" Type: "+type);
        if (vac1!=null || dose1=="Given"){
            System.out.println("Vaccine name: " + vac1);
            System.out.println("1st Dose: " + dose1);
            System.out.println("2nd Dose: " + dose2);
        }
    }
}
