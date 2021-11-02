package l20_structural_design_pattern.practice.facade.controller;

import l20_structural_design_pattern.practice.facade.models.Client;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.share("This is a post");
    }
}
