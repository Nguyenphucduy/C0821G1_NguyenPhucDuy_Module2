package ss19_solid.dependency_inversion_principle.true_design;

public class Main {
        public static void main(String[] args) {
        IDevelop backend = new BackendPHP();

        Project projectBackend = new Project(backend);

        FrontendAngular frontend = new FrontendAngular();

        Project projectFrontend = new Project(frontend);

        projectBackend.build();
        projectFrontend.build();

        BackendPHP backendPHP = new BackendPHP();
        Project projectPhp = new Project(backendPHP);
        projectPhp.build();
    }
}
