package wednes;

class CompanyOfCars {
    
    public void company() {
        System.out.println("Welcome to our car gallery.");
    }
}

class Bmw extends CompanyOfCars {
    public void company() {
        System.out.println("BMW is a great company.");
    }
}

class Mercedes extends CompanyOfCars {
    public void company() {
        System.out.println("Mercedes gives you royalty.");
    }
}
class Dynamic_meth{
    public static void main(String args[]){
        
        CompanyOfCars obj=new CompanyOfCars();
        obj.company();
        
        obj=new Bmw();
        obj.company();
       
        obj=new Mercedes();
        obj.company();
    }
}
