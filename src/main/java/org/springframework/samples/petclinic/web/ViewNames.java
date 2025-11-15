package org.springframework.samples.petclinic.web;

/**
 * Centraliza os nomes das views utilizadas pelos controllers.
 * Ajuda a evitar strings mágicas espalhadas pelo código.
 */
public final class ViewNames {

    private ViewNames() {
        // Evita instanciação
    }

    // Owners
    public static final String OWNER_FORM = "owners/createOrUpdateOwnerForm";
    public static final String OWNER_DETAILS = "owners/ownerDetails";
    public static final String OWNER_FIND = "owners/findOwners";

    // Pets
    public static final String PET_FORM = "pets/createOrUpdatePetForm";

    // Visits
    public static final String VISIT_FORM = "visits/createOrUpdateVisitForm";

    // Sistema / telas gerais (ajuste conforme o projeto)
    public static final String WELCOME = "welcome";
    public static final String ERROR = "error";
}