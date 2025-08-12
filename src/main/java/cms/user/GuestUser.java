package cms.user;

public class GuestUser extends User{

    public GuestUser(String email, int id, String nome, String password) {
        super(email, id, nome, password);
    }
	
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public boolean checkPassword(String p) {
		return password.equals(p);
	}

	public void viewContent(int contentId) {
		/* exclusivo do visitante */ }
}
