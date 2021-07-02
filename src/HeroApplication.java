public class HeroApplication {

    public static void main(String[] args) {


//  Variable Initialization
        String heroName;
        String heroCity;

        String heroPower1, heroPower2, heroPower3;

        Boolean isEvil;

        double heroSalary;
        String realName;

        String universe;


//Variable Assignment
        heroName = "Martina";
        heroCity = "Aizkraukle";
        heroPower1 = "Nice person";
        heroPower2 = "Smiling";
        heroPower3 = "";
        isEvil = false;
        heroSalary = 155.45;
        realName = "Marta";
        universe = "Blossom";


//Printout hero information card
        System.out.println("************");
        System.out.println("**** HERO INFORMATION ****");
        System.out.println("************");

        System.out.println("Hero Name:" + heroName);
        System.out.println("This hero lives in " + heroCity);
        System.out.println("------------------");
        System.out.println("Hero Superpowers:");
        System.out.println("++++++" + heroPower1);
        System.out.println("++++++" + heroPower2);
        System.out.println("++++++" + heroPower3);

        System.out.println("This superhero is evil? " + isEvil);

        System.out.println("This hero earns "  + heroSalary + " EUR.");
        System.out.println(realName + " hides his identitiy.");
        System.out.println("Hero lives in " + universe + " universe.");

    }
}
