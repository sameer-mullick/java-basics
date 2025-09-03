class Cop {
    protected void fire() {
        System.out.println(" Cop is firing!");
    }
}

class Thief extends Cop {
    public static void main(String[] args) {
        Thief t = new Thief();
        t.fire(); 
    }
}
