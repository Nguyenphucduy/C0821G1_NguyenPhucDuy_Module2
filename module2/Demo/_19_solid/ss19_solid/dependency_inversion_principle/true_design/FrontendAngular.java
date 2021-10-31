package ss19_solid.dependency_inversion_principle.true_design;

public class FrontendAngular implements IDevelop {
    @Override
    public void develop() {
        this.codeAngular();
    }

    private void codeAngular() {
        System.out.println("Code Angular");
    }
}
