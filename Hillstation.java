class Hillstation {
    void location() {
        System.out.println("Location is : ");
    }
    void famousfor() {
        System.out.println("Famous for : ");
    }
}

class Manali extends Hillstation {
    void location() {
        System.out.println("Manali is in Himachal Pradesh");
    }
    void famousfor() {
        System.out.println("Manali is famous for Hadimba Temple and adventourous activities");
    }
}

class Mussoorie extends Hillstation {
    void location() {
        System.out.println("Mussoorie is in Uttarakhand");
    }
    void famousfor() {
        System.out.println("Mussoorie is famous for educational institutions.");
    }
}

class Gulmarg extends Hillstation {
    void location() {
        System.out.println("Gulmarg is in Jammu and Kashmir");
    }
    void famousfor() {
        System.out.println("Gulmarg is famous for skiing and snowboarding.");
    }
}

class MeowBossPhonkSlowed {
    public static void main(String args[]) {
        Hillstation A = new Hillstation();
        Hillstation M = new Manali();
        Hillstation Mu = new Mussoorie();
        Hillstation G = new Gulmarg();

        A.location();
        A.famousfor();

        M.location();
        M.famousfor();

        Mu.location();
        Mu.famousfor();

        G.location();
        G.famousfor();
    }
}