public class Author {
    private String name;
    private String surname;

    public Author(String nameAuth, String surnameAuth) {
        this.name=nameAuth;
        this.surname=surnameAuth;
    }
    public String getAuthorName() {
        return name;
    }
    public String getAuthorSurname() {
        return surname;
    }
}