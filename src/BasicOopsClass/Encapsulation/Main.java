package BasicOopsClass.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Capsule capsule = new Capsule();
        capsule.setType(2);
        capsule.setHowMany(10);

        System.out.println(capsule.getType());
        System.out.println(capsule.getHowMany());
    }
}
