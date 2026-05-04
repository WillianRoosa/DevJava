package projeto.java.javacore.Minterfaces.desafio.domain;

public enum PaymentStatus {
    APPROVED(1, "Pagamento Aprovado!"),
    PENDING(2, "Pagamento aguardando compensação bancária..."),
    REFUSED(3, "Pagamento Recusado, tente novamente!");

    private final int ID;
    private final String description;

    PaymentStatus(int ID, String description) {
        this.ID = ID;
        this.description = description;
    }

    public int getID() {
        return ID;
    }

    public String getDescription() {
        return description;
    }
}
