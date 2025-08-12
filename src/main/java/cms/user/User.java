package cms.user;

public abstract class User {
    private final int id;
	private final String nome;
	private final String email;
	private final String password;

    public User(String email, int id, String nome, String password) {
        this.email = email;
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

}
